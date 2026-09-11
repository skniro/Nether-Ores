package com.skniro.nether_ores_reborn.block;

import com.skniro.nether_ores_reborn.NetherOres;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class NetherOresBlocks {

    public static final Block Nether_Coal_Ore = registerBlock("coal_ore", new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHERRACK).mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block Nether_Copper_Ore = registerBlock("copper_ore", new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHERRACK).mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block Nether_Diamond_Ore = registerBlock("diamond_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHERRACK).mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block Nether_Emerald_Ore = registerBlock("emerald_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHERRACK).mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block Nether_Gold_Ore = registerBlock("gold_ore", new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHERRACK).mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block Nether_Iron_Ore = registerBlock("iron_ore", new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHERRACK).mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block Nether_Lapis_Ore = registerBlock("lapis_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHERRACK).mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block Nether_Redstone_Ore = registerBlock("redstone_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),  AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHERRACK).mapColor(MapColor.DARK_RED).instrument(NoteBlockInstrument.BASEDRUM)));

    public static final Block End_Coal_Ore = registerBlock("end_coal_ore", new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block End_Copper_Ore = registerBlock("end_copper_ore", new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block End_Diamond_Ore = registerBlock("end_diamond_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block End_Emerald_Ore = registerBlock("end_emerald_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block End_Gold_Ore = registerBlock("end_gold_ore", new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block End_Iron_Ore = registerBlock("end_iron_ore", new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block End_Lapis_Ore = registerBlock("end_lapis_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final Block End_Redstone_Ore = registerBlock("end_redstone_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),  AbstractBlock.Settings.create().requiresTool().ticksRandomly().strength(3.0F, 3.0F).mapColor(MapColor.PALE_YELLOW).instrument(NoteBlockInstrument.BASEDRUM)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(NetherOres.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(NetherOres.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(NetherOres.MOD_ID, name), block);
    }

    public static void registerBlock() {
        NetherOres.LOGGER.info("register Mod Blocks"+ NetherOres.MOD_ID);
    }
}
