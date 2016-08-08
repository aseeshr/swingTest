package swingTest;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginForm extends JFrame {
	private JLabel userNameLbl;
	private JLabel passwordLbl;

	private JTextField userNameTxt;
	private JTextField passwordTxt;

	private JButton loginBtn;
	private JPanel bodyPanel;

	public LoginForm() {
		setSize(500, 500);
		setLayout(null);
		setTitle("Login Form ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(getUserNameLbl());//adding to contentpane
		setVisible(true);
	}

	private JPanel getBodyPanel() {
		if (bodyPanel == null) {
			bodyPanel = new JPanel();
			bodyPanel.setBounds(0,0,10,10);
			bodyPanel.add(getUserNameLbl());

		}
		return bodyPanel;
	}

	private JLabel getUserNameLbl() {
		if (userNameLbl == null) {
			userNameLbl = new JLabel("User Name");
			userNameLbl.setBounds(30, 30, 80, 20);
		}
		return userNameLbl;
	}

	public static void main(String[] args) {
		new LoginForm();
	}

}
