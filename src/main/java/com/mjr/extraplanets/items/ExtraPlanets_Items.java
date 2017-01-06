package com.mjr.extraplanets.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.mjr.extraplanets.Config;
import com.mjr.extraplanets.items.keys.ItemKeyT10;
import com.mjr.extraplanets.items.keys.ItemKeyT4;
import com.mjr.extraplanets.items.keys.ItemKeyT5;
import com.mjr.extraplanets.items.keys.ItemKeyT6;
import com.mjr.extraplanets.items.keys.ItemKeyT7;
import com.mjr.extraplanets.items.keys.ItemKeyT8;
import com.mjr.extraplanets.items.keys.ItemKeyT9;
import com.mjr.extraplanets.items.noseCones.Tier10NoseCone;
import com.mjr.extraplanets.items.noseCones.Tier4NoseCone;
import com.mjr.extraplanets.items.noseCones.Tier5NoseCone;
import com.mjr.extraplanets.items.noseCones.Tier6NoseCone;
import com.mjr.extraplanets.items.noseCones.Tier7NoseCone;
import com.mjr.extraplanets.items.noseCones.Tier8NoseCone;
import com.mjr.extraplanets.items.noseCones.Tier9NoseCone;
import com.mjr.extraplanets.items.rockets.Tier10Rocket;
import com.mjr.extraplanets.items.rockets.Tier4Rocket;
import com.mjr.extraplanets.items.rockets.Tier5Rocket;
import com.mjr.extraplanets.items.rockets.Tier6Rocket;
import com.mjr.extraplanets.items.rockets.Tier7Rocket;
import com.mjr.extraplanets.items.rockets.Tier8Rocket;
import com.mjr.extraplanets.items.rockets.Tier9Rocket;
import com.mjr.extraplanets.items.schematics.SchematicTier10;
import com.mjr.extraplanets.items.schematics.SchematicTier4;
import com.mjr.extraplanets.items.schematics.SchematicTier5;
import com.mjr.extraplanets.items.schematics.SchematicTier6;
import com.mjr.extraplanets.items.schematics.SchematicTier7;
import com.mjr.extraplanets.items.schematics.SchematicTier8;
import com.mjr.extraplanets.items.schematics.SchematicTier9;

public class ExtraPlanets_Items {
	public static Item tier4Rocket;
	public static Item tier5Rocket;
	public static Item tier6Rocket;
	public static Item tier7Rocket;
	public static Item tier8Rocket;
	public static Item tier9Rocket;
	public static Item tier10Rocket;

	public static Item schematicTier4;
	public static Item schematicTier5;
	public static Item schematicTier6;
	public static Item schematicTier7;
	public static Item schematicTier8;
	public static Item schematicTier9;
	public static Item schematicTier10;

	public static Item noseConeTier4;
	public static Item noseConeTier5;
	public static Item noseConeTier6;
	public static Item noseConeTier7;
	public static Item noseConeTier8;
	public static Item noseConeTier9;
	public static Item noseConeTier10;

	public static Item tier4Items;
	public static Item tier5Items;
	public static Item tier6Items;
	public static Item tier7Items;
	public static Item tier8Items;
	public static Item tier9Items;
	public static Item tier10Items;
	public static Item tier11Items;

	public static Item T4key;
	public static Item T5key;
	public static Item T6key;
	public static Item T7key;
	public static Item T8key;
	public static Item T9key;
	public static Item T10key;

	public static Item nickelBattery;
	public static Item zincBattery;
	public static Item mercuryBattery;
	public static Item advancedBattery;
	public static Item ultimateBattery;

	public static Item glowstone_bucket;
	public static Item magma_bucket;
	public static Item nitrogen_bucket;
	public static Item frozen_water_bucket;
	public static Item salt_bucket;

	public static Item cannedFood;
	public static Item diamondApple;
	public static Item ironApple;
	public static Item bodyParts;

	public static Item ingotUranium;
	public static Item compressedMercury;
	public static Item ingotMercury;

	public static Item tier2ThermalPadding;
	public static Item tier3ThermalPadding;
	public static Item tier4ThermalPadding;

	public static Item wafers;

	public static void init() {
		initializeItems();
		registerItems();
		registerFluidContainer();
		OreDictionaryRegister();
	}

