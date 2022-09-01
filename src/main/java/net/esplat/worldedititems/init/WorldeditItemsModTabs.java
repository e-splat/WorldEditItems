
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.esplat.worldedititems.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class WorldeditItemsModTabs {
	public static CreativeModeTab TAB_WORLD_EDIT_TOOLS;

	public static void load() {
		TAB_WORLD_EDIT_TOOLS = FabricItemGroupBuilder.create(new ResourceLocation("worldedit_items", "world_edit_tools"))
				.icon(() -> new ItemStack(WorldeditItemsModItems.WAND_AXE_WE)).build();
	}
}
