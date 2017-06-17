package com.mjr.extraplanets.itemBlocks.planetAndMoons.Kepler22b;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockKepler22bMapleLeaf extends ItemBlock {
	public ItemBlockKepler22bMapleLeaf(Block block) {
		super(block);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int meta) {
		return meta;
	}

	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		String name = "";

		switch (itemstack.getItemDamage()) {
		case 0: {
			name = "blueMapleLeaf";
			break;
		}
		case 1: {
			name = "redMapleLeaf";
			break;
		}
		case 2: {
			name = "purpleMapleLeaf";
			break;
		}
		case 3: {
			name = "yellowMapleLeaf";
			break;
		}
		case 4: {
			name = "blueMapleLeaf";
			break;
		}
		case 5: {
			name = "redMapleLeaf";
			break;
		}
		case 6: {
			name = "purpleMapleLeaf";
			break;
		}
		case 7: {
			name = "yellowMapleLeaf";
			break;
		}
		default:
			name = "null";
		}

		return this.field_150939_a.getUnlocalizedName() + "." + name;
	}
}