package com.skniro.nether_ores_reborn.datagen;

import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class NetherOresSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public NetherOresSimplifiedChineseLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup){
        super(dataGenerator,"zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(NetherOresBlocks.Nether_Coal_Ore,"下界煤矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Copper_Ore,"下界铜矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Diamond_Ore,"下界钻石矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Emerald_Ore,"下界绿宝石矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Gold_Ore,"下界金矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Iron_Ore,"下界铁矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Lapis_Ore,"下界青金石矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Redstone_Ore,"下界红石矿石");

        translationBuilder.add(NetherOresBlocks.End_Coal_Ore,"末地煤矿石");
        translationBuilder.add(NetherOresBlocks.End_Copper_Ore,"末地铜矿石");
        translationBuilder.add(NetherOresBlocks.End_Diamond_Ore,"末地钻石矿石");
        translationBuilder.add(NetherOresBlocks.End_Emerald_Ore,"末地绿宝石矿石");
        translationBuilder.add(NetherOresBlocks.End_Gold_Ore,"末地金矿石");
        translationBuilder.add(NetherOresBlocks.End_Iron_Ore,"末地铁矿石");
        translationBuilder.add(NetherOresBlocks.End_Lapis_Ore,"末地青金石矿石");
        translationBuilder.add(NetherOresBlocks.End_Redstone_Ore,"末地红石矿石");
    }
}
