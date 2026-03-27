package com.skniro.nether_ores_reborn.datagen;

import com.skniro.nether_ores_reborn.world.ModConfiguredFeatures;
import com.skniro.nether_ores_reborn.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class ModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModWorldGenerator::new);
        pack.addProvider(NetherOresLootTableGenerator::new);
        pack.addProvider(NetherOresModelProvider::new);
        pack.addProvider(NetherOresRecipeProvider::new);
        pack.addProvider(NetherOresEnglishLanguageProvider::new);
        pack.addProvider(NetherOresSimplifiedChineseLanguageProvider::new);
        pack.addProvider(ModBlockTagGeneration::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
        registryBuilder.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }
}
