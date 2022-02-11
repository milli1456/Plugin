package de.milli.plugin.command;

import de.milli.plugin.Plugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class KillAll implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        for (Entity entity: Plugin.getPlugin().getServer().getWorld("world").getEntities()) {
            entity.remove();
        }
        return false;
    }
}