	private static void initializeItems() {
		if (Config.mercury) {
			mercuryBattery = new ItemBasicBattery("mercuryBattery", 85000f, 2);

			ingotMercury = new ItemBasicItem("ingotMercury");
			compressedMercury = new ItemMercuryCompressed("compressedMercury");
		}
		if (Config.venus) {
			tier4Rocket = new Tier4Rocket("itemTier4Rocket");
			schematicTier4 = new SchematicTier4("schematicTier4");
			noseConeTier4 = new Tier4NoseCone("noseConeTier4");
			tier4Items = new ItemTier4Items("tier4");
			T4key = new ItemKeyT4("T4key").setUnlocalizedName("key");
		}
		if (Config.ceres) {
			ingotUranium = new ItemBasicItem("ingotUranium");
			//salt_bucket = new ItemBasicItemBucket("bucket_salt", ExtraPlanets_Fluids.salt);
		}
		if (Config.jupiter) {
			nickelBattery = new ItemBasicBattery("nickelBattery", 45000f, 2);
			//magma_bucket = new ItemBasicItemBucket("bucket_magma", ExtraPlanets_Fluids.magma);

			tier5Rocket = new Tier5Rocket("itemTier5Rocket");
			schematicTier5 = new SchematicTier5("schematicTier5");
			noseConeTier5 = new Tier5NoseCone("noseConeTier5");
			tier5Items = new ItemTier5Items("tier5");
			T5key = new ItemKeyT5("T5key").setUnlocalizedName("key");
		}
		if (Config.saturn) {
			//glowstone_bucket = new ItemBasicItemBucket("bucket_glowstone", ExtraPlanets_Fluids.glowstone);

			tier6Rocket = new Tier6Rocket("itemTier6Rocket");
			schematicTier6 = new SchematicTier6("schematicTier6");
			noseConeTier6 = new Tier6NoseCone("noseConeTier6");
			tier6Items = new ItemTier6Items("tier6");
			T6key = new ItemKeyT6("T6key").setUnlocalizedName("key");
		}
		if (Config.uranus) {
			//frozen_water_bucket = new ItemBasicItemBucket("bucket_frozen_water", ExtraPlanets_Fluids.frozen_water);

			tier7Rocket = new Tier7Rocket("itemTier7Rocket");
			schematicTier7 = new SchematicTier7("schematicTier7");
			noseConeTier7 = new Tier7NoseCone("noseConeTier7");
			tier7Items = new ItemTier7Items("tier7");
			T7key = new ItemKeyT7("T7key").setUnlocalizedName("key");
		}
		if (Config.neptune) {
			zincBattery = new ItemBasicBattery("zincBattery", 125000f, 2);
			//nitrogen_bucket = new ItemBasicItemBucket("bucket_nitrogen", ExtraPlanets_Fluids.nitrogen);

			tier8Rocket = new Tier8Rocket("itemTier8Rocket");
			schematicTier8 = new SchematicTier8("schematicTier8");
			noseConeTier8 = new Tier8NoseCone("noseConeTier8");
			tier8Items = new ItemTier8Items("tier8");
			T8key = new ItemKeyT8("T8key").setUnlocalizedName("key");
		}
		if (Config.pluto) {
			tier9Rocket = new Tier9Rocket("itemTier9Rocket");
			schematicTier9 = new SchematicTier9("schematicTier9");
			noseConeTier9 = new Tier9NoseCone("noseConeTier9");
			tier9Items = new ItemTier9Items("tier9");
			T9key = new ItemKeyT9("T9key").setUnlocalizedName("key");
		}
		if (Config.eris) {
			tier10Rocket = new Tier10Rocket("itemTier10Rocket");
			schematicTier10 = new SchematicTier10("schematicTier10");
			noseConeTier10 = new Tier10NoseCone("noseConeTier10");
			tier10Items = new ItemTier10Items("tier10");
			T10key = new ItemKeyT10("T10key").setUnlocalizedName("key");
		}
		if (Config.eris) {
			tier11Items = new ItemTier11Items("tier11");
		}
		// cannedFood = new ItemCannedFood("cannedfood");
		diamondApple = new ItemAppleDiamond(8, 2.2F, false);
		ironApple = new ItemAppleIron(4, 2.2F, false);
		if (Config.mercury || Config.ceres || Config.pluto || Config.eris)
			bodyParts = new ItemBodyParts();
		// tier2ThermalPadding = new
		// ItemTier2ThermalPadding("tier2ThermalPadding");
		// tier3ThermalPadding = new
		// ItemTier3ThermalPadding("tier3ThermalPadding");
		// tier4ThermalPadding = new
		// ItemTier4ThermalPadding("tier4ThermalPadding");
		wafers = new ItemWafers("wafer");
		advancedBattery = new ItemBasicBattery("advancedBattery", 50000f, 2);
		ultimateBattery = new ItemBasicBattery("ultimateBattery", 200000f, 2);
	}

