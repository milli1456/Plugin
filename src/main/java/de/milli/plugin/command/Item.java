package de.milli.plugin.command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Locale;

public class Item implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        String input = args[0];
        for (Material m: Material.values()) {
            player.sendMessage("funktioniert");
            if(m.name().toLowerCase(Locale.ROOT).startsWith(input.toLowerCase())){
                player.getInventory().addItem(new ItemStack(m));
            }
        }
        return false;
    }
}
