package br.edu.fema.app;

import java.util.Scanner;


public class SemPOO {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite as medidas do triangulo x : ");
        x.a = tc.nextDouble();
        x.b = tc.nextDouble();
        x.c = tc.nextDouble();
        System.out.println(" Agora digite as medidas do triangulo y : ");
        y.a = tc.nextDouble();
        y.b = tc.nextDouble();
        y.c = tc.nextDouble();

        double p = (x.a + x.b + x.c)/ 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c)/ 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Area do triangulo X : %.4f%n", areaX);
        System.out.printf("Area do triangulo Y : %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("A maior area é a do triangulo X!!");
        }
        else {
            System.out.println("A maior area é a do triangulo Y!!");
        }

        tc.close();
    }
}
