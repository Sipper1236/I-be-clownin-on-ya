// 
// Decompiled by Procyon v0.5.36
// 

package net.mcreator.ibeclowninonya.entity;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.network.NetworkHooks;
import net.minecraft.network.protocol.Packet;
import net.mcreator.ibeclowninonya.init.IBeClowninOnYaModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.PlayMessages;
import net.minecraft.world.entity.monster.Monster;

public class GigaClownEntity extends Monster
{
    public GigaClownEntity(final PlayMessages.SpawnEntity packet, final Level world) {
        this((EntityType<GigaClownEntity>)IBeClowninOnYaModEntities.GIGA_CLOWN.get(), world);
    }
    
    public GigaClownEntity(final EntityType<GigaClownEntity> type, final Level world) {
        super((EntityType)type, world);
        this.f_21364_ = 0;
        this.m_21557_(false);
        this.m_21530_();
    }
    
    public Packet<?> m_5654_() {
        return (Packet<?>)NetworkHooks.getEntitySpawningPacket((Entity)this);
    }
    
    protected void m_8099_() {
        super.m_8099_();
        this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal(this, 1.2, false) {
            protected double m_6639_(final LivingEntity entity) {
                return 4.0 + entity.m_20205_() * entity.m_20205_();
            }
        });
        this.f_21346_.m_25352_(2, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
        this.f_21345_.m_25352_(3, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8));
        this.f_21345_.m_25352_(4, (Goal)new RandomLookAroundGoal((Mob)this));
        this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, (Class)Player.class, false, false));
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
    
    public static void init() {
    }
    
    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.m_21552_();
        builder = builder.m_22268_(Attributes.f_22279_, 0.3);
        builder = builder.m_22268_(Attributes.f_22276_, 100.0);
        builder = builder.m_22268_(Attributes.f_22284_, 0.0);
        builder = builder.m_22268_(Attributes.f_22281_, 3.0);
        builder = builder.m_22268_(Attributes.f_22277_, 16.0);
        return builder;
    }
}
