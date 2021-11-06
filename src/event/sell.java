package event;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class sell implements Listener {

    @EventHandler
    public void onSell(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        String name = player.getOpenInventory().getTitle();
        ItemStack item = event.getCurrentItem();
        if(name.equals("§cVente")){
            event.setCancelled(true);
            if(item.getType() == Material.NETHERITE_INGOT){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 200€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.NETHERITE_INGOT){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§8200€ on été versé sur votre compte");
                                test(player.getDisplayName(), 200, player);
                                return;
                            }
                        }
                    }
                }
            } else if(item.getType() == Material.GOLD_INGOT){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 25€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.GOLD_INGOT){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§825€ on été versé sur votre compte");
                                test(player.getDisplayName(), 25, player);
                                return;
                            }
                        }
                    }
                }
            } else if(item.getType() == Material.IRON_INGOT){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 10€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.IRON_INGOT){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§810€ on été versé sur votre compte");
                                test(player.getDisplayName(), 10, player);
                                return;
                            }
                        }
                    }
                }
            } else if(item.getType() == Material.COAL){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 5€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.COAL){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§85€ on été versé sur votre compte");
                                test(player.getDisplayName(), 5, player);
                                return;
                            }
                        }
                    }
                }
            }else if(item.getType() == Material.LAPIS_LAZULI){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 15€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.LAPIS_LAZULI){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§815€ on été versé sur votre compte");
                                test(player.getDisplayName(), 15, player);
                                return;
                            }
                        }
                    }
                }
            }else if(item.getType() == Material.EMERALD){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 500€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.EMERALD){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§8500€ on été versé sur votre compte");
                                test(player.getDisplayName(), 500, player);
                                return;
                            }
                        }
                    }
                }
            }else if(item.getType() == Material.DIAMOND){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 100€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.DIAMOND){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§8100€ on été versé sur votre compte");
                                test(player.getDisplayName(), 100, player);
                                return;
                            }
                        }
                    }
                }
            }else if(item.getType() == Material.COBBLESTONE){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 1€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.COBBLESTONE){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§81€ on été versé sur votre compte");
                                test(player.getDisplayName(), 1, player);
                                return;
                            }
                        }
                    }
                }
            }else if(item.getType() == Material.SUGAR_CANE){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 5€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.SUGAR_CANE){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§85€ on été versé sur votre compte");
                                test(player.getDisplayName(), 5, player);
                                return;
                            }
                        }
                    }
                }
            }else if(item.getType() == Material.POTATO){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 2€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.POTATO){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§82€ on été versé sur votre compte");
                                test(player.getDisplayName(), 2, player);
                                return;
                            }
                        }
                    }
                }
            }else if(item.getType() == Material.CACTUS){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 5€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.CACTUS){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§85€ on été versé sur votre compte");
                                test(player.getDisplayName(), 5, player);
                                return;
                            }
                        }
                    }
                }
            }else if(item.getType() == Material.CARROT){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 4€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.CARROT){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§84€ on été versé sur votre compte");
                                test(player.getDisplayName(), 4, player);
                                return;
                            }
                        }
                    }
                }
            }else if(item.getType() == Material.SWEET_BERRIES){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 3€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.SWEET_BERRIES){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§83€ on été versé sur votre compte");
                                test(player.getDisplayName(), 3, player);
                                return;
                            }
                        }
                    }
                }
            }else if(item.getType() == Material.BAMBOO){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 2€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.BAMBOO){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§82€ on été versé sur votre compte");
                                test(player.getDisplayName(), 2, player);
                                return;
                            }
                        }
                    }
                }
            }else if(item.getType() == Material.VINE){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 10€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.VINE){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§810€ on été versé sur votre compte");
                                test(player.getDisplayName(), 10, player);
                                return;
                            }
                        }
                    }
                }
            }else if(item.getType() == Material.BROWN_MUSHROOM){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 15€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.BROWN_MUSHROOM){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§815€ on été versé sur votre compte");
                                test(player.getDisplayName(), 15, player);
                                return;
                            }
                        }
                    }
                }
            }else if(item.getType() == Material.RED_MUSHROOM){
                List<String> i1Lore = new ArrayList<>();
                i1Lore.add("§dVendre pour : 15€");
                if(item.getItemMeta().getLore().equals(i1Lore)){
                    for (ItemStack is : player.getInventory()){
                        if(is != null){
                            if(is.getType() == Material.RED_MUSHROOM){
                                is.setAmount(is.getAmount() - 1);
                                player.sendMessage("§815€ on été versé sur votre compte");
                                test(player.getDisplayName(), 15, player);
                                return;
                            }
                        }
                    }
                }
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
                int s2 = Integer.parseInt(fName) + valeur;
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




