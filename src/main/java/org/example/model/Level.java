package org.example.model;

public final class Level {
    final private int level;

    public Level(int level) {
        if (level < 1) {
            throw new IllegalArgumentException("Level level must be >= 1");
        }
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Level{" + level + '}';
    }
}