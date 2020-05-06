package com.example.examplemod.objects.blocks;

import com.example.examplemod.init.ExampleTileEntityTypes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class TileEntityBlock extends Block
{
	public TileEntityBlock(Properties properties) 
	{
		super(properties);
	}
	
	@Override
	public boolean hasTileEntity(BlockState state) 
	{
		return true;
	}
	
	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) 
	{
		return ExampleTileEntityTypes.EXAMPLE.get().create();
	}
}