package fr.sncf.up2dev.formes;

public abstract class Forme {

    public abstract double aire();

    public static double sommeAires(Forme[] formes) {
        double somme = 0;
        for (Forme forme: formes) {
            somme += forme.aire();
        }
        return somme;
    }
}
