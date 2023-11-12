package net.ddns.vcccd;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GetNet implements CommandExecutor{
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) { //sender = source of command
			Player player = (Player) sender;
			ItemStack Net = new ItemStack(Material.STONE_AXE);
			ItemMeta NetData = Net.getItemMeta();
			List<String> Lore = new ArrayList<String>();
			Lore.add("Catches Characters");
			NetData.setLore(Lore);
			NetData.setDisplayName(ChatColor.GRAY + "Fatima's Net");
			Net.setItemMeta(NetData);
			player.getInventory().setItemInMainHand(Net);
		}
		
		return(true);
	}

}
