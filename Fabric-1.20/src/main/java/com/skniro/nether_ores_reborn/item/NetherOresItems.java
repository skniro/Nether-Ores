package com.skniro.nether_ores_reborn.item;

import com.skniro.nether_ores_reborn.NetherOres;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class NetherOresItems {
    //Tool

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(NetherOres.MOD_ID, name),item);
    }

    public static void registerModItems() {
        NetherOres.LOGGER.info("Registering Ruby Items for " + NetherOres.MOD_ID);
    }

}
