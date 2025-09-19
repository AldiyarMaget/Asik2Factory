package org.example.model;

public enum AsteroidKind {
    MARIA("Мария", 1.0, 1.0),
    TSOY("Цой", 1.4, 1.2),
    KUNIGUNDA("Кунигунда", 0.8, 1.6);


    private final String displayName;
    private final double speedMultiplier;
    private final double radiusMultiplier;


    AsteroidKind(String displayName, double speedMultiplier, double radiusMultiplier) {
        this.displayName = displayName;
        this.speedMultiplier = speedMultiplier;
        this.radiusMultiplier = radiusMultiplier;
    }


    public String getDisplayName() {
        return displayName;
    }


    public double getSpeedMultiplier() {
        return speedMultiplier;
    }


    public double getRadiusMultiplier() {
        return radiusMultiplier;
    }
}
