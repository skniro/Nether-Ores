package com.skniro.nether_ores_reborn.block;

import com.skniro.nether_ores_reborn.NetherOres;
import com.skniro.nether_ores_reborn.item.MapleItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class NetherOresBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, NetherOres.MOD_ID);

    public static final Supplier<Block> Nether_Coal_Ore = registerBlock("coal_ore",
            ()-> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> Nether_Copper_Ore = registerBlock("copper_ore",
            ()-> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> Nether_Diamond_Ore = registerBlock("diamond_ore",
            ()-> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> Nether_Emerald_Ore = registerBlock("emerald_ore",
            ()-> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> Nether_Gold_Ore = registerBlock("gold_ore",
            ()-> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> Nether_Iron_Ore = registerBlock("iron_ore",
            ()-> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> Nether_Lapis_Ore = registerBlock("lapis_ore",
            ()-> new DropExperienceBlock(UniformInt.of(2, 4), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> Nether_Redstone_Ore = registerBlock("redstone_ore",
            ()-> new DropExperienceBlock(UniformInt.of(2, 4),  BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).sound(SoundType.NETHERRACK).mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Supplier<Block> End_Coal_Ore = registerBlock("end_coal_ore",
            ()-> new DropExperienceBlock(UniformInt.of(0, 2), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> End_Copper_Ore = registerBlock("end_copper_ore",
            ()-> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> End_Diamond_Ore = registerBlock("end_diamond_ore",
            ()-> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> End_Emerald_Ore = registerBlock("end_emerald_ore",
            ()-> new DropExperienceBlock(UniformInt.of(3, 7), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> End_Gold_Ore = registerBlock("end_gold_ore",
            ()-> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> End_Iron_Ore = registerBlock("end_iron_ore",
            ()-> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> End_Lapis_Ore = registerBlock("end_lapis_ore",
            ()-> new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Supplier<Block> End_Redstone_Ore = registerBlock("end_redstone_ore",
            ()-> new DropExperienceBlock(UniformInt.of(2, 4),  BlockBehaviour.Properties.of().requiresCorrectToolForDrops().randomTicks().strength(3.0F, 3.0F).mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASEDRUM)));


    private static <T extends Block> Supplier<T> registerBlockWithoutItem(String name, Supplier<T> block) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> Supplier<Item> registerBlockItem(String name, Supplier<T> block
                                                                            ) {
        return MapleItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerMapleOreBlocks(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
