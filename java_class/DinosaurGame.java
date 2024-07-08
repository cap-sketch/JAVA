package java_class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DinosaurGame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dinosaur Game");
        GamePanel gamePanel = new GamePanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.add(gamePanel);
        frame.setResizable(false);
        frame.setVisible(true);

        new Thread(() -> {
            while (true) {
                gamePanel.updateGame();
                try {
                    Thread.sleep(16); // Approximately 60 FPS
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

class GamePanel extends JPanel {

    private int dinosaurY = 250;
    private int velocityY = 0;
    private boolean isJumping = false;
    private boolean gameOver = false;
    private int score = 0;
    private List<Rectangle> obstacles = new ArrayList<>();
    private Random rand = new Random();

    public GamePanel() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE && !gameOver) {
                    jump();
                }
                if (e.getKeyCode() == KeyEvent.VK_R && gameOver) {
                    restartGame();
                }
            }
        });
        setFocusable(true);

        // Initialize obstacles
        addObstacle();
    }

    private void addObstacle() {
        int x = 800 + rand.nextInt(200);
        int y = 250;
        int width = 50;
        int height = 50;
        obstacles.add(new Rectangle(x, y, width, height));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw background
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw ground
        g.setColor(Color.GREEN);
        g.fillRect(0, 300, getWidth(), 100);

        // Draw dinosaur
        g.setColor(Color.BLACK);
        g.fillRect(50, dinosaurY, 50, 50);

        // Draw obstacles
        g.setColor(Color.RED);
        for (Rectangle obstacle : obstacles) {
            g.fillRect(obstacle.x, obstacle.y, obstacle.width, obstacle.height);
        }

        // Draw score
        g.setColor(Color.BLACK);
        g.drawString("Score: " + score, 700, 20);

        // Draw game over message
        if (gameOver) {
            g.setFont(new Font("Arial", Font.BOLD, 36));
            g.drawString("Game Over", 300, 200);
            g.setFont(new Font("Arial", Font.PLAIN, 18));
            g.drawString("Press 'R' to Restart", 320, 230);
        }
    }

    public void updateGame() {
        if (gameOver) return;

        if (isJumping) {
            velocityY += 1; // Gravity
            dinosaurY += velocityY;
            if (dinosaurY >= 250) {
                dinosaurY = 250;
                isJumping = false;
                velocityY = 0;
            }
        }

        List<Rectangle> newObstacles = new ArrayList<>();
        for (Rectangle obstacle : obstacles) {
            obstacle.x -= 5; // Move obstacle left
            if (obstacle.x + obstacle.width > 0) {
                newObstacles.add(obstacle);
            }
        }
        obstacles = newObstacles;

        if (rand.nextInt(100) < 2) {
            addObstacle();
        }

        for (Rectangle obstacle : obstacles) {
            if (new Rectangle(50, dinosaurY, 50, 50).intersects(obstacle)) {
                gameOver = true;
            }
        }

        if (!gameOver) {
            score++;
        }

        repaint();
    }

    public void jump() {
        if (!isJumping) {
            isJumping = true;
            velocityY = -15; // Jumping velocity
        }
    }

    public void restartGame() {
        dinosaurY = 250;
        velocityY = 0;
        isJumping = false;
        gameOver = false;
        score = 0;
        obstacles.clear();
        addObstacle();
    }
}
