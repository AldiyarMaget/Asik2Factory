package org.example.factory;


import org.example.model.Asteroid;
import org.example.model.AsteroidKind;
import org.example.model.Level;

public final class LevelAsteroidFactory implements AsteroidFactory {
    private static final int BASE_SPEED = 10;
    private static final double BASE_RADIUS = Math.PI;


    private final Level level;
    private final AsteroidKind kind;


    public LevelAsteroidFactory(Level level, AsteroidKind kind) {
        if (level == null) throw new IllegalArgumentException("level == null");
        if (kind == null) throw new IllegalArgumentException("kind == null");
        this.level = level;
        this.kind = kind;
    }


    @Override
    public Asteroid createAsteroid() {
        int speed = computeSpeed();
        double radius = computeRadius();
        return new Asteroid(kind.getDisplayName(), speed, radius);
    }


    private int computeSpeed() {
        double raw = BASE_SPEED * level.getLevel() * kind.getSpeedMultiplier();
        return (int) Math.round(raw);
    }


    private double computeRadius() {
        return BASE_RADIUS * level.getLevel() * kind.getRadiusMultiplier();
    }
}