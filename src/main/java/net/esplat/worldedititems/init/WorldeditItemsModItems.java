
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.esplat.worldedititems.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.esplat.worldedititems.item.WandCompassItem;
import net.esplat.worldedititems.item.WandAxeWEItem;
import net.esplat.worldedititems.item.SuperPickaxeItem;
import net.esplat.worldedititems.WorldeditItemsMod;

public class WorldeditItemsModItems {
	public static Item WAND_AXE_WE;
	public static Item SUPER_PICKAXE;
	public static Item WAND_COMPASS;

	public static void load() {
		WAND_AXE_WE = Registry.register(Registry.ITEM, new ResourceLocation(WorldeditItemsMod.MODID, "wand_axe_we"), new WandAxeWEItem());
		SUPER_PICKAXE = Registry.register(Registry.ITEM, new ResourceLocation(WorldeditItemsMod.MODID, "super_pickaxe"), new SuperPickaxeItem());
		WAND_COMPASS = Registry.register(Registry.ITEM, new ResourceLocation(WorldeditItemsMod.MODID, "wand_compass"), new WandCompassItem());
	}
}
