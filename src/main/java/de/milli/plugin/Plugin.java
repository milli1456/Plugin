package de.milli.plugin;

import de.milli.plugin.command.KillAll;
import de.milli.plugin.listener.JoinEvent;
import de.milli.plugin.listener.OnMoveEvent;
import de.milli.plugin.listener.TNTExplo;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    private static Plugin plugin;

    @Override
    public void onEnable() {
        System.out.println("BiVieh videos yeah");

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

    public static Plugin getPlugin() {
        return plugin;
    }
}
