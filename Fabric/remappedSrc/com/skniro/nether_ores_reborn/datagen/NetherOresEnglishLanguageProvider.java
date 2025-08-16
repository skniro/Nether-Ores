package com.skniro.nether_ores_reborn.datagen;

import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import java.util.concurrent.CompletableFuture;

public class NetherOresEnglishLanguageProvider extends FabricLanguageProvider {
    public NetherOresEnglishLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataGenerator,"en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(NetherOresBlocks.Nether_Coal_Ore,"Nether Coal Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Copper_Ore,"Nether Copper Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Diamond_Ore,"Nether Diamond Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Emerald_Ore,"Nether Emerald Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Gold_Ore,"Nether Gold Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Iron_Ore,"Nether Iron Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Lapis_Ore,"Nether Lapis Ore");
        translationBuilder.add(NetherOresBlocks.Nether_Redstone_Ore,"Nether Redstone Ore");

        translationBuilder.add(NetherOresBlocks.End_Coal_Ore,"End Coal Ore");
        translationBuilder.add(NetherOresBlocks.End_Copper_Ore,"End Copper Ore");
        translationBuilder.add(NetherOresBlocks.End_Diamond_Ore,"End Diamond Ore");
        translationBuilder.add(NetherOresBlocks.End_Emerald_Ore,"End Emerald Ore");
        translationBuilder.add(NetherOresBlocks.End_Gold_Ore,"End Gold Ore");
        translationBuilder.add(NetherOresBlocks.End_Iron_Ore,"End Iron Ore");
        translationBuilder.add(NetherOresBlocks.End_Lapis_Ore,"End Lapis Ore");
        translationBuilder.add(NetherOresBlocks.End_Redstone_Ore,"End Redstone Ore");
    }
}
