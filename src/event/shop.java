package event;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class shop implements Listener {

    @EventHandler
    public void OnInterractWVillager(PlayerInteractEntityEvent event){
        if(event.getRightClicked().getName().equals("§dMarchand")){
            event.setCancelled(true);
            Inventory inv = Bukkit.createInventory(null, 9, ChatColor.LIGHT_PURPLE + "MARCHAND");

            ItemStack blank = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
            ItemStack Valid = new ItemStack(Material.GREEN_BANNER);
            ItemStack sell = new ItemStack(Material.RED_BANNER);

            ItemMeta blankMeta = blank.getItemMeta();
            ItemMeta ValidMeta = Valid.getItemMeta();
            ItemMeta sellMeta = sell.getItemMeta();


            blankMeta.setDisplayName("§D");
            ValidMeta.setDisplayName("§aAcheter");
            sellMeta.setDisplayName("§cVendre");

            blank.setItemMeta(blankMeta);
            Valid.setItemMeta(ValidMeta);
            sell.setItemMeta(sellMeta);

            inv.setItem(0, blank);
            inv.setItem(1,blank);
            inv.setItem(2, blank);
            inv.setItem(3,Valid);
            inv.setItem(4, blank);
            inv.setItem(5, sell);
            inv.setItem(6, blank);
            inv.setItem(7,blank);
            inv.setItem(8, blank);

            event.getPlayer().openInventory(inv);
        }
    }


}

