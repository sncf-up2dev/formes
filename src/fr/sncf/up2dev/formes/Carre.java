package fr.sncf.up2dev.formes;

public class Carre {
    private final double longueur;

    public Carre(double longueur) {
        this.longueur = longueur;
    }

    public double getLongueur() {
        return longueur;
    }

    public static double aire(Carre carre) {
        return carre.longueur * carre.longueur;
    }
}
