package server.kisko.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import server.kisko.util.VanishAPI;

public class Vanish extends Command {
    public Vanish() {
        super("vanish");
    }

        private VanishAPI api= new VanishAPI();
    @Override
    public boolean execute(CommandSender commandSender, String s, String[] strings) {
        if(commandSender instanceof Player){
            Player player  = (Player) commandSender;

            if(player.hasPermission(api.getPermission())){
                api.start(player);
                return true;
            }else{
                player.sendMessage("Sinulla ei ole oikeuksia tähän komentoo");
                return false;
            }

        }else{
            commandSender.sendMessage("§cOnly in-game!");
            return false;
        }
    }
}
