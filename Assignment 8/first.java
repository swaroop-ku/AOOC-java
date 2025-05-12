import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class first
{
	public static void main(String args[]){
		JFrame frame = new JFrame("counter");
		frame.setSize(500,300);
		frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l1 = new JLabel("counter");
		 int[] count = {0};
		frame.add(l1);
		JButton b = new JButton();
		b.setPreferredSize(new Dimension(100, 25));
		b.setText(""+count[0]);
		JButton b1 = new JButton("count up");
		JButton b2 = new JButton("count less");
		JButton b3 = new JButton("reset");
		
		b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count[0]++; // Increment the counter
                b.setText(""+count[0]); // Update the label with the new value
            }
        });
		b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count[0]--; // Increment the counter
                b.setText(""+count[0]); // Update the label with the new value
            }
        });
		b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count[0] = 0; // Increment the counter
                b.setText(""+count[0]); // Update the label with the new value
            }
        });
		frame.add(b);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.setVisible(true);
	}
}