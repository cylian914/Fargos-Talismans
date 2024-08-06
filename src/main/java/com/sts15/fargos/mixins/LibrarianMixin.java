package com.sts15.fargos.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.sts15.fargos.items.talismans.Librarian_Talisman;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import top.theillusivec4.curios.api.CuriosApi;

@Mixin(Player.class)
public abstract class LibrarianMixin {

    @Shadow private int totalExperience;

    @Shadow private int experienceLevel;

    @Shadow private float experienceProgress;

    @Shadow public abstract void increaseScore(int score);

    @Shadow public abstract void giveExperienceLevels(int levels);

    @Shadow public abstract int getXpNeededForNextLevel();

    @Inject(method = "giveExperiencePoints", at = @At("HEAD"), cancellable = true)
    private void modifyExperiencePoints(int p_36291_, CallbackInfo ci) {
        Player player = (Player) (Object) this;
        if (hasLibrarianEnchantment(player)) {
//            System.out.println("Pre Experience Modification: Player = " + player.getName().getString() + ", XP = " + p_36291_);
//            System.out.println("Current Total Experience: " + this.totalExperience);
//            System.out.println("Current Experience Level: " + this.experienceLevel);
//            System.out.println("Current Experience Progress: " + this.experienceProgress);

            int modifiedExperience = Math.round(p_36291_ * 1.5f);
            this.increaseScore(modifiedExperience);
            this.experienceProgress += (float) modifiedExperience / (float) this.getXpNeededForNextLevel();
            this.totalExperience = Mth.clamp(this.totalExperience + modifiedExperience, 0, Integer.MAX_VALUE);
            while (this.experienceProgress < 0.0F) {
                float f = this.experienceProgress * (float) this.getXpNeededForNextLevel();
                if (this.experienceLevel > 0) {
                    this.giveExperienceLevels(-1);
                    this.experienceProgress = 1.0F + f / (float) this.getXpNeededForNextLevel();
                } else {
                    this.giveExperienceLevels(-1);
                    this.experienceProgress = 0.0F;
                }
            }
            while (this.experienceProgress >= 1.0F) {
                this.experienceProgress = (this.experienceProgress - 1.0F) * (float) this.getXpNeededForNextLevel();
                this.giveExperienceLevels(1);
                this.experienceProgress /= (float) this.getXpNeededForNextLevel();
            }

//            System.out.println("Post Experience Modification: Player = " + player.getName().getString());
//            System.out.println("New Total Experience: " + this.totalExperience);
//            System.out.println("New Experience Level: " + this.experienceLevel);
//            System.out.println("New Experience Progress: " + this.experienceProgress);

            ci.cancel();
        }
    }

    @SuppressWarnings("deprecation")
    private static boolean hasLibrarianEnchantment(Player player) {
        return CuriosApi.getCuriosHelper().findEquippedCurio(itemStack -> itemStack.getItem() instanceof Librarian_Talisman, player).isPresent();
    }
}