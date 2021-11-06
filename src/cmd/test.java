package cmd;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class test implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE); //chainmail_chestplate

        ItemMeta itemMeta = item.getItemMeta();

        itemMeta.setDisplayName("§dJetPack");

        item.setItemMeta(itemMeta);

        Bukkit.getPlayer(commandSender.getName()).getInventory().addItem(item);
        return false;
    }
}
