package com.alanblunt.something.items;

import com.alanblunt.something.SomethingAwesome;

import net.minecraft.item.Item;

public class ItemTestItem extends Item {
	
	public ItemTestItem () {
		
		setUnlocalizedName("testitem");
		setRegistryName("testitem");
		
		setMaxStackSize(1);
		setCreativeTab(SomethingAwesome.tabSomething);
	}

}
