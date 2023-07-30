package com.skniro.nether_ores_reborn.datagen;

import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;


public class NetherOresLootTableGenerator extends FabricBlockLootTableProvider {
    public NetherOresLootTableGenerator(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generate() {
        addDrop(NetherOresBlocks.Nether_Coal_Ore, oreDrops(NetherOresBlocks.Nether_Coal_Ore,Items.COAL));
        addDrop(NetherOresBlocks.Nether_Copper_Ore, copperOreDrops(NetherOresBlocks.Nether_Copper_Ore));
        addDrop(NetherOresBlocks.Nether_Diamond_Ore, oreDrops(NetherOresBlocks.Nether_Diamond_Ore,Items.DIAMOND));
        addDrop(NetherOresBlocks.Nether_Emerald_Ore, oreDrops(NetherOresBlocks.Nether_Emerald_Ore,Items.EMERALD));
        addDrop(NetherOresBlocks.Nether_Gold_Ore, oreDrops(NetherOresBlocks.Nether_Gold_Ore,Items.RAW_GOLD));
        addDrop(NetherOresBlocks.Nether_Iron_Ore, oreDrops(NetherOresBlocks.Nether_Iron_Ore,Items.RAW_IRON));
        addDrop(NetherOresBlocks.Nether_Lapis_Ore, lapisOreDrops(NetherOresBlocks.Nether_Lapis_Ore));
        addDrop(NetherOresBlocks.Nether_Redstone_Ore,redstoneOreDrops(NetherOresBlocks.Nether_Redstone_Ore));
        addDrop(NetherOresBlocks.Nether_Coal_Ore, oreDrops(NetherOresBlocks.Nether_Coal_Ore,Items.COAL));



    }


}
