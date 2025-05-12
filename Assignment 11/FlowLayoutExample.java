import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {
    public FlowLayoutExample() {
        setTitle("FlowLayout with Checkboxes");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set FlowLayout: align LEFT, hgap=10, vgap=20
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        // Create checkboxes
        JCheckBox javaCheckBox = new JCheckBox("Java");
        JCheckBox pythonCheckBox = new JCheckBox("Python");
        JCheckBox cppCheckBox = new JCheckBox("C++");

        // Add checkboxes to the frame
        add(javaCheckBox);
        add(pythonCheckBox);
        add(cppCheckBox);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}

