package com.alanblunt.something.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item testItem;
	
	public static void init() {
		
		testItem = new ItemTestItem();
		
	}
	
	public static void register() {
		
		GameRegistry.register(testItem);
		
	}
	
	public static void registerRenders() {
		
		registerRender(testItem);
		
	}
	
	private static void registerRender(Item item) {
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}

}
