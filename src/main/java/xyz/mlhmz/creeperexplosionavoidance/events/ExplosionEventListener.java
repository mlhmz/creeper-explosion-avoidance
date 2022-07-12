package xyz.mlhmz.creeperexplosionavoidance.events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

/**
 * EventListener for Handlers that are related to Explosion Events
 */
public class ExplosionEventListener implements Listener {
    /**
     * checks if the entity that exploded was a creeper and if so
     * clears the blocklist that will be impacted by a creeper explosion.
     *
     * @param event The actual entity explosion event
     */
    @EventHandler
    public void onExplosion(EntityExplodeEvent event) {
        if (event.getEntity().getType() == EntityType.CREEPER) {
            event.blockList().clear();
        }
    }
}
