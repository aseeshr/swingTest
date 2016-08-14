package swingTest;

import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UserForm extends JFrame {
	private JPanel bodyPanel;
	public UserForm() {
		setSize(500, 500);
		setLayout(null);
		setTitle("User Login");
		getContentPane().add(getBodyPanel());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public JPanel getBodyPanel() {
		if(bodyPanel == null){
			bodyPanel = new JPanel(); 
			bodyPanel.setLayout(null);
			bodyPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			bodyPanel.setBackground(Color.CYAN);
			bodyPanel.setBounds(40,30,400,400);
			
//			bodyPanel.setSize(400,400);
			
		}
		return bodyPanel;
		
	}
	public static void main(String[] args) {
		new UserForm();
	}

}
