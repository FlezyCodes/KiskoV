package server.kisko.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import server.kisko.util.VanishAPI;

public class Vanish extends Command {

    private final VanishAPI api = new VanishAPI();

    public Vanish() {
        super("vanish");
    }

    String prefix = "§b§lKisko§f§lMC§7: ";
    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {

        if (commandSender instanceof Player player) {

            if (strings.length == 0) {
                player.sendMessage(prefix + " §cKäyttö ohje /vanish [off/on]");
                return false;
            }
            if(player.hasPermission(api.getPermission())){
                if (strings[0].equalsIgnoreCase("on")) {
                    api.start(player);
                    player.sendMessage(prefix + "§aLiityit vanishtilalle.");
                    return true;
                }
                if(strings[0].equalsIgnoreCase("off")){
                    api.leave(player);
                    return true;
                }
            }



        }else{
            commandSender.sendMessage("§cOnly in-game!");
        }
        return false;
    }
}
