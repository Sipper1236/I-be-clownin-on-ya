// 
// Decompiled by Procyon v0.5.36
// 

package net.mcreator.ibeclowninonya.init;

import java.util.function.BiFunction;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraft.world.entity.Entity;
import net.mcreator.ibeclowninonya.entity.BalloonClownEntity;
import net.mcreator.ibeclowninonya.entity.GigaClownEntity;
import net.mcreator.ibeclowninonya.entity.ClownEntity;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IBeClowninOnYaModEntities
{
    public static final DeferredRegister<EntityType<?>> REGISTRY;
    public static final RegistryObject<EntityType<ClownEntity>> CLOWN;
    public static final RegistryObject<EntityType<GigaClownEntity>> GIGA_CLOWN;
    public static final RegistryObject<EntityType<BalloonClownEntity>> BALLOON_CLOWN;
    
    private static <T extends Entity> RegistryObject<EntityType<T>> register(final String registryname, final EntityType.Builder<T> entityTypeBuilder) {
        return (RegistryObject<EntityType<T>>)IBeClowninOnYaModEntities.REGISTRY.register(registryname, () -> entityTypeBuilder.m_20712_(registryname));
    }
    
    @SubscribeEvent
    public static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ClownEntity.init();
            GigaClownEntity.init();
            BalloonClownEntity.init();
        });
    }
    
    @SubscribeEvent
    public static void registerAttributes(final EntityAttributeCreationEvent event) {
        event.put((EntityType)IBeClowninOnYaModEntities.CLOWN.get(), ClownEntity.createAttributes().m_22265_());
        event.put((EntityType)IBeClowninOnYaModEntities.GIGA_CLOWN.get(), GigaClownEntity.createAttributes().m_22265_());
        event.put((EntityType)IBeClowninOnYaModEntities.BALLOON_CLOWN.get(), BalloonClownEntity.createAttributes().m_22265_());
    }
    
    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, "i_be_clownin_on_ya");
        CLOWN = register("clown", (EntityType.Builder<ClownEntity>)EntityType.Builder.m_20704_(ClownEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory((BiFunction)ClownEntity::new).m_20699_(0.6f, 1.8f));
        GIGA_CLOWN = register("giga_clown", (EntityType.Builder<GigaClownEntity>)EntityType.Builder.m_20704_(GigaClownEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory((BiFunction)GigaClownEntity::new).m_20699_(0.6f, 1.8f));
        BALLOON_CLOWN = register("balloon_clown", (EntityType.Builder<BalloonClownEntity>)EntityType.Builder.m_20704_(BalloonClownEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory((BiFunction)BalloonClownEntity::new).m_20699_(0.6f, 1.8f));
    }
}
