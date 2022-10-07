// 
// Decompiled by Procyon v0.5.36
// 

package net.mcreator.ibeclowninonya.client.renderer;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.HumanoidModel;
import net.mcreator.ibeclowninonya.entity.ClownEntity;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;

public class ClownRenderer extends HumanoidMobRenderer<ClownEntity, HumanoidModel<ClownEntity>>
{
    public ClownRenderer(final EntityRendererProvider.Context context) {
        super(context, new HumanoidModel(context.m_174023_(ModelLayers.f_171162_)), 0.5f);
        this.m_115326_((RenderLayer)new HumanoidArmorLayer((RenderLayerParent)this, new HumanoidModel(context.m_174023_(ModelLayers.f_171164_)), new HumanoidModel(context.m_174023_(ModelLayers.f_171165_))));
    }
    
    public ResourceLocation getTextureLocation(final ClownEntity entity) {
        return new ResourceLocation("i_be_clownin_on_ya:textures/entities/screenshots2.png");
    }
}
