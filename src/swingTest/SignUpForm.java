package swingTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class SignUpForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblFirstName;
	private JLabel lblSignupForm;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JLabel lblEmailAddress;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpForm frame = new SignUpForm();
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
	public SignUpForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblFirstName());
		contentPane.add(getLblSignupForm());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getComboBox());
		contentPane.add(getLblEmailAddress());
		contentPane.add(getTextField_2());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Last Name");
			lblNewLabel.setBounds(39, 112, 99, 26);
		}
		return lblNewLabel;
	}
	private JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First Name");
			lblFirstName.setBounds(39, 75, 99, 26);
		}
		return lblFirstName;
	}
	private JLabel getLblSignupForm() {
		if (lblSignupForm == null) {
			lblSignupForm = new JLabel("Signup Form");
			lblSignupForm.setFont(new Font("Times New Roman", Font.PLAIN, 22));
			lblSignupForm.setBounds(175, 38, 113, 26);
		}
		return lblSignupForm;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(185, 78, 86, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(185, 115, 86, 20);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Date of Birth");
			lblNewLabel_1.setBounds(39, 161, 99, 26);
		}
		return lblNewLabel_1;
	}
	private JComboBox getComboBox() {
		int[] year = {1990,1991,1992,1993};  
		if (comboBox == null) {
			comboBox = new JComboBox();
			
			comboBox.setBounds(211, 164, 28, 20);

		}
		return comboBox;
	}
	private JLabel getLblEmailAddress() {
		if (lblEmailAddress == null) {
			lblEmailAddress = new JLabel("Email Address");
			lblEmailAddress.setBounds(39, 213, 99, 14);
		}
		return lblEmailAddress;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(185, 210, 86, 20);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
}
