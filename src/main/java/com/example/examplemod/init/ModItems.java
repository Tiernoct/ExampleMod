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
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems 
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().group(ExampleItemGroup.instance)));
	public static final RegistryObject<Item> EXAMPLE_FOOD = ITEMS.register("example_food", () -> new Item(new Item.Properties().group(ExampleItemGroup.instance).food(new Food.Builder().hunger(10).saturation(1F).build())));
	public static final RegistryObject<AdvancedItem> EXAMPLE_ADVANCED_ITEM = ITEMS.register("example_advance_item", () -> new AdvancedItem(new Item.Properties().group(ExampleItemGroup.instance)));
	
	public static final RegistryObject<SwordItem> EXAMPLE_SWORD = ITEMS.register("example_sword", () -> new SwordItem(ExampleToolMaterial.EXAMPLE, 2, 1.8F, (new Item.Properties().group(ExampleItemGroup.instance))));
	public static final RegistryObject<PickaxeItem> EXAMPLE_PICKAXE = ITEMS.register("example_pickaxe", () -> new PickaxeItem(ExampleToolMaterial.EXAMPLE, 1, 1.8F, (new Item.Properties().group(ExampleItemGroup.instance))));
	public static final RegistryObject<AxeItem> EXAMPLE_AXE = ITEMS.register("example_axe", () -> new AxeItem(ExampleToolMaterial.EXAMPLE, 3, 1.8F, (new Item.Properties().group(ExampleItemGroup.instance))));
	public static final RegistryObject<ShovelItem> EXAMPLE_SHOVEL = ITEMS.register("example_shovel", () -> new ShovelItem(ExampleToolMaterial.EXAMPLE, 0, 1.8F, (new Item.Properties().group(ExampleItemGroup.instance))));
	public static final RegistryObject<HoeItem> EXAMPLE_HOE = ITEMS.register("example_hoe", () -> new HoeItem(ExampleToolMaterial.EXAMPLE, 1.8F, (new Item.Properties().group(ExampleItemGroup.instance))));

	public static final RegistryObject<ArmorItem> EXAMPLE_HELMET = ITEMS.register("example_helmet", () -> new ArmorItem(ExampleArmourMaterial.EXAMPLE, EquipmentSlotType.HEAD, new Item.Properties().group(ExampleItemGroup.instance)));
	public static final RegistryObject<ArmorItem> EXAMPLE_CHESTPLATE = ITEMS.register("example_chestplate", () -> new ArmorItem(ExampleArmourMaterial.EXAMPLE, EquipmentSlotType.CHEST, new Item.Properties().group(ExampleItemGroup.instance)));
	public static final RegistryObject<ArmorItem> EXAMPLE_LEGGINGS = ITEMS.register("example_leggings", () -> new ArmorItem(ExampleArmourMaterial.EXAMPLE, EquipmentSlotType.LEGS, new Item.Properties().group(ExampleItemGroup.instance)));
	public static final RegistryObject<ArmorItem> EXAMPLE_BOOTS = ITEMS.register("example_boots", () -> new ArmorItem(ExampleArmourMaterial.EXAMPLE, EquipmentSlotType.FEET, new Item.Properties().group(ExampleItemGroup.instance)));
}
