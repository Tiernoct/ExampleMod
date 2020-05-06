package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.tileentity.ExampleTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ExampleTileEntityTypes 
{
	public static final DeferredRegister<TileEntityType<?>> EXAMPLE_TILE_ENTITY_TYPE = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, ExampleMod.MOD_ID);
	
	public static final RegistryObject<TileEntityType<ExampleTileEntity>> EXAMPLE = EXAMPLE_TILE_ENTITY_TYPE.register("example_tile_entity_block", () -> TileEntityType.Builder.create(ExampleTileEntity::new, ModBlocks.EXAMPLE_TILE_ENTITY_BLOCK.get()).build(null));
}
