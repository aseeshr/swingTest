package jTableExample;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import swingTest.LoginForm;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestJTable extends JFrame {

	private JPanel contentPane;
	private JLabel lblFirstname;
	private JLabel lblLastName;
	private JTextField firstNameTxt;
	private JTextField lastNameTxt;
	private JTextField addressTxt;
	private JTextField phoneNoTxt;
	private JLabel lblAddress;
	private JLabel lblPhoneNo;
	private JButton btnSave;
	private JScrollPane scrollPane;
	private JTable table;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnEdit;
	private JMenu mnRun;
	private JMenuItem mntmNew;
	private JMenu mnProject;
	private JMenu mnHelp;
	private JMenuItem mntmNew_1;
	private JMenuItem mntmCopy;
	private JMenuItem mntmPaste;
	private JMenuItem mntmDebug;
	private JMenuItem mntmOpenProject;
	private JMenuItem mntmWelcome;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestJTable frame = new TestJTable();
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
	public TestJTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, -19, 661, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblFirstname());
		contentPane.add(getLblLastName());
		contentPane.add(getFirstNameTxt());
		contentPane.add(getLastNameTxt());
		contentPane.add(getAddressTxt());
		contentPane.add(getPhoneNoTxt());
		contentPane.add(getLblAddress());
		contentPane.add(getLblPhoneNo());
		contentPane.add(getBtnSave());
		contentPane.add(getScrollPane());
		contentPane.add(getMenuBar_1());
		contentPane.add(getBtnNewButton());
	}

	private JLabel getLblFirstname() {
		if (lblFirstname == null) {
			lblFirstname = new JLabel("First Name");
			lblFirstname.setBounds(35, 67, 84, 14);
		}
		return lblFirstname;
	}

	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setBounds(267, 67, 84, 14);
		}
		return lblLastName;
	}

	private JTextField getFirstNameTxt() {
		if (firstNameTxt == null) {
			firstNameTxt = new JTextField();
			firstNameTxt.setBounds(129, 64, 86, 20);
			firstNameTxt.setColumns(10);
		}
		return firstNameTxt;
	}

	private JTextField getLastNameTxt() {
		if (lastNameTxt == null) {
			lastNameTxt = new JTextField();
			lastNameTxt.setColumns(10);
			lastNameTxt.setBounds(364, 64, 86, 20);
		}
		return lastNameTxt;
	}

	private JTextField getAddressTxt() {
		if (addressTxt == null) {
			addressTxt = new JTextField();
			addressTxt.setColumns(10);
			addressTxt.setBounds(129, 132, 86, 20);
		}
		return addressTxt;
	}

	private JTextField getPhoneNoTxt() {
		if (phoneNoTxt == null) {
			phoneNoTxt = new JTextField();
			phoneNoTxt.setColumns(10);
			phoneNoTxt.setBounds(364, 132, 86, 20);
		}
		return phoneNoTxt;
	}

	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(35, 135, 84, 14);
		}
		return lblAddress;
	}

	private JLabel getLblPhoneNo() {
		if (lblPhoneNo == null) {
			lblPhoneNo = new JLabel("Phone No.");
			lblPhoneNo.setBounds(267, 135, 84, 14);
		}
		return lblPhoneNo;
	}

	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("save");
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					populateData();
				}
			});
			btnSave.setBounds(482, 131, 89, 23);
		}
		return btnSave;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(45, 219, 562, 154);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(new Object[][] {},
					new String[] { "First Name", "Last Name", "Address", "Roll NO." }));
		}
		return table;
	}

	private void populateData() {

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(new Object[] { firstNameTxt.getText(), lastNameTxt.getText(), addressTxt.getText(),
				phoneNoTxt.getText() });

	}

	private void clearData() {
		firstNameTxt.setText("");
		lastNameTxt.setText("");
		addressTxt.setText("");
		phoneNoTxt.setText("");

	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBounds(0, 0, 645, 24);
			menuBar.add(getMnFile());
			menuBar.add(getMnEdit());
			menuBar.add(getMnRun());
			menuBar.add(getMnProject());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}

	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");

			mnFile.add(getMntmNew());
			mnFile.add(getMntmNew_1());
		}
		return mnFile;
	}

	private JMenu getMnEdit() {
		if (mnEdit == null) {
			mnEdit = new JMenu("Edit");
			mnEdit.add(getMntmPaste());
			mnEdit.add(getMntmCopy());
		}
		return mnEdit;
	}

	private JMenu getMnRun() {
		if (mnRun == null) {
			mnRun = new JMenu("Run");
			mnRun.add(getMntmDebug());
		}
		return mnRun;
	}

	private JMenuItem getMntmNew() {
		if (mntmNew == null) {
			mntmNew = new JMenuItem("save");
		}
		return mntmNew;
	}

	private JMenu getMnProject() {
		if (mnProject == null) {
			mnProject = new JMenu("Project");
			mnProject.add(getMntmOpenProject());
		}
		return mnProject;
	}

	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmWelcome());
		}
		return mnHelp;
	}

	private JMenuItem getMntmNew_1() {
		if (mntmNew_1 == null) {
			mntmNew_1 = new JMenuItem("New");
			mntmNew_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new LoginForm();
				}
			});
		}
		return mntmNew_1;
	}

	private JMenuItem getMntmCopy() {
		if (mntmCopy == null) {
			mntmCopy = new JMenuItem("Copy");
		}
		return mntmCopy;
	}

	private JMenuItem getMntmPaste() {
		if (mntmPaste == null) {
			mntmPaste = new JMenuItem("Paste");
		}
		return mntmPaste;
	}

	private JMenuItem getMntmDebug() {
		if (mntmDebug == null) {
			mntmDebug = new JMenuItem("Debug");
		}
		return mntmDebug;
	}

	private JMenuItem getMntmOpenProject() {
		if (mntmOpenProject == null) {
			mntmOpenProject = new JMenuItem("Open Project");
		}
		return mntmOpenProject;
	}

	private JMenuItem getMntmWelcome() {
		if (mntmWelcome == null) {
			mntmWelcome = new JMenuItem("Welcome");
		}
		return mntmWelcome;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Clear");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					clearData();

				}
			});
			btnNewButton.setBounds(482, 177, 89, 23);
		}
		return btnNewButton;
	}
}
