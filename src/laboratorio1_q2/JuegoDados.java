/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio1_q2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author royum
 */
public class JuegoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        while (true) {
            System.out.println("Escribe 'click' para iniciar: ");
            String click = scanner.nextLine().trim().toLowerCase();
            
            
             if(click.equals("click")) {
                int dado1 = random.nextInt(6) + 1;
                int dado2 = random.nextInt(6) + 1;
                int dado3 = random.nextInt(6) + 1;
                
                // Mostrar los dados
                System.out.println("\n");
                System.out.println("Dado1: " + dado1);
                System.out.println("Dado2: " + dado2);
                System.out.println("Dado3: " + dado3);
                
                // Condicionales
                if (dado1 == 6 && dado2 == 6 && dado3 == 6) {
                    System.out.println("Excelente, todos los dados cayeron en 6");
                    System.out.println("\n");
                } else if ((dado1 == 6 && dado2 == 6) || (dado1 == 6 && dado3 == 6) || (dado2 == 6 && dado3 == 6)) {
                    System.out.println("Muy bien, 2 dados cayeron en 6");
                    System.out.println("\n");
                } else if (dado1 == 6 || dado2 == 6 || dado3 == 6) {
                    System.out.println("Que inesperado, solo un dado cayo en 6");
                    System.out.println("\n");
                } else {
                    System.out.println("Que mala suerte, ningun dado cayo en 6");
                    System.out.println("\n");
                }
            } else {
                System.out.println("Entrada no válida, por favor escribe 'click'. ");
            }
        }
    }   
}
