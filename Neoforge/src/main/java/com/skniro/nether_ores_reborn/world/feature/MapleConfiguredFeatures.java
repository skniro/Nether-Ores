package com.skniro.nether_ores_reborn.world.feature;

import com.skniro.nether_ores_reborn.NetherOres;
import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;


public class MapleConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Coal_ORE_KEY = registerKey("coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Copper_KEY = registerKey("copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Diamond_KEY = registerKey("diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Emerald_KEY = registerKey("emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Gold_KEY = registerKey("gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Iron_KEY = registerKey("iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Lapis_KEY = registerKey("lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> Nether_Redstone_ORE_KEY = registerKey("redstone_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> featureRegisterable) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherstoneReplaceables = new BlockMatchTest(Blocks.NETHERRACK);

        List<OreConfiguration.TargetBlockState> netherCoalOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, NetherOresBlocks.Nether_Coal_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherCopperOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, NetherOresBlocks.Nether_Copper_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherDiamondOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, NetherOresBlocks.Nether_Diamond_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherEmeraldOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, NetherOresBlocks.Nether_Emerald_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherGoldOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, NetherOresBlocks.Nether_Gold_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherIronOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, NetherOresBlocks.Nether_Iron_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherLapisOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, NetherOresBlocks.Nether_Lapis_Ore.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> netherRedstoneOres =
                List.of(OreConfiguration.target(netherstoneReplaceables, NetherOresBlocks.Nether_Redstone_Ore.get().defaultBlockState()));

        register(featureRegisterable, Nether_Coal_ORE_KEY, Feature.ORE, new OreConfiguration(netherCoalOres, 10));
        register(featureRegisterable, Nether_Copper_KEY, Feature.ORE, new OreConfiguration(netherCopperOres, 8));
        register(featureRegisterable, Nether_Diamond_KEY, Feature.ORE, new OreConfiguration(netherDiamondOres, 8));
        register(featureRegisterable, Nether_Emerald_KEY, Feature.ORE, new OreConfiguration(netherEmeraldOres, 3));
        register(featureRegisterable, Nether_Gold_KEY, Feature.ORE, new OreConfiguration(netherGoldOres, 8));
        register(featureRegisterable, Nether_Iron_KEY, Feature.ORE, new OreConfiguration(netherIronOres, 8));
        register(featureRegisterable, Nether_Lapis_KEY, Feature.ORE, new OreConfiguration(netherLapisOres, 8));
        register(featureRegisterable, Nether_Redstone_ORE_KEY, Feature.ORE, new OreConfiguration(netherRedstoneOres, 8));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(NetherOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
