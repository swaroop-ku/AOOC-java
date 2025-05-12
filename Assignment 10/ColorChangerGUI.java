import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangerGUI extends JFrame {
    private JComboBox<String> colorComboBox;
    private JPanel contentPanel;

    public ColorChangerGUI() {
        setTitle("Background Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Panel to change background
        contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout());

        // Color options
        String[] colors = {"White", "Red", "Green", "Blue", "Yellow", "Orange", "Pink"};
        colorComboBox = new JComboBox<>(colors);

        contentPanel.add(new JLabel("Select Background Color:"));
        contentPanel.add(colorComboBox);

        // Add listener to combo box
        colorComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) colorComboBox.getSelectedItem();
                switch (selectedColor) {
                    case "Red":
                        contentPanel.setBackground(Color.RED);
                        break;
                    case "Green":
                        contentPanel.setBackground(Color.GREEN);
                        break;
                    case "Blue":
                        contentPanel.setBackground(Color.BLUE);
                        break;
                    case "Yellow":
                        contentPanel.setBackground(Color.YELLOW);
                        break;
                    case "Orange":
                        contentPanel.setBackground(Color.ORANGE);
                        break;
                    case "Pink":
                        contentPanel.setBackground(Color.PINK);
                        break;
                    default:
                        contentPanel.setBackground(Color.WHITE);
                }
            }
        });

        add(contentPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChangerGUI();
    }
}

