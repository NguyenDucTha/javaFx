package sample;

import java.util.Collection;
import java.io.*;
import sample.Config;

public abstract class Enemy implements GameEntity {
    private long health;
    private long armor;
    private double speed;
    private long reward;

    protected Enemy(long createdTick, double posX, double posY, double size, long health, long armor, double speed, long reward) {
        super(createdTick, posX, posY, size, size);
        this.health = health;
        this.armor = armor;
        this.speed = speed;
        this.reward = reward;
    }

}
public final class NormalEnemy extends Enemy{
    public NormalEnemy(long createdTick, double posX, double posY, double size, long health, long armor, double speed, long reward) {
        super(createdTick, posX, posY, size, health, armor, speed, reward);
    }
}
public final class TankerEnemy extends Enemy{
    public TankerEnemy(long createdTick, double posX, double posY, double size, long health, long armor, double speed, long reward) {
        super(createdTick, posX, posY, size, health, armor, speed, reward);
    }
}
public final class SmallerEnemy extends Enemy{
    public SmallerEnemy(long createdTick, double posX, double posY, double size, long health, long armor, double speed, long reward) {
        super(createdTick, posX, posY, size, health, armor, speed, reward);
    }
}
public final class BossEnemy extends Enemy{
    public BossEnemy(long createdTick, double posX, double posY, double size, long health, long armor, double speed, long reward) {
        super(createdTick, posX, posY, size, health, armor, speed, reward);
    }
}

