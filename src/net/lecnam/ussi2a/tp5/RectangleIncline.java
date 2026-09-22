package net.lecnam.ussi2a.tp5;

public class RectangleIncline extends Rectangle {

    double angle;

    /*Constructeur 1*/
    public RectangleIncline(double longueur, double largeur, Point p, double angle) {
        super(longueur, largeur, p);
        this.angle = angle;
    }

    /*Constructeur 2*/
    public RectangleIncline(double longueur, double largeur, double x, double y, double angle) {
        super(longueur, largeur, new Point(x,y));
        this.angle = angle;
    }



}
