import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class reverse
{
	public static void main(String args[]){
		JFrame f = new JFrame("Reverse the number");
		f.setSize(500,300);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create a label
		JLabel l1 = new JLabel("Enter the number");
		l1.setBounds(150,0,100,30);
		
		JTextField t = new JTextField(20);
		t.setBounds(150, 30, 100, 20); 
		
		//int s = Integer.parseInt(t.getText());
		JLabel l2 = new JLabel();
		l2.setBounds(150,100,200,30);
		
		
		JButton b = new JButton("Reverse");
		b.setBounds(150,60,100,30);


		 b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int s = Integer.parseInt(t.getText());
					int rem,rev=0;
					while(s != 0){
						rem = s%10;
						rev = (rev*10)+rem;
						s = s/10;
					}
					l2.setText("Reversed Number: "+rev);
                } catch (NumberFormatException ex) {
                    l2.setText("Invalid number");
                }
            }
        });
		
		f.add(l1);
		f.add(t);
		f.add(b);
		f.add(l2);
		//make the frame visible
		f.setVisible(true);
	}
}