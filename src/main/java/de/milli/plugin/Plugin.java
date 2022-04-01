package de.milli.plugin;

import de.milli.plugin.command.*;
import de.milli.plugin.listener.JoinEvent;
import de.milli.plugin.listener.OnMoveEvent;
import de.milli.plugin.listener.TNTExplo;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    private static Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        System.out.println("BiVieh videos yeah");
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("weapon").setExecutor(new Weapon());
        getCommand("itemsearch").setExecutor(new Item());
        getCommand("itemsearch2").setExecutor(new Item2());
        plugin = this;

        getLogger().info("Das plugin funktioniert");
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new TNTExplo(), this);

        pm.registerEvents(new JoinEvent(), this);
        pm.registerEvents(new OnMoveEvent(), this);
        getCommand("killall").setExecutor(new KillAll());
    }

    @Override
    public void onDisable() {

    }

    public static void broadcast(String message){
        for (Player player: Bukkit.getOnlinePlayers()) {
            player.sendMessage(message);
        }
    }

    public static Plugin getPlugin() {
        return plugin;
    }
}
