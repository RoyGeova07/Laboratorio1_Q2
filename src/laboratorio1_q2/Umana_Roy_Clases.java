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
public class Umana_Roy_Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la fecha actual
        System.out.print("Ingrese el día de la semana: ");
        String diaSemana = scanner.nextLine().trim().toLowerCase();
        
        System.out.print("Ingrese la fecha (DD/MM): ");
        String fecha = scanner.nextLine().trim();
        
        // Validar la fecha
        if (fecha.length() != 5 || fecha.charAt(2) != '/') {
            System.out.println("Se produjo un error.");
            return;
        }
        
        String diaStr = fecha.substring(0, 2);
        String mesStr = fecha.substring(3, 5);
        
        // Validar que los valores sean números
        boolean esNumero = true;
        for (int i = 0; i < diaStr.length(); i++) {
            if (!Character.isDigit(diaStr.charAt(i))) {
                esNumero = false;
                break;
            }
        }
        for (int i = 0; i < mesStr.length(); i++) {
            if (!Character.isDigit(mesStr.charAt(i))) {
                esNumero = false;
                break;
            }
        }
        
        if (!esNumero) {
            System.out.println("Se produjo un error.");
            return;
        }
        
        int dia = Integer.parseInt(diaStr);
        int mes = Integer.parseInt(mesStr);
        
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.println("Se produjo un error.");
            return;
        }
        
        // Capitalizar el día de la semana
        String diaCapitalizado = diaSemana.substring(0, 1).toUpperCase() + diaSemana.substring(1).toLowerCase();
        
        // Mostrar fecha en el formato correcto
        System.out.printf("%s, %02d/%02d%n", diaCapitalizado, dia, mes);
        
        // Procesar según el día de la semana
        if (diaSemana.equals("lunes")) {
            System.out.printf("Hoy se dictaron clases de nivel Inicial.%n");
            System.out.print("¿Se tomaron exámenes? (si/no): ");
            String respuesta = scanner.next().trim().toLowerCase();
            
            if (respuesta.equals("si")) {
                System.out.print("Ingrese la cantidad de alumnos que aprobaron: ");
                int aprobados = scanner.nextInt();
                System.out.print("Ingrese la cantidad de alumnos que no aprobaron: ");
                int noAprobados = scanner.nextInt();
                int total = aprobados + noAprobados;
                if (total > 0) {
                    double porcentajeAprobados = (double) aprobados / total * 100;
                    System.out.printf("Porcentaje de aprobados: %.2f%%%n", porcentajeAprobados);
                } else {
                    System.out.println("No hay alumnos para calcular el porcentaje.");
                }
            }
        } else if (diaSemana.equals("martes")) {
            System.out.printf("Hoy se dictaron clases de nivel Intermedio.%n");
            System.out.print("¿Se tomaron exámenes? (si/no): ");
            String respuesta = scanner.next().trim().toLowerCase();
            
            if (respuesta.equals("si")) {
                System.out.print("Ingrese la cantidad de alumnos que aprobaron: ");
                int aprobados = scanner.nextInt();
                System.out.print("Ingrese la cantidad de alumnos que no aprobaron: ");
                int noAprobados = scanner.nextInt();
                int total = aprobados + noAprobados;
                if (total > 0) {
                    double porcentajeAprobados = (double) aprobados / total * 100;
                    System.out.printf("Porcentaje de aprobados: %.2f%%%n", porcentajeAprobados);
                } else {
                    System.out.println("No hay alumnos para calcular el porcentaje.");
                }
            }
        } else if (diaSemana.equals("miércoles") || diaSemana.equals("miercoles")) {
            System.out.printf("Hoy se dictaron clases de nivel Avanzado.%n");
            System.out.print("¿Se tomaron exámenes? (si/no): ");
            String respuesta = scanner.next().trim().toLowerCase();
            
            if (respuesta.equals("si")) {
                System.out.print("Ingrese la cantidad de alumnos que aprobaron: ");
                int aprobados = scanner.nextInt();
                System.out.print("Ingrese la cantidad de alumnos que no aprobaron: ");
                int noAprobados = scanner.nextInt();
                int total = aprobados + noAprobados;
                if (total > 0) {
                    double porcentajeAprobados = (double) aprobados / total * 100;
                    System.out.printf("Porcentaje de aprobados: %.2f%%%n", porcentajeAprobados);
                } else {
                    System.out.println("No hay alumnos para calcular el porcentaje.");
                }
            }
        } else if (diaSemana.equals("jueves")) {
            System.out.print("Ingrese el porcentaje de asistencia: ");
            double asistencia = scanner.nextDouble();
            if (asistencia > 50) {
                System.out.println("Asistió la mayoría.");
            } else {
                System.out.println("No asistió la mayoría.");
            }
        } else if (diaSemana.equals("viernes")) {
            if (dia == 1 && (mes == 1 || mes == 7)) {
                System.out.println("Comienzo de nuevo ciclo.");
                System.out.print("Ingrese la cantidad de alumnos del nuevo ciclo: ");
                int cantidadAlumnos = scanner.nextInt();
                System.out.print("Ingrese el precio en $ por cada alumno: ");
                double precioPorAlumno = scanner.nextDouble();
                double ingresoTotal = cantidadAlumnos * precioPorAlumno;
                System.out.printf("Ingreso total: $%.2f%n", ingresoTotal);
            } else {
                System.out.println("Día normal de clases de inglés para viajeros.");
            }
        } else {
            System.out.println("Se produjo un error.");
        }
    }
}
    
    

