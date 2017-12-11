package com.mjr.extraplanets.world.features;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.blocks.ExtraPlanets_Blocks;
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.Kepler22b.BlockKepler22bMapleTreeLog2;
import com.mjr.extraplanets.util.MessageUtilities;

public class WorldGenLogTree extends WorldGenerator {

	public WorldGenLogTree() {

	}

	@Override
	public boolean generate(World world, Random rand, BlockPos position) {
		int x = position.getX();
		int y = position.getY();
		int z = position.getZ();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				try {
					if (world.getBlockState(new BlockPos(x + i, y, z + j)) == Blocks.AIR)
						return false;
				} catch (Exception ex) {
					MessageUtilities.debugMessageToLog("ExtraPlanets: " + ex.getMessage());
				}
			}
		}
		if (!world.isAreaLoaded(new BlockPos(x + 10, y, z + 10), 10))
			return false;
		else {
			if (Config.DEBUG_MODE)
				MessageUtilities.debugMessageToLog("Spawning Log Tree at (x, y, z)" + x + " " + y + " " + z);
			generate_r0(world, rand, x, y - 1, z);
			return true;
		}
	}

	public boolean generate_r0(World world, Random rand, int x, int y, int z) {
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 4, y + 0, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 8, y + 0, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 9, y + 0, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 5, y + 0, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 8, y + 0, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 6, y + 0, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 7, y + 0, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 6, y + 1, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 7, y + 1, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 8, y + 2, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 5, y + 2, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 7, y + 2, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 6, y + 2, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 4), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 8, y + 3, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 4, y + 3, z + 9), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 5, y + 3, z + 9), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 6, y + 3, z + 9), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 4, y + 4, z + 3), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 8, y + 4, z + 4), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 9, y + 4, z + 4), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 8, y + 4, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 9, y + 4, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 2, y + 4, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 3, y + 4, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 4, y + 4, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 5, y + 4, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 3, y + 4, z + 9), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 4, y + 4, z + 9), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 5, y + 4, z + 9), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 6, y + 4, z + 9), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 7, y + 4, z + 9), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 6, y + 4, z + 10), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 7, y + 4, z + 10), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 5, y + 5, z + 2), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 10, y + 5, z + 2), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 3, y + 5, z + 3), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 4, y + 5, z + 3), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 5, y + 5, z + 3), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 10, y + 5, z + 3), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 11, y + 5, z + 3), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 3, y + 5, z + 4), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 4, y + 5, z + 4), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 9, y + 5, z + 4), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 10, y + 5, z + 4), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 3, y + 5, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 9, y + 5, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 10, y + 5, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 11, y + 5, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 2, y + 5, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 3, y + 5, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 10, y + 5, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 11, y + 5, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 2, y + 5, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 3, y + 5, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 10, y + 5, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 11, y + 5, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 2, y + 5, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 3, y + 5, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 7, y + 5, z + 10), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 7, y + 5, z + 11), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 8, y + 5, z + 11), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 10, y + 6, z + 2), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 4, y + 6, z + 3), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 10, y + 6, z + 3), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 3, y + 6, z + 4), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 4, y + 6, z + 4), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 2, y + 6, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 3, y + 6, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 4, y + 6, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 10, y + 6, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 2, y + 6, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 3, y + 6, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 10, y + 6, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 11, y + 6, z + 6), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 10, y + 6, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 11, y + 6, z + 7), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 10, y + 6, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 11, y + 6, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 10, y + 6, z + 9), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 4, y + 7, z + 3), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 5, y + 7, z + 3), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 3, y + 7, z + 4), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 4, y + 7, z + 4), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 5, y + 7, z + 4), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 4, y + 7, z + 5), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 9, y + 7, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(5), 3);
		world.setBlockState(new BlockPos(x + 10, y + 7, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 11, y + 7, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 9, y + 7, z + 9), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getStateFromMeta(9), 3);
		world.setBlockState(new BlockPos(x + 10, y + 7, z + 9), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 5, y + 8, z + 3), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		world.setBlockState(new BlockPos(x + 9, y + 8, z + 8), ExtraPlanets_Blocks.KEPLER22B_MAPLE_LOG_2.getDefaultState().withProperty(BlockKepler22bMapleTreeLog2.VARIANT, BlockKepler22bMapleTreeLog2.EnumType.MAPLE_BROWN), 3);
		return true;

	}
}