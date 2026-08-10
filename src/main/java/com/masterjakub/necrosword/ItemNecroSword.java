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
            double y = target.posY + target.height * 0.5D;

            // Keep the effect deliberately light for old 1.7.10 clients while
            // still producing an obvious dark smoke burst around the target.
            world.func_147487_a(
                "largesmoke",
                target.posX,
                y,
                target.posZ,
                10,
                0.30D,
                0.40D,
                0.30D,
                0.012D
            );

            world.func_147487_a(
                "smoke",
                target.posX,
                y,
                target.posZ,
                8,
                0.24D,
                0.34D,
                0.24D,
                0.018D
            );
        }

        return result;
    }
}
