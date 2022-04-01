package de.milli.plugin.command;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public class  Weapon implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player player = (Player) sender;
        Inventory inventory = player.getInventory();
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", Integer.MAX_VALUE, AttributeModifier.Operation.ADD_NUMBER);
        ItemStack itemStack = new ItemStack(Material.IRON_DOOR);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, modifier);
        itemStack.setItemMeta(itemMeta);
        inventory.addItem(itemStack);
        return false;
    }
}
