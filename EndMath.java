// 
// Decompiled by Procyon v0.5.36
// 

package net.mcreator.ibeclowninonya;

import net.minecraft.util.Mth;

public class EndMath extends Mth
{
    public static boolean inRange(final int value, final int min, final int max) {
        return value >= min && value <= max;
    }
    
    public static boolean inRange(final float value, final float min, final float max) {
        return value >= min && value <= max;
    }
    
    public static boolean inRange(final double value, final double min, final double max) {
        return value >= min && value <= max;
    }
    
    public static boolean inAverage(final int value, final int average, final int range) {
        return value >= average - range && value <= average + range;
    }
}
