package xyz.mlhmz.creeperexplosionavoidance;

import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class CreeperExplosionAvoidance extends JavaPlugin {
    private final Logger logger = getLogger();

    @Override
    public void onEnable() {
        logger.log(Level.INFO, "Registering Events");
        registerEvents();
        logger.log(Level.INFO, "Plugin loaded");
    }

    private void registerEvents() {

    }

    private void registerEvent(Listener listener) {
        getServer().getPluginManager().registerEvents(listener, this);
    }


}
