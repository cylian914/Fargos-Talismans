package com.sts15.fargos.items;

import com.sts15.fargos.items.components.*;
import com.sts15.fargos.items.forces.*;
import com.sts15.fargos.items.souls.*;
import com.sts15.fargos.items.talismans.*;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems("fargostalismans");

    // Crafting Items
    	public static final DeferredHolder<Item, AbominableEnergyItem> ABOMINABLE_ENERGY = ITEMS.register("abominable_energy", 
            () -> new AbominableEnergyItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, ScavengedItem> AEOLUS_BOOTS = ITEMS.register("aeolus_boots", 
            () -> new ScavengedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, ScavengedItem> AMBER_HORSESHOE_BALLOON = ITEMS.register("amber_horseshoe_balloon", 
            () -> new ScavengedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, ScavengedItem> ANCIENT_HORN = ITEMS.register("ancient_horn", 
            () -> new ScavengedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> ANCIENT_WINGS_ELYTRA = ITEMS.register("ancient_wings_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, LootedItem> ANKH_SHIELD = ITEMS.register("ankh_shield", 
            () -> new LootedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> ASTRAL_WINGS_ELYTRA = ITEMS.register("astral_wings_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, LootedItem> BEE_CLOAK = ITEMS.register("bee_cloak", 
            () -> new LootedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> BLAZING_WINGS_ELYTRA = ITEMS.register("blazing_wings_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, ScavengedItem> BLESSED_APPLE = ITEMS.register("blessed_apple", 
            () -> new ScavengedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, LootedItem> BRAIN_OF_CONFUSION = ITEMS.register("brain_of_confusion", 
            () -> new LootedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, ScavengedItem> BRAIN_SCRAMBLER = ITEMS.register("brain_scrambler", 
            () -> new ScavengedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, ScavengedItem> BUNDLE_OF_HORSESHOE_BALLOONS = ITEMS.register("bundle_of_horseshoe_balloons", 
            () -> new ScavengedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, LootedItem> CHARM_OF_MYTHS = ITEMS.register("charm_of_myths", 
            () -> new LootedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> DRAGON_WINGS_ELYTRA = ITEMS.register("dragon_wings_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> DUSTY_WINGS_ELYTRA = ITEMS.register("dusty_wings_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> ENCHANTED_WINGS_ELYTRA = ITEMS.register("enchanted_wings_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> ENDER_WINGS_ELYTRA = ITEMS.register("ender_wings_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, ScavengedItem> FLYING_CARPET = ITEMS.register("flying_carpet", 
            () -> new ScavengedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> FOREST_WINGS_ELYTRA = ITEMS.register("forest_wings_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, LootedItem> FROZEN_SHIELD = ITEMS.register("frozen_shield", 
            () -> new LootedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> FROZEN_WINGS_ELYTRA = ITEMS.register("frozen_wings_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> GHASTLY_WINGS_ELYTRA = ITEMS.register("ghastly_wings_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, LootedItem> HAND_WARMER = ITEMS.register("hand_warmer", 
            () -> new LootedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, LootedItem> HERO_SHIELD = ITEMS.register("hero_shield", 
            () -> new LootedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, ScavengedItem> MASTER_NINJA_GEAR = ITEMS.register("master_ninja_gear", 
            () -> new ScavengedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, ScavengedItem> MECHANICAL_CART = ITEMS.register("mechanical_cart", 
            () -> new ScavengedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, LootedItem> OBSIDIAN_HORSESHOE = ITEMS.register("obsidian_horseshoe", 
            () -> new LootedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> OCEANS_FINS_ELYTRA = ITEMS.register("oceans_fins_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> PHANTOM_WINGS_ELYTRA = ITEMS.register("phantom_wings_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, LootedItem> POCKET_MIRROR = ITEMS.register("pocket_mirror", 
            () -> new LootedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, ScavengedItem> REINDEER_BELLS = ITEMS.register("reindeer_bells", 
            () -> new ScavengedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, ScavengedItem> SHIELD_OF_CTHULHU = ITEMS.register("shield_of_cthulhu", 
            () -> new ScavengedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, LootedItem> SHINY_STONE = ITEMS.register("shiny_stone", 
            () -> new LootedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, LootedItem> STAR_VEIL = ITEMS.register("star_veil", 
            () -> new LootedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, ScavengedItem> SWEETHEART_NECKLACE = ITEMS.register("sweetheart_necklace", 
            () -> new ScavengedItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> VOLCANIC_ASH_ELYTRA = ITEMS.register("volcanic_ash_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> WITHER_WINGS_ELYTRA = ITEMS.register("wither_wings_elytra", 
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, LootedItem> WORM_SCARF = ITEMS.register("worm_scarf", 
            () -> new LootedItem(new Item.Properties()) {});

    public static final DeferredHolder<Item, CraftingItem> FATIGUED_VIAL = ITEMS.register("fatigued_vial",
            () -> new CraftingItem(new Item.Properties()) {});
    public static final DeferredHolder<Item, CraftingItem> WITHERED_VIAL = ITEMS.register("withered_vial",
            () -> new CraftingItem(new Item.Properties()) {});
    public static final DeferredHolder<Item, CraftingItem> NAUSEATED_VIAL = ITEMS.register("nauseated_vial",
            () -> new CraftingItem(new Item.Properties()) {});
    public static final DeferredHolder<Item, CraftingItem> POISONED_VIAL = ITEMS.register("poisoned_vial",
            () -> new CraftingItem(new Item.Properties()) {});
    public static final DeferredHolder<Item, CraftingItem> WEAKENED_VIAL = ITEMS.register("weakened_vial",
            () -> new CraftingItem(new Item.Properties()) {});
    public static final DeferredHolder<Item, CraftingItem> FIRED_VIAL = ITEMS.register("fired_vial",
            () -> new CraftingItem(new Item.Properties()) {});
    public static final DeferredHolder<Item, CraftingItem> SLOWED_VIAL = ITEMS.register("slowed_vial",
            () -> new CraftingItem(new Item.Properties()) {});
    public static final DeferredHolder<Item, CraftingItem> BLINDED_VIAL = ITEMS.register("blinded_vial",
            () -> new CraftingItem(new Item.Properties()) {});

    public static final DeferredHolder<Item, CraftingItem1> SOUL_OF_FLIGHT_MASTERY_1 = ITEMS.register("soul_of_flight_mastery_1",
            () -> new CraftingItem1(new Item.Properties()) {});
    public static final DeferredHolder<Item, CraftingItem2> SOUL_OF_FLIGHT_MASTERY_2 = ITEMS.register("soul_of_flight_mastery_2",
            () -> new CraftingItem2(new Item.Properties()) {});
    public static final DeferredHolder<Item, CraftingItem1> SOUL_OF_SUPERSONIC_1 = ITEMS.register("soul_of_supersonic_1",
            () -> new CraftingItem1(new Item.Properties()) {});
    public static final DeferredHolder<Item, CraftingItem2> SOUL_OF_SUPERSONIC_2 = ITEMS.register("soul_of_supersonic_2",
            () -> new CraftingItem2(new Item.Properties()) {});
    public static final DeferredHolder<Item, CraftingItem1> SOUL_OF_COLOSSUS_1 = ITEMS.register("soul_of_colossus_1",
            () -> new CraftingItem1(new Item.Properties()) {});
    public static final DeferredHolder<Item, CraftingItem2> SOUL_OF_COLOSSUS_2 = ITEMS.register("soul_of_colossus_2",
            () -> new CraftingItem2(new Item.Properties()) {});

        // Talisman Bases
        public static final DeferredHolder<Item, CraftingItem> TALISMAN_BASE_NORMAL = ITEMS.register("talisman_base_normal",
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> TALISMAN_BASE_ADVANCED = ITEMS.register("talisman_base_advanced",
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> TALISMAN_BASE_EPIC = ITEMS.register("talisman_base_epic",
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> TALISMAN_BASE_LEGENDARY = ITEMS.register("talisman_base_legendary",
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> TALISMAN_BASE_ULTIMATE = ITEMS.register("talisman_base_ultimate",
            () -> new CraftingItem(new Item.Properties()) {});
        public static final DeferredHolder<Item, CraftingItem> TALISMAN_BASE_GODLY = ITEMS.register("talisman_base_godly",
            () -> new CraftingItem(new Item.Properties()) {});

    // Talisman Items
    public static final DeferredHolder<Item, TalismanItem> AIR_TALISMAN = ITEMS.register("air_talisman", Air_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> AMETHYST_TALISMAN = ITEMS.register("amethyst_talisman", Amethyst_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> APPLE_TALISMAN = ITEMS.register("apple_talisman", Apple_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> ARCHITECT_TALISMAN = ITEMS.register("architect_talisman", Architect_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> ARCTIC_TALISMAN = ITEMS.register("arctic_talisman", Arctic_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> BATTLE_TALISMAN = ITEMS.register("battle_talisman", Battle_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> BLAZE_TALISMAN = ITEMS.register("blaze_talisman", Blaze_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> CACTUS_TALISMAN = ITEMS.register("cactus_talisman", Cactus_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> COPPER_TALISMAN = ITEMS.register("copper_talisman", Copper_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> CREEPER_TALISMAN = ITEMS.register("creeper_talisman", Creeper_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> DIAMOND_TALISMAN = ITEMS.register("diamond_talisman", Diamond_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> DRAGON_TALISMAN = ITEMS.register("dragon_talisman", Dragon_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> EARTH_TALISMAN = ITEMS.register("earth_talisman", Earth_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> EMERALD_TALISMAN = ITEMS.register("emerald_talisman", Emerald_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> ENCHANTING_TALISMAN = ITEMS.register("enchanting_talisman", Enchanting_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> ENDERMAN_TALISMAN = ITEMS.register("enderman_talisman", Enderman_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> FIRE_TALISMAN = ITEMS.register("fire_talisman", Fire_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> GHAST_TALISMAN = ITEMS.register("ghast_talisman", Ghast_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> GLOWSTONE_TALISMAN = ITEMS.register("glowstone_talisman", Glowstone_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> GOLD_TALISMAN = ITEMS.register("gold_talisman", Gold_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> IRON_GOLEM_TALISMAN = ITEMS.register("iron_golem_talisman", Iron_Golem_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> IRON_TALISMAN = ITEMS.register("iron_talisman", Iron_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> LAPIS_TALISMAN = ITEMS.register("lapis_talisman", Lapis_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> LIBRARIAN_TALISMAN = ITEMS.register("librarian_talisman", Librarian_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> MOOSHROOM_TALISMAN = ITEMS.register("mooshroom_talisman", Mooshroom_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> NETHER_STAR_TALISMAN = ITEMS.register("nether_star_talisman", Nether_Star_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> OBSIDIAN_TALISMAN = ITEMS.register("obsidian_talisman", Obsidian_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> PICKAXE_TALISMAN = ITEMS.register("pickaxe_talisman", Pickaxe_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> REDSTONE_TALISMAN = ITEMS.register("redstone_talisman", Redstone_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> SHULKER_TALISMAN = ITEMS.register("shulker_talisman", Shulker_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> SKELETON_TALISMAN = ITEMS.register("skeleton_talisman", Skeleton_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> SPECTRAL_TALISMAN = ITEMS.register("spectral_talisman", Spectral_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> THORNY_TALISMAN = ITEMS.register("thorny_talisman", Thorny_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> UNDYING_TALISMAN = ITEMS.register("undying_talisman", Undying_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> VAMPIRIC_TALISMAN = ITEMS.register("vampiric_talisman", Vampiric_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> VINDICATOR_TALISMAN = ITEMS.register("vindicator_talisman", Vindicator_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> VOID_TALISMAN = ITEMS.register("void_talisman", Void_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> WATER_TALISMAN = ITEMS.register("water_talisman", Water_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> WITCH_TALISMAN = ITEMS.register("witch_talisman", Witch_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> WITHER_TALISMAN = ITEMS.register("wither_talisman", Wither_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> ZOMBIE_TALISMAN = ITEMS.register("zombie_talisman", Zombie_Talisman::new);

    public static final DeferredHolder<Item, TalismanItem> FIRED_TALISMAN = ITEMS.register("fired_talisman", Fired_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> POISONED_TALISMAN = ITEMS.register("poisoned_talisman", Poisoned_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> WITHERED_TALISMAN = ITEMS.register("withered_talisman", Withered_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> BLINDED_TALISMAN = ITEMS.register("blinded_talisman", Blinded_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> FATIGUED_TALISMAN = ITEMS.register("fatigued_talisman", Fatigued_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> SLOWED_TALISMAN = ITEMS.register("slowed_talisman", Slowed_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> NAUSEATED_TALISMAN = ITEMS.register("nauseated_talisman", Nauseated_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> WEAKENED_TALISMAN = ITEMS.register("weakened_talisman", Weakened_Talisman::new);

    public static final DeferredHolder<Item, TalismanItem> SUN_TALISMAN = ITEMS.register("sun_talisman", Sun_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> TRUE_SUN_TALISMAN = ITEMS.register("true_sun_talisman", True_Sun_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> STORM_TALISMAN = ITEMS.register("storm_talisman", Storm_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> RAIN_TALISMAN = ITEMS.register("rain_talisman", Rain_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> NIGHT_TALISMAN = ITEMS.register("night_talisman", Night_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> DAY_TALISMAN = ITEMS.register("day_talisman", Day_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> FULL_MOON_TALISMAN = ITEMS.register("full_moon_talisman", Full_Moon_Talisman::new);
    public static final DeferredHolder<Item, TalismanItem> SNOWY_TALISMAN = ITEMS.register("snowy_talisman", Snowy_Talisman::new);
    
    //Forces
    public static final DeferredHolder<Item, TalismanItem> FORCE_OF_EXPLORER = ITEMS.register("force_of_explorer", Force_of_Explorer::new);
    public static final DeferredHolder<Item, TalismanItem> FORCE_OF_MYSTIC = ITEMS.register("force_of_mystic", Force_of_Mystic::new);
    public static final DeferredHolder<Item, TalismanItem> FORCE_OF_NATURE = ITEMS.register("force_of_nature", Force_of_Nature::new);
    public static final DeferredHolder<Item, TalismanItem> FORCE_OF_OVERWORLD = ITEMS.register("force_of_overworld", Force_of_Overworld::new);
    public static final DeferredHolder<Item, TalismanItem> FORCE_OF_REJECTORS = ITEMS.register("force_of_rejectors", Force_of_Rejectors::new);
    public static final DeferredHolder<Item, TalismanItem> FORCE_OF_WARRIOR = ITEMS.register("force_of_warrior", Force_of_Warrior::new);
    public static final DeferredHolder<Item, TalismanItem> FORCE_OF_NEGATIVE = ITEMS.register("force_of_negative", Force_of_Negative::new);
    public static final DeferredHolder<Item, TalismanItem> FORCE_OF_ENVIRONMENT = ITEMS.register("force_of_environment", Force_of_Environment::new);
    
    //Souls
    public static final DeferredHolder<Item, TalismanItem> SOUL_OF_COLOSSUS = ITEMS.register("soul_of_colossus", Soul_of_Colossus::new);
    public static final DeferredHolder<Item, TalismanItem> SOUL_OF_DIMENSIONS = ITEMS.register("soul_of_dimensions", Soul_of_Dimensions::new);
    public static final DeferredHolder<Item, TalismanItem> SOUL_OF_FLIGHT_MASTERY = ITEMS.register("soul_of_flight_mastery", Soul_of_Flight_Mastery::new);
    public static final DeferredHolder<Item, TalismanItem> SOUL_OF_MINECRAFT = ITEMS.register("soul_of_minecraft", Soul_of_Minecraft::new);
    public static final DeferredHolder<Item, TalismanItem> SOUL_OF_SUPERSONIC = ITEMS.register("soul_of_supersonic", Soul_of_Supersonic::new);

    public static final DeferredHolder<Item, FargosGuideBook> GUIDE_BOOK = ITEMS.register("guide_book",
            () -> new FargosGuideBook(new Item.Properties().stacksTo(1)) {});

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
