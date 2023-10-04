package fr.sncf.up2dev.formes;

public class Cercle extends Forme {
    private final double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public double aire() {
        return Math.PI * rayon * rayon;
    }
}
