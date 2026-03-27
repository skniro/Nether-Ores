package com.skniro.nether_ores_reborn.block;

import com.skniro.nether_ores_reborn.NetherOres;
import com.skniro.nether_ores_reborn.item.MapleItems;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class NetherOresBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(NetherOres.MOD_ID);

    public static final Supplier<Block> Nether_Coal_Ore = registerBlock("coal_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Copper_Ore = registerBlock("copper_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Diamond_Ore = registerBlock("diamond_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Emerald_Ore = registerBlock("emerald_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Gold_Ore = registerBlock("gold_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Iron_Ore = registerBlock("iron_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Lapis_Ore = registerBlock("lapis_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> Nether_Redstone_Ore = registerBlock("redstone_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));

    public static final Supplier<Block> End_Coal_Ore = registerBlock("end_coal_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> End_Copper_Ore = registerBlock("end_copper_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> End_Diamond_Ore = registerBlock("end_diamond_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> End_Emerald_Ore = registerBlock("end_emerald_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> End_Gold_Ore = registerBlock("end_gold_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> End_Iron_Ore = registerBlock("end_iron_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> End_Lapis_Ore = registerBlock("end_lapis_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));
    public static final Supplier<Block> End_Redstone_Ore = registerBlock("end_redstone_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings), BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE));

    private static <B extends Block> DeferredBlock<B> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> bDeferredBlock = registerBlockWithoutItem(name, block, properties);
        registerBlockItem(name, bDeferredBlock);
        return bDeferredBlock;
    }

    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = BLOCKS.registerBlock(name, block, ()-> properties.setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(NetherOres.MOD_ID, name))));
        return register;
    }

    private static <B extends Block> DeferredBlock<B> registerBlockWithoutItemWithEmpty(String name, Function<BlockBehaviour.Properties, ? extends B> block, BlockBehaviour.Properties properties) {
        DeferredBlock<B> register = registerBlockWithoutItem(name, block, properties);
        return register;
    }

    private static <T extends Block> Holder<Item> registerBlockItem(String name, DeferredBlock<T> block) {
        return MapleItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(),
                new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(NetherOres.MOD_ID, name)))));
    }


    public static void registerMapleOreBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
