package net.omni.assortedadditions.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f)
            .build();
    public static final FoodComponent GOLDEN_TOMATO = new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(1.2F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 120, 1), 1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0), 1.0F)
            .alwaysEdible()
            .build();
}