package de.milli.plugin.listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    @EventHandler
    public static void onJoin(PlayerJoinEvent event){
        event.setJoinMessage(ChatColor.GOLD + "Deine Mutter ist Schwanger von deinem Haustier");
    }
}
