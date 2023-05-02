package me.sailez.inauguracoes.cmd;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import me.sailez.inauguracoes.Main;
import me.sailez.inauguracoes.utils.Titles;

public class InaugurarCMD implements CommandExecutor{

	public static String getMensagem(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < args.length; i++) {
			sb.append(args[i] + " ");
		}
		return sb.toString();
	}
	@Override
	public boolean onCommand(CommandSender s, Command cmd, String lb, String[] args) {
		Player p = (Player)s;
		if(lb.equalsIgnoreCase("inaugurar")) {
			if(!p.hasPermission("martin.inaugurar")) {
				p.sendMessage("§cVoce nao possui permissao suficiente.");
				p.playSound(p.getLocation(), Sound.CAT_MEOW, 1F, 1F);
			}
			if(args.length == 0) {
				p.sendMessage("§cUse: /inaugurar <nome>");
				return true;
			}
			if (args.length >= 1) {
				Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {
					int a = 5;
					public void run() {
					    if (this.a == 5) {
					    	for(Player ativos : Bukkit.getOnlinePlayers()) {
							      Titles title = new Titles("§a" + getMensagem(args), "§2Inaugurando em: §7" + this.a + "§2s", 0, 2, 2);
							      
							      title.send(p);
							      ativos.playSound(ativos.getLocation(), Sound.ORB_PICKUP, 1F, (float) 1F);
					    	}
					    }
					    if (this.a == 4) {
					    	for(Player ativos : Bukkit.getOnlinePlayers()) {
							      Titles title = new Titles("§b" + getMensagem(args), "§2Inaugurando em: §7" + this.a + "§2s", 0, 2, 2);
							      
							      title.send(p);
							      ativos.playSound(ativos.getLocation(), Sound.ORB_PICKUP, 1F, (float) 1F);
					    	}
					    }
					    if (this.a == 3) {
					    	for(Player ativos : Bukkit.getOnlinePlayers()) {
							      Titles title = new Titles("§c" + getMensagem(args), "§2Inaugurando em: §7" + this.a + "§2s", 0, 2, 2);
							      
							      title.send(p);
							      ativos.playSound(ativos.getLocation(), Sound.ORB_PICKUP, 1F, (float) 1F);
					    	}
					    }
					    if (this.a == 2) {
					    	for(Player ativos : Bukkit.getOnlinePlayers()) {
							      Titles title = new Titles("§e" + getMensagem(args), "§2Inaugurando em: §7" + this.a + "§2s", 0, 2, 2);
							      
							      title.send(p);
							      ativos.playSound(ativos.getLocation(), Sound.ORB_PICKUP, 1F, (float) 1F);
					    	}
					    }
					    if (this.a == 1) {
					    	for(Player ativos : Bukkit.getOnlinePlayers()) {
							      Titles title = new Titles("§d" + getMensagem(args), "§2Inaugurando em: §7" + this.a + "§2s", 0, 2, 2);
							      
							      title.send(p);
							      ativos.playSound(ativos.getLocation(), Sound.ORB_PICKUP, 1F, (float) 1F);
					    	}
					    }
					    if (this.a == 0)
					    {
					    	for(Player ativos: Bukkit.getOnlinePlayers()) {
						      Titles title = new Titles("§6" + getMensagem(args), "§eINAUGURADA!", 0, 4, 4);
						      
						      title.send(ativos);
						      ativos.playSound(ativos.getLocation(), Sound.EXPLODE, 1F, (float) 1F);
						      ativos.playSound(ativos.getLocation(), Sound.ENDERDRAGON_DEATH, 1F, (float) 1F);
						      ativos.getWorld().spawnEntity(ativos.getLocation(), EntityType.FIREWORK);
						      ativos.getWorld().spawnEntity(ativos.getLocation(), EntityType.FIREWORK);
						      ativos.getWorld().spawnEntity(ativos.getLocation(), EntityType.FIREWORK);
						      ativos.getWorld().spawnEntity(ativos.getLocation(), EntityType.FIREWORK);
					          }
					    }
					    this.a -= 1;
					}
				}, 0L, 20L);
			}
		}
		return false;
	}
}
