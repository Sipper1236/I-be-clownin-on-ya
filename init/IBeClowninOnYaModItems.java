// 
// Decompiled by Procyon v0.5.36
// 

package net.mcreator.ibeclowninonya.init;

import net.minecraftforge.registries.ForgeRegistries;
import java.util.function.Supplier;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;

public class IBeClowninOnYaModItems
{
    public static final DeferredRegister<Item> REGISTRY;
    public static final RegistryObject<Item> CLOWN;
    public static final RegistryObject<Item> GIGA_CLOWN;
    public static final RegistryObject<Item> BALLOON_CLOWN;
    
    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "i_be_clownin_on_ya");
        final ForgeSpawnEggItem forgeSpawnEggItem;
        CLOWN = IBeClowninOnYaModItems.REGISTRY.register("clown_spawn_egg", () -> {
            new ForgeSpawnEggItem((Supplier)IBeClowninOnYaModEntities.CLOWN, -1, -65536, new Item.Properties().m_41491_(CreativeModeTab.f_40753_));
            return forgeSpawnEggItem;
        });
        final ForgeSpawnEggItem forgeSpawnEggItem2;
        GIGA_CLOWN = IBeClowninOnYaModItems.REGISTRY.register("giga_clown_spawn_egg", () -> {
            new ForgeSpawnEggItem((Supplier)IBeClowninOnYaModEntities.GIGA_CLOWN, -16777216, -65536, new Item.Properties().m_41491_(CreativeModeTab.f_40753_));
            return forgeSpawnEggItem2;
        });
        final ForgeSpawnEggItem forgeSpawnEggItem3;
        BALLOON_CLOWN = IBeClowninOnYaModItems.REGISTRY.register("balloon_clown_spawn_egg", () -> {
            new ForgeSpawnEggItem((Supplier)IBeClowninOnYaModEntities.BALLOON_CLOWN, -1, -3407770, new Item.Properties().m_41491_(CreativeModeTab.f_40753_));
            return forgeSpawnEggItem3;
        });
    }
}
