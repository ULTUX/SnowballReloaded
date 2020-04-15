package pl.bullcube.apisek12.snowballdamage;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("[SnowballDamage] plugin disabled.");
    }

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("[SnowballDamage] plugin enabled.");
        getServer().getPluginManager().registerEvents(new Events(), this);
    }
}
