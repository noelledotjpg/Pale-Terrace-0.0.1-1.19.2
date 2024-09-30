package net.noelledotjpg.paleterrace.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.noelledotjpg.paleterrace.PaleTerrace;
import net.noelledotjpg.paleterrace.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PaleTerrace.MOD_ID);

    public static final RegistryObject<Block> PALE_DIRT = registerBlock("pale_dirt",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_GRAY)
                    .strength(0.5F)
                    .sound(SoundType.PACKED_MUD)), CreativeModeTab.TAB_BUILDING_BLOCKS);


    public static final RegistryObject<Block> WILTED_GRASS_BLOCK = registerBlock("wilted_grass_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_GRAY)
                    .strength(0.5F)
                    .sound(SoundType.PACKED_MUD)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> PALE_LOG = registerBlock("pale_log",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_GRAY)
                    .strength(0.5F)
                    .sound(SoundType.PACKED_MUD)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> CRACKED_PALE_LOG = registerBlock("cracked_pale_log",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.COLOR_GRAY)
                    .strength(0.5F)
                    .sound(SoundType.PACKED_MUD)), CreativeModeTab.TAB_BUILDING_BLOCKS);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

