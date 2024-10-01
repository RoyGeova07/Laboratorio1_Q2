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
public class Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Configuramos el delimitador de entrada para que sea una nueva linea  
        teclado.useDelimiter("\n");

        // Array de palabras predeterminadas para el juego
        String[] palabras = {"PLATO", "MESSI", "BOLSA", "MESA", "COMPUTADORA", "TECLADO", "OREJA", "PISTOLA", "BANDERA", "ESCUELA"};
        // Numero maximo de oportunidades para adivinar una palabra
        int MaximaOportunidad = 5;

        // Objeto Random para generar las palabras aleatorias
        Random lea = new Random();

        // Array para almacenar la palabra que el usuario esta adivinando
        char[] palabraAdivinada;
        // Cadena para almacenar la palabra seleccionada aleatoriamente
        String palabra;
        // numero de oportunidades restantes para adivinar la palabra
        int oportunidades;
        // Opcion elegida por el usuario en el menu
        int opcion;

        // Mensaje de bienvenida y explicacion del juego
        System.out.println("Hola!!, bienvenido al Menu de juego Ahorcado, donde te ponen una palabra\ny la tienes que adivinar ingresando caracteres, en la opcion 2 puedes elegir cambiar las 10 palabras\no sea que las palabras que ya estan por predeterminacion las puedes cambiar y podes jugar adivinando\nesas palabras con tu amigos!! y en la opcion 3 puedes salir, ten un buen dia!!!!");
        System.out.println("\n");

        // Bucle principal que controla el men del juego.
        while (true) {
            // Mostramos las opciones del menu
            System.out.println("\n");
            System.out.println("1. Jugar");
            System.out.println("2. Cambiar Palabras");
            System.out.println("3. Salir del programa");
            System.out.print("Elige una opcion: ");
            // Leemos la opcion elegida por el usuario
            opcion = teclado.nextInt();
            // Limpiamos el buffer de la entrada
            teclado.nextLine();

            // Controlamos la opcion elegida por el usuario
            if (opcion == 1) {
                // El usuario elige jugar.
                // Seleccionamos una palabra aleatoria del array de palabras.

                palabra = palabras[lea.nextInt(palabras.length)];
                // Inicializamos el array para almacenar la palabra adivinada con guiones bajos
                palabraAdivinada = new char[palabra.length()];
                for (int indice = 0; indice < palabraAdivinada.length; indice++) {
                    palabraAdivinada[indice] = '_';
                }
                // Inicializamos el numero de oportunidades.
                oportunidades = MaximaOportunidad;

                // Array de booleanos para registrar los caracteres que ya se han intentado adivinar
                boolean[] caracteresIntentados = new boolean[26];

                // Mostramos la palabra a adivinar (inicialmente solo con guiones bajos)
                System.out.println("Adivina la palabra:");
                System.out.println(String.valueOf(palabraAdivinada));

                // Bucle para jugar hasta que se agoten las oportunidades o se adivine la palabra
                while (oportunidades > 0) {
                    // Mostramos las oportunidades restantes
                    System.out.println("Oportunidades restantes: " + oportunidades);
                    // Solicitamos al usuario que ingrese un carácter
                    System.out.print("Ingresa un caracter: ");
                    char letra = teclado.nextLine().toUpperCase().charAt(0);

                    // Validamos si el caracter ingresado es una letra válida.
                    if (letra < 'A' || letra > 'Z') {
                        System.out.println("Caracter no valido. Ingresa una letra de la A a la Z por favor!!!.");
                        continue; // Continuamos con la siguiente iteración del bucle
                    }

                    // Validamos si el caracter ya ha sido intentado antes.
                    if (caracteresIntentados[letra - 'A']) {
                        System.out.println("Ya has intentado adivinar este caracter antes!");
                        continue;
                    }
                    caracteresIntentados[letra - 'A'] = true; // Marcamos el caracter como intentado

                    // Bandera para indicar si el carácter ingresado coincide con alguna letra de la palabra
                    boolean acierto = false;
                    for (int index = 0; index < palabra.length(); index++) {
                        if (palabra.charAt(index) == letra) {
                            // Si coincide, actualizamos la palabra adivinada con la letra correcta
                            palabraAdivinada[index] = letra;
                            acierto = true;
                        }
                    }

                    // Mostramos si se acerto un caracter o no
                    if (acierto) {
                        System.out.println("Le pegaste a un caracter!");
                    } else {
                        System.out.println("Ese caracter no esta en la palabra.");
                        oportunidades--;// Reducimos el número de oportunidades
                    }

                    // Mostramos la palabra adivinada hasta el momento
                    System.out.println(String.valueOf(palabraAdivinada));

                    // Si la palabra adivinada es igual a la palabra original se ha ganado el juego
                    if (String.valueOf(palabraAdivinada).equals(palabra)) {
                        System.out.println("\n");
                        System.out.println("Felicidades! Adivinaste la palabra: " + palabra);
                        break; // Salimos del bucle
                    }
                }

                // Si se agotan las oportunidades, se muestra la palabra original
                if (oportunidades == 0) {
                    System.out.println("Se te acabaron las oportunidades. La palabra era: " + palabra);
                }
            } else if (opcion == 2) {
                System.out.println("\n");
                // El usuario elige cambiar las palabras
                System.out.println("Ingresa 10 nuevas palabras:");
                for (int contador = 0; contador < 10; contador++) {
                    // Solicitamos al usuario que ingrese una nueva palabra para cada posición del array
                    System.out.print("Palabra " + (contador + 1) + ": ");
                    palabras[contador] = teclado.nextLine().toUpperCase();
                }
                System.out.println("\n");
                System.out.println("Se han ingresado las nuevas palabras exitosamente!!!, presiona 1 para comprobar! y jugar.");
            } else if (opcion == 3) {
                // El usuario elige salir del programa.
                System.out.println("\n");
                System.out.println("Gracias por jugar. Adios!!!!!");
                break;
            } else {
                // Erro si el usuario elige una opcion que no esta en el menu.
                System.out.println("\n");
                System.out.println("Opcion no valida. Por favor, elige una opcion valida.");
            }
        }
    }
}
