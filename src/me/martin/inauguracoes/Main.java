package me.sailez.inauguracoes;

import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

import me.sailez.inauguracoes.cmd.InaugurarCMD;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getCommand("inaugurar").setExecutor(new InaugurarCMD());
	}
	
	@Override
	public void onDisable() {
		HandlerList.unregisterAll();
	}
	
	public static Main getInstance() {
		return (Main)Bukkit.getPluginManager().getPlugin("Inauguracoes");
	}
}
