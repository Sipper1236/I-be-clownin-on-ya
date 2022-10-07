// 
// Decompiled by Procyon v0.5.36
// 

package net.mcreator.ibeclowninonya.client.renderer;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.mcreator.ibeclowninonya.client.model.Modelcustom_model;
import net.mcreator.ibeclowninonya.entity.BalloonClownEntity;
import net.minecraft.client.renderer.entity.MobRenderer;

public class BalloonClownRenderer extends MobRenderer<BalloonClownEntity, Modelcustom_model<BalloonClownEntity>>
{
    public BalloonClownRenderer(final EntityRendererProvider.Context context) {
        super(context, (EntityModel)new Modelcustom_model<Object>(context.m_174023_(Modelcustom_model.LAYER_LOCATION)), 0.5f);
    }
    
    public ResourceLocation getTextureLocation(final BalloonClownEntity entity) {
        return new ResourceLocation("i_be_clownin_on_ya:textures/entities/ballonmantwest1.png");
    }
}
