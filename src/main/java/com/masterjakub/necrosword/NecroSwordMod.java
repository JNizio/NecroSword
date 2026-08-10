package com.masterjakub.necrosword;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

@Mod(
    modid = NecroSwordMod.MODID,
    name = NecroSwordMod.NAME,
    version = NecroSwordMod.VERSION,
    acceptedMinecraftVersions = "[1.7.10]"
)
public class NecroSwordMod {

    public static final String MODID = "necrosword";
    public static final String NAME = "Necro Sword";
    public static final String VERSION = "1.0.1";

    public static Item necroSword;

    public static final Item.ToolMaterial NECRO_MATERIAL = EnumHelper.addToolMaterial(
        "NECRO",
        3,
        1800,
        8.0F,
        4.0F,
        18
    );

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        necroSword = new ItemNecroSword(NECRO_MATERIAL)
            .setUnlocalizedName("necroSword")
            .setTextureName(MODID + ":necro_sword")
            .setCreativeTab(CreativeTabs.tabCombat);

        GameRegistry.registerItem(necroSword, "necro_sword");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new NecroCombatHandler());
    }
}
