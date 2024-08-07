package com.sts15.fargos.mixins;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ShulkerBullet;
import net.minecraft.world.phys.EntityHitResult;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import com.sts15.fargos.items.talismans.Shulker_Talisman_Provider;

import top.theillusivec4.curios.api.CuriosApi;

@Mixin(ShulkerBullet.class)
public class ShulkerMixin {

    
	@Inject(method = "onHitEntity", at = @At("HEAD"), cancellable = true)
    private void onHitEntity(EntityHitResult result, CallbackInfo ci) {
        Entity entity = result.getEntity();
        
        if (entity instanceof Player player && hasShulkerTalisman(player)) {
        	DamageSource DamageS = player.level().damageSources().generic();
        	entity.hurt(DamageS, 4.0F); // Vanilla damage value, just made generic rather than from the shulker
            ci.cancel();
        }
    }
	
	@SuppressWarnings({ "deprecation", "removal" })
    private static boolean hasShulkerTalisman(Player player) {
        return CuriosApi.getCuriosHelper().findEquippedCurio(itemStack -> itemStack.getItem() instanceof Shulker_Talisman_Provider, player).isPresent();
    }
	
}