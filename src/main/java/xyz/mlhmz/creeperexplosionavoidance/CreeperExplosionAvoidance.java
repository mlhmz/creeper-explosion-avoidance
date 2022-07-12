package xyz.mlhmz.creeperexplosionavoidance;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.mlhmz.creeperexplosionavoidance.events.ExplosionEventListener;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is a simple plugin to avoid block destruction from creeper explosions.
 *
 * @author mlhmz
 * @since 12.07.2022
 */
public final class CreeperExplosionAvoidance extends JavaPlugin {
    // Logger to avoid duplicate Code
    private final Logger logger = getLogger();

    @Override
    public void onEnable() {
        logger.log(Level.INFO, "Registering Events");
        registerEvents();
        logger.log(Level.INFO, "Plugin loaded");
    }

    /**
     * Registers event in the plugin
     */
    private void registerEvents() {
        registerEvent(new ExplosionEventListener());
    }

    /**
     * method to register an event listener
     *
     * @param listener the event listener to register
     */
    private void registerEvent(Listener listener) {
        getServer().getPluginManager().registerEvents(listener, this);
    }


}
