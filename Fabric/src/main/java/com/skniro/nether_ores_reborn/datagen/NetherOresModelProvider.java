package com.skniro.nether_ores_reborn.datagen;

import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class NetherOresModelProvider extends FabricModelProvider {
    public NetherOresModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.Nether_Coal_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.Nether_Copper_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.Nether_Diamond_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.Nether_Emerald_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.Nether_Gold_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.Nether_Iron_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.Nether_Lapis_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.Nether_Redstone_Ore);

        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.End_Coal_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.End_Copper_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.End_Diamond_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.End_Emerald_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.End_Gold_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.End_Iron_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.End_Lapis_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(NetherOresBlocks.End_Redstone_Ore);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
