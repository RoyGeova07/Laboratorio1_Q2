/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio1_q2;

import java.util.Scanner;

/*
Hacer un programa dónde una persona recibe un préstamo de $100,000.00 de un banco y desea saber cuánto pagará de interés, si el banco le cobra una tasa del 2% mensual. Ingresar el número de meses por teclado.
 */
/**
 *
 * @author royum
 */
public class Umana_Roy_Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int prestamo = 1000000;
        double interes = 0.02;
        int meses;

        System.out.println("Ingrese el numero de de meses que va a tardar en pagar");
        meses = lea.nextInt();

        double pagara = prestamo * interes * meses;

        System.out.println("el interes total a pagar en " + meses + " meses es de $ " + pagara);

    }

}
