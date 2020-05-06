package com.example.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.examplemod.init.ExampleTileEntityTypes;
import com.example.examplemod.init.ModBlocks;
import com.example.examplemod.init.ModItems;
import com.example.examplemod.world.gen.ExampleGen;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(ExampleMod.MOD_ID)
@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus = Bus.MOD)
public class ExampleMod
{
	public static final String MOD_ID = "examplemod";
	public static ExampleMod instance;
	public static final Logger LOGGER = LogManager.getLogger();
	
	public static class ExampleItemGroup extends ItemGroup
	{
		public static final ExampleItemGroup instance = new ExampleItemGroup(ItemGroup.GROUPS.length, ExampleMod.MOD_ID);
		private ExampleItemGroup(int index, String label)
		{
			super(index, label);
		}

		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(ModItems.EXAMPLE_ITEM.get());
		}
	}

    public ExampleMod()
    {
    	final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        
    	modBus.addListener(this::setup);
    	modBus.addListener(this::doClientStuff);
    	
    	ModItems.ITEMS.register(modBus);
    	ModBlocks.BLOCKS.register(modBus);
    	
    	ExampleTileEntityTypes.EXAMPLE_TILE_ENTITY_TYPE.register(modBus);
    	
        instance = this;
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event)
    {
    	final IForgeRegistry<Item> registry = event.getRegistry();
    	ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block ->
    	{
    		final Item.Properties properties = new Item.Properties().group(ExampleItemGroup.instance);
    		final BlockItem blockItem = new BlockItem(block, properties);
    		blockItem.setRegistryName(block.getRegistryName());
    		registry.register(blockItem);
    	});
    	
    	LOGGER.debug("Registered BlockItems");
    }

    // Register the setup method for modloading
    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }

    // Register the doClientStuff method for modloading
    private void doClientStuff(final FMLClientSetupEvent event) 
    {
    	
    }
    
    @SubscribeEvent
    public static void loadComplete(FMLLoadCompleteEvent event)
    {
    	ExampleGen.generateExample();
    }
}