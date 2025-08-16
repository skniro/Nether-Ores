package com.skniro.nether_ores_reborn.datagen;

import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import java.util.concurrent.CompletableFuture;

import static com.skniro.nether_ores_reborn.datagen.ModBlockTagGeneration.ModBlockTags.*;
import static net.minecraft.tags.BlockTags.*;


public class ModBlockTagGeneration extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagGeneration(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(dataGenerator, completableFuture);
    }


    public static class ModBlockTags {
        public static final TagKey<Block> C_SAPLING = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "saplings"));
        public static final TagKey<Block> C_MAPLE_LOGS = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "maple_logs"));
        public static final TagKey<Block> C_CHERRY_LOGS = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "cherry_logs"));
        public static final TagKey<Block> C_PLASTER = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "plaster"));

    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        valueLookupBuilder(MINEABLE_WITH_PICKAXE)
                .add(NetherOresBlocks.Nether_Diamond_Ore)
                .add(NetherOresBlocks.Nether_Gold_Ore)
                .add(NetherOresBlocks.Nether_Redstone_Ore)
                .add(NetherOresBlocks.Nether_Emerald_Ore)
                .add(NetherOresBlocks.Nether_Coal_Ore)
                .add(NetherOresBlocks.Nether_Iron_Ore)
                .add(NetherOresBlocks.Nether_Copper_Ore)
                .add(NetherOresBlocks.Nether_Lapis_Ore)
                .add(NetherOresBlocks.End_Diamond_Ore)
                .add(NetherOresBlocks.End_Gold_Ore)
                .add(NetherOresBlocks.End_Redstone_Ore)
                .add(NetherOresBlocks.End_Emerald_Ore)
                .add(NetherOresBlocks.End_Coal_Ore)
                .add(NetherOresBlocks.End_Iron_Ore)
                .add(NetherOresBlocks.End_Copper_Ore)
                .add(NetherOresBlocks.End_Lapis_Ore)
                .setReplace(false);
        valueLookupBuilder(NEEDS_IRON_TOOL)
                .add(NetherOresBlocks.Nether_Diamond_Ore)
                .add(NetherOresBlocks.Nether_Gold_Ore)
                .add(NetherOresBlocks.Nether_Redstone_Ore)
                .add(NetherOresBlocks.Nether_Emerald_Ore)
                .add(NetherOresBlocks.End_Diamond_Ore)
                .add(NetherOresBlocks.End_Gold_Ore)
                .add(NetherOresBlocks.End_Redstone_Ore)
                .add(NetherOresBlocks.End_Emerald_Ore)
                .setReplace(false);
        valueLookupBuilder(NEEDS_STONE_TOOL)
                .add(NetherOresBlocks.Nether_Iron_Ore)
                .add(NetherOresBlocks.Nether_Copper_Ore)
                .add(NetherOresBlocks.Nether_Lapis_Ore)
                .add(NetherOresBlocks.End_Iron_Ore)
                .add(NetherOresBlocks.End_Copper_Ore)
                .add(NetherOresBlocks.End_Lapis_Ore)
                .setReplace(false);

    }
}
