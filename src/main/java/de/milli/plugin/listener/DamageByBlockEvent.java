package de.milli.plugin.listener;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageByBlockEvent implements Listener {

    @EventHandler
    public static void DamageByBlock(EntityDamageEvent event){
        System.out.println("1");
        EntityDamageEvent.DamageCause damageCause = event.getCause();
        if(damageCause == EntityDamageEvent.DamageCause.LAVA
                || damageCause == EntityDamageEvent.DamageCause.FIRE
                ||damageCause == EntityDamageEvent.DamageCause.FIRE_TICK){
            System.out.println("2");
            event.setCancelled(true);
            LivingEntity entity = (LivingEntity) event.getEntity();
            entity.setHealth(entity.getHealth() + 2.5);
        }
    }
}
