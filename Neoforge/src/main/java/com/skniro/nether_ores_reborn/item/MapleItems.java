package com.skniro.nether_ores_reborn.item;

import com.skniro.nether_ores_reborn.NetherOres;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class MapleItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NetherOres.MOD_ID);

    private static <T extends Item> DeferredItem<T> registerItem(String name, Function<Item.Properties, ? extends T> item, Item.Properties properties) {
        DeferredItem<T> toReturn = ITEMS.registerItem(name, item, ()-> properties.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(NetherOres.MOD_ID, name))));
        return toReturn;
    }

    private static Function<Item.Properties, Item> createBlockItemWithUniqueName(Supplier<Block> block) {
        return (properties) -> {
            return new BlockItem(block.get(), properties.useItemDescriptionPrefix());
        };
    }
    public static void registerModItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}