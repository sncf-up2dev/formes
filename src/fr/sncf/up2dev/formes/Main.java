package fr.sncf.up2dev.formes;

public class Main {

    public static void main(String[] args) {
        Object[] formes = new Object[] {
                new Cercle(1.2),
                new Rectangle(2, 4),
                new Carre(3),
                new Rectangle(6,1)
        };
        System.out.printf("Somme des aires %f", sommeAires(formes));

    }

    public static double sommeAires(Object[] formes) {
        double somme = 0;
        for (Object object: formes) {
            if (object instanceof Cercle cercle) {
                somme += Cercle.aire(cercle);
            } else if (object instanceof Rectangle rectangle) {
                somme += Rectangle.aire(rectangle);
            } else if (object instanceof Carre carre) {
                somme += Carre.aire(carre);
            } else {
                throw new IllegalArgumentException("Le tableau ne doit contenir que des formes géométriques.");
            }
        }
        return somme;
    }
}
