package de.milli.plugin.command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class Item2 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        String input = args[0];
        Arrays.stream(Material.values()).filter(material -> material.name().toLowerCase().startsWith(input.toLowerCase()))
                .forEach(material -> player.getInventory().addItem(new ItemStack(material)));
        return false;
    }
}

