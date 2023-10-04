package fr.sncf.up2dev.formes;

public class Triangle extends Forme {

    private final double hauteur;
    private final double base;

    public Triangle(double hauteur, double base) {
        this.hauteur = hauteur;
        this.base = base;
    }

    @Override
    public double aire() {
        return hauteur * base / 2;
    }
}
