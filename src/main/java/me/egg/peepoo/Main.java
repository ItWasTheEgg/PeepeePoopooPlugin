package me.egg.peepoo;

import me.egg.peepoo.commands.Info;
import me.egg.peepoo.commands.Mcsp;
import me.egg.peepoo.commands.Sex;


import org.bukkit.configuration.file.FileConfiguration;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("The PoopooPeepee Plugin has started!");
        FileConfiguration config = this.getConfig();
        config.options().copyDefaults();
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new MyListener(), this);
        Mcsp Mcsp = new Mcsp(this);

        //ACTUAL STUFF STARTS NOW

        //Commands
        getCommand("mcsp").setExecutor(new Mcsp(this));
        getCommand("info").setExecutor(new Info());
        getCommand("sex").setExecutor(new Sex());



    }



}
