package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.ExampleMod.ExampleItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ExampleMod.MOD_ID)
public class ModBlocks 
{
	//Simple Block
	public static final Block example_block = null;
	
	//Modelled Block
	//	public static final Block modelled_block = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> blockRegister)
	{
		//Simple Block
		blockRegister.getRegistry().register(new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(2F).harvestTool(ToolType.PICKAXE).sound(SoundType.field_226947_m_)).setRegistryName("example_block"));
			
		//Modelled Block
		//blockRegister.getRegistry().register(new ModelledBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(2F, 5F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName("modelled_block"));
	}

	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> itemBlockRegister)
	{
		//Simple Block
		itemBlockRegister.getRegistry().register(new BlockItem(example_block, new Item.Properties().group(ExampleItemGroup.instance)).setRegistryName("example_block"));
		
		//Modelled Block#
		//itemBlockRegister.getRegistry().register(new BlockItem(modelled_block, new Item.Properties().group(ExampleItemGroup.instance)).setRegistryName("modelled_block"));
	}
}
