/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1_q2;

import java.util.Scanner;

/**
 *
 * @author royum
 */
public class Umana_Roy_Matematicas {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        double numerador, numerador2;
        double denominador, denominador2;
        double result;

        System.out.println("Ejercica a");
        System.out.println("\n");

        System.out.println("Ingrese el numerador 1: ");
        numerador = lea.nextInt();

        System.out.println("Ingrese el denominador 1: ");
        denominador = lea.nextInt();

        System.out.println("Ingrese el numerador 2: ");
        numerador2 = lea.nextInt();

        System.out.println("Ingrese el denominador2: ");
        denominador2 = lea.nextInt();

        result = (numerador / denominador) + (numerador2 / denominador2);
        System.out.println("El resultado es: " + result);

        System.out.println("\n");
        System.out.println("Ejercicio b");
        double x;
        double y;
        double result2;

        System.out.println("Ingrese x: ");
        x = lea.nextDouble();
        System.out.println("Ingrese y: ");
        y = lea.nextDouble();

        result2 = (1 / (x - 5)) - ((3 * x * y) / 4);
        System.out.println("El resultado es: " + result2);
        System.out.println("\n");

        System.out.println("Ejercicio c");
        double numec, denomc;
        double numeroc;
        double resultc;

        System.out.println("Ingrese el numerador 1: ");
        numec = lea.nextInt();
        System.out.println("Ingrese el denominador 2: ");
        denomc = lea.nextInt();
        System.out.println("Ingrese un numero: ");
        numeroc = lea.nextInt();

        resultc = (numec / denomc) + numeroc;

        System.out.println("El resultado es: " + resultc);

        System.out.println("\n");
        System.out.println("Ejercicio d");

        double numed, denomid;
        double numerod;
        double resultd;

        System.out.println("Ingrese un numero: ");
        numerod = lea.nextInt();
        System.out.println("Ingrese el numerador 1: ");
        numed = lea.nextInt();
        System.out.println("Ingrese el denominador 2: ");
        denomid = lea.nextInt();

        resultd = (numed / denomid) + numerod;
        System.out.println("el resultafo es: " + resultd);

        System.out.println("\n");
        System.out.println("ejercicio e");
        double a, b, c, d, e, f, g, h, j;
        double resulte;

        System.out.println("Ingrese a:");
        a = lea.nextInt();
        System.out.println("ingrese b");
        b = lea.nextInt();
        System.out.println("ingrese c: ");
        c = lea.nextInt();
        System.out.println("ingrese d: ");
        d = lea.nextInt();
        System.out.println("ingrese e: ");
        e = lea.nextInt();
        System.out.println("ingrese f: ");
        f = lea.nextInt();
        System.out.println("ingrese g: ");
        g = lea.nextInt();
        System.out.println("ingrese h: ");
        h = lea.nextInt();
        System.out.println("ingrese j: ");
        j = lea.nextInt();

        resulte = ((a * a) / (b - c)) + ((d - e) / (f - ((g * h) / j)));

        System.out.println("el resultado es: " + resulte);
        System.out.println("\n");

        System.out.println("Ejercicio f");
        double m, n, p;
        double resultf;

        System.out.println("Ingrese m: ");
        m = lea.nextInt();
        System.out.println("Ingrese n: ");
        n = lea.nextInt();
        System.out.println("Ingrese p: ");
        p = lea.nextInt();

        resultf = (m / n) + p;
        System.out.println("El resultado es: " + resultf);
        System.out.println("\n");

        System.out.println("Ejercicio g");
        double m2, n2, p2, q2;
        double resultg;

        System.out.println("Ingrese m: ");
        m2 = lea.nextInt();
        System.out.println("Ingrese n: ");
        n2 = lea.nextInt();
        System.out.println("Ingrese q:");
        q2 = lea.nextInt();
        System.out.println("Ingrese p: ");
        p2 = lea.nextInt();

        resultg = m2 + (n2 / (p2 - q2));

        System.out.println("El resultado es: " + resultg);

        System.out.println("\n");
        System.out.println("Ejercicio h");

        double a2, b2, c2, d2;
        double resulth;

        System.out.println("Ingrese a: ");
        a2 = lea.nextInt();
        System.out.println("Ingrese b: ");
        b2 = lea.nextInt();
        System.out.println("Ingrese c: ");
        c2 = lea.nextInt();
        System.out.println("Ingrese d: ");
        d2 = lea.nextInt();

        resulth = ((a2 * a2) / (b2 * b2)) + ((c2 * c2) / (d2 * d2));
        System.out.println("El resultado es: " + resulth);

        System.out.println("\n");

        System.out.println("Ejercicio i");

        double m3, n3, p3, r3, s3, q3;
        double resulti;

        System.out.println("Ingresa m: ");
        m3 = lea.nextInt();
        System.out.println("Ingresa n: ");
        n3 = lea.nextInt();
        System.out.println("Ingresa p: ");
        p3 = lea.nextInt();
        System.out.println("Ingrese r: ");
        r3 = lea.nextInt();
        System.out.println("Ingrese s: ");
        s3 = lea.nextInt();
        System.out.println("Ingresa q: ");
        q3 = lea.nextInt();

        resulti = (m3 + (n3 / p3)) / ((q3 - r3) / s3);
        System.out.println("Ingrese el resultado: " + resulti);

        System.out.println("\n");

        System.out.println("Ejercicio j");

        double a4, b4, c4, d4, e4, f4, h4;
        double resultj;

        System.out.println("Ingrese a: ");
        a4 = lea.nextInt();
        System.out.println("Ingrese b: ");
        b4 = lea.nextInt();
        System.out.println("Ingrese c: ");
        c4 = lea.nextInt();
        System.out.println("Ingrese d: ");
        d4 = lea.nextInt();
        System.out.println("Ingrese e: ");
        e4 = lea.nextInt();
        System.out.println("Ingrese f: ");
        f4 = lea.nextInt();
        System.out.println("Ingrese h: ");
        h4 = lea.nextInt();

        resultj = ((3 * a4) + b) / ((c - (d4 + (5 * e4))) / (f + (g / (2 * h))));

        System.out.println("El resultado es: " + resultj);

        System.out.println("\n");

        System.out.println("Ejercicio k ");

        double a5, b5, x5;
        double resultk;

        System.out.println("Ingrese a: ");
        a5 = lea.nextInt();
        System.out.println("Ingrese b: ");
        b5 = lea.nextInt();
        System.out.println("Ingrese x: ");
        x5 = lea.nextInt();

        resultk = ((a * a) + (2 * a * b) + (b * b)) / ((1 / (x * x) + 2));

        System.out.println("El resultado es: " + resultk);
    }

}
