package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.objects.blocks.ModelledBlock;
import com.example.examplemod.objects.blocks.TileEntityBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks
{
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);
	
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(Block.Properties.create(Material.ROCK)));
	public static final RegistryObject<Block> EXAMPLE_MODELLED_BLOCK = BLOCKS.register("example_modelled_block", () -> new ModelledBlock(Block.Properties.create(Material.WOOD)));
	public static final RegistryObject<Block> EXAMPLE_TILE_ENTITY_BLOCK = BLOCKS.register("example_tile_entity_block", () -> new TileEntityBlock(Block.Properties.create(Material.IRON)));
}
