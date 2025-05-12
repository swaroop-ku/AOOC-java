import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBallApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        BallPanel ballPanel = new BallPanel();
        frame.add(ballPanel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class BallPanel extends JPanel implements MouseListener {
    private int x = 100, y = 100; // Ball position
    private int radius = 20;
    private int dx = 2, dy = 3; // Ball velocity
    private boolean running = false;

    public BallPanel() {
        addMouseListener(this);
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, radius * 2, radius * 2);
    }

    private void startAnimation() {
        if (running) return;
        running = true;
        Runnable r = () -> {
            while (true) {
                x += dx;
                y += dy;

                // Bounce off the edges
                if (x <= 0 || x + 2 * radius >= getWidth()) {
                    dx = -dx;
                }
                if (y <= 0 || y + 2 * radius >= getHeight()) {
                    dy = -dy;
                }

                repaint();
                try {
                    Thread.sleep(10); // adjust speed
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(r);
        thread.start();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        startAnimation();
    }

    // Unused mouse events
    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
