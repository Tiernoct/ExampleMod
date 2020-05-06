package com.example.examplemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.examplemod.init.ModItems;
import com.example.examplemod.world.gen.ExampleGen;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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
			return new ItemStack(ModItems.example_item);
		}
	}

    public ExampleMod()
    {
    	final IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        
    	modBus.addListener(this::setup);
       
    	modBus.addListener(this::doClientStuff);
        instance = this;

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
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