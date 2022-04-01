package de.milli.plugin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        player.setPlayerListName("§c" + player.getName());
        player.sendMessage("test");
                /*if(sender instanceof Player ){
            Player player = (Player) sender;
            if (player.hasPermission("Heal Permission")) {
                if (args.length == 0) {
                    player.setHealth((int) player.getHealthScale());
                    player.setFoodLevel((int) player.getHealthScale());
                    player.sendMessage("§aDu bist nun geheilt");
                } else player.sendMessage("§6Bitte nutze /heal");
            } else player.sendMessage("§cNo Permission!");
        }else
            sender.sendMessage("Command is invalid");
         */
        return false;
    }
}
