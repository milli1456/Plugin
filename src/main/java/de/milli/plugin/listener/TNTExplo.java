package de.milli.plugin.listener;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class TNTExplo implements Listener {

    /*@EventHandler
    public static void onTNT(EntityExplodeEvent e){
        Location loc = e.getLocation();
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage("TNT ist explodiert");
        }
        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage("TNT ist explodiert");
        }
        LivingEntity entity;
        for (Block block: e.blockList()) {
           TNTPrimed tnt = (TNTPrimed) block.getLocation().getWorld().spawnEntity(block.getLocation(), EntityType.PRIMED_TNT);
           tnt.setFuseTicks(0);
        }

    }*/
}
