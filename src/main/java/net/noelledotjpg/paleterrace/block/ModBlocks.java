package net.noelledotjpg.paleterrace.block;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.noelledotjpg.paleterrace.PaleTerrace;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PaleTerrace.MOD_ID);

    public static final RegistryObject<Block> PALE_DIRT = BLOCKS.register("pale_dirt",
            () -> new Block(new BlockBehaviour.Properties()
                    .of(Material.DIRT).strength(0.5F)
                    .tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
                    .sound(SoundType.MUD)));

    public static final RegistryObject<Block> WILTED_GRASS_BLOCK = BLOCKS.register("wilted_grass_block",
            () -> new Block(new BlockBehaviour.Properties().destroyTime()
                    .of(Material.DIRT).strength(0.5F)
                    .tab(CreativeModeTab.TAB_BUILDING_BLOCKS)
                    .sound(SoundType.MUD)
                    .sound(SoundType.GRASS)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
