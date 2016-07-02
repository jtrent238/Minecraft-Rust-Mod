package com.jtrent238.mcrustmod.items.tools;

import java.util.Set;

import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;

public class hammer_salvaged extends ItemTool{


		private static float damageVsEntity;
		private static Set field_150914_c;

		protected hammer_salvaged(float p_i45333_1_, ToolMaterial p_i45333_2_, Set p_i45333_3_) {
			super(p_i45333_1_, p_i45333_2_, p_i45333_3_);
		}

		public hammer_salvaged(ToolMaterial IRON) {
			super(damageVsEntity, IRON, field_150914_c);
		}

	}
