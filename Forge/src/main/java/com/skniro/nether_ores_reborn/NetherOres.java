package com.skniro.nether_ores_reborn;

import com.mojang.logging.LogUtils;
import com.skniro.nether_ores_reborn.block.NetherOresBlocks;
import com.skniro.nether_ores_reborn.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(NetherOres.MOD_ID)
public class NetherOres {
    public static final String MOD_ID = "nether_ores_reborn";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public NetherOres(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        NetherOresBlocks.registerMapleOreBlocks(modEventBus);
        MapleItems.registerModItems(modEventBus);


        MinecraftForge.EVENT_BUS.register(this);
    }


    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
