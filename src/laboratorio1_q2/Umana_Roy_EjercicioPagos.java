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
public class Umana_Roy_EjercicioPagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        System.out.println("Ingrese el codigo del empleado:");
        String codigo = scanner.next();
        
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.next();
        
        System.out.println("Ingrese el apellido del empleado:");
        String apellido = scanner.next();
        
        System.out.println("Ingrese la cantidad de horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();
        
        System.out.println("Ingrese la cantidad de horas extras trabajadas:");
        int horasExtras = scanner.nextInt();
        
        System.out.println("Ingrese la categoria del empleado (1, 2, 3, 4):");
        int categoria = scanner.nextInt();
    
        int horasNormales = horasTrabajadas;
        if (horasNormales > 40) {
            horasNormales = 40;
        }

        int horasExtrasPagables = 0;
        if (horasExtras > 0) {
            if (horasExtras <= 15) {
                horasExtrasPagables = horasExtras;
            } else {
                horasExtrasPagables = 15;
            }
        }
        
        // Calcular salario base y pago extra
        double salarioBase = horasNormales * 35.99;
        double pagoExtra = 0;
        
        // Calcular pago extra según la categoría
        if (categoria == 1) {
            pagoExtra = horasExtrasPagables * 40;
        } else if (categoria == 2) {
            pagoExtra = horasExtrasPagables * 50;
        } else if (categoria == 3) {
            pagoExtra = horasExtrasPagables * 85;
        } else if (categoria == 4) {
            pagoExtra = 0; // Categoría 4 no recibe pago extra por horas extras
        } else {
            System.out.println("Categoría no valida");
            return;
        }
        
        // Calcular salario neto
        double salarioNeto = salarioBase + pagoExtra;
        
        // Imprimir la boleta de pago
        System.out.println("----------------Boleta de Pago---------------");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre Completo: " + nombre + " " + apellido);
        System.out.println("Salario Base: " + salarioBase + " $");
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Categoria: " + categoria);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Salario Neto: " + salarioNeto + " $");
        
    }
}
