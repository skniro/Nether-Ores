package com.skniro.nether_ores_reborn.item;

import com.skniro.nether_ores_reborn.NetherOres;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MapleItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NetherOres.MOD_ID);


    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> item) {
        RegistryObject<T> toReturn = ITEMS.register(name, item);
        return toReturn;
    }

    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}