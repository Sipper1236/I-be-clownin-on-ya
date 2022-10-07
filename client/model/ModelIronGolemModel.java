// 
// Decompiled by Procyon v0.5.36
// 

package net.mcreator.ibeclowninonya.client.model;

import net.minecraft.resources.ResourceLocation;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.world.entity.Entity;

public class ModelIronGolemModel<T extends Entity> extends EntityModel<T>
{
    public static final ModelLayerLocation LAYER_LOCATION;
    public final ModelPart field_78176_b;
    public final ModelPart field_78174_d;
    public final ModelPart field_78177_c;
    public final ModelPart field_78175_e;
    public final ModelPart field_78178_a;
    public final ModelPart field_78173_f;
    public final ModelPart bb_main;
    
    public ModelIronGolemModel(final ModelPart root) {
        this.field_78176_b = root.m_171324_("field_78176_b");
        this.field_78174_d = root.m_171324_("field_78174_d");
        this.field_78177_c = root.m_171324_("field_78177_c");
        this.field_78175_e = root.m_171324_("field_78175_e");
        this.field_78178_a = root.m_171324_("field_78178_a");
        this.field_78173_f = root.m_171324_("field_78173_f");
        this.bb_main = root.m_171324_("bb_main");
    }
    
    public static LayerDefinition createBodyLayer() {
        final MeshDefinition meshdefinition = new MeshDefinition();
        final PartDefinition partdefinition = meshdefinition.m_171576_();
        final PartDefinition field_78176_b = partdefinition.m_171599_("field_78176_b", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0f, -7.0f, 0.0f));
        final PartDefinition field_78174_d = partdefinition.m_171599_("field_78174_d", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0f, -7.0f, 0.0f));
        final PartDefinition field_78177_c = partdefinition.m_171599_("field_78177_c", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0f, -7.0f, 0.0f));
        final PartDefinition field_78175_e = partdefinition.m_171599_("field_78175_e", CubeListBuilder.m_171558_(), PartPose.m_171419_(-4.0f, 11.0f, 0.0f));
        final PartDefinition field_78178_a = partdefinition.m_171599_("field_78178_a", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0f, -7.0f, -2.0f));
        final PartDefinition field_78173_f = partdefinition.m_171599_("field_78173_f", CubeListBuilder.m_171558_(), PartPose.m_171419_(5.0f, 11.0f, 0.0f));
        final PartDefinition bb_main = partdefinition.m_171599_("bb_main", CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-4.0f, -19.0f, -21.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.0f)).m_171514_(0, 0).m_171488_(-4.0f, -19.0f, -21.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(0.5f)).m_171514_(32, 0).m_171488_(-3.9f, -12.0f, -2.0f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).m_171514_(44, 12).m_171488_(-8.0f, -12.0f, -13.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).m_171514_(44, 12).m_171488_(4.0f, -12.0f, -13.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).m_171514_(32, 0).m_171488_(0.1f, -12.0f, -2.0f, 4.0f, 4.0f, 4.0f, new CubeDeformation(0.0f)).m_171514_(29, 28).m_171488_(-4.0f, -2.0f, -2.0f, 4.0f, 2.0f, 6.0f, new CubeDeformation(0.0f)).m_171514_(29, 28).m_171488_(0.0f, -2.0f, -2.0f, 4.0f, 2.0f, 6.0f, new CubeDeformation(0.0f)).m_171514_(18, 44).m_171488_(0.0f, -3.0f, 2.0f, 4.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).m_171514_(18, 44).m_171488_(-4.0f, -3.0f, 2.0f, 4.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.m_171419_(0.0f, 24.0f, 0.0f));
        final PartDefinition RightLeg_r1 = bb_main.m_171599_("RightLeg_r1", CubeListBuilder.m_171558_().m_171514_(32, 0).m_171488_(-3.9f, -8.0f, 1.0f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)).m_171514_(32, 0).m_171488_(-7.9f, -8.0f, 1.0f, 4.0f, 7.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.m_171423_(4.0f, 0.0f, 0.0f, 0.3927f, 0.0f, 0.0f));
        final PartDefinition RightArm_r1 = bb_main.m_171599_("RightArm_r1", CubeListBuilder.m_171558_().m_171514_(44, 12).m_171488_(-8.0f, -11.0f, -17.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)).m_171514_(44, 12).m_171488_(-20.0f, -11.0f, -17.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.m_171423_(12.0f, 0.0f, 0.0f, -0.829f, 0.0f, 0.0f));
        final PartDefinition cube_r1 = bb_main.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(24, 0).m_171488_(-1.0f, -11.0f, -25.0f, 2.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.m_171423_(0.0f, 0.0f, 0.0f, -0.5672f, 0.0f, 0.0f));
        final PartDefinition cube_r2 = bb_main.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0f, -5.0f, -27.0f, 2.0f, 6.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.m_171423_(0.0f, 0.0f, 0.0f, -1.0036f, 0.0f, 0.0f));
        final PartDefinition cube_r3 = bb_main.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(0, 16).m_171488_(-1.0f, -22.0f, 14.0f, 2.0f, 6.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.m_171423_(0.0f, 0.0f, 0.0f, 1.0036f, 0.0f, 0.0f));
        final PartDefinition Body_r1 = bb_main.m_171599_("Body_r1", CubeListBuilder.m_171558_().m_171514_(28, 28).m_171488_(-4.0f, -22.0f, 3.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.m_171423_(0.0f, 0.0f, 0.0f, 0.4363f, 0.0f, 0.0f));
        return LayerDefinition.m_171565_(meshdefinition, 128, 128);
    }
    
    public void m_6973_(final T entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch) {
    }
    
    public void m_7695_(final PoseStack poseStack, final VertexConsumer vertexConsumer, final int packedLight, final int packedOverlay, final float red, final float green, final float blue, final float alpha) {
        this.field_78176_b.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.field_78174_d.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.field_78177_c.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.field_78175_e.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.field_78178_a.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.field_78173_f.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.bb_main.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
    
    static {
        LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("i_be_clownin_on_ya", "model_iron_golem_model"), "main");
    }
}
