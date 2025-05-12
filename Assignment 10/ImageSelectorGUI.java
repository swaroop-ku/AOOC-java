import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class ImageSelectorGUI extends JFrame {
    private JComboBox<String> imageComboBox;
    private JLabel imageLabel;

    // Image file names (must match names in resources folder)
    private String[] imageNames = {"lotus.jpeg", "rose.jpg", "sunflower.jpeg"};

    public ImageSelectorGUI() {
        setTitle("Image Selector");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ComboBox with image names
        imageComboBox = new JComboBox<>(imageNames);
        add(imageComboBox, BorderLayout.NORTH);

        // Label to show the image
        imageLabel = new JLabel("", JLabel.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        // Listener for item selection
        imageComboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedImage = (String) imageComboBox.getSelectedItem();
                    URL imageUrl = getClass().getResource("/" + selectedImage);

                    if (imageUrl != null) {
                        ImageIcon icon = new ImageIcon(imageUrl);
                        Image scaledImage = icon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);
                        imageLabel.setIcon(new ImageIcon(scaledImage));
                        imageLabel.setText(""); // clear error text
                    } else {
                        imageLabel.setText("Image not found: " + selectedImage);
                        imageLabel.setIcon(null);
                    }
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageSelectorGUI();
    }
}
