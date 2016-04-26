package com.Thomas.Fully_Elemental.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.Thomas.Fully_Elemental.Reference;

public class HeldItems {
	
	public static Item rock;
	
	public static void init() {
		rock = new Item().setUnlocalizedName("rock");
	}

	public static void register()
	{
		GameRegistry.registerItem(rock, rock.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(rock);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
