package com.skniro.nether_ores_reborn.datagen;

import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

import static com.skniro.nether_ores_reborn.datagen.ModBlockTagGeneration.ModBlockTags.*;
import static net.minecraft.registry.tag.BlockTags.*;


public class ModBlockTagGeneration extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(dataGenerator, completableFuture);
    }


    public static class ModBlockTags {
        public static final TagKey<Block> C_SAPLING = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "saplings"));
        public static final TagKey<Block> C_MAPLE_LOGS = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "maple_logs"));
        public static final TagKey<Block> C_CHERRY_LOGS = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "cherry_logs"));
        public static final TagKey<Block> C_PLASTER = TagKey.of(RegistryKeys.BLOCK, Identifier.of("c", "plaster"));

    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        valueLookupBuilder(PICKAXE_MINEABLE)
                .add(NetherOresBlocks.Nether_Diamond_Ore)
                .add(NetherOresBlocks.Nether_Gold_Ore)
                .add(NetherOresBlocks.Nether_Redstone_Ore)
                .add(NetherOresBlocks.Nether_Emerald_Ore)
                .add(NetherOresBlocks.Nether_Coal_Ore)
                .add(NetherOresBlocks.Nether_Iron_Ore)
                .add(NetherOresBlocks.Nether_Copper_Ore)
                .add(NetherOresBlocks.Nether_Lapis_Ore)
                .setReplace(false);
        valueLookupBuilder(NEEDS_IRON_TOOL)
                .add(NetherOresBlocks.Nether_Diamond_Ore)
                .add(NetherOresBlocks.Nether_Gold_Ore)
                .add(NetherOresBlocks.Nether_Redstone_Ore)
                .add(NetherOresBlocks.Nether_Emerald_Ore)
                .setReplace(false);
        valueLookupBuilder(NEEDS_STONE_TOOL)
                .add(NetherOresBlocks.Nether_Iron_Ore)
                .add(NetherOresBlocks.Nether_Copper_Ore)
                .add(NetherOresBlocks.Nether_Lapis_Ore)
                .setReplace(false);

    }
}
