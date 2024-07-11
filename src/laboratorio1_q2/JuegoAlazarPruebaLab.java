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
public class JuegoAlazarPruebaLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");
        int opcionMenu = 0;
        //Inicio del Menu

        // Esta inicializacion serviria para saber cuantas veces se ingreso a cada opcion
        int contadorOpcion1 = 0;
        int contadorOpcion2 = 0;
        int contadorOpcion3 = 0;
        int contadorOpcion4 = 0;
        int contadorOpcion5 = 0;

        while (opcionMenu != 5) {
            System.out.println("Ingrese una opcion");
            System.out.println("1. Palabra al reves");
            System.out.println("2. Palindroma & Vocales");
            System.out.println("3. Mayor y menor ingresados");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir del sistema");
            System.out.println("Selecciona una opcion: ");
            opcionMenu = lea.nextInt();
            lea.nextLine();

            if (opcionMenu == 1) {
                // esto para saber cada cuanto selecciono esta opcion
                contadorOpcion1++;

                //Inicio del ejercicio 1 
                System.out.println("Ingrese una palabra para invertirla: ");
                // lee la palabra 
                String palabra = lea.nextLine();

                //Variable que alamacena 
                String palabraAlReves = "";

                int longitud = palabra.length();

                //Inicializador un contador con la longitud  de la palabra menos 1
                int contador = longitud - 1;

                // El contador sea mayor o igual a 0
                while (contador >= 0) {

                    // Concatenar el caracter en la posicion indicada por el contador al String PalabraAlReves
                    palabraAlReves += palabra.charAt(contador);
                    // Decrementar el contador para ir recorriendo la palabra de atras hacia adelante
                    contador--;
                }
                // Imprime el contador 
                System.out.println("La palabra invertida es: " + palabraAlReves);

            } else if (opcionMenu == 2) {

                //esto para saber cada cuanto selecciono esta opcion
                contadorOpcion2++;

                //Inicio del Menu 2 
                System.out.println("Ingrese una palabra: "); // Ingresamos una palabra 
                String palabraPalin = lea.nextLine(); // El progrma lee la palabra
                boolean palindromo = true; // Un boleano d para eligir una palindromo
                int longitud = palabraPalin.length(); // Inicializamos la variable longitud
                int contador = 0;

                // Este bucle continuará mientras el contador sea menor que la mitad de la longitud de la palabra
                while (contador < longitud / 2) {
                    // Comprueba si el carácter en la posición 'contador' desde el principio de la palabra
                    // es diferente al carácter en la posición correspondiente desde el final de la palabra

                    if (palabraPalin.charAt(contador) != palabraPalin.charAt(longitud - 1 - contador)) {
                        // Si los caracteres no coinciden, la palabra no es un palíndromo
                        palindromo = false;
                        // Se interrumpe el bucle, ya que no es necesario seguir comprobando el resto de la palabra
                        break;
                    }
                    // Se incrementa el contador para pasar al siguiente par de caracteres a comparar
                    contador++;
                }
                // Condicicion donde si es un palindromo mostrara lo siguiente:
                if (palindromo) {
                    System.out.println("La palabra ingresada es un palindromo.");

                    // Inicializamos la cantidad vocales
                    int cantidadVocales = 0;
                    //Inicalizamos todas las vocales
                    int cantidadA = 0, cantidadE = 0, cantidadI = 0, cantidadO = 0, cantidadU = 0;
                    contador = 0;
                    while (contador < longitud) {
                        char letra = Character.toLowerCase(palabraPalin.charAt(contador));
                        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                            cantidadVocales++; //Incrementa las vocales

                            // Aquie es donde se ubica cuantas vocales se ingreso en la palabra que dio el usuario
                            if (letra == 'a') {
                                cantidadA++;
                            } else if (letra == 'e') {
                                cantidadE++;
                            } else if (letra == 'i') {
                                cantidadI++;
                            } else if (letra == 'o') {
                                cantidadO++;
                            } else if (letra == 'u') {
                                cantidadU++;
                            }
                        }
                        contador++; // Este contador sirve para  avanzar al siguiente caracter  en la palabra 
                    }

                    //Imprime cada una de las vocales de la palabra que ingreso el usuario
                    System.out.println("La cantidad de vocales en la palabra es: " + cantidadVocales);
                    System.out.println("Cantidad de 'a': " + cantidadA);
                    System.out.println("Cantidad de 'e': " + cantidadE);
                    System.out.println("Cantidad de 'i': " + cantidadI);
                    System.out.println("Cantidad de 'o': " + cantidadO);
                    System.out.println("Cantidad de 'u': " + cantidadU);
                } else {
                    // condicion donde si no es un palindromo no mostrala las vocales y solo mostrara que no es un palindromo
                    System.out.println("La palabra ingresada no es un palindromo.");
                }

            } else if (opcionMenu == 3) {

                //esto para saber cada cuanto selecciono esta opcion
                contadorOpcion3++;

                // INICIO DE MENU 3
                // se ingresa los numeros
                System.out.println("Cuantos numeros deseas ingresar ");
                int cantidad = lea.nextInt();

                // cantidad que debe ser mayor a cero 
                if (cantidad <= 0) {
                    System.out.println("La cantidad debe ser mayor que cero.");
                    return;
                }

                System.out.println("Ingresa el número 1:"); // pide al usuario que ingrese el primer numero
                int numero = lea.nextInt(); // lee el numero 
                int maximo = numero; // inicaliza el maximo de del primer numero que se ingreso
                int minimo = numero; // inicializa el minimo del primero numero que se ingreso
                int contadorMaximo = 1; // Contador maximo
                int contadorMinimo = 1; // Contadro minimo

                // Bucle para leer los numeros restantes
                for (int contador4 = 2; contador4 <= cantidad; contador4++) {
                    System.out.println("Ingresa el número " + contador4 + ":"); // se le pide al usarion que ingrese el siguiente numero
                    numero = lea.nextInt(); // Se lee el suguiente numero 

                    // Se comprueba la actualizacion del maximo
                    if (numero > maximo) {
                        maximo = numero; // Actualiza el maximo
                        contadorMaximo = 1; // Reinicia el contador del minimo
                    } else if (numero == maximo) {
                        contadorMaximo++; // Incrementa el contador del  minimo si el numero es igual al minimo actual
                    }

                    // se hace lo mismo solo que en ves del maximo es el minimo
                    if (numero < minimo) {
                        minimo = numero;
                        contadorMinimo = 1;
                    } else if (numero == minimo) {
                        contadorMinimo++;
                    }
                }

                // Se imprime el resultado
                System.out.println("El numero mayor es: " + maximo);
                System.out.println("El numero menor es: " + minimo);
                System.out.println("El numero mayor se repite: " + contadorMaximo + " veces");
                System.out.println("El número menor se repite: " + contadorMinimo + " veces");

            } else if (opcionMenu == 4) {

                //esto para saber cada cuanto selecciono esta opcion
                contadorOpcion4++;

                System.out.println("Cuantos votantes hay en el pais: ");
                int totalVotantes = lea.nextInt();
                lea.nextLine();

                int votosAzul = 0;
                int votosRojo = 0;
                int votosNegro = 0;
                int votosAmarillo = 0;
                int votosNulos = 0;

                // Bucle para recoger los votos de cada votante
                for (int contador = 1; contador <= totalVotantes; contador++) {
                    System.out.println("Votante " + contador + ":");
                    System.out.println("Ingrese su voto (AZUL, ROJO, NEGRO, AMARILLO):");
                    String voto = lea.nextLine().toUpperCase();

                    // Verificamos el voto ingresado y actualizamos los contadores correspondientes
                    switch (voto) {
                        case "AZUL":
                            votosAzul++;
                            break;
                        case "ROJO":
                            votosRojo++;
                            break;
                        case "NEGRO":
                            votosNegro++;
                            break;
                        case "AMARILLO":
                            votosAmarillo++;
                            break;
                        default:
                            votosNulos++;
                    }

                }

                // Calculamos el total de votos válidos
                int votosValidos = votosAzul + votosRojo + votosNegro + votosAmarillo;
                // Calculamos el porcentaje de votos válidos respecto al total de votos
                double porcentajeValido = (double) votosValidos / totalVotantes;

                // Verificamos si la votación es válida (si el porcentaje de votos válidos es mayor o igual al 60%)
                if (porcentajeValido >= 0.6) {
                    // Determinamos la planilla ganadora
                    String ganador;
                    if (votosAzul > votosRojo && votosAzul > votosNegro && votosAzul > votosAmarillo) {
                        ganador = "AZUL";
                    } else if (votosRojo > votosNegro && votosRojo > votosAmarillo) {
                        ganador = "ROJO";
                    } else if (votosNegro > votosAmarillo) {
                        ganador = "NEGRO";
                    } else {
                        ganador = "AMARILLO";
                    }
                    // Imprimimos el ganador
                    System.out.println("El ganador es: " + ganador);
                } else {
                    // Imprimimos "VOTACIÓN FALLIDA" si la votación no es válida
                    System.out.println("VOTACION FALLIDA");
                }

            } else if (opcionMenu == 5) {

                //esto para saber cada cuanto selecciono esta opcion
                contadorOpcion5++;
                //se imprime las veces que se ingreso a cada opcion
                System.out.println("Las veces que se ingreso a la Opcion 1: " + contadorOpcion1);
                System.out.println("Las veces que se ingreso a la Opcion 2: " + contadorOpcion2);
                System.out.println("Las veces que se ingreso a la Opcion 3: " + contadorOpcion3);
                System.out.println("Las veces que se ingreso a la Opcion 4: " + contadorOpcion4);
                System.out.println("Las veces que se ingreso a la Opcion 5: " + contadorOpcion5);

                //Saliendo del sistema
                System.out.println("Saliendo del sistema..");
            } else {
                System.out.println("Opción no valida. Por favor, seleccione una opcion del 1 al 5.");
            }
        }
    }
}
