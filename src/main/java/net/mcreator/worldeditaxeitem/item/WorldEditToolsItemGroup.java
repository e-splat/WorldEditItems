
package net.mcreator.worldeditaxeitem.item;

import net.minecraft.util.Identifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.worldeditaxeitem.WorldeditAxeItemMod;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public final class WorldEditToolsItemGroup {
	public static ItemGroup get() {
		return ITEM_GROUP;
	}

	private static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("worldedit_axe_item", "world_edit_tools")).icon(() -> {
		return new ItemStack(WorldeditAxeItemMod.WandAxeWE_ITEM);
	}).build();
}
