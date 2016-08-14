package swingTest;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {
	private JLabel userNameLbl;
	private JLabel passwordLbl;

	private JTextField userNameTxt;

	private JButton loginBtn;
	private JPanel bodyPanel;
	private JPasswordField passwordTxt;

	public LoginForm() {
		setSize(500, 500);
		setLayout(null);
		setTitle("Login Form ");
		getContentPane().add(getBodyPanel());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private JPanel getBodyPanel() {
		if (bodyPanel == null) {
			bodyPanel = new JPanel();
			bodyPanel.setLayout(null);
			bodyPanel.setBounds(30, 30, 400, 400);
			bodyPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			bodyPanel.add(getUserNameLbl());
			bodyPanel.add(getPasswordLbl());
			bodyPanel.add(userNameTxt());
			bodyPanel.add(getPasswordTxt());
			bodyPanel.add(getLoginButton());

		}
		return bodyPanel;
	}

	private JLabel getUserNameLbl() {
		if (userNameLbl == null) {
			userNameLbl = new JLabel("User Name");
			userNameLbl.setBounds(10, 30, 80, 20);
			userNameLbl.setBorder(BorderFactory.createLineBorder(Color.black));

		}
		return userNameLbl;
	}

	private JTextField userNameTxt() {
		if (userNameTxt == null) {
			userNameTxt = new JTextField();
			userNameTxt.setBounds(130, 30, 100, 20);
			userNameTxt.setBorder(BorderFactory.createLineBorder(Color.black));
		}
		return userNameTxt;

	}

	private JPasswordField getPasswordTxt() {
		if (passwordTxt == null) {
			passwordTxt = new JPasswordField();
			passwordTxt.setBounds(130, 60, 100, 20);
			passwordTxt.setBorder(BorderFactory.createLineBorder(Color.black));
		}
		return passwordTxt;

	}

	private JLabel getPasswordLbl() {
		if (passwordLbl == null) {
			passwordLbl = new JLabel("Password");
			passwordLbl.setBounds(10, 60, 80, 20);
			passwordLbl.setBorder(BorderFactory.createLineBorder(Color.black));
		}

		return passwordLbl;
	}
	
	private JButton getLoginButton(){
		
		if(loginBtn == null){
			loginBtn = new JButton("Login");
			loginBtn.setBounds(130, 100, 70, 20);
			loginBtn.setBorder(BorderFactory.createLineBorder(Color.black));
			
		}
		return loginBtn;
		
	}

	public static void main(String[] args) {
		new LoginForm();
	}

}
