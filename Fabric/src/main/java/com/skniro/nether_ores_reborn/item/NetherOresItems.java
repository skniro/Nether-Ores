package com.skniro.nether_ores_reborn.item;

import com.skniro.nether_ores_reborn.NetherOres;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;

public class NetherOresItems {
    //Tool

    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(NetherOres.MOD_ID, name),item);
    }

    public static void registerModItems() {
        NetherOres.LOGGER.info("Registering Ruby Items for " + NetherOres.MOD_ID);
    }

}
