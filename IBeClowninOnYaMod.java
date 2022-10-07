// 
// Decompiled by Procyon v0.5.36
// 

package net.mcreator.ibeclowninonya;

import java.util.function.Predicate;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import net.minecraftforge.network.NetworkEvent;
import java.util.function.Supplier;
import java.util.function.Function;
import net.minecraft.network.FriendlyByteBuf;
import java.util.function.BiConsumer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.mcreator.ibeclowninonya.init.IBeClowninOnYaModEntities;
import net.mcreator.ibeclowninonya.init.IBeClowninOnYaModItems;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;

@Mod("i_be_clownin_on_ya")
public class IBeClowninOnYaMod
{
    public static final Logger LOGGER;
    public static final String MODID = "i_be_clownin_on_ya";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER;
    private static int messageID;
    
    public IBeClowninOnYaMod() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        IBeClowninOnYaModItems.REGISTRY.register(bus);
        IBeClowninOnYaModEntities.REGISTRY.register(bus);
    }
    
    public static <T> void addNetworkMessage(final Class<T> messageType, final BiConsumer<T, FriendlyByteBuf> encoder, final Function<FriendlyByteBuf, T> decoder, final BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        IBeClowninOnYaMod.PACKET_HANDLER.registerMessage(IBeClowninOnYaMod.messageID, (Class)messageType, (BiConsumer)encoder, (Function)decoder, (BiConsumer)messageConsumer);
        ++IBeClowninOnYaMod.messageID;
    }
    
    static {
        LOGGER = LogManager.getLogger((Class)IBeClowninOnYaMod.class);
        PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation("i_be_clownin_on_ya", "i_be_clownin_on_ya"), () -> "1", (Predicate)"1"::equals, (Predicate)"1"::equals);
        IBeClowninOnYaMod.messageID = 0;
    }
}
