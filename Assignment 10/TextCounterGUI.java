import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextCounterGUI extends JFrame {
    private JTextArea textArea;
    private JLabel countLabel;

    public TextCounterGUI() {
        setTitle("Text Counter");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create text area
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Create label to show counts
        countLabel = new JLabel("Characters: 0 | Words: 0");
        countLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        add(countLabel, BorderLayout.SOUTH);

        // Add key listener for real-time update
        textArea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                updateCounts();
            }
        });

        setVisible(true);
    }

    private void updateCounts() {
        String text = textArea.getText();
        int charCount = text.length();
        int wordCount = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;

        countLabel.setText("Characters: " + charCount + " | Words: " + wordCount);
    }

    public static void main(String[] args) {
        new TextCounterGUI();
    }
}
