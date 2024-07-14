package server.kisko;

import org.bukkit.plugin.java.JavaPlugin;
import server.kisko.command.Vanish;

public class Main extends JavaPlugin {


    @Override
    public void onEnable() {
        getServer().getCommandMap().register("vanish", new Vanish());
    }

    @Override
    public void onDisable() {

    }
}
