// 
// Decompiled by Procyon v0.5.36
// 

package net.mcreator.ibeclowninonya.client.renderer;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.mcreator.ibeclowninonya.client.model.ModelIronGolemModel;
import net.mcreator.ibeclowninonya.entity.GigaClownEntity;
import net.minecraft.client.renderer.entity.MobRenderer;

public class GigaClownRenderer extends MobRenderer<GigaClownEntity, ModelIronGolemModel<GigaClownEntity>>
{
    public GigaClownRenderer(final EntityRendererProvider.Context context) {
        super(context, (EntityModel)new ModelIronGolemModel<Object>(context.m_174023_(ModelIronGolemModel.LAYER_LOCATION)), 0.5f);
    }
    
    public ResourceLocation getTextureLocation(final GigaClownEntity entity) {
        return new ResourceLocation("i_be_clownin_on_ya:textures/entities/very_really_good.png");
    }
}
