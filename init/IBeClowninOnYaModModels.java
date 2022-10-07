// 
// Decompiled by Procyon v0.5.36
// 

package net.mcreator.ibeclowninonya.init;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.mcreator.ibeclowninonya.client.model.Modelcustom_model;
import java.util.function.Supplier;
import net.mcreator.ibeclowninonya.client.model.ModelIronGolemModel;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = { Dist.CLIENT })
public class IBeClowninOnYaModModels
{
    @SubscribeEvent
    public static void registerLayerDefinitions(final EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelIronGolemModel.LAYER_LOCATION, (Supplier)ModelIronGolemModel::createBodyLayer);
        event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, (Supplier)Modelcustom_model::createBodyLayer);
    }
}
