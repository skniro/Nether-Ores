package com.skniro.nether_ores_reborn.client;

import com.skniro.nether_ores_reborn.NetherOres;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = NetherOres.MOD_ID, value = Dist.CLIENT)
public class MapleClient {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

    }
}
