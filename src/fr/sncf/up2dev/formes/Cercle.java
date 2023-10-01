package fr.sncf.up2dev.formes;

public class Cercle {
    private final double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public static double aire(Cercle cercle) {
        return Math.PI * cercle.rayon * cercle.rayon;
    }
}
