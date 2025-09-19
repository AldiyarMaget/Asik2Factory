package org.example.family;

import org.example.factory.LevelAsteroidFactory;
import org.example.model.Asteroid;
import org.example.model.AsteroidKind;
import org.example.model.Level;

public final class LevelAsteroidFamilyFactory implements AsteroidFamilyFactory {
    private final Level level;


    public LevelAsteroidFamilyFactory(Level level) {
        if (level == null) throw new IllegalArgumentException("level == null");
        this.level = level;
    }


    @Override
    public Asteroid createMaria() {
        return new LevelAsteroidFactory(level, AsteroidKind.MARIA).createAsteroid();
    }


    @Override
    public Asteroid createTsoy() {
        return new LevelAsteroidFactory(level, AsteroidKind.TSOY).createAsteroid();
    }


    @Override
    public Asteroid createKunigunda() {
        return new LevelAsteroidFactory(level, AsteroidKind.KUNIGUNDA).createAsteroid();
    }
}