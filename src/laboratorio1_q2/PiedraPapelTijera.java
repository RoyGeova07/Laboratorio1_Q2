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
public class PiedraPapelTijera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random lea = new Random();
        teclado.useDelimiter("\n");

        //Mensaje de bienvenida
        System.out.println("Bienvenido al menu de juegos!");

        boolean continuar = true;

        // bucle principal
        while (continuar) {
            // Opciones de juego
            System.out.println("Seleccione un juego:");
            System.out.println("1. Piedra, Papel o Tijera");
            System.out.println("2. Adivinar el numero");
            System.out.println("3. Salir");

            // Lee la opcion del Usuario
            int opcion = teclado.nextInt();
            teclado.nextLine(); // Consumir la nueva línea

            //Logica para el primer juego Piedra, papel o tijera
            if (opcion == 1) {
                boolean jugarNuevamente = true;

                while (jugarNuevamente) {
                    String usuario = "";
                    String pc = "";

                    // Presentar Opciones al Usuario
                    System.out.println("\n");
                    System.out.println("Hola Usuario, bienvenido al juego de Piedra, Papel o Tijera.");
                    System.out.println("Ingrese el nombre de la herramienta que usará: ");
                    System.out.println("Piedra");
                    System.out.println("Papel");
                    System.out.println("Tijera");

                    boolean entradaValida = false;
                    while (!entradaValida) {
                        System.out.print("Herramienta: ");
                        usuario = teclado.nextLine();

                        if (usuario.equalsIgnoreCase("Piedra")
                                || usuario.equalsIgnoreCase("Papel")
                                || usuario.equalsIgnoreCase("Tijera")) {
                            entradaValida = true;
                        } else {
                            System.out.println("ERROR: ELIJA ENTRE PIEDRA, PAPEL O TIJERA");
                        }
                    }

                    // Selección aleatoria de la herramienta de la computadora
                    int seleccion = lea.nextInt(3);
                    if (seleccion == 0) {
                        pc = "Piedra";
                    } else if (seleccion == 1) {
                        pc = "Papel";
                    } else if (seleccion == 2) {
                        pc = "Tijera";
                    }
                    System.out.println("La computadora ha elegido: " + pc);

                    // Determinar el ganador
                    if (usuario.equalsIgnoreCase(pc)) {
                        System.out.println("Es un empate!");
                    } else if ((usuario.equalsIgnoreCase("Piedra") && pc.equals("Tijera"))
                            || (usuario.equalsIgnoreCase("Papel") && pc.equals("Piedra"))
                            || (usuario.equalsIgnoreCase("Tijera") && pc.equals("Papel"))) {
                        System.out.println("Felicidades, ganaste!");
                    } else {
                        System.out.println("La computadora gano, suerte la proxima!!");
                    }

                    // Preguntar si desea jugar nuevamente
                    System.out.print("Quieres jugar de nuevo? (si/no): ");
                    String respuesta = teclado.nextLine();
                    if (!respuesta.equalsIgnoreCase("si")) {
                        jugarNuevamente = false;
                        System.out.println("Gracias por jugar. Adios!!!");
                        continuar = false;
                    }
                }

                // Logica del segundo juego, Adivinar numeros.
            } else if (opcion == 2) {
                int numeroAleatorio = lea.nextInt(100) + 1;
                int intentos = 10;
                boolean acertado = false;

                System.out.println("Bienvenido al juego de adivinar los numeros. El  juego consisten en adivinar un numero del 1 al 100, donde tienes 10 intentos ");

                for (int contador = 1; contador <= intentos; contador++) {
                    System.out.println("Intento " + contador + " Ingresar un numero: ");
                    int NumeroUsuario = teclado.nextInt();
                    if (NumeroUsuario > 100) {
                        System.out.println("ERROR: SOLO PUEDES INGRESAR NUMEROS DEL 1 AL 100");
                    }

                    if (NumeroUsuario == numeroAleatorio) {
                        System.out.println("Felicidades!! Adivinaste el numero en " + contador + " intentos");
                        acertado = true;
                        break;
                    } else if (NumeroUsuario < numeroAleatorio) {
                        System.out.println("El numero a adivinar es mayor.");
                    } else {
                        System.out.println("El numero a adivinar es menor.");
                    }
                    continuar = false;
                }

                //Mensaje que no acierta el numero 
                if (!acertado) {
                    System.out.println("Lastimosamente, has alacando el limite de intentos el numero era: " + numeroAleatorio);
                }
            } else if (opcion == 3) {
                continuar = false;
                break;
            } else {
                System.out.println("ERROR: ELIJA UN JUEGO NUMERO VALIDO!!!");
            }
        }
    }
    
}
