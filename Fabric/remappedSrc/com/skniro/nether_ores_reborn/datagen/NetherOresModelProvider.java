package com.skniro.nether_ores_reborn.datagen;

import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class NetherOresModelProvider extends FabricModelProvider {
    public NetherOresModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator){
        blockStateModelGenerator.family(NetherOresBlocks.Nether_Coal_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.Nether_Copper_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.Nether_Diamond_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.Nether_Emerald_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.Nether_Gold_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.Nether_Iron_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.Nether_Lapis_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.Nether_Redstone_Ore);

        blockStateModelGenerator.family(NetherOresBlocks.End_Coal_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.End_Copper_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.End_Diamond_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.End_Emerald_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.End_Gold_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.End_Iron_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.End_Lapis_Ore);
        blockStateModelGenerator.family(NetherOresBlocks.End_Redstone_Ore);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

    }
}
