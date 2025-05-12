import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleTimer extends JFrame {
    private JLabel timeLabel;
    private JButton startButton, stopButton;
    private Timer timer;
    private int seconds = 0;

    public SimpleTimer() {
        setTitle("Simple Timer");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timeLabel = new JLabel("Time: 0 s");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timeLabel);

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");

        add(startButton);
        add(stopButton);

        // Create a Swing Timer to update every 1000ms (1 second)
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seconds++;
                timeLabel.setText("Time: " + seconds + " s");
            }
        });

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleTimer();
    }
}
