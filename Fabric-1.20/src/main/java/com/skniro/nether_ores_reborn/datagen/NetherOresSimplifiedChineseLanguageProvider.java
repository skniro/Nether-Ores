package com.skniro.nether_ores_reborn.datagen;

import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class NetherOresSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public NetherOresSimplifiedChineseLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
        translationBuilder.add(NetherOresBlocks.Nether_Coal_Ore,"下届煤矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Copper_Ore,"下届铜矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Diamond_Ore,"下届钻石矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Emerald_Ore,"下届绿宝石矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Gold_Ore,"下届金矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Iron_Ore,"下届铁矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Lapis_Ore,"下届青金石矿石");
        translationBuilder.add(NetherOresBlocks.Nether_Redstone_Ore,"下届红石矿石");
    }
}
