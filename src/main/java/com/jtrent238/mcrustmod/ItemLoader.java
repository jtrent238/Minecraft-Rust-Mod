package com.jtrent238.mcrustmod;

import com.jtrent238.foodmod.FoodMod;
import com.jtrent238.mcrustmod.items.ammo.ammo_handmade_shell;
import com.jtrent238.mcrustmod.items.ammo.ammo_pistol;
import com.jtrent238.mcrustmod.items.ammo.ammo_pistol_fire;
import com.jtrent238.mcrustmod.items.ammo.ammo_pistol_hv;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle_explosive;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle_hv;
import com.jtrent238.mcrustmod.items.ammo.ammo_rifle_incendiary;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_basic;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_fire;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_hv;
import com.jtrent238.mcrustmod.items.ammo.ammo_rocket_smoke;
import com.jtrent238.mcrustmod.items.ammo.ammo_shotgun;
import com.jtrent238.mcrustmod.items.ammo.ammo_shotgun_slug;
import com.jtrent238.mcrustmod.items.ammo.arrow_hv;
import com.jtrent238.mcrustmod.items.ammo.arrow_wooden;
import com.jtrent238.mcrustmod.items.tools.axe_salvaged;
import com.jtrent238.mcrustmod.items.tools.hammer;
import com.jtrent238.mcrustmod.items.tools.hammer_salvaged;
import com.jtrent238.weaponmod.Itemcheeseknife;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;

public class ItemLoader {
		//Ammo//
	public static Item ammo_handmade_shell;
	public static Item ammo_pistol_fire;
	public static Item ammo_pistol_hv;
	public static Item ammo_pistol;
	public static Item ammo_rifle_explosive;
	public static Item ammo_rifle_hv;
	public static Item ammo_rifle_incendiary;
	public static Item ammo_rifle;
	public static Item ammo_rocket_basic;
	public static Item ammo_rocket_fire;
	public static Item ammo_rocket_hv;
	public static Item ammo_rocket_smoke;
	public static Item ammo_shotgun;
	public static Item ammo_shotgun_slug;
	public static Item arrow_hv;
	public static Item arrow_wooden;
		//Food//
	public static Item apple;
	public static Item apple_spoiled;
	public static Item bearmeat;
	public static Item bearmeat_burned;
	public static Item bearmeat_cooked;
	public static Item black_raspberries;
	public static Item blueberries;
		//Tools//
	public static Item axe_salvaged;
	public static Item hammer;
	public static Item hammer_salvaged;

