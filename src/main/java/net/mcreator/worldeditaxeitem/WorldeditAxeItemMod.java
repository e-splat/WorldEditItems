/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.worldeditaxeitem;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.worldeditaxeitem.item.WorldEditToolsItemGroup;
import net.mcreator.worldeditaxeitem.item.WandCompassTool;
import net.mcreator.worldeditaxeitem.item.WandAxeWETool;
import net.mcreator.worldeditaxeitem.item.SuperPickaxeTool;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class WorldeditAxeItemMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup WorldEditTools = WorldEditToolsItemGroup.get();
	public static final Item WandAxeWE_ITEM = Registry.register(Registry.ITEM, id("wand_axe_we"), WandAxeWETool.INSTANCE);
	public static final Item SuperPickaxe_ITEM = Registry.register(Registry.ITEM, id("super_pickaxe"), SuperPickaxeTool.INSTANCE);
	public static final Item WandCompass_ITEM = Registry.register(Registry.ITEM, id("wand_compass"), WandCompassTool.INSTANCE);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing WorldeditAxeItemMod");
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("worldedit_axe_item", s);
	}
}
