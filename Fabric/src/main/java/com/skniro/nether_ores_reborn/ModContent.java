package com.skniro.nether_ores_reborn;


import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import com.skniro.nether_ores_reborn.item.NetherOresItems;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;




public class ModContent {


    public static void registerItem(){

        NetherOresItems.registerModItems();
    }
    public static void registerBlock(){
        NetherOresBlocks.registerNetherOresBlock();
    }

    public static void CreativeTab() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> {
            content.accept(NetherOresBlocks.Nether_Coal_Ore);
            content.accept(NetherOresBlocks.Nether_Copper_Ore);
            content.accept(NetherOresBlocks.Nether_Diamond_Ore);
            content.accept(NetherOresBlocks.Nether_Emerald_Ore);
            content.accept(NetherOresBlocks.Nether_Gold_Ore);
            content.accept(NetherOresBlocks.Nether_Iron_Ore);
            content.accept(NetherOresBlocks.Nether_Lapis_Ore);
            content.accept(NetherOresBlocks.Nether_Redstone_Ore);

            content.accept(NetherOresBlocks.End_Coal_Ore);
            content.accept(NetherOresBlocks.End_Copper_Ore);
            content.accept(NetherOresBlocks.End_Diamond_Ore);
            content.accept(NetherOresBlocks.End_Emerald_Ore);
            content.accept(NetherOresBlocks.End_Gold_Ore);
            content.accept(NetherOresBlocks.End_Iron_Ore);
            content.accept(NetherOresBlocks.End_Lapis_Ore);
            content.accept(NetherOresBlocks.End_Redstone_Ore);
        });
    }
}