	/**
	 * Load Items.
	 */
public static void LoadItems() {

		//Ammo//
	ammo_handmade_shell = new ammo_handmade_shell().setUnlocalizedName("ammo_handmade_shell").setTextureName("mcrustmod:ammo.handmade.shell").setCreativeTab(RustMod.RustMod_Ammo);
	ammo_pistol_fire = new ammo_pistol_fire().setUnlocalizedName("ammo_pistol_fire").setTextureName("mcrustmod:ammo.pistol.fire").setCreativeTab(RustMod.RustMod_Ammo);
	ammo_pistol_hv = new ammo_pistol_hv().setUnlocalizedName("ammo_pistol_hv").setTextureName("mcrustmod:ammo.pistol.hv").setCreativeTab(RustMod.RustMod_Ammo);
	ammo_pistol = new ammo_pistol().setUnlocalizedName("ammo_pistol").setTextureName("mcrustmod:ammo.pistol").setCreativeTab(RustMod.RustMod_Ammo);
	ammo_rifle_explosive = new ammo_rifle_explosive().setUnlocalizedName("ammo_rifle_explosive").setTextureName("mcrustmod:ammo.rifle.explosive").setCreativeTab(RustMod.RustMod_Ammo);
	ammo_rifle_hv = new ammo_rifle_hv().setUnlocalizedName("ammo_rifle_hv").setTextureName("mcrustmod:ammo.rifle.hv").setCreativeTab(RustMod.RustMod_Ammo);
	ammo_rifle_incendiary = new ammo_rifle_incendiary().setUnlocalizedName("ammo_rifle_incendiary").setTextureName("mcrustmod:ammo.handmade.shell").setCreativeTab(RustMod.RustMod_Ammo);
	ammo_rifle = new ammo_rifle().setUnlocalizedName("ammo_rifle").setTextureName("mcrustmod:ammo.rifle").setCreativeTab(RustMod.RustMod_Ammo);
	ammo_rocket_basic = new ammo_rocket_basic().setUnlocalizedName("ammo_rocket_basic").setTextureName("mcrustmod:ammo.rocket.basic").setCreativeTab(RustMod.RustMod_Ammo);
	ammo_rocket_fire = new ammo_rocket_fire().setUnlocalizedName("ammo_rocket_fire").setTextureName("mcrustmod:ammo.rocket.fire").setCreativeTab(RustMod.RustMod_Ammo);
	ammo_rocket_hv = new ammo_rocket_hv().setUnlocalizedName("ammo_rocket_hv").setTextureName("mcrustmod:ammo.rocket.hv").setCreativeTab(RustMod.RustMod_Ammo);
	ammo_rocket_smoke = new ammo_rocket_smoke().setUnlocalizedName("ammo_rocket_smoke").setTextureName("mcrustmod:ammo.rocket.smoke").setCreativeTab(RustMod.RustMod_Ammo);
	ammo_shotgun = new ammo_shotgun().setUnlocalizedName("ammo_shotgun").setTextureName("mcrustmod:ammo.shotgun").setCreativeTab(RustMod.RustMod_Ammo);
	ammo_shotgun_slug = new ammo_shotgun_slug().setUnlocalizedName("ammo_shotgun_slug").setTextureName("mcrustmod:ammo.shotgun.slug").setCreativeTab(RustMod.RustMod_Ammo);
	arrow_hv = new arrow_hv().setUnlocalizedName("arrow_hv").setTextureName("mcrustmod:arrow.hv").setCreativeTab(RustMod.RustMod_Ammo);
	arrow_wooden = new arrow_wooden().setUnlocalizedName("arrow_wooden").setTextureName("mcrustmod:arrow.wooden").setCreativeTab(RustMod.RustMod_Ammo);
		//Food//
	apple = new ItemFood(3, 0.2F, false).setUnlocalizedName("apple").setTextureName("mcrustmod:apple").setCreativeTab(RustMod.RustMod_Food);
	apple_spoiled = new ItemFood(1, 0.2F, false).setUnlocalizedName("apple_spoiled").setTextureName("mcrustmod:apple.spoiled").setCreativeTab(RustMod.RustMod_Food);
	bearmeat = new ItemFood(1, 0.2F, false).setUnlocalizedName("bearmeat").setTextureName("mcrustmod:bearmeat").setCreativeTab(RustMod.RustMod_Food);
	bearmeat_burned = new ItemFood(2, 0.2F, false).setUnlocalizedName("bearmeat_burned").setTextureName("mcrustmod:bearmeat.burned").setCreativeTab(RustMod.RustMod_Food);
	bearmeat_cooked = new ItemFood(4, 0.2F, false).setUnlocalizedName("bearmeat_cooked").setTextureName("mcrustmod:bearmeat.cooked").setCreativeTab(RustMod.RustMod_Food);
	black_raspberries = new ItemFood(2, 0.2F, false).setUnlocalizedName("black_raspberries").setTextureName("mcrustmod:black.raspberries").setCreativeTab(RustMod.RustMod_Food);
	blueberries = new ItemFood(2, 0.2F, false).setUnlocalizedName("blueberries").setTextureName("mcrustmod:blueberries").setCreativeTab(RustMod.RustMod_Food);
    	//Tools//
	axe_salvaged = new axe_salvaged(ToolMaterial.IRON).setUnlocalizedName("axe_salvaged").setTextureName("mcrustmod:axe.salvaged").setCreativeTab(RustMod.RustMod_Tools);
	hammer = new hammer(ToolMaterial.WOOD).setUnlocalizedName("hammer").setTextureName("mcrustmod:hammer").setCreativeTab(RustMod.RustMod_Tools);
	hammer_salvaged = new hammer_salvaged(ToolMaterial.IRON).setUnlocalizedName("hammer_salvaged").setTextureName("mcrustmod:hammer.salvaged").setCreativeTab(RustMod.RustMod_Tools);
	
	registerItems();
}

/**
 * Register Items.
 */
private static void registerItems(){

		//Ammo//
	GameRegistry.registerItem(ammo_handmade_shell, ammo_handmade_shell.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ammo_pistol_fire, ammo_pistol_fire.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ammo_pistol_hv, ammo_pistol_hv.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ammo_pistol, ammo_pistol.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ammo_rifle_explosive, ammo_rifle_explosive.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ammo_rifle_hv, ammo_rifle_hv.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ammo_rifle_incendiary, ammo_rifle_incendiary.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ammo_rifle, ammo_rifle.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ammo_rocket_basic, ammo_rocket_basic.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ammo_rocket_fire, ammo_rocket_fire.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ammo_rocket_hv, ammo_rocket_hv.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ammo_rocket_smoke, ammo_rocket_smoke.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ammo_shotgun, ammo_shotgun.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(ammo_shotgun_slug, ammo_shotgun_slug.getUnlocalizedName().substring(5)); 
	GameRegistry.registerItem(arrow_hv, arrow_hv.getUnlocalizedName().substring(5)); 
	GameRegistry.registerItem(arrow_wooden, arrow_wooden.getUnlocalizedName().substring(5)); 
		//Food//
	GameRegistry.registerItem(apple, apple.getUnlocalizedName().substring(5)); 
	GameRegistry.registerItem(apple_spoiled, apple_spoiled.getUnlocalizedName().substring(5)); 
	GameRegistry.registerItem(bearmeat, bearmeat.getUnlocalizedName().substring(5)); 
	GameRegistry.registerItem(bearmeat_burned, bearmeat_burned.getUnlocalizedName().substring(5)); 
	GameRegistry.registerItem(bearmeat_cooked, bearmeat_cooked.getUnlocalizedName().substring(5)); 
	GameRegistry.registerItem(black_raspberries, black_raspberries.getUnlocalizedName().substring(5)); 
	GameRegistry.registerItem(blueberries, blueberries.getUnlocalizedName().substring(5)); 
		//Tools//
	GameRegistry.registerItem(axe_salvaged, axe_salvaged.getUnlocalizedName().substring(5)); 
	GameRegistry.registerItem(hammer, hammer.getUnlocalizedName().substring(5)); 
	GameRegistry.registerItem(hammer_salvaged, hammer_salvaged.getUnlocalizedName().substring(5)); 
	
}

}
