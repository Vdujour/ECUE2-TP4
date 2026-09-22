package net.lecnam.ussi2a.tp5;

public class Triangle extends Figure {

    Point a;
    Point b;
    Point c;

    /*Constructeur 1*/
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /*Constructeur 2 (Si on a pas fait de points)*/
    public Triangle(double xa, double ya, double xb, double yb, double xc, double yc) {
        this.a = new Point(xa,ya);
        this.b = new Point(xb,yb);
        this.c = new Point(xc,yc);
    }

    /*Mettre la longueur des côtés dans un tableau de double*/
    public double[] calculCote() {
        double l1 = a.retourneDistance(b);
        double l2 = b.retourneDistance(c);
        double l3 = c.retourneDistance(a);

        return new double [] {l1, l2, l3};
    }

    /*Calculer la distance entre un point donné et les points du triangle*/
    public double calculDistance(Point m) {
        double ma = m.retourneDistance(a);
        double mb = m.retourneDistance(b);
        double mc = m.retourneDistance(c);

        return ma + mb + mc;
    }

    /*Récupérer le plus petit côté du triangle*/
    public double recupPlusPetitCote() {
        double[] cotes = calculCote();
        double ab = cotes[0];
        double bc = cotes[1];
        double ac = cotes[2];

        return Math.min(ab, Math.min(bc, ac));
    }

    /*Retourner le périmètre du triangle*/
    public double retournePerimetre() {
        double[] cotes = calculCote();
        double c1 = cotes[0];
        double c2 = cotes[1];
        double c3 = cotes[2];

        return c1 + c2 + c3;
    }

    /*Retourner la surface du triangle*/
    public double retourneSurface() {
        double[] cotes = calculCote();
        double d1 = cotes[0];
        double d2 = cotes[1];
        double d3 = cotes[2];

        double s = retournePerimetre() / 2;

        return Math.sqrt(s*(s-d1)*(s-d2)*(s-d3));
    }

    /*Déplacer le triangle*/
    public void translate(double x, double y){
        this.a.translate(x,y);
        this.b.translate(x,y);
        this.c.translate(x,y);
    }

    /*Méthode pour savoir si un point est dans le triangle*/
    public boolean contient(Point m) {
        double perimetre = retournePerimetre();

        double demiPerimetre = retournePerimetre() / 2;

        double minCote = recupPlusPetitCote();

        double sommeDistances = calculDistance(m);

        return (sommeDistances >= demiPerimetre) && (sommeDistances <= perimetre - minCote);
    }
}
