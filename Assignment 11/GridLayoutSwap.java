import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutSwap extends JFrame {
    private JButton[] buttons = new JButton[6];

    public GridLayoutSwap() {
        setTitle("GridLayout Swap");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 3, 10, 10));  // 2 rows x 3 columns with gaps

        // Initialize buttons with numbers 1 to 6
        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
            buttons[i].addActionListener(new SwapListener());
            add(buttons[i]);
        }

        setVisible(true);
    }

    // Listener to handle button clicks and swapping with "1"
    private class SwapListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton clicked = (JButton) e.getSource();
            JButton buttonWith1 = null;

            // Find the button with text "1"
            for (JButton btn : buttons) {
                if (btn.getText().equals("1")) {
                    buttonWith1 = btn;
                    break;
                }
            }

            if (buttonWith1 != null && clicked != buttonWith1) {
                // Swap text
                String temp = clicked.getText();
                clicked.setText("1");
                buttonWith1.setText(temp);
            }
        }
    }

    public static void main(String[] args) {
        new GridLayoutSwap();
    }
}

