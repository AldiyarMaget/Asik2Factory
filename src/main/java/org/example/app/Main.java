package org.example.app;

import org.example.family.AsteroidFamilyFactory;
import org.example.family.LevelAsteroidFamilyFactory;
import org.example.model.Asteroid;
import org.example.model.Level;

public class Main {
    public static void main(String[] args) {
        Level level = new Level(10);
        AsteroidFamilyFactory familyFactory = new LevelAsteroidFamilyFactory(level);


        Asteroid maria = familyFactory.createMaria();
        Asteroid tsoy = familyFactory.createTsoy();
        Asteroid kunigunda = familyFactory.createKunigunda();


        System.out.println(maria);
        System.out.println(tsoy);
        System.out.println(kunigunda);

    }
}