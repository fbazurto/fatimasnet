package net.ddns.vcccd;

import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

public class NetUse implements Listener{
	
	@EventHandler
	public void onNetUse(PlayerInteractEntityEvent event) {
		Player player = event.getPlayer();
		if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.GRAY + "Fatima's Net")) {
		if(event.getRightClicked() instanceof Mob) {
			HashMap<EntityType, Material> ReferencedMobs = new HashMap<EntityType, Material>();
			EntityType[] Types = {EntityType.VILLAGER, EntityType.CREEPER, EntityType.COW, EntityType.BEE,EntityType.LLAMA,EntityType.BAT,
					EntityType.CHICKEN, EntityType.CAVE_SPIDER,EntityType.SKELETON,EntityType.SPIDER, EntityType.PIG, EntityType.SHEEP, EntityType.CAMEL, 
					EntityType.CAT, EntityType.HORSE, EntityType.OCELOT};
			
			Material[] SpawnEggs = {Material.VILLAGER_SPAWN_EGG, Material.CREEPER_SPAWN_EGG,
					Material.COW_SPAWN_EGG, Material.BEE_SPAWN_EGG, Material.LLAMA_SPAWN_EGG, 
					Material.BAT_SPAWN_EGG, Material.CHICKEN_SPAWN_EGG, Material.CAVE_SPIDER_SPAWN_EGG, Material.SKELETON_SPAWN_EGG,
					Material.SPIDER_SPAWN_EGG, Material.PIG_SPAWN_EGG,Material.SHEEP_SPAWN_EGG, Material.CAMEL_SPAWN_EGG, Material.CAT_SPAWN_EGG, 
					Material.HORSE_SPAWN_EGG, Material.OCELOT_SPAWN_EGG};
			for(int Values = 0; Values < Types.length; Values++) {
				ReferencedMobs.put(Types[Values], SpawnEggs[Values]);
			}
			
			Mob ClickedEntity = (Mob) event.getRightClicked();
			
			switch(ClickedEntity.getType()) {
			case VILLAGER:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;
			case CREEPER:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;
			case COW:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;
			case BEE:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;
			case LLAMA:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;
			case BAT:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;				
			case CHICKEN:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;	
			case CAVE_SPIDER:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;
			case SPIDER:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;
			case PIG:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;
			case SHEEP:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;
			case CAMEL:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;
			case CAT:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;
			case HORSE:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;
			case OCELOT:
				GiveItem(player, ReferencedMobs.get(ClickedEntity.getType()), ClickedEntity);
				break;
			default:
				player.sendMessage("Cannot Catch Entity In the Net...");
				break;
			}
		}
	
	}assert true;
}
	
	private void GiveItem(Player player, Material item, Mob ClickedEntity) {
		ItemStack egg = new ItemStack(item);
		player.getInventory().setItemInOffHand(egg);
		ClickedEntity.damage(ClickedEntity.getHealth());
		World ReferenceWorld = player.getWorld();
		
		for(int i = -5; i < 5; i++) {
			ReferenceWorld.spawnParticle(Particle.CLOUD, ClickedEntity.getLocation(), 10);
		}
	}

}
