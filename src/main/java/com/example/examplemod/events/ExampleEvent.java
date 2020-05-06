package com.example.examplemod.events;

import com.example.examplemod.ExampleMod;

import net.minecraft.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus = Bus.FORGE)
public class ExampleEvent 
{	
	@SubscribeEvent
	public static void exampleEvent(LivingJumpEvent event)
	{
		//ExampleMod.LOGGER.info("ExampleEvent Fired");
		
		LivingEntity livingEntity = event.getEntityLiving();
		livingEntity.setGlowing(true);
	}
}
