/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio1_q2;

import java.util.Scanner;

/**
 *
 * @author royum
 */
public class JuegosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");
        int opcionMenu = 0;

        while (opcionMenu != 4) {

            System.out.println("\n Menu principal");
            System.out.println("1. Identificar cifras");
            System.out.println("2. Ejercicio Suma");
            System.out.println("3. Ejercicio Piramide");
            System.out.println("4. Salir del sistema");
            System.out.println("Seleccione una opcion: ");
            opcionMenu = lea.nextInt();

            if (opcionMenu == 1) {
                int Contador = 0;
                System.out.println("**EJERCICIO #1***");
                System.out.println("Introduzca un numero entero: ");
                int NumeroEntero = lea.nextInt();
                int NumeroTemp = NumeroEntero;
                while (NumeroTemp != 0) {
                    NumeroTemp /= 10;
                    Contador++;
                }
                System.out.println("El numero " + NumeroEntero + " Contiene " + Contador + " Cifras");
            }

            if (opcionMenu == 2) {
                int Numero = 0;
                System.out.println("****EJERCICIO 2****");
                System.out.println("Ingresa los numeros a sumar que no sean negativos: ");
                String entrada = lea.next();

                int numero = Integer.parseInt(entrada);
                int suma = 0;
                String dSuma = "";
                boolean PrimerDigito = true;

                while (numero > 0) {
                    int digito = numero % 10;
                    suma += digito;

                    if (PrimerDigito) {
                        dSuma = digito + dSuma;

                        PrimerDigito = false;
                    } else {
                        dSuma = digito + "+" + dSuma;
                    }
                    numero /= 10;
                }
                System.out.println(dSuma + " = " + suma);
            }
            if (opcionMenu == 3) {
                System.out.println("EJERCICIO #3");
                System.out.println("Ingrese el numero para contruir la piramide:");
                int numeroA = lea.nextInt();

                for (int contar = 1; contar <= numeroA; contar++) {
                    for (int numero2 = 1; numero2 < contar; numero2++) {
                        System.out.print("  ");
                    }
                    for (int numero2 = contar; numero2 <= numeroA; numero2++) {
                        System.out.print(numero2 + " ");
                    }
                    for (int numero2 = numeroA - 1; numero2 >= contar; numero2--) {
                        System.out.print(numero2 + " ");
                    }
                    System.out.println();
                }
                if (opcionMenu == 4) {
                    System.out.println("Fin del Loop..");
                }
            }
        }
    }
}
