package com.mjr.extraplanets.inventory.machines;

import micdoodle8.mods.galacticraft.api.item.IItemElectric;
import micdoodle8.mods.galacticraft.core.energy.EnergyUtil;
import micdoodle8.mods.galacticraft.core.energy.tile.TileBaseElectricBlock;
import micdoodle8.mods.galacticraft.core.inventory.SlotSpecific;
import micdoodle8.mods.galacticraft.core.items.ItemCanisterOxygenInfinite;
import micdoodle8.mods.galacticraft.core.items.ItemOxygenTank;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import com.mjr.extraplanets.tileEntities.machines.TileEntityAdvancedOxygenDecompressor;

public class ContainerAdvancedOxygenDecompressor extends Container {
	private TileBaseElectricBlock tileEntity;

	public ContainerAdvancedOxygenDecompressor(InventoryPlayer par1InventoryPlayer, TileEntityAdvancedOxygenDecompressor compressor, EntityPlayer player) {
		this.tileEntity = compressor;
		this.addSlotToContainer(new Slot(compressor, 0, 133, 71));
		this.addSlotToContainer(new SlotSpecific(compressor, 1, 32, 27, IItemElectric.class));

		int var3;

		for (var3 = 0; var3 < 3; ++var3) {
			for (int var4 = 0; var4 < 9; ++var4) {
				this.addSlotToContainer(new Slot(par1InventoryPlayer, var4 + var3 * 9 + 9, 8 + var4 * 18, 20 + 84 + var3 * 18));
			}
		}

		for (var3 = 0; var3 < 9; ++var3) {
			this.addSlotToContainer(new Slot(par1InventoryPlayer, var3, 8 + var3 * 18, 20 + 142));
		}

		compressor.openInventory(player);
	}

	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		return this.tileEntity.isUseableByPlayer(var1);
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer entityPlayer, int par1) {
		ItemStack var2 = null;
		final Slot slot = this.inventorySlots.get(par1);
		final int b = this.inventorySlots.size();

		if (slot != null && slot.getHasStack()) {
			final ItemStack stack = slot.getStack();
			var2 = stack.copy();
			boolean movedToMachineSlot = false;

			if (par1 < 2) {
				if (!this.mergeItemStack(stack, b - 36, b, true)) {
					return null;
				}
			} else {
				if (EnergyUtil.isElectricItem(stack.getItem())) {
					if (!this.mergeItemStack(stack, 1, 2, false)) {
						return null;
					}
					movedToMachineSlot = true;
				} else if (stack.getItem() instanceof ItemCanisterOxygenInfinite || (stack.getItem() instanceof ItemOxygenTank && stack.getItemDamage() < stack.getMaxDamage())) {
					if (!this.mergeItemStack(stack, 0, 1, false)) {
						return null;
					}
					movedToMachineSlot = true;
				} else {
					if (par1 < b - 9) {
						if (!this.mergeItemStack(stack, b - 9, b, false)) {
							return null;
						}
					} else if (!this.mergeItemStack(stack, b - 36, b - 9, false)) {
						return null;
					}
				}
			}

			if (stack.stackSize == 0) {
				// Needed where tile has inventoryStackLimit of 1
				if (movedToMachineSlot && var2.stackSize > 1) {
					ItemStack remainder = var2.copy();
					--remainder.stackSize;
					slot.putStack(remainder);
				} else {
					slot.putStack((ItemStack) null);
				}
			} else {
				slot.onSlotChanged();
			}

			if (stack.stackSize == var2.stackSize) {
				return null;
			}

			slot.onPickupFromSlot(entityPlayer, stack);
		}

		return var2;
	}
}
