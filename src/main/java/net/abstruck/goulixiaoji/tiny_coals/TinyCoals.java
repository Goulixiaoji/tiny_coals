package net.abstruck.goulixiaoji.tiny_coals;

import net.abstruck.goulixiaoji.tiny_coals.registry.CoalRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Goulixiaoji
 */
@Mod(TinyCoals.MOD_ID)
public class TinyCoals {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tiny_coals";

    public TinyCoals() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        CoalRegistry.ITEMS.register(bus);
    }
}
