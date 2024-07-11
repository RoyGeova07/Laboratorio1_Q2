/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1_q2;

/**
 *
 * @author royum
 */
public class Registro_Usuarios {
    private Jugador[] jugador;

    public Registro_Usuarios() {
        jugador = new Jugador[50];
    }

    public Jugador buscar(String contrasena) {
        for (Jugador jugd : jugador) {
            if (jugd != null && jugd.getContrasena().equals(contrasena)) {
                return jugd;
            }
        }
        return null;
    }

    public void agregarUsuario(String player, String contrasena) {
        for (int index = 0; index < jugador.length; index++) {
            if (jugador[index] == null) {
                jugador[index] = new Jugador(player, contrasena);
                break;
            }
        }
    }
}