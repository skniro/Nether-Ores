package com.skniro.nether_ores_reborn.world;

import com.skniro.nether_ores_reborn.NetherOres;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> Coal_ORE_PLACED_KEY = registerKey("coal_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Copper_PLACED_KEY = registerKey("copper_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Diamond_PLACED_KEY = registerKey("diamond_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Emerald_PLACED_KEY = registerKey("emerald_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Gold_PLACED_KEY = registerKey("gold_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Iron_PLACED_KEY = registerKey("iron_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Lapis_PLACED_KEY = registerKey("lapis_ore_placed");
    public static final ResourceKey<PlacedFeature> Nether_Redstone_PLACED_KEY = registerKey("redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> End_Coal_ORE_PLACED_KEY = registerKey("end_coal_ore_placed");
    public static final ResourceKey<PlacedFeature> End_Copper_PLACED_KEY = registerKey("end_copper_ore_placed");
    public static final ResourceKey<PlacedFeature> End_Diamond_PLACED_KEY = registerKey("end_diamond_ore_placed");
    public static final ResourceKey<PlacedFeature> End_Emerald_PLACED_KEY = registerKey("end_emerald_ore_placed");
    public static final ResourceKey<PlacedFeature> End_Gold_PLACED_KEY = registerKey("end_gold_ore_placed");
    public static final ResourceKey<PlacedFeature> End_Iron_PLACED_KEY = registerKey("end_iron_ore_placed");
    public static final ResourceKey<PlacedFeature> End_Lapis_PLACED_KEY = registerKey("end_lapis_ore_placed");
    public static final ResourceKey<PlacedFeature> End_Redstone_PLACED_KEY = registerKey("end_redstone_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, Coal_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Nether_Coal_ORE_KEY),
                modifiersWithCount(20, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context,Nether_Copper_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Nether_Copper_KEY),
                modifiersWithCount(16, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, Nether_Diamond_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Nether_Diamond_KEY),
                modifiersWithCount(8, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, Nether_Emerald_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Nether_Emerald_KEY),
                modifiersWithCount(6, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, Nether_Gold_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Nether_Gold_KEY),
                modifiersWithCount(10, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, Nether_Iron_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures. Nether_Iron_KEY),
                modifiersWithCount(16, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, Nether_Lapis_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Nether_Lapis_KEY),
                modifiersWithCount(10, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, Nether_Redstone_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.Nether_Redstone_ORE_KEY),
                modifiersWithCount(10, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, End_Coal_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.End_Coal_ORE_KEY),
                modifiersWithCount(20, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, End_Copper_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.End_Copper_KEY),
                modifiersWithCount(16, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, End_Diamond_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.End_Diamond_KEY),
                modifiersWithCount(8, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, End_Emerald_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.End_Emerald_KEY),
                modifiersWithCount(6, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, End_Gold_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.End_Gold_KEY),
                modifiersWithCount(10, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, End_Iron_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures. End_Iron_KEY),
                modifiersWithCount(16, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, End_Lapis_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.End_Lapis_KEY),
                modifiersWithCount(10, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));

        register(context, End_Redstone_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.End_Redstone_ORE_KEY),
                modifiersWithCount(10, // Veins per Chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(256))));
    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(NetherOres.MOD_ID, name));
    }
    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                                                                   Holder<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    // Used here because the vanilla ones are private
    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, InSquarePlacement.spread(), heightModifier, BiomeFilter.biome());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacement.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilter.onAverageOnceEvery(chance), heightModifier);
    }
}
