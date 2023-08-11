package com.skniro.nether_ores_reborn;

import com.skniro.nether_ores_reborn.world.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class NetherOres implements ModInitializer {
    public static final String MOD_ID = "nether_ores_reborn";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    @Override
    public void onInitialize() {
        ModContent.CreativeTab();
        ModContent.registerBlock();
        ModContent.registerItem();
        ModOreGeneration.generateOres();
    }
}
