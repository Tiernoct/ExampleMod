package com.example.examplemod.util.helpers;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.example.examplemod.tileentity.ExampleTileEntity;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class NBTHelper 
{
	public static CompoundNBT toNBT(Object o)
	{
		if(o instanceof ItemStack)
		{
			return writeItemstack((ItemStack)o);
		}
		
		if(o instanceof ExampleTileEntity)
		{
			return writeExampleTileEntity((ExampleTileEntity)o);
		}
		
		return null;
	}

	private static CompoundNBT writeExampleTileEntity(ExampleTileEntity o) 
	{
		CompoundNBT compoundNBT = new CompoundNBT();
		compoundNBT.putInt("x", o.x);
		compoundNBT.putInt("y", o.y);
		compoundNBT.putInt("z", o.z);
		return compoundNBT;
	}

	private static CompoundNBT writeItemstack(ItemStack iS) 
	{
		CompoundNBT nbt = new CompoundNBT();
		nbt.putInt("count", iS.getCount());
		nbt.putString("item", iS.getItem().getRegistryName().toString());
		nbt.putByte("type", (byte)0);
		return nbt;
	}
	
	@Nullable
	public static Object fromNBT(@Nonnull CompoundNBT compound) 
	{
		switch (compound.getByte("type"))
		{
		case 0:
			return readItemStack(compound);
		default:
			return null;
		}
	}

	private static ItemStack readItemStack(CompoundNBT compound) 
	{
		Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(compound.getString("item")));
		int count = compound.getInt("count");
		return new ItemStack(item, count);
	}
}
