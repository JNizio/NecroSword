package com.masterjakub.necrosword;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class NecroCombatHandler {

    private static final float NECROTIC_BONUS_DAMAGE = 4.0F;

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        Entity source = event.source.getEntity();

        if (!(source instanceof EntityLivingBase)) {
            return;
        }

        EntityLivingBase attacker = (EntityLivingBase) source;
        ItemStack held = attacker.getHeldItem();

        if (held != null && held.getItem() == NecroSwordMod.necroSword) {
            event.ammount += NECROTIC_BONUS_DAMAGE;
        }
    }
}
