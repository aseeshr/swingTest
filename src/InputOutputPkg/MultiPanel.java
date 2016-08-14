package InputOutputPkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MultiPanel extends JFrame {

	private JPanel contentPane;
	private JPanel inputPanel;
	private JLabel nameNbl;
	private JTextField nameTxt;
	private JLabel addressLbl;
	private JTextField addressTxt;
	private JLabel genderLbl;
	private JLabel collegeLbl;
	private JComboBox collegeCmb;
	private JRadioButton maleRdbtn;
	private JRadioButton femaleRdbtn;
	private JLabel emailLbl;
	private JCheckBox emailChckbx;
	private JButton btnSave;
	private JPanel outputPanel;
	private JLabel outNameLbl;
	private JTextField outNameTxt;
	private JLabel outAddressLbl;
	private JTextField outAddressTxt;
	private JLabel label_2;
	private JLabel label_3;
	private JComboBox outputCollegeChckbx;
	private JRadioButton outMaleRtb;
	private JRadioButton outFemaleRbt;
	private JLabel label_4;
	private JCheckBox outEmailChckbx;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiPanel frame = new MultiPanel();
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
	public MultiPanel() {
		setTitle("Multi Panel Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getInputPanel());
		contentPane.add(getOutputPanel());

	}

	private JPanel getInputPanel() {
		if (inputPanel == null) {
			inputPanel = new JPanel();
			inputPanel.setBorder(
					new TitledBorder(null, "InputPanel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			inputPanel.setBounds(63, 28, 528, 138);
			inputPanel.setLayout(null);
			inputPanel.add(getNameNbl());
			inputPanel.add(getNameTxt());
			inputPanel.add(getAddressLbl());
			inputPanel.add(getAddressTxt());
			inputPanel.add(getGenderLbl());
			inputPanel.add(getCollegeLbl());
			inputPanel.add(getCollegeCmb());
			inputPanel.add(getMaleRdbtn());
			inputPanel.add(getFemaleRdbtn());
			inputPanel.add(getEmailLbl());
			inputPanel.add(getEmailChckbx());
			inputPanel.add(getBtnSave());
		}
		return inputPanel;
	}

	private JLabel getNameNbl() {
		if (nameNbl == null) {
			nameNbl = new JLabel("Name");
			nameNbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			nameNbl.setBounds(32, 24, 63, 20);
		}
		return nameNbl;
	}

	private JTextField getNameTxt() {
		if (nameTxt == null) {
			nameTxt = new JTextField();
			nameTxt.setBounds(105, 25, 86, 20);
			nameTxt.setColumns(10);
		}
		return nameTxt;
	}

	private JLabel getAddressLbl() {
		if (addressLbl == null) {
			addressLbl = new JLabel("Address");
			addressLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			addressLbl.setBounds(201, 25, 56, 18);
		}
		return addressLbl;
	}

	private JTextField getAddressTxt() {
		if (addressTxt == null) {
			addressTxt = new JTextField();
			addressTxt.setBounds(267, 24, 86, 20);
			addressTxt.setColumns(10);
		}
		return addressTxt;
	}

	private JLabel getGenderLbl() {
		if (genderLbl == null) {
			genderLbl = new JLabel("Gender");
			genderLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			genderLbl.setBounds(32, 72, 63, 14);
		}
		return genderLbl;
	}

	private JLabel getCollegeLbl() {
		if (collegeLbl == null) {
			collegeLbl = new JLabel("College");
			collegeLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			collegeLbl.setBounds(363, 27, 41, 14);
		}
		return collegeLbl;
	}

	private JComboBox getCollegeCmb() {
		if (collegeCmb == null) {
			collegeCmb = new JComboBox();
			collegeCmb.setFont(new Font("Tahoma", Font.PLAIN, 12));
			collegeCmb.setModel(new DefaultComboBoxModel(
					new String[] { "select college", "KEC", "NCC", "NCIT", "LCC", "JEC", "ABC" }));
			collegeCmb.setBounds(414, 24, 104, 20);
		}
		return collegeCmb;
	}

	private JRadioButton getMaleRdbtn() {
		if (maleRdbtn == null) {
			maleRdbtn = new JRadioButton("Male");
			buttonGroup.add(maleRdbtn);
			maleRdbtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
			maleRdbtn.setBounds(105, 68, 56, 23);
		}
		return maleRdbtn;
	}

	private JRadioButton getFemaleRdbtn() {
		if (femaleRdbtn == null) {
			femaleRdbtn = new JRadioButton("Female");
			femaleRdbtn.setSelected(true);
			buttonGroup.add(femaleRdbtn);
			femaleRdbtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
			femaleRdbtn.setBounds(169, 68, 63, 23);
		}
		return femaleRdbtn;
	}

	private JLabel getEmailLbl() {
		if (emailLbl == null) {
			emailLbl = new JLabel("Email");
			emailLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			emailLbl.setBounds(293, 76, 35, 14);
		}
		return emailLbl;
	}

	private JCheckBox getEmailChckbx() {
		if (emailChckbx == null) {
			emailChckbx = new JCheckBox("");
			emailChckbx.setBounds(348, 72, 21, 23);
		}
		return emailChckbx;
	}

	private JButton getBtnSave() {

		if (btnSave == null) {
			btnSave = new JButton("Save");

			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

					String inNameTxt, inAddressTxt, inCollegeCmb;
					boolean inEmailChk;
					boolean inFemaleRb;
					boolean inMaleRb;

					inNameTxt = nameTxt.getText();
					inAddressTxt = addressTxt.getText();
					inCollegeCmb = (String) collegeCmb.getSelectedItem();

					inEmailChk = emailChckbx.isSelected();
					inMaleRb = maleRdbtn.isSelected();
					inFemaleRb = femaleRdbtn.isSelected();

					if (inNameTxt.isEmpty() || inAddressTxt.isEmpty() || inCollegeCmb.isEmpty()) {
						JOptionPane.showMessageDialog(nameTxt, "Some Field is Missing");
					} else {
						outNameTxt.setText(inNameTxt);
						outAddressTxt.setText(inAddressTxt);
						outputCollegeChckbx.setSelectedItem(inCollegeCmb);

						if (inMaleRb) {
							outMaleRtb.setSelected(true);

						} else {
							outFemaleRbt.setSelected(true);
						}

						if (emailChckbx.isSelected()) {
							outEmailChckbx.setSelected(true);
						} else {
							outEmailChckbx.setSelected(false);
						}
						// clear data
						nameTxt.setText("");
						addressTxt.setText("");
						collegeCmb.setSelectedIndex(0);
						buttonGroup.clearSelection();
						emailChckbx.setSelected(false);

						// disable input panel
						Component[] cmpList = inputPanel.getComponents();
						for (Component cmp : cmpList) {
							cmp.setEnabled(false);
						}
					}

				}
			});
			btnSave.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnSave.setBounds(429, 68, 89, 23);
		}
		return btnSave;
	}

	private JPanel getOutputPanel() {
		if (outputPanel == null) {
			outputPanel = new JPanel();
			outputPanel.setLayout(null);
			outputPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "OutputPanel",
					TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			outputPanel.setBounds(63, 228, 528, 138);
			outputPanel.add(getOutNameLbl());
			outputPanel.add(getOutNameTxt());
			outputPanel.add(getOutAddressLbl());
			outputPanel.add(getOutAddressTxt());
			outputPanel.add(getLabel_2());
			outputPanel.add(getLabel_3());
			outputPanel.add(getOutputCollegeChckbx());
			outputPanel.add(getOutMaleRtb());
			outputPanel.add(getOutFemaleRbt());
			outputPanel.add(getLabel_4());
			outputPanel.add(getOutEmailChckbx());
			outputPanel.add(getBtnBack());

		}
		return outputPanel;
	}

	private JLabel getOutNameLbl() {
		if (outNameLbl == null) {
			outNameLbl = new JLabel("Name");
			outNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			outNameLbl.setBounds(32, 24, 63, 20);
		}
		return outNameLbl;
	}

	private JTextField getOutNameTxt() {
		if (outNameTxt == null) {
			outNameTxt = new JTextField();
			outNameTxt.setEnabled(false);
			outNameTxt.setColumns(10);
			outNameTxt.setBounds(105, 25, 86, 20);
		}
		return outNameTxt;
	}

	private JLabel getOutAddressLbl() {
		if (outAddressLbl == null) {
			outAddressLbl = new JLabel("Address");
			outAddressLbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
			outAddressLbl.setBounds(201, 25, 56, 18);
		}
		return outAddressLbl;
	}

	private JTextField getOutAddressTxt() {
		if (outAddressTxt == null) {
			outAddressTxt = new JTextField();
			outAddressTxt.setEnabled(false);
			outAddressTxt.setColumns(10);
			outAddressTxt.setBounds(267, 24, 86, 20);
		}
		return outAddressTxt;
	}

	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Gender");
			label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_2.setBounds(32, 72, 63, 14);
		}
		return label_2;
	}

	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("College");
			label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_3.setBounds(363, 27, 41, 14);
		}
		return label_3;
	}

	private JComboBox getOutputCollegeChckbx() {
		if (outputCollegeChckbx == null) {
			outputCollegeChckbx = new JComboBox();
			outputCollegeChckbx.setEnabled(false);
			outputCollegeChckbx.setModel(new DefaultComboBoxModel(
					new String[] { "select college", "KEC", "NCC", "NCIT", "LCC", "JEC", "ABC" }));
			outputCollegeChckbx.setFont(new Font("Tahoma", Font.PLAIN, 12));
			outputCollegeChckbx.setBounds(414, 24, 104, 20);
		}
		return outputCollegeChckbx;
	}

	private JRadioButton getOutMaleRtb() {
		if (outMaleRtb == null) {
			outMaleRtb = new JRadioButton("Male");
			buttonGroup_1.add(outMaleRtb);
			outMaleRtb.setEnabled(false);
			outMaleRtb.setFont(new Font("Tahoma", Font.PLAIN, 12));
			outMaleRtb.setBounds(105, 68, 56, 23);
		}
		return outMaleRtb;
	}

	private JRadioButton getOutFemaleRbt() {
		if (outFemaleRbt == null) {
			outFemaleRbt = new JRadioButton("Female");
			outFemaleRbt.setSelected(true);
			buttonGroup_1.add(outFemaleRbt);
			outFemaleRbt.setEnabled(false);
			outFemaleRbt.setFont(new Font("Tahoma", Font.PLAIN, 12));
			outFemaleRbt.setBounds(169, 68, 63, 23);
		}
		return outFemaleRbt;
	}

	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Email");
			label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_4.setBounds(293, 72, 35, 14);
		}
		return label_4;
	}

	private JCheckBox getOutEmailChckbx() {
		if (outEmailChckbx == null) {
			outEmailChckbx = new JCheckBox("");
			outEmailChckbx.setEnabled(false);
			outEmailChckbx.setBounds(348, 72, 21, 18);
		}
		return outEmailChckbx;
	}

	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					// enable input panel
					Component[] cmpList = inputPanel.getComponents();
					for (Component cmp : cmpList) {
						cmp.setEnabled(true);
					}
				}
			});
			btnBack.setBounds(414, 104, 89, 23);
		}
		return btnBack;
	}
}
