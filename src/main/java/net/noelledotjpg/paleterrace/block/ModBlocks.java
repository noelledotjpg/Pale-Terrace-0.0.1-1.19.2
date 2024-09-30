package net.noelledotjpg.paleterrace.block;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
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
                    .tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
