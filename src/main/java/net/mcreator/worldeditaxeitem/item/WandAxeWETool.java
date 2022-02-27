
package net.mcreator.worldeditaxeitem.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.AxeItem;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class WandAxeWETool {
	public static final ToolMaterial WANDAXEWE_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 100;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 4F;
		}

		@Override
		public float getAttackDamage() {
			return 7F;
		}

		@Override
		public int getMiningLevel() {
			return 1;
		}

		@Override
		public int getEnchantability() {
			return 2;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.EMPTY;
		}
	};
	public static final Item INSTANCE = new AxeItem(WANDAXEWE_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(WorldEditToolsItemGroup.get()))) {
	};
}
