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
public class Umana_Roy_Segundos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        
        int segundos;
        int horas;
        int minutos;
        
        System.out.println("Ingrese la cantidad de segundos");
        segundos = lea.nextInt();
        
        minutos = segundos / 60;
        horas = segundos / 3600;
        
        System.out.println("minutos: " +minutos);
        System.out.println("Horas: " + horas);
        System.out.println("Segundos: "+ segundos);
        
        
    }
    
}
