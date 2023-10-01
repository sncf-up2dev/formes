package fr.sncf.up2dev.formes;

public class Rectangle {
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

    public static double aire(Rectangle rectangle) {
        return rectangle.hauteur * rectangle.longueur;
    }
}
