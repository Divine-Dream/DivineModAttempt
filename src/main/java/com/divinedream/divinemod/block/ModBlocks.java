package com.divinedream.divinemod.block;

import com.divinedream.divinemod.DivineModAttempt;
import com.divinedream.divinemod.item.ModCreativeModeTab;
import com.divinedream.divinemod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DivineModAttempt.MOD_ID);

    //creates zircon ore and displays it in divinemod creative mode tab. also drops experience.
    public static final RegistryObject<Block> ZIRCON_ORE = registerBlock("zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(15, 41)), ModCreativeModeTab.DIVINEMOD_TAB);

    //zircon ore, but deepslate version
    public static final RegistryObject<Block> DEEPSPLATE_ZIRCON_ORE = registerBlock("deepslate_zircon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops(),
                    UniformInt.of(15, 41)), ModCreativeModeTab.DIVINEMOD_TAB);

    //creates zircon block and displays it in divinemod creative mode tab.
    public static final RegistryObject<Block> ZIRCON_BLOCK = registerBlock("zircon_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).
                    strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.DIVINEMOD_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        regiserBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> regiserBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
