package com.mjr.extraplanets.items.slabs;

import com.mjr.extraplanets.Constants;
import com.mjr.extraplanets.blocks.ExtraPlanets_SlabsStairsBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

public class UranusStoneItemSlab extends ItemSlab {

	public UranusStoneItemSlab(Block block) {
		super(block, ((BlockSlab) (ExtraPlanets_SlabsStairsBlocks.uranusStoneBlockHalfSlab)), ((BlockSlab) (ExtraPlanets_SlabsStairsBlocks.uranusStoneBlockDoubleSlab)), false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		setUnlocalizedName(Constants.TEXTURE_PREFIX + "uranusStone");
	}

}