package nl.hotmail.fynn2602.Potions;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Potions extends JavaPlugin {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "Alleen spelers kunnen dit gebruiken!");
			return true;
		}
		
		final Player p = (Player) sender;
		PlayerInventory pi = p.getInventory();
	
	    if (cmd.getName().equalsIgnoreCase("antwoord2")) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 120, 0));
			p.addPotionEffect(new PotionEffect(PotionEffectType.HARM, 120, 0));
			p.sendMessage(ChatColor.DARK_RED + "Dit is geen goede combi!!!!");
		
	    }
				
		if (cmd.getName().equalsIgnoreCase("antwoord1")) {
			p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 160, 0));
			p.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 120, 0));			
			p.sendMessage(ChatColor.GREEN + "Dit is goede combi!!!!");
		}
		return true;
	    
	}
}