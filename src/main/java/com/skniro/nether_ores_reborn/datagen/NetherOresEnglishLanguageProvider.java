package com.skniro.nether_ores_reborn.datagen;

import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class NetherOresEnglishLanguageProvider extends FabricLanguageProvider {
    public NetherOresEnglishLanguageProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(NetherOresBlocks.Nether_Coal_Ore,"Nether Coal Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Copper_Ore,"Nether Copper Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Diamond_Ore,"Nether Diamond Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Emerald_Ore,"Nether Emerald Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Gold_Ore,"Nether Gold Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Iron_Ore,"Nether Iron Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Lapis_Ore,"Nether Lapis Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Redstone_Ore,"Nether Redstone Ore");


    }
}
