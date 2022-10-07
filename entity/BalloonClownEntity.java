// 
// Decompiled by Procyon v0.5.36
// 

package net.mcreator.ibeclowninonya.entity;

import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import java.util.Random;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import java.util.EnumSet;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.network.NetworkHooks;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.mcreator.ibeclowninonya.init.IBeClowninOnYaModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;
import net.minecraft.world.entity.monster.Monster;

public class BalloonClownEntity extends Monster
{
    public BalloonClownEntity(final PlayMessages.SpawnEntity packet, final Level world) {
        this((EntityType<BalloonClownEntity>)IBeClowninOnYaModEntities.BALLOON_CLOWN.get(), world);
    }
    
    public BalloonClownEntity(final EntityType<BalloonClownEntity> type, final Level world) {
        super((EntityType)type, world);
        this.f_21364_ = 0;
        this.m_21557_(false);
        this.m_21530_();
        this.f_21342_ = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
    }
    
    public Packet<?> m_5654_() {
        return (Packet<?>)NetworkHooks.getEntitySpawningPacket((Entity)this);
    }
    
    protected PathNavigation m_6037_(final Level world) {
        return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
    }
    
    protected void m_8099_() {
        super.m_8099_();
        this.f_21345_.m_25352_(1, (Goal)new Goal() {
            {
                this.m_7021_((EnumSet)EnumSet.of(Goal.Flag.MOVE));
            }
            
            public boolean m_8036_() {
                return BalloonClownEntity.this.m_5448_() != null && !BalloonClownEntity.this.m_21566_().m_24995_();
            }
            
            public boolean m_8045_() {
                return BalloonClownEntity.this.m_21566_().m_24995_() && BalloonClownEntity.this.m_5448_() != null && BalloonClownEntity.this.m_5448_().m_6084_();
            }
            
            public void m_8056_() {
                final LivingEntity livingentity = BalloonClownEntity.this.m_5448_();
                final Vec3 vec3d = livingentity.m_20299_(1.0f);
                BalloonClownEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 2.0);
            }
            
            public void m_8037_() {
                final LivingEntity livingentity = BalloonClownEntity.this.m_5448_();
                if (BalloonClownEntity.this.m_142469_().m_82381_(livingentity.m_142469_())) {
                    BalloonClownEntity.this.m_7327_((Entity)livingentity);
                }
                else {
                    final double d0 = BalloonClownEntity.this.m_20280_((Entity)livingentity);
                    if (d0 < 16.0) {
                        final Vec3 vec3d = livingentity.m_20299_(1.0f);
                        BalloonClownEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 2.0);
                    }
                }
            }
        });
        this.f_21345_.m_25352_(2, (Goal)new RandomStrollGoal(this, 0.8, 20) {
            protected Vec3 m_7037_() {
                final Random random = BalloonClownEntity.this.m_21187_();
                final double dir_x = BalloonClownEntity.this.m_20185_() + (random.nextFloat() * 2.0f - 1.0f) * 16.0f;
                final double dir_y = BalloonClownEntity.this.m_20186_() + (random.nextFloat() * 2.0f - 1.0f) * 16.0f;
                final double dir_z = BalloonClownEntity.this.m_20189_() + (random.nextFloat() * 2.0f - 1.0f) * 16.0f;
                return new Vec3(dir_x, dir_y, dir_z);
            }
        });
        this.f_21345_.m_25352_(3, (Goal)new MeleeAttackGoal(this, 1.2, false) {
            protected double m_6639_(final LivingEntity entity) {
                return 4.0 + entity.m_20205_() * entity.m_20205_();
            }
        });
        this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this));
        this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, (Class)Player.class, false, false));
        this.f_21346_.m_25352_(6, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
    }
    
    public MobType m_6336_() {
        return MobType.f_21640_;
    }
    
    public boolean m_6785_(final double distanceToClosestPlayer) {
        return false;
    }
    
    public SoundEvent m_7975_(final DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
    }
    
    public SoundEvent m_5592_() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
    }
    
    public boolean m_142535_(final float l, final float d, final DamageSource source) {
        return false;
    }
    
    public boolean m_6469_(final DamageSource source, final float amount) {
        return source != DamageSource.f_19315_ && super.m_6469_(source, amount);
    }
    
    protected void m_7840_(final double y, final boolean onGroundIn, final BlockState state, final BlockPos pos) {
    }
    
    public void m_20242_(final boolean ignored) {
        super.m_20242_(true);
    }
    
    public void m_8107_() {
        super.m_8107_();
        this.m_20242_(true);
    }
    
    public static void init() {
    }
    
    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.m_21552_();
        builder = builder.m_22268_(Attributes.f_22279_, 0.3);
        builder = builder.m_22268_(Attributes.f_22276_, 10.0);
        builder = builder.m_22268_(Attributes.f_22284_, 0.0);
        builder = builder.m_22268_(Attributes.f_22281_, 2.0);
        builder = builder.m_22268_(Attributes.f_22277_, 16.0);
        builder = builder.m_22268_(Attributes.f_22280_, 0.3);
        return builder;
    }
}
