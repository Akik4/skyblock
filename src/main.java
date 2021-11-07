import cmd.*;
import event.*;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onEnable(){
        System.out.println("Plugin lancé");
        getCommand("read").setExecutor(new read());

        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new spawn(), this);
        pm.registerEvents(new shop(), this);
        pm.registerEvents(new inv(), this);
        pm.registerEvents(new join(), this);
        pm.registerEvents(new wear(), this);
        pm.registerEvents(new sell(), this);
        pm.registerEvents(new buy(), this);
    }

    @Override
    public void onDisable(){

    }

}

