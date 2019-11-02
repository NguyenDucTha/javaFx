package sample;

public abstract class GameTile extends GameEntity {
    protected GameTile(long createdTick, long posX, long posY, long width, long height) {
        super(createdTick, posX, posY, width, height);
    }
}
public final class Mountain extends GameTile {
    public Mountain(long createdTick, long posX, long posY) {
        super(createdTick, posX, posY, 1L, 1L);
    }
}
public final class Road extends GameTile {
    private double distance ;

    public Road(long createdTick, long posX, long posY) {
        super(createdTick, posX, posY, 1L, 1L);
    }

    public final double getDistance() {
        return distance;
    }

    public final void setDistance(double distance) {
        this.distance = distance;
    }
}
public final class Target extends  GameTile {
    private long health;

    public Target(long createdTick, long posX, long posY, long width, long height, long health) {
        super(createdTick, posX, posY, width, height);
        this.health = health;
    }

    @Override
    public long getHealth() {
        return health;
    }

    @Override
    public void doEffect(long value) {
        if (health != Long.MIN_VALUE) this.health += value;
    }

    @Override
    public void doDestroy() {
        this.health = Long.MIN_VALUE;
    }

    @Override
    public boolean isDestroyed() {
        return health <= 0L;
    }
}

