package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.ExampleMod.ExampleItemGroup;
import com.example.examplemod.enums.ExampleArmourMaterial;
import com.example.examplemod.enums.ExampleToolMaterial;
import com.example.examplemod.objects.items.AdvancedItem;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus=Bus.MOD)
@ObjectHolder(ExampleMod.MOD_ID)
public class ModItems 
{
	//Simple item
	public static final Item example_item = null;
	
	//Food
	public static final Item example_food = null;
	
	//Advanced Item
	public static final Item example_advanced_item = null;
	
	//Tools+Sword
	public static final Item example_sword = null;
	public static final Item example_pickaxe = null;
	public static final Item example_axe = null;
	public static final Item example_shovel = null;
	public static final Item example_hoe = null;
	
	//Armour
	public static final Item example_helmet = null;
	public static final Item example_chestplate = null;
	public static final Item example_leggings = null;
	public static final Item example_boots = null;
	
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> itemRegister)
	{
		//Simple item
		itemRegister.getRegistry().register(new Item(new Item.Properties().group(ExampleItemGroup.instance)).setRegistryName("example_item"));
		//Food
		itemRegister.getRegistry().register(new Item(new Item.Properties().group(ExampleItemGroup.instance).food(new Food.Builder().hunger(10).saturation(1F).build())).setRegistryName("example_food"));
		//Advanced item
		itemRegister.getRegistry().register(new AdvancedItem(new Item.Properties().group(ExampleItemGroup.instance)).setRegistryName("example_advanced_item"));
		//Tools+Sword
		itemRegister.getRegistry().register(new SwordItem(ExampleToolMaterial.EXAMPLE, 2, 1.8F, (new Item.Properties().group(ExampleItemGroup.instance))).setRegistryName("example_sword"));
		itemRegister.getRegistry().register(new PickaxeItem(ExampleToolMaterial.EXAMPLE, 1, 1.8F, (new Item.Properties().group(ExampleItemGroup.instance))).setRegistryName("example_pickaxe"));
		itemRegister.getRegistry().register(new AxeItem(ExampleToolMaterial.EXAMPLE, 3, 1.8F, (new Item.Properties().group(ExampleItemGroup.instance))).setRegistryName("example_axe"));
		itemRegister.getRegistry().register(new ShovelItem(ExampleToolMaterial.EXAMPLE, 0, 1.8F, (new Item.Properties().group(ExampleItemGroup.instance))).setRegistryName("example_shovel"));
		itemRegister.getRegistry().register(new HoeItem(ExampleToolMaterial.EXAMPLE, 1.8F, (new Item.Properties().group(ExampleItemGroup.instance))).setRegistryName("example_hoe"));
		
		//Armour
		itemRegister.getRegistry().register(new ArmorItem(ExampleArmourMaterial.EXAMPLE, EquipmentSlotType.HEAD, new Item.Properties().group(ExampleItemGroup.instance)).setRegistryName("example_helmet"));
		itemRegister.getRegistry().register(new ArmorItem(ExampleArmourMaterial.EXAMPLE, EquipmentSlotType.CHEST, new Item.Properties().group(ExampleItemGroup.instance)).setRegistryName("example_chestplate"));
		itemRegister.getRegistry().register(new ArmorItem(ExampleArmourMaterial.EXAMPLE, EquipmentSlotType.LEGS, new Item.Properties().group(ExampleItemGroup.instance)).setRegistryName("example_leggings"));
		itemRegister.getRegistry().register(new ArmorItem(ExampleArmourMaterial.EXAMPLE, EquipmentSlotType.FEET, new Item.Properties().group(ExampleItemGroup.instance)).setRegistryName("example_boots"));
	}
}
