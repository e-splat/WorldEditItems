
package net.mcreator.worldeditaxeitem.item;

import net.minecraft.world.World;
import net.minecraft.text.Text;
import net.minecraft.text.LiteralText;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.item.TooltipContext;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

public class SuperPickaxeTool {
	public static final ToolMaterial SUPERPICKAXE_TOOL_MATERIAL = new ToolMaterial() {
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
			return 2F;
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
	public static final Item INSTANCE = new PickaxeItem(SUPERPICKAXE_TOOL_MATERIAL, 0, (float) -3,
			(new FabricItemSettings().group(WorldEditToolsItemGroup.get()))) {
		@Override
		@Environment(EnvType.CLIENT)
		public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
			tooltip.add(new LiteralText("superpickaxe for WorldEdit"));
		}
	};
}
