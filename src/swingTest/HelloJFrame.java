package swingTest;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HelloJFrame {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Hello JFrame");// pass Title in Jframe
		// jf.setTitle("I m Java");// set title
		jf.setSize(400, 400);
		jf.setLayout(null);
		jf.getContentPane().setBackground(Color.CYAN);

		JLabel jl = new JLabel("My first swing");
		// jl.setSize(100, 100);//gives window size
		jl.setBounds(100, 90, 222, 30);
		jl.setBorder(BorderFactory.createLineBorder(Color.green));
		jl.setText("Welcome to Java Swing");
		jf.add(jl);

		JTextField jt = new JTextField();
		jt.setBounds(50, 50, 90, 30);
		jf.add(jt);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

	}
}
