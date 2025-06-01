package com.skniro.nether_ores_reborn.item;

import com.skniro.nether_ores_reborn.NetherOres;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MapleItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, NetherOres.MOD_ID);

    private static <T extends Item> Supplier<T> registerItem(String name, Supplier<T> item) {
        Supplier<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}