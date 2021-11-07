package event;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFromToEvent;

import java.util.Random;

public class spawn implements Listener {

    @EventHandler
    public void onSpawnBlock(BlockFromToEvent block) {
        if(block.getBlock().getType() == Material.LAVA & block.getToBlock().getType() == Material.AIR){
            Location Tloc = block.getToBlock().getLocation();
            Material eau = Material.WATER;
            int Tlocx = (int) block.getToBlock().getLocation().getX();
            int TlocZ = (int) block.getToBlock().getLocation().getZ();

            int x = Tlocx - 1;
            int z = TlocZ - 1;

            Block cible = Bukkit.getWorld("world").getBlockAt(Tloc);
            do{
                if(Material.WATER == cible.getType()){
                    block.setCancelled(false);
                    block.setCancelled(true);
                    Random r = new Random();
                    int low = 0;
                    int high = 100;
                    int result = r.nextInt(high-low) + low;
                    if(result < 1){
                        block.getToBlock().setType(Material.EMERALD_ORE);
                    } else if (result > 1 && result < 4){
                        block.getToBlock().setType(Material.DIAMOND_ORE);
                    } else if (result > 4 && result < 9) {
                        block.getToBlock().setType(Material.REDSTONE_ORE);
                    }else if (result > 9 && result < 14){
                        block.getToBlock().setType(Material.LAPIS_ORE);
                    } else if (result > 14 && result < 16){
                        block.getToBlock().setType(Material.GOLD_ORE);
                    } else if (result > 16 && result < 20){
                        block.getToBlock().setType(Material.IRON_ORE);
                    } else if (result > 20 && result <30) {
                        block.getToBlock().setType(Material.COAL_ORE);
                    } else if (result > 30 && result < 101){
                        block.getToBlock().setType(Material.COBBLESTONE);
                    }
                    return;
                }
                if(x < Tlocx + 1){
                    x++;
                } else {
                    z++;
                    x = Tlocx-1;
                    Tloc.setZ(z);
                }
                Tloc.setX(x);
                cible = Bukkit.getWorld("world").getBlockAt(Tloc);
            } while (z < TlocZ + 2);
        }
    }
}