	private static void registerItems() {
		if (Config.mercury) {
			GameRegistry.registerItem(mercuryBattery, "mercuryBattery");
			GameRegistry.registerItem(compressedMercury, "compressedMercury");
			GameRegistry.registerItem(ingotMercury, "ingotMercury");
		}
		if (Config.venus) {
			GameRegistry.registerItem(tier4Rocket, "itemTier4Rocket");
			GameRegistry.registerItem(schematicTier4, "schematicTier4");
			GameRegistry.registerItem(noseConeTier4, "noseConeTier4");
			GameRegistry.registerItem(tier4Items, "tier4Items");
			GameRegistry.registerItem(T4key, "T4key");
		}
		if (Config.ceres) {
			GameRegistry.registerItem(ingotUranium, "ingotUranium");
			//GameRegistry.registerItem(salt_bucket, "bucket_salt");
		}
		if (Config.jupiter) {
			GameRegistry.registerItem(tier5Rocket, "itemTier5Rocket");
			GameRegistry.registerItem(schematicTier5, "schematicTier5");
			GameRegistry.registerItem(noseConeTier5, "noseConeTier5");
			GameRegistry.registerItem(tier5Items, "tier5Items");
			GameRegistry.registerItem(T5key, "T5key");

			GameRegistry.registerItem(nickelBattery, "nickelBattery");
			//GameRegistry.registerItem(magma_bucket, "bucket_magma");
		}
		if (Config.saturn) {
			GameRegistry.registerItem(tier6Rocket, "itemTier6Rocket");
			GameRegistry.registerItem(schematicTier6, "schematicTier6");
			GameRegistry.registerItem(noseConeTier6, "noseConeTier6");
			GameRegistry.registerItem(tier6Items, "tier6Items");
			GameRegistry.registerItem(T6key, "T6key");

			//GameRegistry.registerItem(glowstone_bucket, "bucket_glowstone");
		}
		if (Config.uranus) {
			GameRegistry.registerItem(tier7Rocket, "itemTier7Rocket");
			GameRegistry.registerItem(schematicTier7, "schematicTier7");
			GameRegistry.registerItem(noseConeTier7, "noseConeTier7");
			GameRegistry.registerItem(tier7Items, "tier7Items");
			GameRegistry.registerItem(T7key, "T7key");
			//GameRegistry.registerItem(frozen_water_bucket, "bucket_frozen_water");
		}
		if (Config.neptune) {
			GameRegistry.registerItem(tier8Rocket, "itemTier8Rocket");
			GameRegistry.registerItem(schematicTier8, "schematicTier8");
			GameRegistry.registerItem(noseConeTier8, "noseConeTier8");
			GameRegistry.registerItem(tier8Items, "tier8Items");
			GameRegistry.registerItem(T8key, "T8key");
			GameRegistry.registerItem(zincBattery, "zincBattery");
			//GameRegistry.registerItem(nitrogen_bucket, "bucket_nitrogen");
		}
		if (Config.pluto) {
			GameRegistry.registerItem(tier9Rocket, "itemTier9Rocket");
			GameRegistry.registerItem(schematicTier9, "schematicTier9");
			GameRegistry.registerItem(noseConeTier9, "noseConeTier9");
			GameRegistry.registerItem(tier9Items, "tier9Items");
			GameRegistry.registerItem(T9key, "T9key");
		}
		if (Config.eris) {
			GameRegistry.registerItem(tier10Rocket, "itemTier10Rocket");
			GameRegistry.registerItem(schematicTier10, "schematicTier10");
			GameRegistry.registerItem(noseConeTier10, "noseConeTier10");
			GameRegistry.registerItem(tier10Items, "tier10Items");
			GameRegistry.registerItem(T10key, "T10key");
		}
		if (Config.kepler22b) {
			GameRegistry.registerItem(tier11Items, "tier11Items");
		}

		//GameRegistry.registerItem(cannedFood, "cannedFood");
		GameRegistry.registerItem(diamondApple, "diamondApple");
		GameRegistry.registerItem(ironApple, "ironApple");

		// if (Config.mercury || Config.ceres || Config.pluto || Config.eris)
		// GameRegistry.registerItem(bodyParts, "bodyParts");

//		GameRegistry.registerItem(tier2ThermalPadding, tier2ThermalPadding.getUnlocalizedName());
//		GameRegistry.registerItem(tier3ThermalPadding, tier3ThermalPadding.getUnlocalizedName());
//		GameRegistry.registerItem(tier4ThermalPadding, tier4ThermalPadding.getUnlocalizedName());

		GameRegistry.registerItem(wafers, wafers.getUnlocalizedName());

		GameRegistry.registerItem(advancedBattery, advancedBattery.getUnlocalizedName());
		GameRegistry.registerItem(ultimateBattery, ultimateBattery.getUnlocalizedName());
	}

