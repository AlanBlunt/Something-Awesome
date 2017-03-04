package com.alanblunt.something;

import com.alanblunt.something.proxy.IProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MINECRAFT_VERSIONS)
public class SomethingAwesome {
	
	@Instance(value = Reference.MOD_ID)
	public static SomethingAwesome instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static IProxy proxy;
	
	public static CreativeTabs tabSomething = new SomethingTab("tabSomething");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		proxy.preInit(event);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.init(event);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		proxy.postInit(event);
		
	}

}
