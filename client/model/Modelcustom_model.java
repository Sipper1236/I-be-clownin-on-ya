// 
// Decompiled by Procyon v0.5.36
// 

package net.mcreator.ibeclowninonya.client.model;

import net.minecraft.resources.ResourceLocation;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.world.entity.Entity;

public class Modelcustom_model<T extends Entity> extends EntityModel<T>
{
    public static final ModelLayerLocation LAYER_LOCATION;
    public final ModelPart head;
    public final ModelPart rightleg;
    public final ModelPart leftleg;
    public final ModelPart rightarm;
    public final ModelPart leftarm;
    public final ModelPart torso;
    public final ModelPart balloon;
    
    public Modelcustom_model(final ModelPart root) {
        this.head = root.m_171324_("head");
        this.rightleg = root.m_171324_("rightleg");
        this.leftleg = root.m_171324_("leftleg");
        this.rightarm = root.m_171324_("rightarm");
        this.leftarm = root.m_171324_("leftarm");
        this.torso = root.m_171324_("torso");
        this.balloon = root.m_171324_("balloon");
    }
    
    public static LayerDefinition createBodyLayer() {
        final MeshDefinition meshdefinition = new MeshDefinition();
        final PartDefinition partdefinition = meshdefinition.m_171576_();
        final PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_().m_171514_(0, 19).m_171488_(-6.0f, -30.0f, -3.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)), PartPose.m_171419_(0.0f, 24.0f, 0.0f));
        final PartDefinition rightleg = partdefinition.m_171599_("rightleg", CubeListBuilder.m_171558_().m_171514_(36, 0).m_171488_(-6.0f, -11.0f, -1.0f, 4.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.m_171419_(0.0f, 24.0f, 0.0f));
        final PartDefinition leftleg = partdefinition.m_171599_("leftleg", CubeListBuilder.m_171558_().m_171514_(16, 42).m_171488_(-2.0f, -11.0f, -1.0f, 4.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.m_171419_(0.0f, 24.0f, 0.0f));
        final PartDefinition rightarm = partdefinition.m_171599_("rightarm", CubeListBuilder.m_171558_().m_171514_(0, 35).m_171488_(-10.0f, -22.0f, -1.0f, 4.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.m_171419_(0.0f, 24.0f, 0.0f));
        final PartDefinition leftarm = partdefinition.m_171599_("leftarm", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0f, 24.0f, 0.0f));
        final PartDefinition LeftArm_r1 = leftarm.m_171599_("LeftArm_r1", CubeListBuilder.m_171558_().m_171514_(32, 15).m_171488_(-2.0f, -32.0f, -1.0f, 4.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.m_171423_(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1745f));
        final PartDefinition torso = partdefinition.m_171599_("torso", CubeListBuilder.m_171558_().m_171514_(28, 31).m_171488_(-6.0f, -22.0f, -1.0f, 8.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.m_171419_(0.0f, 24.0f, 0.0f));
        final PartDefinition balloon = partdefinition.m_171599_("balloon", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(1.0f, -54.0f, -4.0f, 9.0f, 10.0f, 9.0f, new CubeDeformation(0.0f)).m_171514_(32, 46).m_171488_(5.0f, -44.0f, 0.0f, 1.0f, 14.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.m_171419_(0.0f, 24.0f, 0.0f));
        return LayerDefinition.m_171565_(meshdefinition, 64, 64);
    }
    
    public void m_7695_(final PoseStack poseStack, final VertexConsumer vertexConsumer, final int packedLight, final int packedOverlay, final float red, final float green, final float blue, final float alpha) {
        this.head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightleg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftleg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.rightarm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leftarm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.torso.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.balloon.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
    
    public void m_6973_(final T entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch) {
    }
    
    static {
        LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("i_be_clownin_on_ya", "modelcustom_model"), "main");
    }
}
