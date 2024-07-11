/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio1_q2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class SnakeGame extends JPanel implements ActionListener {
    private final int TILE_SIZE = 20; // Tamaño de cada celda en píxeles
    private final int BOARD_SIZE = 20; // Tamaño del tablero (número de celdas)
    private ArrayList<Point> snake; // Lista que almacena las coordenadas de la serpiente
    private Point fruit; // Coordenadas de la fruta
    private int direction; // Dirección actual de movimiento de la serpiente
    private Timer timer; // Temporizador para controlar la velocidad del juego

    public SnakeGame() {
        snake = new ArrayList<>();
        snake.add(new Point(10, 10)); // Comenzamos con la serpiente de tamaño 1 en el centro
        generateFruit(); // Generamos la fruta en una posición aleatoria

        direction = KeyEvent.VK_RIGHT; // Dirección inicial: derecha

        timer = new Timer(100, this); // Temporizador que llama al ActionListener cada 100 ms
        timer.start(); // Iniciar el temporizador
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar la fruta
        g.setColor(Color.RED);
        g.fillRect(fruit.x * TILE_SIZE, fruit.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

        // Dibujar la serpiente
        g.setColor(Color.GREEN);
        for (Point p : snake) {
            g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
        }
    }

    public void actionPerformed(ActionEvent e) {
        move(); // Mover la serpiente en cada tick del temporizador
        checkCollision(); // Comprobar colisiones
        repaint(); // Volver a dibujar el juego
    }

    public void move() {
        // Mover la serpiente añadiendo una nueva cabeza y eliminando la cola
        Point head = new Point(snake.get(0));
        switch (direction) {
            case KeyEvent.VK_UP:
                head.y--;
                break;
            case KeyEvent.VK_DOWN:
                head.y++;
                break;
            case KeyEvent.VK_LEFT:
                head.x--;
                break;
            case KeyEvent.VK_RIGHT:
                head.x++;
                break;
        }
        snake.add(0, head);
        snake.remove(snake.size() - 1);
    }

    public void checkCollision() {
        // Comprobar si la serpiente choca consigo misma o con los bordes
        Point head = snake.get(0);

        // Colisión con los bordes
        if (head.x < 0 || head.x >= BOARD_SIZE || head.y < 0 || head.y >= BOARD_SIZE) {
            gameOver();
        }

        // Colisión consigo misma
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                gameOver();
            }
        }

        // Comprobar si la serpiente ha comido la fruta
        if (head.equals(fruit)) {
            snake.add(new Point(fruit));
            generateFruit();
        }
    }

    public void generateFruit() {
        // Generar una nueva fruta en una posición aleatoria que no esté ocupada por la serpiente
        Random random = new Random();
        do {
            fruit = new Point(random.nextInt(BOARD_SIZE), random.nextInt(BOARD_SIZE));
        } while (snake.contains(fruit));
    }

    public void gameOver() {
        timer.stop(); // Detener el temporizador
        JOptionPane.showMessageDialog(this, "Game Over!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame();
        frame.add(game);
        frame.setSize(game.BOARD_SIZE * game.TILE_SIZE, game.BOARD_SIZE * game.TILE_SIZE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Capturar las teclas de dirección para cambiar la dirección de la serpiente
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if ((key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT ||
                     key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) &&
                    (key != game.direction + 2 && key != game.direction - 2)) {
                    game.direction = key;
                }
            }
        });
    }
}