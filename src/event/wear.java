package event;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class wear implements Listener {

    @EventHandler
    public void onWear(PlayerMoveEvent player){
        join.SetupScoreboard(player.getPlayer());
        if(player.getPlayer().getGameMode() == GameMode.SURVIVAL) {
            if (player.getPlayer().getInventory().getChestplate() == null) {
                player.getPlayer().setAllowFlight(false);
                player.getPlayer().setFlying(false);
                return;
            }
            if (player.getPlayer().getInventory().getChestplate().getType() == Material.CHAINMAIL_CHESTPLATE) {
                if (player.getPlayer().isFlying()) {
                    return;
                }
                player.getPlayer().setAllowFlight(true);
            } else {
                player.getPlayer().setAllowFlight(false);
                player.getPlayer().setFlying(false);
            }
        }
    }
}
