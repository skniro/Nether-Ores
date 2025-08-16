package com.skniro.nether_ores_reborn;


import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import com.skniro.nether_ores_reborn.item.NetherOresItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;




public class ModContent {


    public static void registerItem(){

        NetherOresItems.registerModItems();
    }
    public static void registerBlock(){
        NetherOresBlocks.registerNetherOresBlock();
    }

    public static void CreativeTab() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
            content.add(NetherOresBlocks.Nether_Coal_Ore);
            content.add(NetherOresBlocks.Nether_Copper_Ore);
            content.add(NetherOresBlocks.Nether_Diamond_Ore);
            content.add(NetherOresBlocks.Nether_Emerald_Ore);
            content.add(NetherOresBlocks.Nether_Gold_Ore);
            content.add(NetherOresBlocks.Nether_Iron_Ore);
            content.add(NetherOresBlocks.Nether_Lapis_Ore);
            content.add(NetherOresBlocks.Nether_Redstone_Ore);

            content.add(NetherOresBlocks.End_Coal_Ore);
            content.add(NetherOresBlocks.End_Copper_Ore);
            content.add(NetherOresBlocks.End_Diamond_Ore);
            content.add(NetherOresBlocks.End_Emerald_Ore);
            content.add(NetherOresBlocks.End_Gold_Ore);
            content.add(NetherOresBlocks.End_Iron_Ore);
            content.add(NetherOresBlocks.End_Lapis_Ore);
            content.add(NetherOresBlocks.End_Redstone_Ore);
        });
    }
}
