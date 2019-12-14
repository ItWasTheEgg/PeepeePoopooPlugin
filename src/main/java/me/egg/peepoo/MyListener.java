package me.egg.peepoo;

import me.egg.peepoo.commands.Sex;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class MyListener implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {

        boolean isSexMode = new Sex().ifSexMode;
        Player player = e.getPlayer();
        player.sendMessage();


    }

}
