package com.jtrent238.mcrustmod.items.tools;

import java.util.Set;

import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class hatchet extends ItemAxe{


	private static float damageVsEntity;
	private static Set field_150914_c;

	protected hatchet(float p_i45333_1_, ToolMaterial p_i45333_2_, Set p_i45333_3_) {
		super(p_i45333_2_);
	}

	public hatchet(ToolMaterial IRON) {
		super(IRON);
	}

}
