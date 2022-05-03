package de.milli.plugin.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityDamage implements Listener {

    @EventHandler
    public static void onHit(EntityDamageByEntityEvent event){
        event.setDamage(3.3);
    }
}
