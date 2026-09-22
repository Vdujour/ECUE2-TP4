package net.lecnam.ussi2a.tp5;

public class Disque {

    Point centre;
    double rayon;

    /*Constructeur*/
    public Disque(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    /*Déplacer le disque*/
    public void translate(double x, double y) {
        this.centre.translate(x,y);
    }

    /*Calculer la surface du disque*/
    public double retourneSurface() {
        return Math.pow(Math.PI * this.rayon, 2);
    }

    /*Calculer le périmètre du disque*/
    public double retournePerimetre() {
        return 2 * Math.PI * this.rayon;
    }

    /*Savoir si un se trouve dans le disque*/
    public boolean contient(Point p) {
        return this.centre.retourneDistance(p) <= this.rayon;
    }

    /*Ré-écriture du ToString()*/
    @Override
    public String toString() {
        return "Disque{" +
                "centre=" + centre +
                ", rayon=" + rayon +
                '}';
    }
}
