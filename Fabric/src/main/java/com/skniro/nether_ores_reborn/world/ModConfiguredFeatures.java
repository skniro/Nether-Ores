package com.skniro.nether_ores_reborn.world;

import com.skniro.nether_ores_reborn.NetherOres;
import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Coal_ORE_KEY = registerKey("coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Copper_KEY = registerKey("copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Diamond_KEY = registerKey("diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Emerald_KEY = registerKey("emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Gold_KEY = registerKey("gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Iron_KEY = registerKey("iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Lapis_KEY = registerKey("lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> Nether_Redstone_ORE_KEY = registerKey("redstone_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> End_Coal_ORE_KEY = registerKey("end_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> End_Copper_KEY = registerKey("end_copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> End_Diamond_KEY = registerKey("end_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> End_Emerald_KEY = registerKey("end_emerald_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> End_Gold_KEY = registerKey("end_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> End_Iron_KEY = registerKey("end_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> End_Lapis_KEY = registerKey("end_lapis_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> End_Redstone_ORE_KEY = registerKey("end_redstone_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new BlockMatchRuleTest(Blocks.NETHERRACK);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endStoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> netherCoalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, NetherOresBlocks.Nether_Coal_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherCopperOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, NetherOresBlocks.Nether_Copper_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherDiamondOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, NetherOresBlocks.Nether_Diamond_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherEmeraldOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, NetherOresBlocks.Nether_Emerald_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherGoldOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, NetherOresBlocks.Nether_Gold_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherIronOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, NetherOresBlocks.Nether_Iron_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherLapisOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, NetherOresBlocks.Nether_Lapis_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> netherRedstoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, NetherOresBlocks.Nether_Redstone_Ore.getDefaultState()));

        register(context, Nether_Coal_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherCoalOres, 10));
        register(context, Nether_Copper_KEY, Feature.ORE, new OreFeatureConfig(netherCopperOres, 8));
        register(context, Nether_Diamond_KEY, Feature.ORE, new OreFeatureConfig(netherDiamondOres, 8));
        register(context, Nether_Emerald_KEY, Feature.ORE, new OreFeatureConfig(netherEmeraldOres, 3));
        register(context, Nether_Gold_KEY, Feature.ORE, new OreFeatureConfig(netherGoldOres, 8));
        register(context, Nether_Iron_KEY, Feature.ORE, new OreFeatureConfig(netherIronOres, 8));
        register(context, Nether_Lapis_KEY, Feature.ORE, new OreFeatureConfig(netherLapisOres, 8));
        register(context, Nether_Redstone_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRedstoneOres, 8));


        List<OreFeatureConfig.Target> endCoalOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, NetherOresBlocks.End_Coal_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> endCopperOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, NetherOresBlocks.End_Copper_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> endDiamondOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, NetherOresBlocks.End_Diamond_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> endEmeraldOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, NetherOresBlocks.End_Emerald_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> endGoldOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, NetherOresBlocks.End_Gold_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> endIronOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, NetherOresBlocks.End_Iron_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> endLapisOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, NetherOresBlocks.End_Lapis_Ore.getDefaultState()));
        List<OreFeatureConfig.Target> endRedstoneOres =
                List.of(OreFeatureConfig.createTarget(endStoneReplaceables, NetherOresBlocks.End_Redstone_Ore.getDefaultState()));

        register(context, End_Coal_ORE_KEY, Feature.ORE, new OreFeatureConfig(endCoalOres, 6));
        register(context, End_Copper_KEY, Feature.ORE, new OreFeatureConfig(endCopperOres, 4));
        register(context, End_Diamond_KEY, Feature.ORE, new OreFeatureConfig(endDiamondOres, 4));
        register(context, End_Emerald_KEY, Feature.ORE, new OreFeatureConfig(endEmeraldOres, 2));
        register(context, End_Gold_KEY, Feature.ORE, new OreFeatureConfig(endGoldOres, 5));
        register(context, End_Iron_KEY, Feature.ORE, new OreFeatureConfig(endIronOres, 5));
        register(context, End_Lapis_KEY, Feature.ORE, new OreFeatureConfig(endLapisOres, 4));
        register(context, End_Redstone_ORE_KEY, Feature.ORE, new OreFeatureConfig(endRedstoneOres, 4));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(NetherOres.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}

