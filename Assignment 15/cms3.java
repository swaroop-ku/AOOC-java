import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class cms3 {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Crop Management System");
        frame.setSize(550, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(204, 255, 204)); // Light green

        int x = 150;  // Common X for alignment

        JLabel label = new JLabel("Welcome to CMS");
        label.setBounds(x, 20, 300, 30);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setForeground(new Color(0, 102, 0));

        JLabel l2 = new JLabel("Enter the pH of soil:");
        l2.setBounds(x, 60, 200, 25);
        l2.setForeground(new Color(0, 102, 0));

        JTextField flabel = new JTextField();
        flabel.setBounds(x, 90, 150, 25);

        JButton button = new JButton("Check Crop");
        button.setBounds(x, 130, 120, 30);
        button.setBackground(new Color(102, 204, 0));
        button.setForeground(Color.BLACK);

        JLabel cropNameLabel = new JLabel("");
        cropNameLabel.setBounds(x, 180, 300, 30);
        cropNameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        cropNameLabel.setForeground(Color.BLUE);

        JLabel cropImageLabel = new JLabel("");
        cropImageLabel.setBounds(x, 220, 200, 200);

        JTextArea cropInfoArea = new JTextArea();
        cropInfoArea.setEditable(false);
        cropInfoArea.setOpaque(false);
        cropInfoArea.setBounds(x, 440, 350, 180);
        cropInfoArea.setFont(new Font("Arial", Font.PLAIN, 13));

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double ph = Double.parseDouble(flabel.getText());

                    cropNameLabel.setText("");
                    cropImageLabel.setIcon(null);
                    cropInfoArea.setText("");

                    String cropInfo = "";
                    String cropName = "";

                    if (ph > 5.5 && ph < 6.0
                    ) {
                        cropName = "Crop: Rice (Acidic soil)";
                        cropInfo = """
                            • Soil Type: Acidic, clayey soil
                            • Water Requirement: High (flooded fields)
                            • Growth Time: 4 to 6 months
                            • Climate: Warm and humid
                            • Fertilizer Need: Nitrogen-rich fertilizers
                            • Harvesting: When grains turn golden
                        """;
                        cropImageLabel.setIcon(scaleImage("rice.jpg"));
                    } else if (ph >= 6.1 && ph <= 6.6) {
                        cropName = "Crop: Wheat (Acidic soil)";
                        cropInfo = """
                            • Soil Type: Well-drained loamy soil
                            • Water Requirement: Moderate
                            • Growth Time: 4 to 5 months
                            • Climate: Cool and dry
                            • Fertilizer Need: Balanced NPK
                            • Harvesting: When grains are golden
                        """;
                        cropImageLabel.setIcon(scaleImage("wheat.jpg"));
                    } else if (ph >= 6.7 && ph <= 7.2) {
                        cropName = "Crop: Maize (Basic soil)";
                        cropInfo = """
                            • Soil Type: Fertile, well-drained soil
                            • Water Requirement: Moderate
                            • Growth Time: 3 to 4 months
                            • Climate: Warm and sunny
                            • Fertilizer Need: High nitrogen needed
                            • Harvesting: When husks turn brown
                        """;
                        cropImageLabel.setIcon(scaleImage("maze.jpg"));
                    } else if (ph >= 7.3 && ph <= 8) {
                        cropName = "Crop: Sugarcane (Basic soil)";
                        cropInfo = """
                            • Soil Type: Fertile, well-drained basic soil
                            • Water Requirement: Very high
                            • Growth Time: 10 to 18 months
                            • Climate: Hot and sunny
                            • Fertilizer Need: Rich in nitrogen and potassium
                            • Harvesting: When stalks are firm
                        """;
                        cropImageLabel.setIcon(scaleImage("sugarcane.jpg"));
                    } else {
                        cropName = "No suitable crop found.";
                        cropInfo = "";
                    }

                    cropNameLabel.setText(cropName);
                    cropInfoArea.setText(cropInfo);

                    // Save to file
                    String phValue = flabel.getText();
                    String outputText = "Soil pH: " + phValue + "\n" +
                                        cropName + "\n" +
                                        cropInfo +
                                        "---------------------------\n";

                    try (FileWriter writer = new FileWriter("cms_output.txt", true)) {
                        writer.write(outputText);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(frame, "Error writing to file.");
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number.");
                }
            }

            private ImageIcon scaleImage(String fileName) {
                ImageIcon icon = new ImageIcon(fileName);
                Image img = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                return new ImageIcon(img);
            }
        });

        frame.add(label);
        frame.add(l2);
        frame.add(flabel);
        frame.add(button);
        frame.add(cropNameLabel);
        frame.add(cropImageLabel);
        frame.add(cropInfoArea);

        frame.setVisible(true);
    }
}
