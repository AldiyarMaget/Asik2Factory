package org.example.model;

public final class Asteroid {
    private final String name;
    private final int speed;
    private final double radius;


    public Asteroid(String name, int speed, double radius) {
        this.name = name;
        this.speed = speed;
        this.radius = radius;
    }


    public String getName() {
        return name;
    }


    public int getSpeed() {
        return speed;
    }


    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Asteroid{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", radius=" + radius +
                '}';
    }
}