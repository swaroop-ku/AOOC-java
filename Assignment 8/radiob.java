import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class radiob
{
	public static void main(String args[]){
		JFrame f = new JFrame("Radio Buttons");
		f.setSize(500,300);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel l = new JLabel("Select the gender");
		l.setBounds(150,0,200,30);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(150,30,200,30);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(150,60,200,30);
		
		//group the buttons
		ButtonGroup b = new ButtonGroup();
		b.add(r1);
		b.add(r2);
		
		JButton c = new JButton("submit");
		c.setBounds(150,90,100,30);
		
		JLabel l2 = new JLabel();
		l2.setBounds(150,130,200,30);
		
		c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    String s1 = "";
					if(r1.isSelected()){
						s1 = "Male";
					}
					else if(r2.isSelected()){
						s1 = "Female";
					}
					else{
						s1 = "Not selected";
					}
                 
				l2.setText("You selected: " +s1);
            }
        });
		
		
		
		f.add(l);
		f.add(r1);
		f.add(r2);
		f.add(c);
		f.add(l2);
		f.setVisible(true);
	}
}