
package net.mcreator.worldeditaxeitem.item;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.text.Text;
import net.minecraft.text.LiteralText;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class WandCompassTool {
	private static class CustomToolItem extends Item {
		protected CustomToolItem() {
			super(new FabricItemSettings().group(WorldEditToolsItemGroup.get()).maxDamage(100).fireproof());
		}

		@Override
		public int getEnchantability() {
			return 2;
		}

		@Override
		public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
			return 0;
		}

		@Override
		public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
			if (slot == EquipmentSlot.MAINHAND) {
				ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
				builder.putAll(super.getAttributeModifiers(slot));
				builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE,
						new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_ID, "Tool modifier", 2, EntityAttributeModifier.Operation.ADDITION));
				builder.put(EntityAttributes.GENERIC_ATTACK_SPEED,
						new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_ID, "Tool modifier", -3, EntityAttributeModifier.Operation.ADDITION));
				return builder.build();
			}
			return super.getAttributeModifiers(slot);
		}

		@Override
		public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
			stack.damage(2, attacker, i -> i.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
			return true;
		}

		@Override
		public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
			stack.damage(1, miner, i -> i.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
			return true;
		}
	}

	public static final Item INSTANCE = new CustomToolItem() {
		@Override
		@Environment(EnvType.CLIENT)
		public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
			tooltip.add(new LiteralText("Pass through Blocks"));
		}
	};
}
