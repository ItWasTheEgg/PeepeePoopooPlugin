package me.egg.peepoo.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class Sex implements CommandExecutor {

    public boolean ifSexMode;

    //TODO add in sex mode / make command do something.

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;

            player.chat("Sex Mode, activate!");
            player.sendTitle(ChatColor.DARK_PURPLE + "SEX MODE!", ChatColor.LIGHT_PURPLE + "activated.", 10, 70 , 20);

            ifSexMode = true;
            return ifSexMode;

        } else {
            System.out.println("You must be a player to run this command.");
        }

        return false;
    }
}
