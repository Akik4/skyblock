package event;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class inv implements Listener {

    @EventHandler
    public void OnInventory(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        String name = player.getOpenInventory().getTitle();
        ItemStack item = event.getCurrentItem();

        if (name.equals("§dMARCHAND")) {
            event.setCancelled(true);
            if (item.getItemMeta().getDisplayName().equals("§aAcheter")) {
                player.closeInventory();
                Inventory shop = Bukkit.createInventory(null, 18, "§dMAGASIN§a");

                ItemStack blank = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
                ItemStack redstone = new ItemStack(Material.REDSTONE);
                ItemStack Block = new ItemStack(Material.OAK_WOOD);
                ItemStack food = new ItemStack(Material.APPLE);
                ItemStack special = new ItemStack(Material.DIAMOND_SWORD);
                ItemStack Autres = new ItemStack(Material.LAVA_BUCKET);
                ItemStack colorant = new ItemStack(Material.YELLOW_DYE);

                ItemMeta blankMeta = blank.getItemMeta();
                ItemMeta redstoneMeta = redstone.getItemMeta();
                ItemMeta BlockMeta = Block.getItemMeta();
                ItemMeta foodMeta = food.getItemMeta();
                ItemMeta specialMeta = special.getItemMeta();
                ItemMeta autreMeta= Autres.getItemMeta();
                ItemMeta colorantMeta = colorant.getItemMeta();

                blankMeta.setDisplayName("§D");
                redstoneMeta.setDisplayName("§cREDSTONE");
                BlockMeta.setDisplayName("§6Blocks");
                foodMeta.setDisplayName("§dVégétation");
                specialMeta.setDisplayName("§cSpécial");
                autreMeta.setDisplayName("§aAutres");
                colorantMeta.setDisplayName("§eColorant");

                blank.setItemMeta(blankMeta);
                redstone.setItemMeta(redstoneMeta);
                Block.setItemMeta(BlockMeta);
                food.setItemMeta(foodMeta);
                special.setItemMeta(specialMeta);
                Autres.setItemMeta(autreMeta);
                colorant.setItemMeta(colorantMeta);

                shop.setItem(0, blank);
                shop.setItem(1, blank);
                shop.setItem(2, redstone);
                shop.setItem(3, blank);
                shop.setItem(4, food);
                shop.setItem(5, blank);
                shop.setItem(6, Block);
                shop.setItem(7, blank);
                shop.setItem(8, blank);
                shop.setItem(9, blank);
                shop.setItem(10, blank);
                shop.setItem(11, blank);
                shop.setItem(12, special);
                shop.setItem(13, colorant);
                shop.setItem(14, Autres);
                shop.setItem(15, blank);
                shop.setItem(16, blank);
                shop.setItem(17, blank);

                player.openInventory(shop);
            } else if (item.getItemMeta().getDisplayName().equals("§cVendre")){
                player.closeInventory();
                Inventory sell = Bukkit.createInventory(null, 27, "§cVente");

                ItemStack i1 = new ItemStack(Material.NETHERITE_INGOT);
                ItemStack i2 = new ItemStack(Material.GOLD_INGOT);
                ItemStack i3 = new ItemStack(Material.IRON_INGOT);
                ItemStack i4 = new ItemStack(Material.COAL);
                ItemStack i5 = new ItemStack(Material.LAPIS_LAZULI);
                ItemStack i6 = new ItemStack(Material.EMERALD);
                ItemStack i7 = new ItemStack(Material.DIAMOND);
                ItemStack i8 = new ItemStack(Material.COBBLESTONE);
                ItemStack i9 = new ItemStack(Material.SUGAR_CANE);
                ItemStack i10 = new ItemStack(Material.POTATO);
                ItemStack i11 = new ItemStack(Material.CACTUS);
                ItemStack i12 = new ItemStack(Material.CARROT);
                ItemStack i13 = new ItemStack(Material.SWEET_BERRIES);
                ItemStack i14 = new ItemStack(Material.BAMBOO);
                ItemStack i15 = new ItemStack(Material.VINE);
                ItemStack i16 = new ItemStack(Material.BROWN_MUSHROOM);
                ItemStack i17 = new ItemStack(Material.RED_MUSHROOM);

                ItemMeta i1Meta = i1.getItemMeta();
                ItemMeta i2Meta = i2.getItemMeta();
                ItemMeta i3Meta = i3.getItemMeta();
                ItemMeta i4Meta = i4.getItemMeta();
                ItemMeta i5Meta = i5.getItemMeta();
                ItemMeta i6Meta = i6.getItemMeta();
                ItemMeta i7Meta = i7.getItemMeta();
                ItemMeta i8Meta = i8.getItemMeta();
                ItemMeta i9Meta = i9.getItemMeta();
                ItemMeta i10Meta = i10.getItemMeta();
                ItemMeta i11Meta = i11.getItemMeta();
                ItemMeta i12Meta = i12.getItemMeta();
                ItemMeta i13Meta = i13.getItemMeta();
                ItemMeta i14Meta = i14.getItemMeta();
                ItemMeta i15Meta = i15.getItemMeta();
                ItemMeta i16Meta = i16.getItemMeta();
                ItemMeta i17Meta = i17.getItemMeta();

                List<String> i1Lore = new ArrayList<>();
                List<String> i2Lore = new ArrayList<>();
                List<String> i3Lore = new ArrayList<>();
                List<String> i4Lore = new ArrayList<>();
                List<String> i5Lore = new ArrayList<>();
                List<String> i6Lore = new ArrayList<>();
                List<String> i7Lore = new ArrayList<>();
                List<String> i8Lore = new ArrayList<>();
                List<String> i9Lore = new ArrayList<>();
                List<String> i10Lore = new ArrayList<>();
                List<String> i11Lore = new ArrayList<>();
                List<String> i12Lore = new ArrayList<>();
                List<String> i13Lore = new ArrayList<>();
                List<String> i14Lore = new ArrayList<>();
                List<String> i15Lore = new ArrayList<>();
                List<String> i16Lore = new ArrayList<>();
                List<String> i17Lore = new ArrayList<>();

                i1Lore.add("§dVendre pour : 200€");
                i2Lore.add("§dVendre pour : 25€");
                i3Lore.add("§dVendre pour : 10€");
                i4Lore.add("§dVendre pour : 5€");
                i5Lore.add("§dVendre pour : 15€");
                i6Lore.add("§dVendre pour : 500€");
                i7Lore.add("§dVendre pour : 100€");
                i8Lore.add("§dVendre pour : 1€");
                i9Lore.add("§dVendre pour : 5€");
                i10Lore.add("§dVendre pour : 2€");
                i11Lore.add("§dVendre pour : 5€");
                i12Lore.add("§dVendre pour : 4€");
                i13Lore.add("§dVendre pour : 3€");
                i14Lore.add("§dVendre pour : 2€");
                i15Lore.add("§dVendre pour : 10€");
                i16Lore.add("§dVendre pour : 15€");
                i17Lore.add("§dVendre pour : 15€");

                i1Meta.setLore(i1Lore);
                i2Meta.setLore(i2Lore);
                i3Meta.setLore(i3Lore);
                i4Meta.setLore(i4Lore);
                i5Meta.setLore(i5Lore);
                i6Meta.setLore(i6Lore);
                i7Meta.setLore(i7Lore);
                i8Meta.setLore(i8Lore);
                i9Meta.setLore(i9Lore);
                i10Meta.setLore(i10Lore);
                i11Meta.setLore(i11Lore);
                i12Meta.setLore(i12Lore);
                i13Meta.setLore(i13Lore);
                i14Meta.setLore(i14Lore);
                i15Meta.setLore(i15Lore);
                i16Meta.setLore(i16Lore);
                i17Meta.setLore(i17Lore);

                i1.setItemMeta(i1Meta);
                i2.setItemMeta(i2Meta);
                i3.setItemMeta(i3Meta);
                i4.setItemMeta(i4Meta);
                i5.setItemMeta(i5Meta);
                i6.setItemMeta(i6Meta);
                i7.setItemMeta(i7Meta);
                i8.setItemMeta(i8Meta);
                i9.setItemMeta(i9Meta);
                i10.setItemMeta(i10Meta);
                i11.setItemMeta(i11Meta);
                i12.setItemMeta(i12Meta);
                i13.setItemMeta(i13Meta);
                i14.setItemMeta(i14Meta);
                i15.setItemMeta(i15Meta);
                i16.setItemMeta(i16Meta);
                i17.setItemMeta(i17Meta);

                sell.setItem(0, i1);
                sell.setItem(1, i2);
                sell.setItem(2, i3);
                sell.setItem(3, i4);
                sell.setItem(4, i5);
                sell.setItem(5, i6);
                sell.setItem(6, i7);
                sell.setItem(7, i8);
                sell.setItem(8, i9);
                sell.setItem(9, i10);
                sell.setItem(10, i11);
                sell.setItem(11, i12);
                sell.setItem(12, i13);
                sell.setItem(13, i14);
                sell.setItem(14, i15);
                sell.setItem(15, i16);
                sell.setItem(16, i17);

                player.openInventory(sell);
            }
        } else if (name.equals("§dMAGASIN§a")) {
            event.setCancelled(true);
            if(item.getItemMeta().getDisplayName().equals("§eColorant")){
                player.closeInventory();
                Inventory block = Bukkit.createInventory(null, 27, "§eColorant");

                ItemStack i1 = new ItemStack(Material.WHITE_DYE);
                ItemStack i2 = new ItemStack(Material.BLACK_DYE);
                ItemStack i3 = new ItemStack(Material.RED_DYE);
                ItemStack i4 = new ItemStack(Material.CYAN_DYE);
                ItemStack i5 = new ItemStack(Material.LIGHT_GRAY_DYE);
                ItemStack i6 = new ItemStack(Material.GRAY_DYE);
                ItemStack i7 = new ItemStack(Material.LIME_DYE);
                ItemStack i8 = new ItemStack(Material.PINK_DYE);
                ItemStack i9 = new ItemStack(Material.BLUE_DYE);
                ItemStack i10 = new ItemStack(Material.GREEN_DYE);
                ItemStack i11 = new ItemStack(Material.LIGHT_BLUE_DYE);
                ItemStack i12 = new ItemStack(Material.MAGENTA_DYE);
                ItemStack i13 = new ItemStack(Material.YELLOW_DYE);
                ItemStack i14 = new ItemStack(Material.ORANGE_DYE);
                ItemStack i15 = new ItemStack(Material.BROWN_DYE);
                ItemStack i16 = new ItemStack(Material.PURPLE_DYE);

                ItemMeta i1Meta = i1.getItemMeta();
                ItemMeta i2Meta = i2.getItemMeta();
                ItemMeta i3Meta = i3.getItemMeta();
                ItemMeta i4Meta = i4.getItemMeta();
                ItemMeta i5Meta = i5.getItemMeta();
                ItemMeta i6Meta = i6.getItemMeta();
                ItemMeta i7Meta = i7.getItemMeta();
                ItemMeta i8Meta = i8.getItemMeta();
                ItemMeta i9Meta = i9.getItemMeta();
                ItemMeta i10Meta = i10.getItemMeta();
                ItemMeta i11Meta = i11.getItemMeta();
                ItemMeta i12Meta = i12.getItemMeta();
                ItemMeta i13Meta = i13.getItemMeta();
                ItemMeta i14Meta = i14.getItemMeta();
                ItemMeta i15Meta = i15.getItemMeta();
                ItemMeta i16Meta = i16.getItemMeta();

                List<String> i1Lore = new ArrayList<>();
                List<String> i2Lore = new ArrayList<>();
                List<String> i3Lore = new ArrayList<>();
                List<String> i4Lore = new ArrayList<>();
                List<String> i5Lore = new ArrayList<>();
                List<String> i6Lore = new ArrayList<>();
                List<String> i7Lore = new ArrayList<>();
                List<String> i8Lore = new ArrayList<>();
                List<String> i9Lore = new ArrayList<>();
                List<String> i10Lore = new ArrayList<>();
                List<String> i11Lore = new ArrayList<>();
                List<String> i12Lore = new ArrayList<>();
                List<String> i13Lore = new ArrayList<>();
                List<String> i14Lore = new ArrayList<>();
                List<String> i15Lore = new ArrayList<>();
                List<String> i16Lore = new ArrayList<>();

                i1Lore.add("§dAcheter pour : 5€");
                i2Lore.add("§dAcheter pour : 5€");
                i3Lore.add("§dAcheter pour : 5€");
                i4Lore.add("§dAcheter pour : 5€");
                i5Lore.add("§dAcheter pour : 5€");
                i6Lore.add("§dAcheter pour : 5€");
                i7Lore.add("§dAcheter pour : 5€");
                i8Lore.add("§dAcheter pour : 5€");
                i9Lore.add("§dAcheter pour : 5€");
                i10Lore.add("§dAcheter pour : 5€");
                i11Lore.add("§dAcheter pour : 5€");
                i12Lore.add("§dAcheter pour : 5€");
                i13Lore.add("§dAcheter pour : 5€");
                i14Lore.add("§dAcheter pour : 5€");
                i15Lore.add("§dAcheter pour : 5€");
                i16Lore.add("§dAcheter pour : 5€");

                i1Meta.setLore(i1Lore);
                i2Meta.setLore(i2Lore);
                i3Meta.setLore(i3Lore);
                i4Meta.setLore(i4Lore);
                i5Meta.setLore(i5Lore);
                i6Meta.setLore(i6Lore);
                i7Meta.setLore(i7Lore);
                i8Meta.setLore(i8Lore);
                i9Meta.setLore(i9Lore);
                i10Meta.setLore(i10Lore);
                i11Meta.setLore(i11Lore);
                i12Meta.setLore(i12Lore);
                i13Meta.setLore(i13Lore);
                i14Meta.setLore(i14Lore);
                i15Meta.setLore(i15Lore);
                i16Meta.setLore(i16Lore);

                i1.setItemMeta(i1Meta);
                i2.setItemMeta(i2Meta);
                i3.setItemMeta(i3Meta);
                i4.setItemMeta(i4Meta);
                i5.setItemMeta(i5Meta);
                i6.setItemMeta(i6Meta);
                i7.setItemMeta(i7Meta);
                i8.setItemMeta(i8Meta);
                i9.setItemMeta(i9Meta);
                i10.setItemMeta(i10Meta);
                i11.setItemMeta(i11Meta);
                i12.setItemMeta(i12Meta);
                i13.setItemMeta(i13Meta);
                i14.setItemMeta(i14Meta);
                i15.setItemMeta(i15Meta);
                i16.setItemMeta(i16Meta);

                block.setItem(0, i1);
                block.setItem(1, i2);
                block.setItem(2, i3);
                block.setItem(3, i4);
                block.setItem(4, i5);
                block.setItem(5, i6);
                block.setItem(6, i7);
                block.setItem(7, i8);
                block.setItem(8, i9);
                block.setItem(9, i10);
                block.setItem(10, i11);
                block.setItem(11, i12);
                block.setItem(12, i13);
                block.setItem(13, i14);
                block.setItem(14, i15);
                block.setItem(15, i16);

                player.openInventory(block);
            }else if(item.getItemMeta().getDisplayName().equals("§cREDSTONE")){
                player.closeInventory();
                Inventory redstone = Bukkit.createInventory(null, 18, "§cREDSTONE");

                ItemStack i1 = new ItemStack(Material.REPEATER);
                ItemStack i2 = new ItemStack(Material.REDSTONE);
                ItemStack i3 = new ItemStack(Material.REDSTONE_TORCH);
                ItemStack i4 = new ItemStack(Material.REDSTONE_BLOCK);
                ItemStack i5 = new ItemStack(Material.PISTON);
                ItemStack i6 = new ItemStack(Material.COMPARATOR);
                ItemStack i7 = new ItemStack(Material.STICKY_PISTON);
                ItemStack i8 = new ItemStack(Material.OBSERVER);
                ItemStack i9 = new ItemStack(Material.HOPPER);
                ItemStack i10 = new ItemStack(Material.SLIME_BLOCK);
                ItemStack i11 = new ItemStack(Material.DROPPER);
                ItemStack i12 = new ItemStack(Material.DISPENSER);

                ItemMeta i1Meta = i1.getItemMeta();
                ItemMeta i2Meta = i2.getItemMeta();
                ItemMeta i3Meta = i3.getItemMeta();
                ItemMeta i4Meta = i4.getItemMeta();
                ItemMeta i5Meta = i5.getItemMeta();
                ItemMeta i6Meta = i6.getItemMeta();
                ItemMeta i7Meta = i7.getItemMeta();
                ItemMeta i8Meta = i8.getItemMeta();
                ItemMeta i9Meta = i9.getItemMeta();
                ItemMeta i10Meta = i10.getItemMeta();
                ItemMeta i11Meta = i11.getItemMeta();
                ItemMeta i12Meta = i12.getItemMeta();

                List<String> i1Lore = new ArrayList<>();
                List<String> i2Lore = new ArrayList<>();
                List<String> i3Lore = new ArrayList<>();
                List<String> i4Lore = new ArrayList<>();
                List<String> i5Lore = new ArrayList<>();
                List<String> i6Lore = new ArrayList<>();
                List<String> i7Lore = new ArrayList<>();
                List<String> i8Lore = new ArrayList<>();
                List<String> i9Lore = new ArrayList<>();
                List<String> i10Lore = new ArrayList<>();
                List<String> i11Lore = new ArrayList<>();
                List<String> i12Lore = new ArrayList<>();


                i1Lore.add("§dAcheter pour : 10€");
                i2Lore.add("§dAcheter pour : 5€");
                i3Lore.add("§dAcheter pour : 5€");
                i4Lore.add("§dAcheter pour : 9€");
                i5Lore.add("§dAcheter pour : 20€");
                i6Lore.add("§dAcheter pour : 10€");
                i7Lore.add("§dAcheter pour : 100€");
                i8Lore.add("§dAcheter pour : 120€");
                i9Lore.add("§dAcheter pour : 150€");
                i10Lore.add("§dAcheter pour : 250€");
                i11Lore.add("§dAcheter pour : 50€");
                i12Lore.add("§dAcheter pour : 50€");

                i1Meta.setLore(i1Lore);
                i2Meta.setLore(i2Lore);
                i3Meta.setLore(i3Lore);
                i4Meta.setLore(i4Lore);
                i5Meta.setLore(i5Lore);
                i6Meta.setLore(i6Lore);
                i7Meta.setLore(i7Lore);
                i8Meta.setLore(i8Lore);
                i9Meta.setLore(i9Lore);
                i10Meta.setLore(i10Lore);
                i11Meta.setLore(i11Lore);
                i12Meta.setLore(i12Lore);

                i1.setItemMeta(i1Meta);
                i2.setItemMeta(i2Meta);
                i3.setItemMeta(i3Meta);
                i4.setItemMeta(i4Meta);
                i5.setItemMeta(i5Meta);
                i6.setItemMeta(i6Meta);
                i7.setItemMeta(i7Meta);
                i8.setItemMeta(i8Meta);
                i9.setItemMeta(i9Meta);
                i10.setItemMeta(i10Meta);
                i11.setItemMeta(i11Meta);
                i12.setItemMeta(i12Meta);


                redstone.setItem(0, i1);
                redstone.setItem(1, i2);
                redstone.setItem(2, i3);
                redstone.setItem(3, i4);
                redstone.setItem(4, i5);
                redstone.setItem(5, i6);
                redstone.setItem(6, i7);
                redstone.setItem(7, i8);
                redstone.setItem(8, i9);
                redstone.setItem(9, i10);
                redstone.setItem(10, i11);
                redstone.setItem(11, i12);


                player.openInventory(redstone);
            } else if(item.getItemMeta().getDisplayName().equals("§6Blocks")){
                player.closeInventory();
                Inventory block = Bukkit.createInventory(null, 27, "§6Blocks");

                ItemStack i1 = new ItemStack(Material.OAK_LOG);
                ItemStack i2 = new ItemStack(Material.DARK_OAK_LOG);
                ItemStack i3 = new ItemStack(Material.BIRCH_LOG);
                ItemStack i4 = new ItemStack(Material.JUNGLE_LOG);
                ItemStack i5 = new ItemStack(Material.ACACIA_LOG);
                ItemStack i6 = new ItemStack(Material.SPRUCE_LOG);
                ItemStack i7 = new ItemStack(Material.COBBLESTONE);
                ItemStack i8 = new ItemStack(Material.SAND);
                ItemStack i9 = new ItemStack(Material.GRAVEL);
                ItemStack i10 = new ItemStack(Material.ANDESITE);
                ItemStack i11 = new ItemStack(Material.DIORITE);
                ItemStack i12 = new ItemStack(Material.GRANITE);
                ItemStack i13 = new ItemStack(Material.SOUL_SAND);
                ItemStack i14 = new ItemStack(Material.ICE);
                ItemStack i15 = new ItemStack(Material.DIRT);
                ItemStack i16 = new ItemStack(Material.NETHERRACK);

                ItemMeta i1Meta = i1.getItemMeta();
                ItemMeta i2Meta = i2.getItemMeta();
                ItemMeta i3Meta = i3.getItemMeta();
                ItemMeta i4Meta = i4.getItemMeta();
                ItemMeta i5Meta = i5.getItemMeta();
                ItemMeta i6Meta = i6.getItemMeta();
                ItemMeta i7Meta = i7.getItemMeta();
                ItemMeta i8Meta = i8.getItemMeta();
                ItemMeta i9Meta = i9.getItemMeta();
                ItemMeta i10Meta = i10.getItemMeta();
                ItemMeta i11Meta = i11.getItemMeta();
                ItemMeta i12Meta = i12.getItemMeta();
                ItemMeta i13Meta = i13.getItemMeta();
                ItemMeta i14Meta = i14.getItemMeta();
                ItemMeta i15Meta = i15.getItemMeta();
                ItemMeta i16Meta = i16.getItemMeta();

                List<String> i1Lore = new ArrayList<>();
                List<String> i2Lore = new ArrayList<>();
                List<String> i3Lore = new ArrayList<>();
                List<String> i4Lore = new ArrayList<>();
                List<String> i5Lore = new ArrayList<>();
                List<String> i6Lore = new ArrayList<>();
                List<String> i7Lore = new ArrayList<>();
                List<String> i8Lore = new ArrayList<>();
                List<String> i9Lore = new ArrayList<>();
                List<String> i10Lore = new ArrayList<>();
                List<String> i11Lore = new ArrayList<>();
                List<String> i12Lore = new ArrayList<>();
                List<String> i13Lore = new ArrayList<>();
                List<String> i14Lore = new ArrayList<>();
                List<String> i15Lore = new ArrayList<>();
                List<String> i16Lore = new ArrayList<>();

                i1Lore.add("§dAcheter pour : 20€");
                i2Lore.add("§dAcheter pour : 20€");
                i3Lore.add("§dAcheter pour : 20€");
                i4Lore.add("§dAcheter pour : 20€");
                i5Lore.add("§dAcheter pour : 20€");
                i6Lore.add("§dAcheter pour : 20€");
                i7Lore.add("§dAcheter pour : 5€");
                i8Lore.add("§dAcheter pour : 30€");
                i9Lore.add("§dAcheter pour : 30€");
                i10Lore.add("§dAcheter pour : 10€");
                i11Lore.add("§dAcheter pour : 10€");
                i12Lore.add("§dAcheter pour : 10€");
                i13Lore.add("§dAcheter pour : 100€");
                i14Lore.add("§dAcheter pour : 200€");
                i15Lore.add("§dAcheter pour : 100€");
                i16Lore.add("§dAcheter pour : 50€");

                i1Meta.setLore(i1Lore);
                i2Meta.setLore(i2Lore);
                i3Meta.setLore(i3Lore);
                i4Meta.setLore(i4Lore);
                i5Meta.setLore(i5Lore);
                i6Meta.setLore(i6Lore);
                i7Meta.setLore(i7Lore);
                i8Meta.setLore(i8Lore);
                i9Meta.setLore(i9Lore);
                i10Meta.setLore(i10Lore);
                i11Meta.setLore(i11Lore);
                i12Meta.setLore(i12Lore);
                i13Meta.setLore(i13Lore);
                i14Meta.setLore(i14Lore);
                i15Meta.setLore(i15Lore);
                i16Meta.setLore(i16Lore);

                i1.setItemMeta(i1Meta);
                i2.setItemMeta(i2Meta);
                i3.setItemMeta(i3Meta);
                i4.setItemMeta(i4Meta);
                i5.setItemMeta(i5Meta);
                i6.setItemMeta(i6Meta);
                i7.setItemMeta(i7Meta);
                i8.setItemMeta(i8Meta);
                i9.setItemMeta(i9Meta);
                i10.setItemMeta(i10Meta);
                i11.setItemMeta(i11Meta);
                i12.setItemMeta(i12Meta);
                i13.setItemMeta(i13Meta);
                i14.setItemMeta(i14Meta);
                i15.setItemMeta(i15Meta);
                i16.setItemMeta(i16Meta);

                block.setItem(0, i1);
                block.setItem(1, i2);
                block.setItem(2, i3);
                block.setItem(3, i4);
                block.setItem(4, i5);
                block.setItem(5, i6);
                block.setItem(6, i7);
                block.setItem(7, i8);
                block.setItem(8, i9);
                block.setItem(9, i10);
                block.setItem(10, i11);
                block.setItem(11, i12);
                block.setItem(12, i13);
                block.setItem(13, i14);
                block.setItem(14, i15);
                block.setItem(15, i16);

                player.openInventory(block);
            }  else if(item.getItemMeta().getDisplayName().equals("§dVégétation")){
                player.closeInventory();
                Inventory food = Bukkit.createInventory(null, 27, "§dVégétation");

                ItemStack i1 = new ItemStack(Material.WHEAT_SEEDS);
                ItemStack i2 = new ItemStack(Material.SWEET_BERRIES);
                ItemStack i3 = new ItemStack(Material.MUTTON);
                ItemStack i4 = new ItemStack(Material.CAKE);
                ItemStack i5 = new ItemStack(Material.BEEF);
                ItemStack i6 = new ItemStack(Material.OAK_SAPLING);
                ItemStack i7 = new ItemStack(Material.MELON_SLICE);
                ItemStack i8 = new ItemStack(Material.PUMPKIN);
                ItemStack i9 = new ItemStack(Material.POTATO);
                ItemStack i10 = new ItemStack(Material.APPLE);
                ItemStack i11 = new ItemStack(Material.VINE);
                ItemStack i12 = new ItemStack(Material.LILY_PAD);
                ItemStack i13 = new ItemStack(Material.BAMBOO);
                ItemStack i14 = new ItemStack(Material.NETHER_WART);
                ItemStack i15 = new ItemStack(Material.CARROT);
                ItemStack i16 = new ItemStack(Material.COCOA_BEANS);
                ItemStack i17 = new ItemStack(Material.SUGAR_CANE);
                ItemStack i18 = new ItemStack(Material.CACTUS);

                ItemMeta i1Meta = i1.getItemMeta();
                ItemMeta i2Meta = i2.getItemMeta();
                ItemMeta i3Meta = i3.getItemMeta();
                ItemMeta i4Meta = i4.getItemMeta();
                ItemMeta i5Meta = i5.getItemMeta();
                ItemMeta i6Meta = i6.getItemMeta();
                ItemMeta i7Meta = i7.getItemMeta();
                ItemMeta i8Meta = i8.getItemMeta();
                ItemMeta i9Meta = i9.getItemMeta();
                ItemMeta i10Meta = i10.getItemMeta();
                ItemMeta i11Meta = i11.getItemMeta();
                ItemMeta i12Meta = i12.getItemMeta();
                ItemMeta i13Meta = i13.getItemMeta();
                ItemMeta i14Meta = i14.getItemMeta();
                ItemMeta i15Meta = i15.getItemMeta();
                ItemMeta i16Meta = i16.getItemMeta();
                ItemMeta i17Meta = i17.getItemMeta();
                ItemMeta i18Meta = i18.getItemMeta();

                List<String> i1Lore = new ArrayList<>();
                List<String> i2Lore = new ArrayList<>();
                List<String> i3Lore = new ArrayList<>();
                List<String> i4Lore = new ArrayList<>();
                List<String> i5Lore = new ArrayList<>();
                List<String> i6Lore = new ArrayList<>();
                List<String> i7Lore = new ArrayList<>();
                List<String> i8Lore = new ArrayList<>();
                List<String> i9Lore = new ArrayList<>();
                List<String> i10Lore = new ArrayList<>();
                List<String> i11Lore = new ArrayList<>();
                List<String> i12Lore = new ArrayList<>();
                List<String> i13Lore = new ArrayList<>();
                List<String> i14Lore = new ArrayList<>();
                List<String> i15Lore = new ArrayList<>();
                List<String> i16Lore = new ArrayList<>();
                List<String> i17Lore = new ArrayList<>();
                List<String> i18Lore= new ArrayList<>();

                i1Lore.add("§dAcheter pour : 5€");
                i2Lore.add("§dAcheter pour : 20€");
                i3Lore.add("§dAcheter pour : 100€");
                i4Lore.add("§dAcheter pour : 300€");
                i5Lore.add("§dAcheter pour : 200€");
                i6Lore.add("§dAcheter pour : 50€");
                i7Lore.add("§dAcheter pour : 30€");
                i8Lore.add("§dAcheter pour : 30€");
                i9Lore.add("§dAcheter pour : 30€");
                i10Lore.add("§dAcheter pour : 100€");
                i11Lore.add("§dAcheter pour : 250€");
                i12Lore.add("§dAcheter pour : 100€");
                i13Lore.add("§dAcheter pour : 250€");
                i14Lore.add("§dAcheter pour : 200€");
                i15Lore.add("§dAcheter pour : 30€");
                i16Lore.add("§dAcheter pour : 10€");
                i17Lore.add("§dAcheter pour : 10€");
                i18Lore.add("§dAcheter pour : 10€");

                i1Meta.setLore(i1Lore);
                i2Meta.setLore(i2Lore);
                i3Meta.setLore(i3Lore);
                i4Meta.setLore(i4Lore);
                i5Meta.setLore(i5Lore);
                i6Meta.setLore(i6Lore);
                i7Meta.setLore(i7Lore);
                i8Meta.setLore(i8Lore);
                i9Meta.setLore(i9Lore);
                i10Meta.setLore(i10Lore);
                i11Meta.setLore(i11Lore);
                i12Meta.setLore(i12Lore);
                i13Meta.setLore(i13Lore);
                i14Meta.setLore(i14Lore);
                i15Meta.setLore(i15Lore);
                i16Meta.setLore(i16Lore);
                i17Meta.setLore(i17Lore);
                i18Meta.setLore(i18Lore);

                i1.setItemMeta(i1Meta);
                i2.setItemMeta(i2Meta);
                i3.setItemMeta(i3Meta);
                i4.setItemMeta(i4Meta);
                i5.setItemMeta(i5Meta);
                i6.setItemMeta(i6Meta);
                i7.setItemMeta(i7Meta);
                i8.setItemMeta(i8Meta);
                i9.setItemMeta(i9Meta);
                i10.setItemMeta(i10Meta);
                i11.setItemMeta(i11Meta);
                i12.setItemMeta(i12Meta);
                i13.setItemMeta(i13Meta);
                i14.setItemMeta(i14Meta);
                i15.setItemMeta(i15Meta);
                i16.setItemMeta(i16Meta);
                i17.setItemMeta(i17Meta);
                i18.setItemMeta(i18Meta);

                food.setItem(0, i1);
                food.setItem(1, i2);
                food.setItem(2, i3);
                food.setItem(3, i4);
                food.setItem(4, i5);
                food.setItem(5, i6);
                food.setItem(6, i7);
                food.setItem(7, i8);
                food.setItem(8, i9);
                food.setItem(9, i10);
                food.setItem(10, i11);
                food.setItem(11, i12);
                food.setItem(12, i13);
                food.setItem(13, i14);
                food.setItem(14, i15);
                food.setItem(15, i16);
                food.setItem(16, i17);
                food.setItem(17, i18);

                player.openInventory(food);
            }else if(item.getItemMeta().getDisplayName().equals("§cSpécial")){
                player.closeInventory();
                Inventory special = Bukkit.createInventory(null, 9, "§cSpécial");

                ItemStack i1 = new ItemStack(Material.CHAINMAIL_CHESTPLATE);

                ItemMeta i1Meta = i1.getItemMeta();

                List<String> i1Lore = new ArrayList<>();

                i1Lore.add("§dAcheter pour : 500000€");

                i1Meta.setLore(i1Lore);

                i1Meta.setDisplayName("§DJETPACK");

                i1.setItemMeta(i1Meta);

                special.setItem(0, i1);

                player.openInventory(special);
            } else if (item.getItemMeta().getDisplayName().equals("§aAutres")){
                player.closeInventory();
                Inventory other = Bukkit.createInventory(null, 36, "§aAutres");

                ItemStack i1 = new ItemStack(Material.FERMENTED_SPIDER_EYE);
                ItemStack i2 = new ItemStack(Material.ROTTEN_FLESH);
                ItemStack i3 = new ItemStack(Material.SLIME_BALL);
                ItemStack i4 = new ItemStack(Material.BONE);
                ItemStack i5 = new ItemStack(Material.BLAZE_POWDER);
                ItemStack i6 = new ItemStack(Material.CHICKEN_SPAWN_EGG);
                ItemStack i7 = new ItemStack(Material.COW_SPAWN_EGG);
                ItemStack i8 = new ItemStack(Material.SHEEP_SPAWN_EGG);
                ItemStack i9 = new ItemStack(Material.ENDER_PEARL);
                ItemStack i10 = new ItemStack(Material.LAVA_BUCKET);
                ItemStack i11 = new ItemStack(Material.STRING);
                ItemStack i12 = new ItemStack(Material.FEATHER);
                ItemStack i13 = new ItemStack(Material.LEATHER);
                ItemStack i14 = new ItemStack(Material.EXPERIENCE_BOTTLE);
                ItemStack i15 = new ItemStack(Material.END_PORTAL_FRAME);
                ItemStack i16 = new ItemStack(Material.NAME_TAG);

                ItemMeta i1Meta = i1.getItemMeta();
                ItemMeta i2Meta = i2.getItemMeta();
                ItemMeta i3Meta = i3.getItemMeta();
                ItemMeta i4Meta = i4.getItemMeta();
                ItemMeta i5Meta = i5.getItemMeta();
                ItemMeta i6Meta = i6.getItemMeta();
                ItemMeta i7Meta = i7.getItemMeta();
                ItemMeta i8Meta = i8.getItemMeta();
                ItemMeta i9Meta = i9.getItemMeta();
                ItemMeta i10Meta = i10.getItemMeta();
                ItemMeta i11Meta = i11.getItemMeta();
                ItemMeta i12Meta = i12.getItemMeta();
                ItemMeta i13Meta = i13.getItemMeta();
                ItemMeta i14Meta = i14.getItemMeta();
                ItemMeta i15Meta = i15.getItemMeta();
                ItemMeta i16Meta = i16.getItemMeta();

                List<String> i1Lore = new ArrayList<>();
                List<String> i2Lore = new ArrayList<>();
                List<String> i3Lore = new ArrayList<>();
                List<String> i4Lore = new ArrayList<>();
                List<String> i5Lore = new ArrayList<>();
                List<String> i6Lore = new ArrayList<>();
                List<String> i7Lore = new ArrayList<>();
                List<String> i8Lore = new ArrayList<>();
                List<String> i9Lore = new ArrayList<>();
                List<String> i10Lore = new ArrayList<>();
                List<String> i11Lore = new ArrayList<>();
                List<String> i12Lore = new ArrayList<>();
                List<String> i13Lore = new ArrayList<>();
                List<String> i14Lore = new ArrayList<>();
                List<String> i15Lore = new ArrayList<>();
                List<String> i16Lore = new ArrayList<>();

                i1Lore.add("§dAcheter pour : 10€");
                i2Lore.add("§dAcheter pour : 10€");
                i3Lore.add("§dAcheter pour : 200€");
                i4Lore.add("§dAcheter pour : 20€");
                i5Lore.add("§dAcheter pour : 1000€");
                i6Lore.add("§dAcheter pour : 1000€");
                i7Lore.add("§dAcheter pour : 1500€");
                i8Lore.add("§dAcheter pour : 2000€");
                i9Lore.add("§dAcheter pour : 5000€");
                i10Lore.add("§dAcheter pour : 2500€");
                i11Lore.add("§dAcheter pour : 10€");
                i12Lore.add("§dAcheter pour : 20€");
                i13Lore.add("§dAcheter pour : 20€");
                i14Lore.add("§dAcheter pour : 750€");
                i15Lore.add("§dAcheter pour : 1000000€");
                i16Lore.add("§dAcheter pour : 500€");

                i1Meta.setLore(i1Lore);
                i2Meta.setLore(i2Lore);
                i3Meta.setLore(i3Lore);
                i4Meta.setLore(i4Lore);
                i5Meta.setLore(i5Lore);
                i6Meta.setLore(i6Lore);
                i7Meta.setLore(i7Lore);
                i8Meta.setLore(i8Lore);
                i9Meta.setLore(i9Lore);
                i10Meta.setLore(i10Lore);
                i11Meta.setLore(i11Lore);
                i12Meta.setLore(i12Lore);
                i13Meta.setLore(i13Lore);
                i14Meta.setLore(i14Lore);
                i15Meta.setLore(i15Lore);
                i16Meta.setLore(i16Lore);

                i1.setItemMeta(i1Meta);
                i2.setItemMeta(i2Meta);
                i3.setItemMeta(i3Meta);
                i4.setItemMeta(i4Meta);
                i5.setItemMeta(i5Meta);
                i6.setItemMeta(i6Meta);
                i7.setItemMeta(i7Meta);
                i8.setItemMeta(i8Meta);
                i9.setItemMeta(i9Meta);
                i10.setItemMeta(i10Meta);
                i11.setItemMeta(i11Meta);
                i12.setItemMeta(i12Meta);
                i13.setItemMeta(i13Meta);
                i14.setItemMeta(i14Meta);
                i15.setItemMeta(i15Meta);
                i16.setItemMeta(i16Meta);

                other.setItem(0, i1);
                other.setItem(1, i2);
                other.setItem(2, i3);
                other.setItem(3, i4);
                other.setItem(4, i5);
                other.setItem(5, i6);
                other.setItem(6, i7);
                other.setItem(7, i8);
                other.setItem(8, i9);
                other.setItem(9, i10);
                other.setItem(10, i11);
                other.setItem(11, i12);
                other.setItem(12, i13);
                other.setItem(13, i14);
                other.setItem(14, i15);
                other.setItem(15, i16);

                player.openInventory(other);
            }
        }
    }
}
