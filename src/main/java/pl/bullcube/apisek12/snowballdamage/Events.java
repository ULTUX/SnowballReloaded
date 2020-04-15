package pl.bullcube.apisek12.snowballdamage;

import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.util.Vector;

public class Events implements Listener {
    @EventHandler
    private void ProjectileHitEvent(ProjectileHitEvent e){
        if (e.getEntityType().equals(EntityType.SNOWBALL) && e.getHitEntity() instanceof LivingEntity){
            LivingEntity entity = (LivingEntity) e.getHitEntity();
            entity.damage(0.1);
            entity.setVelocity(e.getEntity().getVelocity().multiply(10).add(new Vector(0, 1, 0).multiply(3)));
            if (entity.getHealth() <= entity.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()-0.1) entity.setHealth(entity.getHealth()+0.1);
        }
    }
}
