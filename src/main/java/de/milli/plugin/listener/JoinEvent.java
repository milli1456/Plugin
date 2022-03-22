package de.milli.plugin.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    @EventHandler
    public static void onJoin(PlayerJoinEvent event){
        String teamName = "Alpha";
        event.setJoinMessage(ChatColor.GOLD + "Programmieren lernen ist schwer");
        for (Player player: Bukkit.getOnlinePlayers()) {
            player.sendMessage("Der Spieler ");

        }

         /*for (Player player: Bukkit.getOnlinePlayers()) {
            if(player == teamName){
                event.getPlayer().sendMessage("Dein Mate " + player + " ist online");
            }
        }
      */

    }
}
