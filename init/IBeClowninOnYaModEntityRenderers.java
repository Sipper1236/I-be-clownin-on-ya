// 
// Decompiled by Procyon v0.5.36
// 

package net.mcreator.ibeclowninonya.init;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.mcreator.ibeclowninonya.client.renderer.BalloonClownRenderer;
import net.mcreator.ibeclowninonya.client.renderer.GigaClownRenderer;
import net.mcreator.ibeclowninonya.client.renderer.ClownRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = { Dist.CLIENT })
public class IBeClowninOnYaModEntityRenderers
{
    @SubscribeEvent
    public static void registerEntityRenderers(final EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer((EntityType)IBeClowninOnYaModEntities.CLOWN.get(), ClownRenderer::new);
        event.registerEntityRenderer((EntityType)IBeClowninOnYaModEntities.GIGA_CLOWN.get(), GigaClownRenderer::new);
        event.registerEntityRenderer((EntityType)IBeClowninOnYaModEntities.BALLOON_CLOWN.get(), BalloonClownRenderer::new);
    }
}
