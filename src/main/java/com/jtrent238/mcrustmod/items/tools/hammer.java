package com.jtrent238.mcrustmod.items.tools;

import java.util.Set;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemTool;

public class hammer extends ItemTool{

	private static float damageVsEntity;
	private static Set field_150914_c;

	protected hammer(float p_i45333_1_, ToolMaterial p_i45333_2_, Set p_i45333_3_) {
		super(p_i45333_1_, p_i45333_2_, p_i45333_3_);
	}

	public hammer(ToolMaterial WOOD) {
		super(damageVsEntity, WOOD, field_150914_c);
	}

}
