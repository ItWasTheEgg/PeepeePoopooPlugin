package me.egg.peepoo.commands;


import me.egg.peepoo.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Mcsp implements CommandExecutor {

    private Main main;

    public Mcsp(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendMessage(ChatColor.LIGHT_PURPLE + "Welcome to " + ChatColor.DARK_PURPLE + " Minecraft Sex Plugin" + ChatColor.LIGHT_PURPLE + "!");
                player.sendMessage(ChatColor.LIGHT_PURPLE + "Please do each of the following, ");
                player.sendMessage(ChatColor.DARK_PURPLE + "/mcsp gender <gender>");
                player.sendMessage(ChatColor.DARK_PURPLE + "/mcsp ethnicity <ethnicity>");
                player.sendMessage(ChatColor.DARK_PURPLE + "/mcsp preference <preference>");
                player.sendMessage(ChatColor.DARK_PURPLE + "/info <username>");
            } else if (args.length == 1 ) {

                if (args[0].equalsIgnoreCase("gender")) {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Command to define gender. \nVariables: Male, Female "+ ChatColor.DARK_PURPLE +" \n/mcsp gender <variable>");

                } else if (args[0].equalsIgnoreCase("ethnicity")) {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Command to define ethnicity. \nVariables: Caucasian, Mongolian, Aethiopian " + ChatColor.DARK_PURPLE + " \n/mcsp ethnicity <variable>");

                } else if (args[0].equalsIgnoreCase("preference")) {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "Command to define sexual preference. \nVariables: Male, Female, Both, Neither " + ChatColor.DARK_PURPLE + "\n/mcsp preference <variable>");

                } else if (args[0].equalsIgnoreCase("version")) {

                    //TODO VERSION COMMAND BROKEN. fix eventually
                    String versionForMcsp = main.getConfig().getString("version");
                    player.sendTitle(ChatColor.DARK_PURPLE + "MCSP", ChatColor.LIGHT_PURPLE + "Version: " + versionForMcsp, 10, 70, 20);
                } else {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "This is not a valid command! \nPlease do " + ChatColor.DARK_PURPLE + "/mcsp " + ChatColor.LIGHT_PURPLE + "to see all command options!" );
                }
            } else if (args.length == 2 ) {
                /*TODO MOST IMPORTANT THING IN THE ENTIRE PLUGIN
                COLE YOU MUST ADD THE THING TO SAVE THE PLAYERS CHOICES. RIV SAID SOMETHING ABOUT A .DAT FILE SO DO THAT.
                 */
                // Gender selection
                if (args[0].equalsIgnoreCase("gender")) {

                    if (args[1].equalsIgnoreCase("male")) {
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "You are now classified as a " + ChatColor.DARK_PURPLE + "Male" + ChatColor.LIGHT_PURPLE + ".");
                    } else if (args[1].equalsIgnoreCase("female")) {
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "You are now classified as a " + ChatColor.DARK_PURPLE + "Female" + ChatColor.LIGHT_PURPLE + ".");
                    } else {
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "This is not a valid gender setting.");
                    }

                    // Ethnicity selection
                } else if (args[0].equalsIgnoreCase("ethnicity")) {

                    if (args[1].equalsIgnoreCase("caucasian")) {
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "You are now classified as a " + ChatColor.DARK_PURPLE + "Caucasian" + ChatColor.LIGHT_PURPLE + ".");
                    } else if (args[1].equalsIgnoreCase("mongolian")) {
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "You are now classified as a " + ChatColor.DARK_PURPLE + "Mongolian" + ChatColor.LIGHT_PURPLE + ".");
                    } else if (args[1].equalsIgnoreCase("aethiopian")) {
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "You are now classified as an " + ChatColor.DARK_PURPLE + "Aethiopian" + ChatColor.LIGHT_PURPLE + ".");
                    } else {
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "This is not a valid ethnicity setting.");
                    }

                    //Preference selection
                } else if (args[0].equalsIgnoreCase("preference")) {

                    if (args[1].equalsIgnoreCase("male")) {
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "Your sexual preference is now classified as " + ChatColor.DARK_PURPLE + "Male" + ChatColor.LIGHT_PURPLE + ".");
                    } else if (args[1].equalsIgnoreCase("female")) {
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "Your sexual preference is now classified as " + ChatColor.DARK_PURPLE + "Female" + ChatColor.LIGHT_PURPLE + ".");
                    } else if (args[1].equalsIgnoreCase("both")) {
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "Your sexual preference is now classified as " + ChatColor.DARK_PURPLE + "Both" + ChatColor.LIGHT_PURPLE + ".");
                    } else if (args[1].equalsIgnoreCase("neither")) {
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "Your sexual preference is now classified as " + ChatColor.DARK_PURPLE + "Neither" + ChatColor.LIGHT_PURPLE + ".");
                    } else {
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "This is not a valid sexual preference within MCSP. No judgement.");
                    }

                } else {
                    player.sendMessage(ChatColor.LIGHT_PURPLE + "This is not a valid command! \n Please do " + ChatColor.DARK_PURPLE + "/mcsp " + ChatColor.LIGHT_PURPLE + "to see all command options!" );
                }

            } else {
                player.sendMessage(ChatColor.LIGHT_PURPLE + "You entered an invalid argument, too many arguments, or a completely different command.");
            }

        } else {
            System.out.println("You must be a player to run this command.");
        }

        return true;
    }
}
