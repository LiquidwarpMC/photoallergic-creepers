package net.liquidwarpmc.photoallergiccreepers.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(CreeperEntity.class)
public class CreeperEntityMixin extends HostileEntity {

    protected CreeperEntityMixin(EntityType<? extends HostileEntity> type, World world) {
        super(type, world);
    }

    protected boolean burnsInDaylight() {
        return true;
    }

    public void tickMovement() {
        if (this.isAlive() && this.burnsInDaylight() && this.isInDaylight()) {
            this.setOnFireFor(8);
        }
        super.tickMovement();
    }
}
