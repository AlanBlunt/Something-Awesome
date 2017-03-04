package com.alanblunt.something;

import com.alanblunt.something.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SomethingTab extends CreativeTabs {

	public SomethingTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.testItem);
	}

}
