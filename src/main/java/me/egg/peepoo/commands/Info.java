package me.egg.peepoo.commands;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Info implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        //TODO INFO CARDS
        //MAKE IT SO IT WORKS FOR INDIVIDUALS AND OTHERS
        //REPLACE ALL THE REPLACES WITH ACTUAL VALUES FOR THERE STATS

        if(args.length == 0) {
            //PERSONAL INFO
            player.sendMessage(ChatColor.LIGHT_PURPLE + "Character Card of " + ChatColor.GOLD + player.getName() + ChatColor.LIGHT_PURPLE + ":");
            player.sendMessage(ChatColor.LIGHT_PURPLE + "Gender: " + ChatColor.DARK_PURPLE + "FILLER TEXT" + ChatColor.LIGHT_PURPLE + ".");
            player.sendMessage(ChatColor.LIGHT_PURPLE + "Ethnicity: " + ChatColor.DARK_PURPLE + "FILLER TEXT" + ChatColor.LIGHT_PURPLE + ".");
            player.sendMessage(ChatColor.LIGHT_PURPLE + "Preference: " + ChatColor.DARK_PURPLE + "FILLER TEXT" + ChatColor.LIGHT_PURPLE + ".");

        } else if (args.length == 1) {
            //OTHER INFO
            Player o = Bukkit.getServer().getPlayer(args[0]);

            if (o == null) {
                player.sendMessage(ChatColor.LIGHT_PURPLE + "That player is not online!");
                return false;
            }

            player.sendMessage(ChatColor.LIGHT_PURPLE + "Character Card of " + ChatColor.GOLD + o.getName() + ChatColor.LIGHT_PURPLE + ":");
            player.sendMessage(ChatColor.LIGHT_PURPLE + "Gender: " + ChatColor.DARK_PURPLE + "FILLER TEXT" + ChatColor.LIGHT_PURPLE + ".");
            player.sendMessage(ChatColor.LIGHT_PURPLE + "Ethnicity: " + ChatColor.DARK_PURPLE + "FILLER TEXT" + ChatColor.LIGHT_PURPLE + ".");
            player.sendMessage(ChatColor.LIGHT_PURPLE + "Preference: " + ChatColor.DARK_PURPLE + "FILLER TEXT" + ChatColor.LIGHT_PURPLE + ".");
        }

        return false;
    }
}
