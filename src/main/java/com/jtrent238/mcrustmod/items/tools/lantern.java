package com.jtrent238.mcrustmod.items.tools;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureVillagePieces.Torch;

public class lantern extends Item{

	public lantern() {
		super();
	}

	   public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5){
			super.onUpdate(stack, world, entity, par4, par5);
			{
			    EntityPlayer  player = (EntityPlayer) entity;
			    ItemStack equipped = player.getCurrentEquippedItem();
			    if(equipped == stack){
			    	  player.getBrightness(3.0f);
			    	  player.getBrightnessForRender(15728880);
			    }
			}
	    }
}