	private static void registerFluidContainer() {
//		if (Config.saturn) {
//			FluidContainerRegistry.registerFluidContainer(ExtraPlanets_Fluids.glowstone_fluid, new ItemStack(glowstone_bucket, 1, 0), new ItemStack(Items.bucket));
//		}
//		if (Config.jupiter) {
//			FluidContainerRegistry.registerFluidContainer(ExtraPlanets_Fluids.magma_fluid, new ItemStack(magma_bucket, 1, 0), new ItemStack(Items.bucket));
//		}
//		if (Config.neptune) {
//			FluidContainerRegistry.registerFluidContainer(ExtraPlanets_Fluids.nitrogen_fluid, new ItemStack(nitrogen_bucket, 1, 0), new ItemStack(Items.bucket));
//		}
//		if (Config.uranus) {
//			FluidContainerRegistry.registerFluidContainer(ExtraPlanets_Fluids.frozen_water_fluid, new ItemStack(frozen_water_bucket, 1, 0), new ItemStack(Items.bucket));
//		}
//		if (Config.ceres) {
//			FluidContainerRegistry.registerFluidContainer(ExtraPlanets_Fluids.salt_fluid, new ItemStack(salt_bucket, 1, 0), new ItemStack(Items.bucket));
//		}
	}

	public static void OreDictionaryRegister() {
		if (Config.mercury)
			OreDictionary.registerOre("ingotMercury", new ItemStack(ingotMercury));
		if (Config.venus)
			OreDictionary.registerOre("ingotCarbon", new ItemStack(tier4Items, 1, 5));
		if (Config.ceres)
			OreDictionary.registerOre("ingotUranium", new ItemStack(ingotUranium));
		if (Config.jupiter) {
			OreDictionary.registerOre("ingotPalladium", new ItemStack(tier5Items, 1, 5));
			OreDictionary.registerOre("ingotNickel", new ItemStack(tier5Items, 1, 7));
			OreDictionary.registerOre("gemRedGem", new ItemStack(tier5Items, 1, 8));
		}
		if (Config.saturn)
			OreDictionary.registerOre("ingotMagnesium", new ItemStack(tier6Items, 1, 5));
		if (Config.uranus) {
			OreDictionary.registerOre("ingotCrystal", new ItemStack(tier7Items, 1, 5));
			OreDictionary.registerOre("gemWhiteGem", new ItemStack(tier7Items, 1, 7));
		}
		if (Config.neptune) {
			OreDictionary.registerOre("ingotZinc", new ItemStack(tier8Items, 1, 5));
			OreDictionary.registerOre("gemBlueGem", new ItemStack(tier8Items, 1, 6));
		}
		if (Config.pluto)
			OreDictionary.registerOre("ingotTungsten", new ItemStack(tier9Items, 1, 5));
		if (Config.eris)
			OreDictionary.registerOre("ingotDarkIron", new ItemStack(tier10Items, 1, 5));
		if (Config.kepler22b) {
			OreDictionary.registerOre("gemBlueDiamond", new ItemStack(tier11Items, 1, 0));
			OreDictionary.registerOre("gemRedDiamond", new ItemStack(tier11Items, 1, 1));
			OreDictionary.registerOre("gemPurpleDiamond", new ItemStack(tier11Items, 1, 2));
			OreDictionary.registerOre("gemYellowDiamond", new ItemStack(tier11Items, 1, 3));
			OreDictionary.registerOre("gemGreenDiamond", new ItemStack(tier11Items, 1, 4));
		}
	}
}
