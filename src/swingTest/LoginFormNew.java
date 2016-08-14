package swingTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.Box;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Checkbox;

public class LoginFormNew extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JPasswordField passwordField;
	private JButton btnLogin;
	private JLabel lblUserLogin;
	private Checkbox checkbox;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFormNew frame = new LoginFormNew();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFormNew() {
		setTitle("Loginform");
		setForeground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUsername());
		contentPane.add(getTextField());
		contentPane.add(getLblNewLabel());
		contentPane.add(getPasswordField());
		contentPane.add(getBtnLogin());
		contentPane.add(getLblUserLogin());
		contentPane.add(getCheckbox());
		contentPane.add(getBtnNewButton());
	}

	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username");
			lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblUsername.setBounds(135, 109, 86, 26);
		}
		return lblUsername;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(250, 112, 118, 20);
			textField.setColumns(10);
		}
		return textField;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(135, 163, 86, 20);
		}
		return lblNewLabel;
	}

	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(250, 163, 118, 20);
		}
		return passwordField;
	}

	private JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("Login");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String un = textField.getText();
					@SuppressWarnings("deprecation")
					String psw = passwordField.getText();
					
					if(un.isEmpty()){
						JOptionPane.showMessageDialog(textField, "Username cannot be blank");
						return;
					}
					if(psw.isEmpty()){
						JOptionPane.showMessageDialog(passwordField, "Password cannot be blank");
						return;
					}
					
					if (un.equals("asee") && psw.equals("1234")) {
						JOptionPane.showMessageDialog(null, "Successfully Login");
						new Dashboard();
					}else{
						JOptionPane.showMessageDialog(null, "Login Failed");
					}

				}
			});
			btnLogin.setBackground(Color.LIGHT_GRAY);
			btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 12));
			btnLogin.setForeground(Color.BLACK);
			btnLogin.setBounds(265, 206, 89, 23);
		}
		return btnLogin;
	}

	private JLabel getLblUserLogin() {
		if (lblUserLogin == null) {
			lblUserLogin = new JLabel("User Login");
			lblUserLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblUserLogin.setBounds(217, 46, 137, 31);
		}
		return lblUserLogin;
	}
	private Checkbox getCheckbox() {
		if (checkbox == null) {
			checkbox = new Checkbox("Remember Me");
			checkbox.setBounds(259, 261, 95, 22);
		}
		return checkbox;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Clear");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					textField.setText("");
					passwordField.setText("");
				}
			});
			btnNewButton.setBounds(166, 206, 64, 20);
		}
		return btnNewButton;
	}
}
