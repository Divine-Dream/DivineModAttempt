package com.divinedream.divinemod.item;

import com.divinedream.divinemod.DivineModAttempt;
import com.divinedream.divinemod.item.custom.WitherSwordItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DivineModAttempt.MOD_ID);

    //cooked zircon
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINEMOD_TAB)));
    //raw zircon (got after mining ore)
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIVINEMOD_TAB)));

    //Zircon Tools

    /* Zircon Sword (no effect)
    public static final RegistryObject<Item> ZIRCON_SWORD = ITEMS.register("zircon_sword",
            () -> new SwordItem(ModTiers.ZIRCON, 32, 2f, new Item.Properties().tab(ModCreativeModeTab.DIVINEMOD_TAB)));
    */

    //zircon sword (wither effect)
    public static final RegistryObject<Item> ZIRCON_SWORD = ITEMS.register("zircon_sword",
            () -> new WitherSwordItem(ModTiers.ZIRCON, 32, 2f, new Item.Properties().tab(ModCreativeModeTab.DIVINEMOD_TAB)));
    //zircon pickaxe
    public static final RegistryObject<Item> ZIRCON_PICKAXE = ITEMS.register("zircon_pickaxe",
            () -> new PickaxeItem(ModTiers.ZIRCON, 1, 1f, new Item.Properties().tab(ModCreativeModeTab.DIVINEMOD_TAB)));
    //zircon axe
    public static final RegistryObject<Item> ZIRCON_AXE = ITEMS.register("zircon_axe",
            () -> new AxeItem(ModTiers.ZIRCON, 9, 0f, new Item.Properties().tab(ModCreativeModeTab.DIVINEMOD_TAB)));
    //zircon shovel
    public static final RegistryObject<Item> ZIRCON_SHOVEL = ITEMS.register("zircon_shovel",
            () -> new ShovelItem(ModTiers.ZIRCON, 0, 1f, new Item.Properties().tab(ModCreativeModeTab.DIVINEMOD_TAB)));
    //zircon hoe
    public static final RegistryObject<Item> ZIRCON_HOE = ITEMS.register("zircon_hoe",
            () -> new ShovelItem(ModTiers.ZIRCON, 0, 0f, new Item.Properties().tab(ModCreativeModeTab.DIVINEMOD_TAB)));

    //Zircon Armor

    //zircon helmet
    public static final RegistryObject<Item> ZIRCON_HELMET = ITEMS.register("zircon_helmet",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.DIVINEMOD_TAB)));
    //zircon chestplate
    public static final RegistryObject<Item> ZIRCON_CHESTPLATE = ITEMS.register("zircon_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.DIVINEMOD_TAB)));
    //zircon leggings
    public static final RegistryObject<Item> ZIRCON_LEGGINGS = ITEMS.register("zircon_leggings",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.DIVINEMOD_TAB)));
    //zircon boots
    public static final RegistryObject<Item> ZIRCON_BOOTS = ITEMS.register("zircon_boots",
            () -> new ArmorItem(ModArmorMaterials.ZIRCON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.DIVINEMOD_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
