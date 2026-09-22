package net.lecnam.ussi2a.tp5;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Rectangle r = new Rectangle(2,3,1.2,9);
        Rectangle r2 = new Rectangle(2,4,0,0);

        dessin.ajout(r);
        dessin.ajout(r2);

        System.out.println(dessin.retournePlusGrand());

        Figure f1 = new Rectangle(1,4,1,1);
        Figure f2 = new Disque(1,2,3);

        System.out.println(f1.retourneSurface());
        System.out.println(f2.retourneSurface());

        Dessin d1 = new Dessin();

        d1.ajout(f1);
        d1.ajout(f2);

        System.out.println(d1.retourneSurfaceTotale());
        System.out.println(d1.retournePlusGrand());
    }


}
