package fr.sncf.up2dev.formes;

public class Rectangle extends Forme {
    private final double longueur;
    private final double hauteur;


    public Rectangle(double longueur, double hauteur) {
        this.longueur = longueur;
        this.hauteur = hauteur;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getHauteur() {
        return hauteur;
    }

    @Override
    public double aire() {
        return this.hauteur * this.longueur;
    }
}
