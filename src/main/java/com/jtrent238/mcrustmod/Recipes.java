package com.jtrent238.mcrustmod;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.Type;
import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class Recipes {

	
	/**
	 * Register Recipes with Game Registry.
	 */
	public static void registerRecpies(){
		addShaplessRecpies();
		addShapedRecpies();
		addsmeltigrecipies();
	}

	/**
	 * Add Shaped Recipes.
	 */
	private static void addShapedRecpies(){
		
	}

	/**
	 * Add Shapeless Recipes.
	 */
	private static void addShaplessRecpies(){
		
		}
	/**
	 * Add Smelting Recipes
	 */
	private static void addsmeltigrecipies(){
		GameRegistry.addSmelting(ItemLoader.chicken_raw, new ItemStack (ItemLoader.chicken_cooked, 1), 0.2F );
		GameRegistry.addSmelting(ItemLoader.chicken_cooked, new ItemStack (ItemLoader.chicken_burned, 1), 0.2F );
		GameRegistry.addSmelting(ItemLoader.bearmeat, new ItemStack (ItemLoader.bearmeat_cooked, 1), 0.2F );
		GameRegistry.addSmelting(ItemLoader.bearmeat_cooked, new ItemStack (ItemLoader.bearmeat_burned, 1), 0.2F );
		   }
	
	}

	
	
	
