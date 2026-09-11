package com.skniro.nether_ores_reborn.block;

import com.skniro.nether_ores_reborn.NetherOres;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

public class NetherOresBlocks {
    public static final Block Nether_Coal_Ore = registerBlock("coal_ore", (settings)-> new DropExperienceBlock(UniformInt.of(0, 2), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block Nether_Copper_Ore = registerBlock("copper_ore", (settings)-> new DropExperienceBlock(ConstantInt.of(0), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block Nether_Diamond_Ore = registerBlock("diamond_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block Nether_Emerald_Ore = registerBlock("emerald_ore", (settings)-> new DropExperienceBlock(UniformInt.of(3, 7), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block Nether_Gold_Ore = registerBlock("gold_ore", (settings)-> new DropExperienceBlock(ConstantInt.of(0), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block Nether_Iron_Ore = registerBlock("iron_ore", (settings)-> new DropExperienceBlock(ConstantInt.of(0), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block Nether_Lapis_Ore = registerBlock("lapis_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block Nether_Redstone_Ore = registerBlock("redstone_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block End_Coal_Ore = registerBlock("end_coal_ore", (settings)-> new DropExperienceBlock(UniformInt.of(0, 2), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block End_Copper_Ore = registerBlock("end_copper_ore", (settings)-> new DropExperienceBlock(ConstantInt.of(0), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block End_Diamond_Ore = registerBlock("end_diamond_ore", (settings)-> new DropExperienceBlock(UniformInt.of(3, 7), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block End_Emerald_Ore = registerBlock("end_emerald_ore", (settings)-> new DropExperienceBlock(UniformInt.of(3, 7), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block End_Gold_Ore = registerBlock("end_gold_ore", (settings)-> new DropExperienceBlock(ConstantInt.of(0), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block End_Iron_Ore = registerBlock("end_iron_ore", (settings)-> new DropExperienceBlock(ConstantInt.of(0), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block End_Lapis_Ore = registerBlock("end_lapis_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 5), settings),BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM));
    public static final Block End_Redstone_Ore = registerBlock("end_redstone_ore", (settings)-> new DropExperienceBlock(UniformInt.of(2, 4), settings), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM));


    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = (Block)factory.apply(settings.setId(keyOf(name)));
        registerBlockItem(name, block);
        return Registry.register(BuiltInRegistries.BLOCK, keyOf(name), block);
    }


    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(NetherOres.MOD_ID, name)),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(NetherOres.MOD_ID, name)))));
    }

    private static Block registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings) {
        Block block = (Block)factory.apply(settings.setId(keyOf(name)));
        return Registry.register(BuiltInRegistries.BLOCK, keyOf(name), block);
    }

    private static ResourceKey<Block> keyOf(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(NetherOres.MOD_ID, name));
    }

    public static void registerNetherOresBlock() {
        NetherOres.LOGGER.info("register Mod Nether Ores Blocks"+ NetherOres.MOD_ID);
    }
}
