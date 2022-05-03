package de.milli.plugin.listener;

import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftCreature;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.spigotmc.event.entity.EntityDismountEvent;


import java.util.HashMap;

public class OnMoveEvent implements Listener {

    private static HashMap<Player, Entity> hashMap = new HashMap();

    @EventHandler
    public static void onMov(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if(hashMap.containsKey(player)){
            Double speed = 1.4;
            CraftPlayer player1 = (CraftPlayer) player;
            Location location = player.getTargetBlock(null, 200).getLocation();
            Entity entity = hashMap.get(player);
            CraftCreature craftEntity = (CraftCreature) entity;
            craftEntity.getHandle().getNavigation().a(location.getX(), location.getY() ,location.getZ(), speed);
        }
    }

    @EventHandler
    public static void onHit(EntityDamageByEntityEvent event) {
        if(!(event.getEntity() instanceof Player) || event.getDamager() instanceof Player){
            Player player = (Player) event.getDamager();
            Entity target = event.getEntity();
            target.setPassenger(player);
            hashMap.put(player, target);
        }
    }
    @EventHandler
    public static void onPassagerLeave(EntityDismountEvent event) {
        hashMap.remove(event.getEntity());
    }
}
