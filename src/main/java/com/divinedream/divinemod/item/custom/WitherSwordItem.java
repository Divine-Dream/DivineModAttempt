package com.divinedream.divinemod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;


public class WitherSwordItem extends SwordItem {
    public WitherSwordItem(Tier p_43269_, int p_43270_, float p_43271_, Properties p_43272_) {
        super(p_43269_, p_43270_, p_43271_, p_43272_);
    }

    @Override
    public boolean hurtEnemy(ItemStack p_43278_, LivingEntity p_43279_, LivingEntity p_43280_) {
        //adds wither effect when an enemy is hurt.
        p_43279_.addEffect(new MobEffectInstance(MobEffects.WITHER, 500), p_43280_);
        return super.hurtEnemy(p_43278_, p_43279_, p_43280_);
    }
}
