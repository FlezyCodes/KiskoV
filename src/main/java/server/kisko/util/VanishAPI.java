package server.kisko.util;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

@Getter
public class VanishAPI {


    String permission = "kisko.vanish";

    public void start(Player player) {
        for (Player player1 : Bukkit.getOnlinePlayers()) {
            if (player1.hasPermission(permission)) {
                player1.showPlayer(player);
                if (player.hasPermission(permission))
                    player.sendMessage("§7Pelaaja " + player.getName() + " meni vanish tilalle.");
            } else {
                player1.hidePlayer(player);
            }
        }
    }
}
