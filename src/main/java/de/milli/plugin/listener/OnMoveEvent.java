package de.milli.plugin.listener;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class OnMoveEvent implements Listener {
    @EventHandler
    public static void onMove(PlayerMoveEvent event){
        Location location = event.getPlayer().getLocation();
        location.setY(location.getY() -1);
        location.getBlock().setType(Material.PACKED_ICE);



    }
}
