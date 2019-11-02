package sample;


public abstract class Tower {
    private final double range;
    private final long speed;

    private long tickDown;

    protected Tower(long createdTick, long posX, long posY, double range, long speed) {
        super(createdTick, posX, posY, 1L, 1L);
        this.range = range;
        this.speed = speed;
        this.tickDown = 0;
    }
}
public final class NormalTower extends Tower {
    public NormalTower(long createdTick, long posX, long posY, double range, long speed) {
        super(createdTick, posX, posY, range, speed);
    }
}
public final class SniperTower extends Tower {
    public SniperTower(long createdTick, long posX, long posY, double range, long speed) {
        super(createdTick, posX, posY, range, speed);
    }
}
public final class MachineGunTower extends Tower {
    public MachineGunTower(long createdTick, long posX, long posY, double range, long speed) {
        super(createdTick, posX, posY, range, speed);
    }
}

