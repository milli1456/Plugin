package de.milli.plugin.listener;

import de.milli.plugin.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemMergeEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class OnMoveEvent implements Listener {
    @EventHandler
    public static void onMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Location location = player.getLocation();
        ItemStack itemStack = new ItemStack(Material.GOLD_INGOT);
        Item item = location.getWorld().dropItem(location, itemStack);
        item.setVelocity(item.getVelocity().multiply(0));
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            number.append(String.valueOf(new Random().nextInt(11 + 1) + 1));
        }
        Plugin.getPlugin().getLogger().info(number.toString());
        Bukkit.getScheduler().runTaskLater(Plugin.getPlugin(), new Runnable() {
            @Override
            public void run() {
                item.remove();
            }
        }, 15);
    }
}
