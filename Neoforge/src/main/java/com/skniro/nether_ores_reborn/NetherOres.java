package com.skniro.nether_ores_reborn;

import com.mojang.logging.LogUtils;
import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import com.skniro.nether_ores_reborn.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NetherOres.MOD_ID)
public class NetherOres {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "nether_ores_reborn";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public NetherOres(IEventBus modEventBus) {

        NetherOresBlocks.registerMapleOreBlocks(modEventBus);
        MapleItems.registerModItems(modEventBus);

        NeoForge.EVENT_BUS.register(this);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
