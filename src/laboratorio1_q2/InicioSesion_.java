/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio1_q2;

/*
ROY: DISEÑO, AJUSTE DE LOS BOTONES LABELS,BOTON VOLVER, INICIO SESION, MENU PRINCIPAL
RIGO: MENU INCIO, CERRAR SESION, LOGICA DEL JUEGO, CLASE REGISTRO, CLASE JUGADOR, SALIR

 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class InicioSesion_ {

    private static Registro_Usuarios h;
    private static Jugador jugador1;
    private static Jugador jugador2;
    private static boolean turnoJugador1 = true;
    private JLabel etiquetaTurno;

    public static void main(String[] args) {
        new InicioSesion_().mostrarMenuInicio();
    }

    public InicioSesion_() {
        h = new Registro_Usuarios();
    }

    public void mostrarMenuInicio() {
        JFrame frame = new JFrame("JUEGO X-0 TIP TAP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(null);

        JButton botonInicioSesion = new JButton("INICIAR SESION");
        botonInicioSesion.setBounds(100, 50, 200, 30);
        botonInicioSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMenuPrincipal(frame);
            }
        });

        JButton botonCrearJugador = new JButton("REGISTRO");
        botonCrearJugador.setBounds(100, 100, 200, 30);
        botonCrearJugador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarRegistro(frame);
            }
        });

        JButton botonSalir = new JButton("SALIR");
        botonSalir.setBounds(100, 150, 200, 30);
        botonSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panelBotones.add(botonInicioSesion);
        panelBotones.add(botonCrearJugador);
        panelBotones.add(botonSalir);

        frame.add(panelBotones, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void mostrarMenuPrincipal(JFrame frame) {
        frame.getContentPane().removeAll();
        frame.setLayout(new BorderLayout(10, 10));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel etiquetaUsuario = new JLabel("Nombre de Usuario:");
        JTextField textoUsuario = new JTextField();
        etiquetaUsuario.setForeground(Color.BLACK);

        JLabel etiquetaContrasena = new JLabel("Contrasena:");
        JPasswordField textoContrasena = new JPasswordField();
        etiquetaContrasena.setForeground(Color.BLACK);

        JButton botonInicioSesion = new JButton("INICIAR SESION");
        botonInicioSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombreUsuario = textoUsuario.getText();
                String contrasena = new String(textoContrasena.getPassword());
                Jugador jugador = h.buscar(contrasena);

                if (jugador != null && jugador.getJugador().equals(nombreUsuario)) {
                    if (jugador1 == null) {
                        jugador1 = jugador;
                        JOptionPane.showMessageDialog(frame, "Jugador 1 registrado. Ahora, registre al Jugador 2.");
                    } else if (jugador2 == null) {
                        jugador2 = jugador;
                        JOptionPane.showMessageDialog(frame, "Jugador 2 registrado. Mostrando el menu principal...");
                        mostrarMenuPrincipalJuego(frame);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Nombre de usuario o contrasena incorrecta");
                }
            }
        });

        JButton botonVolver = new JButton("VOLVER");
        botonVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMenuInicio();
            }
        });

        panel.add(etiquetaUsuario);
        panel.add(textoUsuario);
        panel.add(etiquetaContrasena);
        panel.add(textoContrasena);
        panel.add(botonInicioSesion);
        panel.add(botonVolver);

        frame.add(panel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }

    public void mostrarRegistro(JFrame frame) {
        frame.getContentPane().removeAll();
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel etiquetaUsuario = new JLabel("Nombre del jugador:");
        JTextField textoUsuario1 = new JTextField();
        etiquetaUsuario.setForeground(Color.BLACK);

        JLabel etiquetaContrasena1 = new JLabel("Contrasena (5 caracteres):");
        JPasswordField textoContrasena1 = new JPasswordField();
        etiquetaContrasena1.setForeground(Color.BLACK);

        JButton botonCrearJugador = new JButton("CREAR JUGADOR");
        botonCrearJugador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombreUsuario = textoUsuario1.getText();
                String contrasena = new String(textoContrasena1.getPassword());
                if (contrasena.length() != 5) {
                    JOptionPane.showMessageDialog(frame, "La contrasena debe tener exactamente 5 caracteres.");
                } else {
                    h.agregarUsuario(nombreUsuario, contrasena);
                    JOptionPane.showMessageDialog(frame, "Jugador registrado exitosamente");
                    mostrarMenuInicio();
                }
            }
        });

        JButton botonVolver = new JButton("VOLVER");
        botonVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMenuInicio();
            }
        });

        panel.add(etiquetaUsuario);
        panel.add(textoUsuario1);
        panel.add(etiquetaContrasena1);
        panel.add(textoContrasena1);
        panel.add(botonCrearJugador);
        panel.add(botonVolver);

        frame.add(panel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }

    public void mostrarMenuPrincipalJuego(JFrame frame) {
        frame.getContentPane().removeAll();
        frame.setLayout(new BorderLayout(10, 10));

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(2, 1, 10, 10));

        JButton botonJugar = new JButton("JUGAR X-0");
        botonJugar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                iniciarJuego(frame);
            }
        });

        JButton botonCerrarSesion = new JButton("CERRAR SESION");
        botonCerrarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jugador1 = null;
                jugador2 = null;
                mostrarMenuInicio();
            }
        });

        panelBotones.add(botonJugar);
        panelBotones.add(botonCerrarSesion);

        frame.add(panelBotones, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }

    public void iniciarJuego(JFrame frame) {
        frame.getContentPane().removeAll();
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 10, 10));

        JLabel[][] tablero = new JLabel[3][3];
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                tablero[fila][columna] = new JLabel(" ", JLabel.CENTER);
                tablero[fila][columna].setOpaque(true);
                tablero[fila][columna].setBackground(Color.LIGHT_GRAY);
                panel.add(tablero[fila][columna]);
            }
        }

        JPanel controlPanel = new JPanel(new GridLayout(1, 5, 10, 10));
        etiquetaTurno = new JLabel("Turno: " + (turnoJugador1 ? jugador1.getJugador() : jugador2.getJugador()));
        JLabel etiquetaFila = new JLabel("Fila:");
        JTextField textoFila = new JTextField();
        JLabel etiquetaColumna = new JLabel("Columna:");
        JTextField textoColumna = new JTextField();
        JButton botonJugar = new JButton("JUGAR");

        controlPanel.add(etiquetaTurno);
        controlPanel.add(etiquetaFila);
        controlPanel.add(textoFila);
        controlPanel.add(etiquetaColumna);
        controlPanel.add(textoColumna);
        controlPanel.add(botonJugar);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        botonJugar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int fila = Integer.parseInt(textoFila.getText());
                    int columna = Integer.parseInt(textoColumna.getText());
                    if (fila < 1 || fila > 3 || columna < 1 || columna > 3 || !tablero[fila - 1][columna - 1].getText().equals(" ")) {
                        JOptionPane.showMessageDialog(frame, "Movimiento no valido. Intentalo de nuevo.");
                    } else {
                        tablero[fila - 1][columna - 1].setText(turnoJugador1 ? "X" : "O");
                        if (verificarGanador(tablero)) {
                            JOptionPane.showMessageDialog(frame, (turnoJugador1 ? jugador1.getJugador() : jugador2.getJugador()) + " gana!");
                            mostrarMenuPrincipal(frame);
                        } else if (verificarEmpate(tablero)) {
                            JOptionPane.showMessageDialog(frame, "Empate!");
                            mostrarMenuPrincipal(frame);
                        } else {
                            turnoJugador1 = !turnoJugador1;
                            etiquetaTurno.setText("Turno: " + (turnoJugador1 ? jugador1.getJugador() : jugador2.getJugador()));
                        }
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese valores validos.");
                }
            }
        });

        frame.revalidate();
        frame.repaint();
    }

    private boolean verificarGanador(JLabel[][] tablero) {
        for (int fila = 0; fila < 3; fila++) {
            if (tablero[fila][0].getText().equals(tablero[fila][1].getText()) && tablero[fila][1].getText().equals(tablero[fila][2].getText()) && !tablero[fila][0].getText().equals(" ")) {
                return true;
            }
            if (tablero[0][fila].getText().equals(tablero[1][fila].getText()) && tablero[1][fila].getText().equals(tablero[2][fila].getText()) && !tablero[0][fila].getText().equals(" ")) {
                return true;
            }
        }
        if (tablero[0][0].getText().equals(tablero[1][1].getText()) && tablero[1][1].getText().equals(tablero[2][2].getText()) && !tablero[0][0].getText().equals(" ")) {
            return true;
        }
        if (tablero[0][2].getText().equals(tablero[1][1].getText()) && tablero[1][1].getText().equals(tablero[2][0].getText()) && !tablero[0][2].getText().equals(" ")) {
            return true;
        }
        return false;
    }

    private boolean verificarEmpate(JLabel[][] tablero) {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (tablero[fila][columna].getText().equals(" ")) {
                    return false;
                }
            }
        }
        return true;
    }
}

class Registro_Usuarios {

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

class Jugador {

    private String jugador;
    private String contrasena;

    public Jugador(String jugador, String contrasena) {
        this.jugador = jugador;
        this.contrasena = contrasena;
    }

    public String getJugador() {
        return jugador;
    }

    public String getContrasena() {
        return contrasena;
    }
}
