package com.skniro.nether_ores_reborn.datagen;

import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import java.util.concurrent.CompletableFuture;


public class NetherOresLootTableGenerator extends FabricBlockLootTableProvider {
    public NetherOresLootTableGenerator(FabricDataOutput dataGenerator, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataGenerator, registryLookup);
    }

    @Override
    public void generate() {
        add(NetherOresBlocks.Nether_Coal_Ore, createOreDrop(NetherOresBlocks.Nether_Coal_Ore,Items.COAL));
        add(NetherOresBlocks.Nether_Copper_Ore, createCopperOreDrops(NetherOresBlocks.Nether_Copper_Ore));
        add(NetherOresBlocks.Nether_Diamond_Ore, createOreDrop(NetherOresBlocks.Nether_Diamond_Ore,Items.DIAMOND));
        add(NetherOresBlocks.Nether_Emerald_Ore, createOreDrop(NetherOresBlocks.Nether_Emerald_Ore,Items.EMERALD));
        add(NetherOresBlocks.Nether_Gold_Ore, createOreDrop(NetherOresBlocks.Nether_Gold_Ore,Items.RAW_GOLD));
        add(NetherOresBlocks.Nether_Iron_Ore, createOreDrop(NetherOresBlocks.Nether_Iron_Ore,Items.RAW_IRON));
        add(NetherOresBlocks.Nether_Lapis_Ore, createLapisOreDrops(NetherOresBlocks.Nether_Lapis_Ore));
        add(NetherOresBlocks.Nether_Redstone_Ore,createRedstoneOreDrops(NetherOresBlocks.Nether_Redstone_Ore));
        add(NetherOresBlocks.Nether_Coal_Ore, createOreDrop(NetherOresBlocks.Nether_Coal_Ore,Items.COAL));

        add(NetherOresBlocks.End_Coal_Ore, createOreDrop(NetherOresBlocks.End_Coal_Ore, Items.COAL));
        add(NetherOresBlocks.End_Copper_Ore, createCopperOreDrops(NetherOresBlocks.End_Copper_Ore));
        add(NetherOresBlocks.End_Diamond_Ore, createOreDrop(NetherOresBlocks.End_Diamond_Ore, Items.DIAMOND));
        add(NetherOresBlocks.End_Emerald_Ore, createOreDrop(NetherOresBlocks.End_Emerald_Ore, Items.EMERALD));
        add(NetherOresBlocks.End_Gold_Ore, createOreDrop(NetherOresBlocks.End_Gold_Ore, Items.RAW_GOLD));
        add(NetherOresBlocks.End_Iron_Ore, createOreDrop(NetherOresBlocks.End_Iron_Ore, Items.RAW_IRON));
        add(NetherOresBlocks.End_Lapis_Ore, createLapisOreDrops(NetherOresBlocks.End_Lapis_Ore));
        add(NetherOresBlocks.End_Redstone_Ore, createRedstoneOreDrops(NetherOresBlocks.End_Redstone_Ore));
        add(NetherOresBlocks.End_Coal_Ore, createOreDrop(NetherOresBlocks.End_Coal_Ore, Items.COAL));

    }


}
