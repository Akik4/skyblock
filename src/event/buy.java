package event;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class buy implements Listener {

    @EventHandler
    public void onBuy(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        String name = player.getOpenInventory().getTitle();
        ItemStack item = event.getCurrentItem();
        if(name.equals("§6Blocks")){
            event.setCancelled(true);
            if(item.getType() == Material.OAK_LOG){
                buy(player, 20, item, Material.OAK_LOG);
            }else if(item.getType() == Material.DARK_OAK_LOG){
                buy(player, 20, item, Material.DARK_OAK_LOG);
            }else if(item.getType() == Material.BIRCH_LOG){
                buy(player, 20, item, Material.BIRCH_LOG);
            }else if(item.getType() == Material.JUNGLE_LOG){
                buy(player, 20, item, Material.JUNGLE_LOG);
            }else if(item.getType() == Material.ACACIA_LOG){
                buy(player, 20, item, Material.ACACIA_LOG);
            }else if(item.getType() == Material.SPRUCE_LOG){
                buy(player, 20, item, Material.SPRUCE_LOG);
            }else if(item.getType() == Material.COBBLESTONE){
                buy(player, 5, item, Material.COBBLESTONE);
            }else if(item.getType() == Material.SAND){
                buy(player, 30, item, Material.SAND);
            }else if(item.getType() == Material.GRAVEL){
                buy(player, 30, item, Material.GRAVEL);
            }else if(item.getType() == Material.ANDESITE){
                buy(player, 10, item, Material.ANDESITE);
            }else if(item.getType() == Material.DIORITE){
                buy(player, 10, item, Material.DIORITE);
            }else if(item.getType() == Material.GRANITE){
                buy(player, 10, item, Material.GRANITE);
            }else if(item.getType() == Material.SOUL_SAND){
                buy(player, 100, item, Material.SOUL_SAND);
            }else if(item.getType() == Material.ICE){
                buy(player, 200, item, Material.ICE);
            }else if(item.getType() == Material.DIRT){
                buy(player, 100, item, Material.DIRT);
            }else if(item.getType() == Material.NETHERRACK){
                buy(player, 50, item, Material.NETHERRACK);
            }
        } else if(name.equals("§dVégétation")){
            event.setCancelled(true);
            if(item.getType() == Material.WHEAT_SEEDS){
                buy(player, 5, item, Material.WHEAT_SEEDS);
            }else if(item.getType() == Material.SWEET_BERRIES){
                buy(player, 20, item, Material.SWEET_BERRIES);
            }else if(item.getType() == Material.MUTTON){
                buy(player, 100, item, Material.MUTTON);
            }else if(item.getType() == Material.CAKE){
                buy(player, 300, item, Material.CAKE);
            }else if(item.getType() == Material.BEEF){
                buy(player, 200, item, Material.BEEF);
            }else if(item.getType() == Material.OAK_SAPLING){
                buy(player, 50, item, Material.OAK_SAPLING);
            }else if(item.getType() == Material.MELON_SLICE){
                buy(player, 30, item, Material.MELON_SLICE);
            }else if(item.getType() == Material.PUMPKIN){
                buy(player, 30, item, Material.PUMPKIN);
            }else if(item.getType() == Material.POTATO){
                buy(player, 30, item, Material.POTATO);
            }else if(item.getType() == Material.APPLE){
                buy(player, 100, item, Material.APPLE);
            }else if(item.getType() == Material.VINE){
                buy(player, 250, item, Material.VINE);
            }else if(item.getType() == Material.LILY_PAD){
                buy(player, 100, item, Material.LILY_PAD);
            }else if(item.getType() == Material.BAMBOO){
                buy(player, 250, item, Material.BAMBOO);
            }else if(item.getType() == Material.NETHER_WART){
                buy(player, 200, item, Material.NETHER_WART);
            }else if(item.getType() == Material.CARROT){
                buy(player, 30, item, Material.CARROT);
            }else if(item.getType() == Material.COCOA_BEANS){
                buy(player, 10, item, Material.COCOA_BEANS);
            } else if(item.getType() == Material.SUGAR_CANE){
                buy(player, 10, item, Material.SUGAR_CANE);
            } else if(item.getType() == Material.CACTUS){
                buy(player, 10, item, Material.CACTUS);
            }
        } else if (name.equals("§aAutres")){
            event.setCancelled(true);
            if(item.getType() == Material.FERMENTED_SPIDER_EYE){
                buy(player, 10, item, Material.FERMENTED_SPIDER_EYE);
            }else if(item.getType() == Material.ROTTEN_FLESH){
                buy(player, 10, item, Material.ROTTEN_FLESH);
            }else if(item.getType() == Material.SLIME_BALL){
                buy(player, 200, item, Material.SLIME_BALL);
            }else if(item.getType() == Material.BONE){
                buy(player, 20, item, Material.BONE);
            }else if(item.getType() == Material.BLAZE_POWDER){
                buy(player, 1000, item, Material.BLAZE_POWDER);
            }else if(item.getType() == Material.CHICKEN_SPAWN_EGG){
                buy(player, 1000, item, Material.CHICKEN_SPAWN_EGG);
            }else if(item.getType() == Material.COW_SPAWN_EGG){
                buy(player, 1500, item, Material.COW_SPAWN_EGG);
            }else if(item.getType() == Material.SHEEP_SPAWN_EGG){
                buy(player, 2000, item, Material.SHEEP_SPAWN_EGG);
            }else if(item.getType() == Material.ENDER_PEARL){
                buy(player, 5000, item, Material.ENDER_PEARL);
            }else if(item.getType() == Material.LAVA_BUCKET){
                buy(player, 2500, item, Material.LAVA_BUCKET);
            }else if(item.getType() == Material.STRING){
                buy(player, 10, item, Material.STRING);
            }else if(item.getType() == Material.FEATHER){
                buy(player, 20, item, Material.FEATHER);
            }else if(item.getType() == Material.LEATHER){
                buy(player, 20, item, Material.LEATHER);
            }else if(item.getType() == Material.EXPERIENCE_BOTTLE){
                buy(player, 750, item, Material.EXPERIENCE_BOTTLE);
            }else if(item.getType() == Material.END_PORTAL_FRAME){
                buy(player, 1000000, item, Material.END_PORTAL_FRAME);
            }else if(item.getType() == Material.NAME_TAG){
                buy(player, 500, item, Material.NAME_TAG);
            }
        } else if (name.equals("§cSpécial")){
            event.setCancelled(true);
            if(item.getType() == Material.CHAINMAIL_CHESTPLATE){
                buy(player, 500000, item, Material.CHAINMAIL_CHESTPLATE);
            }
        } else if (name.equals("§cREDSTONE")) {
            event.setCancelled(true);
            if(item.getType() == Material.REPEATER){
                buy(player, 10, item, Material.REPEATER);
            }else if(item.getType() == Material.REDSTONE){
                buy(player, 5, item, Material.REDSTONE);
            } else if(item.getType() == Material.REDSTONE_TORCH){
                buy(player, 5, item, Material.REDSTONE_TORCH);
            }else if(item.getType() == Material.REDSTONE_BLOCK){
                buy(player, 9, item, Material.REDSTONE_BLOCK);
            } else if(item.getType() == Material.PISTON){
                buy(player, 20, item, Material.PISTON);
            }else if(item.getType() == Material.COMPARATOR){
                buy(player, 10, item, Material.COMPARATOR);
            } else if(item.getType() == Material.STICKY_PISTON){
                buy(player, 100, item, Material.STICKY_PISTON);
            }else if(item.getType() == Material.OBSERVER){
                buy(player, 120, item, Material.OBSERVER);
            } else if(item.getType() == Material.HOPPER){
                buy(player, 150, item, Material.HOPPER);
            }else if(item.getType() == Material.SLIME_BLOCK){
                buy(player, 250, item, Material.SLIME_BLOCK);
            } else if(item.getType() == Material.DROPPER){
                buy(player, 50, item, Material.DROPPER);
            } else if(item.getType() == Material.DISPENSER){
                buy(player, 50, item, Material.DISPENSER);
            }
        } else if (name.equals("§eColorant")){
            event.setCancelled(true);
            if(item.getType() == Material.WHITE_DYE){
                buy(player, 5, item, Material.WHITE_DYE);
            }else if(item.getType() == Material.BLACK_DYE){
                buy(player, 5, item, Material.BLACK_DYE);
            }else if(item.getType() == Material.RED_DYE){
                buy(player, 5, item, Material.RED_DYE);
            }else if(item.getType() == Material.CYAN_DYE){
                buy(player, 5, item, Material.CYAN_DYE);
            }else if(item.getType() == Material.LIGHT_GRAY_DYE){
                buy(player, 5, item, Material.LIGHT_GRAY_DYE);
            }else if(item.getType() == Material.GRAY_DYE){
                buy(player, 5, item, Material.GRAY_DYE);
            }else if(item.getType() == Material.LIME_DYE){
                buy(player, 5, item, Material.LIME_DYE);
            }else if(item.getType() == Material.PINK_DYE){
                buy(player, 5, item, Material.PINK_DYE);
            }else if(item.getType() == Material.BLUE_DYE){
                buy(player, 5, item, Material.BLUE_DYE);
            }else if(item.getType() == Material.GREEN_DYE){
                buy(player, 5, item, Material.GREEN_DYE);
            }else if(item.getType() == Material.LIGHT_BLUE_DYE){
                buy(player, 5, item, Material.LIGHT_BLUE_DYE);
            }else if(item.getType() == Material.MAGENTA_DYE){
                buy(player, 5, item, Material.MAGENTA_DYE);
            }else if(item.getType() == Material.YELLOW_DYE){
                buy(player, 5, item, Material.YELLOW_DYE);
            }else if(item.getType() == Material.ORANGE_DYE){
                buy(player, 5, item, Material.ORANGE_DYE);
            }else if(item.getType() == Material.BROWN_DYE){
                buy(player, 5, item, Material.BROWN_DYE);
            }else if(item.getType() == Material.PURPLE_DYE){
                buy(player, 5, item, Material.PURPLE_DYE);
            }
        }
    }


    public void buy(Player player, int valeur, ItemStack item,Material material){
        List<String> i1Lore = new ArrayList<>();
        i1Lore.add("§dAcheter pour : " + String.valueOf(valeur) + "€");
        if(item.getItemMeta().getLore().equals(i1Lore)){
            try {
                Object objc = new JSONParser().parse(new FileReader("./plugins/output.json"));

                JSONObject job = (JSONObject) objc;

                String fName = String.valueOf(job.get(player.getName()));

                int s2 = Integer.parseInt(fName);
                fName.replace(fName, String.valueOf(s2));
                if(Integer.parseInt(fName) >= valeur){
                    if(material == Material.CHAINMAIL_CHESTPLATE){
                        ItemStack jet = new ItemStack(Material.CHAINMAIL_CHESTPLATE); //chainmail_chestplate

                        ItemMeta itemMeta = jet.getItemMeta();

                        itemMeta.setDisplayName("§dJetPack");

                        jet.setItemMeta(itemMeta);
                        player.getInventory().addItem(jet);
                    } else {
                        player.getInventory().addItem(new ItemStack(material));
                    }
                    test(player.getDisplayName(), valeur, player.getPlayer());
                } else {
                    player.sendMessage("§cVous n'avez pas assez d'argent");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }

    public void test(String p, int valeur, Player player){
        try {
            Object objc = new JSONParser().parse(new FileReader("./plugins/output.json"));

            JSONObject job = (JSONObject) objc;

            String fName = String.valueOf(job.get(p));

            if(fName == null){
                Bukkit.broadcastMessage(fName);
                job.put(p, valeur);
                join.SetupScoreboard(player);
            } else {
                int s2 = Integer.parseInt(fName) - valeur;
                fName.replace(fName, String.valueOf(s2));

                job.replace(p, String.valueOf(s2));
                join.SetupScoreboard(player);
            }

            try {
                FileWriter file = new FileWriter("./plugins/output.json");
                file.write(job.toJSONString());
                file.close();

            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
