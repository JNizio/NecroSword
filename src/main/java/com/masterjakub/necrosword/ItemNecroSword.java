package com.masterjakub.necrosword;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.WorldServer;

public class ItemNecroSword extends ItemSword {

    public ItemNecroSword(ToolMaterial material) {
        super(material);
        setMaxStackSize(1);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        boolean result = super.hitEntity(stack, target, attacker);

        if (!target.worldObj.isRemote && target.worldObj instanceof WorldServer) {
            WorldServer world = (WorldServer) target.worldObj;

            world.func_147487_a(
                "largesmoke",
                target.posX,
                target.posY + target.height * 0.55D,
                target.posZ,
                24,
                0.35D,
                0.50D,
                0.35D,
                0.015D
            );

            world.func_147487_a(
                "smoke",
                target.posX,
                target.posY + target.height * 0.45D,
                target.posZ,
                18,
                0.28D,
                0.42D,
                0.28D,
                0.025D
            );
        }

        return result;
    }
}
