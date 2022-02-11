package de.milli.plugin;

import de.milli.plugin.listener.JoinEvent;
import de.milli.plugin.listener.TNTExplo;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Das plugin funktioniert");
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new TNTExplo(), this);

        pm.registerEvents(new JoinEvent(), this);


    }

    @Override
    public void onDisable() {

    }
}
