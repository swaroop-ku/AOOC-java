import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopwatchApp extends JFrame {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private volatile boolean running = false;
    private int seconds = 0;

    public StopwatchApp() {
        setTitle("Stopwatch");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        timeLabel = new JLabel("00:00:00", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        add(timeLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);
        add(buttonPanel, BorderLayout.SOUTH);

        startButton.addActionListener(e -> startStopwatch());
        stopButton.addActionListener(e -> stopStopwatch());
        resetButton.addActionListener(e -> resetStopwatch());
    }

    private void startStopwatch() {
        if (running) return;
        running = true;

        Thread thread = new Thread(() -> {
            while (running) {
                try {
                    Thread.sleep(1000);
                    seconds++;
                    SwingUtilities.invokeLater(() -> timeLabel.setText(formatTime(seconds)));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }

    private void stopStopwatch() {
        running = false;
    }

    private void resetStopwatch() {
        running = false;
        seconds = 0;
        timeLabel.setText("00:00:00");
    }

    private String formatTime(int totalSeconds) {
        int hrs = totalSeconds / 3600;
        int mins = (totalSeconds % 3600) / 60;
        int secs = totalSeconds % 60;
        return String.format("%02d:%02d:%02d", hrs, mins, secs);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StopwatchApp app = new StopwatchApp();
            app.setVisible(true);
        });
    }
}

