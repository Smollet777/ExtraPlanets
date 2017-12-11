package com.mjr.extraplanets.planets.Mercury.worldgen;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.MapGenStructure;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraft.world.gen.structure.StructureStart;

import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.planets.Mercury.worldgen.village.StructureComponentVillageField;
import com.mjr.extraplanets.planets.Mercury.worldgen.village.StructureComponentVillageField2;
import com.mjr.extraplanets.planets.Mercury.worldgen.village.StructureComponentVillageHouse;
import com.mjr.extraplanets.planets.Mercury.worldgen.village.StructureComponentVillagePathGen;
import com.mjr.extraplanets.planets.Mercury.worldgen.village.StructureComponentVillageRoadPiece;
import com.mjr.extraplanets.planets.Mercury.worldgen.village.StructureComponentVillageStartPiece;
import com.mjr.extraplanets.planets.Mercury.worldgen.village.StructureComponentVillageTorch;
import com.mjr.extraplanets.planets.Mercury.worldgen.village.StructureComponentVillageWoodHut;
import com.mjr.extraplanets.planets.Mercury.worldgen.village.StructureVillageStartMercury;
import com.mjr.extraplanets.util.MessageUtilities;

public class MapGenVillageMercury extends MapGenStructure {
	public static List<Biome> villageSpawnBiomes = Arrays.asList(new Biome[] { BiomeGenMercury.mercury });
	private final int terrainType;
	private static boolean initialized;

	static {
		try {
			MapGenVillageMercury.initiateStructures();
		} catch (Throwable e) {

		}
	}

	public static void initiateStructures() throws Throwable {
		if (!MapGenVillageMercury.initialized) {
			MapGenStructureIO.registerStructure(StructureVillageStartMercury.class, "MercuryVillage");
			MapGenStructureIO.registerStructureComponent(StructureComponentVillageField.class, "MercuryField1");
			MapGenStructureIO.registerStructureComponent(StructureComponentVillageField2.class, "MercuryField2");
			MapGenStructureIO.registerStructureComponent(StructureComponentVillageHouse.class, "MercuryHouse");
			MapGenStructureIO.registerStructureComponent(StructureComponentVillageRoadPiece.class, "MercuryRoadPiece");
			MapGenStructureIO.registerStructureComponent(StructureComponentVillagePathGen.class, "MercuryPath");
			MapGenStructureIO.registerStructureComponent(StructureComponentVillageTorch.class, "MercuryTorch");
			MapGenStructureIO.registerStructureComponent(StructureComponentVillageStartPiece.class, "MercuryWell");
			MapGenStructureIO.registerStructureComponent(StructureComponentVillageWoodHut.class, "MercuryWoodHut");
		}

		MapGenVillageMercury.initialized = true;
	}

	public MapGenVillageMercury() {
		this.terrainType = 0;
	}

	@Override
	protected boolean canSpawnStructureAtCoords(int i, int j) {
		final byte numChunks = 32;
		final byte offsetChunks = 8;
		final int oldi = i;
		final int oldj = j;

		if (i < 0) {
			i -= numChunks - 1;
		}

		if (j < 0) {
			j -= numChunks - 1;
		}

		int randX = i / numChunks;
		int randZ = j / numChunks;
		final Random var7 = this.world.setRandomSeed(i, j, 10387312);
		randX *= numChunks;
		randZ *= numChunks;
		randX += var7.nextInt(numChunks - offsetChunks);
		randZ += var7.nextInt(numChunks - offsetChunks);

		return oldi == randX && oldj == randZ;

	}

	@Override
	public BlockPos getClosestStrongholdPos(World worldIn, BlockPos pos, boolean p_180706_3_) {
		this.world = worldIn;
		return findNearestStructurePosBySpacing(worldIn, this, pos, 32, 8, 10387312, false, 100, p_180706_3_);
	}

	@Override
	protected StructureStart getStructureStart(int par1, int par2) {
		if (Config.DEBUG_MODE)
			MessageUtilities.debugMessageToLog("Generating Mercury Village at x" + par1 * 16 + " z" + par2 * 16);
		return new StructureVillageStartMercury(this.world, this.rand, par1, par2, this.terrainType);
	}

	@Override
	public String getStructureName() {
		return "MercuryVillage";
	}
}
