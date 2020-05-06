package com.example.examplemod.world.gen;

import com.example.examplemod.init.ModBlocks;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ExampleGen 
{
	public static void generateExample()
	{
		for (Biome biome : ForgeRegistries.BIOMES)
		{
				ConfiguredPlacement<CountRangeConfig> customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128));
				biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(FillerBlockType.NATURAL_STONE, ModBlocks.EXAMPLE_BLOCK.get().getDefaultState(), 10)).withPlacement(customConfig));
		}
	}
}