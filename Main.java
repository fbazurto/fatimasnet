package net.ddns.vcccd;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		this.getCommand("givenet").setExecutor(new GetNet());
		getServer().getPluginManager().registerEvents(new NetUse(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
}
