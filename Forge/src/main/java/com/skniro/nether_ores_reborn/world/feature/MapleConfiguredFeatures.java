package com.skniro.nether_ores_reborn.world.feature;

import com.skniro.nether_ores_reborn.NetherOres;
import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.BlockReplacement;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;


public class MapleConfiguredFeatures {
    public static final ResourceKey<Feature> Nether_Coal_ORE_KEY = registerKey("coal_ore");
    public static final ResourceKey<Feature> Nether_Copper_KEY = registerKey("copper_ore");
    public static final ResourceKey<Feature> Nether_Diamond_KEY = registerKey("diamond_ore");
    public static final ResourceKey<Feature> Nether_Emerald_KEY = registerKey("emerald_ore");
    public static final ResourceKey<Feature> Nether_Gold_KEY = registerKey("gold_ore");
    public static final ResourceKey<Feature> Nether_Iron_KEY = registerKey("iron_ore");
    public static final ResourceKey<Feature> Nether_Lapis_KEY = registerKey("lapis_ore");
    public static final ResourceKey<Feature> Nether_Redstone_ORE_KEY = registerKey("redstone_ore");

    public static final ResourceKey<Feature> End_Coal_ORE_KEY = registerKey("end_coal_ore");
    public static final ResourceKey<Feature> End_Copper_KEY = registerKey("end_copper_ore");
    public static final ResourceKey<Feature> End_Diamond_KEY = registerKey("end_diamond_ore");
    public static final ResourceKey<Feature> End_Emerald_KEY = registerKey("end_emerald_ore");
    public static final ResourceKey<Feature> End_Gold_KEY = registerKey("end_gold_ore");
    public static final ResourceKey<Feature> End_Iron_KEY = registerKey("end_iron_ore");
    public static final ResourceKey<Feature> End_Lapis_KEY = registerKey("end_lapis_ore");
    public static final ResourceKey<Feature> End_Redstone_ORE_KEY = registerKey("end_redstone_ore");

    public static void bootstrap(BootstrapContext<Feature> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherstoneReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endStoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<BlockReplacement> netherCoalOres =
                List.of(BlockReplacement.replace(netherstoneReplaceables, NetherOresBlocks.Nether_Coal_Ore.get().defaultBlockState()));
        List<BlockReplacement> netherCopperOres =
                List.of(BlockReplacement.replace(netherstoneReplaceables, NetherOresBlocks.Nether_Copper_Ore.get().defaultBlockState()));
        List<BlockReplacement> netherDiamondOres =
                List.of(BlockReplacement.replace(netherstoneReplaceables, NetherOresBlocks.Nether_Diamond_Ore.get().defaultBlockState()));
        List<BlockReplacement> netherEmeraldOres =
                List.of(BlockReplacement.replace(netherstoneReplaceables, NetherOresBlocks.Nether_Emerald_Ore.get().defaultBlockState()));
        List<BlockReplacement> netherGoldOres =
                List.of(BlockReplacement.replace(netherstoneReplaceables, NetherOresBlocks.Nether_Gold_Ore.get().defaultBlockState()));
        List<BlockReplacement> netherIronOres =
                List.of(BlockReplacement.replace(netherstoneReplaceables, NetherOresBlocks.Nether_Iron_Ore.get().defaultBlockState()));
        List<BlockReplacement> netherLapisOres =
                List.of(BlockReplacement.replace(netherstoneReplaceables, NetherOresBlocks.Nether_Lapis_Ore.get().defaultBlockState()));
        List<BlockReplacement> netherRedstoneOres =
                List.of(BlockReplacement.replace(netherstoneReplaceables, NetherOresBlocks.Nether_Redstone_Ore.get().defaultBlockState()));

        context.register(Nether_Coal_ORE_KEY, new OreFeature(netherCoalOres, 10));
        context.register(Nether_Copper_KEY, new OreFeature(netherCopperOres, 8));
        context.register(Nether_Diamond_KEY, new OreFeature(netherDiamondOres, 8));
        context.register(Nether_Emerald_KEY, new OreFeature(netherEmeraldOres, 3));
        context.register(Nether_Gold_KEY, new OreFeature(netherGoldOres, 8));
        context.register(Nether_Iron_KEY, new OreFeature(netherIronOres, 8));
        context.register(Nether_Lapis_KEY, new OreFeature(netherLapisOres, 8));
        context.register(Nether_Redstone_ORE_KEY, new OreFeature(netherRedstoneOres, 8));

        List<BlockReplacement> endCoalOres =
                List.of(BlockReplacement.replace(endStoneReplaceables, NetherOresBlocks.End_Coal_Ore.get().defaultBlockState()));
        List<BlockReplacement> endCopperOres =
                List.of(BlockReplacement.replace(endStoneReplaceables, NetherOresBlocks.End_Copper_Ore.get().defaultBlockState()));
        List<BlockReplacement> endDiamondOres =
                List.of(BlockReplacement.replace(endStoneReplaceables, NetherOresBlocks.End_Diamond_Ore.get().defaultBlockState()));
        List<BlockReplacement> endEmeraldOres =
                List.of(BlockReplacement.replace(endStoneReplaceables, NetherOresBlocks.End_Emerald_Ore.get().defaultBlockState()));
        List<BlockReplacement> endGoldOres =
                List.of(BlockReplacement.replace(endStoneReplaceables, NetherOresBlocks.End_Gold_Ore.get().defaultBlockState()));
        List<BlockReplacement> endIronOres =
                List.of(BlockReplacement.replace(endStoneReplaceables, NetherOresBlocks.End_Iron_Ore.get().defaultBlockState()));
        List<BlockReplacement> endLapisOres =
                List.of(BlockReplacement.replace(endStoneReplaceables, NetherOresBlocks.End_Lapis_Ore.get().defaultBlockState()));
        List<BlockReplacement> endRedstoneOres =
                List.of(BlockReplacement.replace(endStoneReplaceables, NetherOresBlocks.End_Redstone_Ore.get().defaultBlockState()));

        context.register(End_Coal_ORE_KEY, new OreFeature(endCoalOres, 6));
        context.register(End_Copper_KEY, new OreFeature(endCopperOres, 4));
        context.register(End_Diamond_KEY, new OreFeature(endDiamondOres, 4));
        context.register(End_Emerald_KEY, new OreFeature(endEmeraldOres, 2));
        context.register(End_Gold_KEY, new OreFeature(endGoldOres, 5));
        context.register(End_Iron_KEY, new OreFeature(endIronOres, 5));
        context.register(End_Lapis_KEY, new OreFeature(endLapisOres, 4));
        context.register(End_Redstone_ORE_KEY, new OreFeature(endRedstoneOres, 4));
    }

    public static ResourceKey<Feature> registerKey(String name) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(NetherOres.MOD_ID, name));
    }

}
