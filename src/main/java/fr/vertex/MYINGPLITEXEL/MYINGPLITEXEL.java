package fr.vertex.MYINGPLITEXEL;

import org.bukkit.plugin.java.JavaPlugin;

public class MYINGPLITEXEL extends JavaPlugin {
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getLogger().info("[MYINGPLITEXEL] Plugin has been enabled!");
    }
    @Override
    public void onDisable() {

        getLogger().info("[MYINGPLITEXEL] Plugin has been disabled!");
    }
}
