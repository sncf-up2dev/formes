package fr.sncf.up2dev.formes;

public class Main {

    public static void main(String[] args) {
        Forme[] formes = {
                new Cercle(1.2),
                new Rectangle(2, 4),
                new Carre(3),
                new Rectangle(6,1),
                new Triangle(2, 2),
        };
        System.out.printf("Somme des aires %f", Forme.sommeAires(formes));
    }
}
