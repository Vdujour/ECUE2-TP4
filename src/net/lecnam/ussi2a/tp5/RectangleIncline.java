package net.lecnam.ussi2a.tp5;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        if (!(o instanceof RectangleIncline)) {
            return this.angle == 0;
        } else {
            return Double.compare(this.angle, ((RectangleIncline) o).angle) == 0;
        }
    }

    @Override
    public String toString() {
        return "RectangleIncline{" +
                "longeur=" + this.longueur +
                ", largeur=" + this.largeur +
                ", point=" + this.point +
                ", surface=" + this.retourneSurface() +
                ", angle=" + this.angle +
                '}';
    }

    @Override
    public boolean contient(Point p) {
        double a = Math.toRadians(this.angle);
        double dx = p.x - this.point.x;
        double dy = p.y - this.point.y;
        double rotx =  dx * Math.cos(a) + dy * Math.sin(a);
        double roty = -dx * Math.sin(a) + dy * Math.cos(a);
        return 0 <= rotx && rotx <= this.longueur && 0 <= roty && roty <= this.largeur;
    }


}
