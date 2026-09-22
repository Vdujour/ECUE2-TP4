package net.lecnam.ussi2a.tp5;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Exec {

    static Dessin dessin = new Dessin();

    public static void main(String[] args) {

        Figure f1 = new Rectangle(2,3,1.2,9);
        Figure f2 = new Rectangle(2,4,0,0);
        Figure f3 = new Rectangle(1,4,1,1);
        Figure f4 = new Disque(1,2,3);
        Figure f5 = new Disque(3,2,5);

        dessin.ajout(f1);
        dessin.ajout(f2);
        dessin.ajout(f3);
        dessin.ajout(f4);
        dessin.ajout(f5);

        System.out.println("La surface totale est de : " + dessin.retourneSurfaceTotale());
        System.out.println("La plus grande figure est : " + dessin.retournePlusGrand());

        Point p = new Point(4,6);
        System.out.println("Est-ce que le point est dans l'une des figures ? \n" + dessin.contient(p));

        Figure f6 = new Triangle(0,0,0,5,5,0);
        Figure f7 = new Triangle(1,5,6,10,23,0);

        dessin.ajout(f6);
        dessin.ajout(f7);

        System.out.println("La surface totale est de : " + dessin.retourneSurfaceTotale());

        System.out.println("Le figure la plus grande est : " + dessin.retournePlusGrand());

        Figure f8 = new RectangleIncline(5,3,0,0,0);
        Figure f9 = new Rectangle(5,3,0,0);
        System.out.println(f8.equals(f7));

        Point p1 = new Point(3,2);
        Figure f10 = new RectangleIncline(50,80,0,0,0.35);

        dessin.ajout(f10);
        System.out.println(dessin.retournePlusGrand());

        System.out.println(f10.contient(p1));
    }


}
