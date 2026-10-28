package be.renaud11232.bluemapmobmarkers.fabric.entity;

import be.renaud11232.bluemapmobmarkers.entity.Enderman;

public class FabricEnderman extends FabricMob<net.minecraft.world.entity.monster.Enderman> implements Enderman {
    public FabricEnderman(net.minecraft.world.entity.monster.Enderman wrapped) {
        super(wrapped);
    }
}
