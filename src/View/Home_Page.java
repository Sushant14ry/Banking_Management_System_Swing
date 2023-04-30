package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;

public class Home_Page extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_2;
	private JLabel lblNewLabel_1_1_1_3;
	private JLabel lblNewLabel_1_1_1_3_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JDateChooser dateChooser;
	private JComboBox comboBox;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JComboBox comboBox_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnFemale;
	private JLabel lblNewLabel_1_2_1_1;
	private JLabel lblNewLabel_1_1_1_3_1_1;
	private JLabel lblNewLabel_1_2_1;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	private JTextField textField_9;
	private JLabel lblNewLabel_1_2_1_2;
	private JSeparator separator;
	private JButton btnSave;
	private JButton btnNewButton_1_1;
	private JLabel lblNewLabel_1_1_1_4;
	private JTextField textField_10;
	private JLabel lblNewLabel_1_1_1_4_1;
	private JTextField textField_11;
	private JLabel lblNewLabel_1_1_1_4_1_1;
	private JTextField textField_12;
	private JTextField textField_13;
	private JButton btnTotal;
	private JButton btnDeposite;
	private JLabel lblNewLabel_1_1_1_4_1_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2_1_1;
	private JLabel lblNewLabel_2_1_1_1;
	private JLabel lblNewLabel_2_1_1_1_1;
	private JLabel lblNewLabel_2_1_1_1_1_1;
	private JButton btnSearch;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1;
	private JButton btnTotal_1;
	private JTextField textField_14;
	private JTextField textField_15;
	private JLabel lblNewLabel_1_1_1_4_1_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_3;
	private JLabel lblNewLabel_1_1_1_4_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_2;
	private JTextField textField_17;
	private JLabel lblNewLabel_2_1_1_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_1_1_1;
	private JLabel lblNewLabel_2_1_2;
	private JLabel lblNewLabel_2_2;
	private JLabel lblNewLabel_1_1_1_4_2_1;
	private JTextField textField_18;
	private JLabel lblNewLabel_2_2_1;
	private JButton btnSearch_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_2_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_3_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1;
	private JLabel lblNewLabel_2_2_1_1;
	private JLabel lblNewLabel_2_2_1_1_1;
	private JTextField textField_16;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1;
	private JLabel lblNewLabel_2_2_1_1_1_1;
	private JButton btnSearch_1_1_1;
	private JSeparator separator_1;
	private JLabel lblNewLabel_1_1_1_4_3;
	private JTextField textField_19;
	private JButton btnSearch_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_3;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_1;
	private JTextField textField_20;
	private JTextField textField_21;
	private JLabel lblNewLabel_2_1_1_1_1_3;
	private JLabel lblNewLabel_2_1_1_1_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_2;
	private JLabel lblNewLabel_2_1_1_2;
	private JLabel lblNewLabel_2_1_3;
	private JLabel lblNewLabel_2_3;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_4;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_3;
	private JLabel lblNewLabel_1_1_1_4_1_1_3;
	private JLabel lblNewLabel_1_1_1_4_1_1_3_1;
	private JLabel lblNewLabel_2_1_1_1_1_1_2_1;
	private JTextField textField_22;
	private JButton btnSearch_1_2;
	private JButton btnSearch_1_2_1;
	private JScrollPane scrollPane;
	private JTable table;
	private JScrollPane scrollPane_1;
	private JTable table_1;
	private JLabel lblNewLabel_1_1_1_4_4;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_5;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_3;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2;
	private JLabel lblNewLabel_2_1_1_1_3;
	private JLabel lblNewLabel_2_1_1_3;
	private JLabel lblNewLabel_2_1_4;
	private JLabel lblNewLabel_2_4;
	private JTextField textField_23;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_4;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_3;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_2;
	private JButton btnSearch_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2_1;
	private JLabel lblNewLabel_2_1_1_1_3_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1;
	private JLabel lblNewLabel_2_1_1_1_3_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2;
	private JLabel lblNewLabel_2_1_1_1_3_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1;
	private JLabel lblNewLabel_2_1_1_1_3_1_2_1;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1;
	private JLabel lblNewLabel_1_1_1_4_5;
	private JTextField textField_24;
	private JLabel lblNewLabel_1_1_1_4_5_1;
	private JTextField textField_25;
	private JLabel lblNewLabel_1_1_1_4_5_2;
	private JTextField textField_26;
	private JButton btnSearch_2_1;
	private JButton btnSearch_2_1_1;
	private JPanel panel_1_1;
	private JLabel lblName;
	private JLabel lblSushantChaudhary;
	private JLabel lblCsushantgmailcom;
	private JLabel lblEmail_1;
	private JLabel lblPhone_1;
	private JLabel lblSushantChaudhary_1;
	private JLabel lblSushantChaudhary_1_1;
	private JLabel lblAdress;
	private JLabel lblKalankiKathmandu;
	private JLabel lblWebsite;
	private JLabel lblSushantChaudhary_1_2;
	private JPanel panel_9;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_1_1;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_3_1_1_1;
	private JLabel lblNewLabel_3_1_2;
	private JLabel lblNewLabel_3_1_1_1_1;
	private JPanel panel_10;
	private JLabel lblNewLabel_4;
	private JTextField textField_27;
	private JButton btnSearch_1_1_2;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_6;
	private JLabel lblNewLabel_2_1_5;
	private JLabel lblNewLabel_1_1_1_4_1_1_1_6_1;
	private JLabel lblNewLabel_2_1_5_1;
	private JSeparator separator_2;
	private JTextField textField_28;
	private JTextField textField_29;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Page frame = new Home_Page();
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
	public Home_Page() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 829, 645);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getTabbedPane());
		contentPane.add(getSeparator());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("iBanking");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel.setBounds(42, 31, 177, 72);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Acc_No");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(414, 31, 81, 21);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Date");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(414, 74, 51, 21);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(505, 26, 190, 30);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(505, 72, 190, 30);
		}
		return textField_1;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Show");
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnNewButton.setBounds(705, 24, 81, 32);
		}
		return btnNewButton;
	}
	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(22, 140, 764, 446);
			tabbedPane.addTab("Profile", null, getPanel(), null);
			tabbedPane.addTab("Deposite", null, getPanel_1(), null);
			tabbedPane.addTab("Withdrawal", null, getPanel_3(), null);
			tabbedPane.addTab("Customer List", null, getPanel_4(), null);
			tabbedPane.addTab("Transaction\r\n", null, getPanel_5(), null);
			tabbedPane.addTab("View Balance", null, getPanel_6(), null);
			tabbedPane.addTab("Transfer", null, getPanel_2(), null);
			tabbedPane.addTab("Change Pin", null, getPanel_7(), null);
			tabbedPane.addTab("About Us", null, getPanel_8(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getLblNewLabel_1_1_1());
			panel.add(getLblNewLabel_1_1_1_1());
			panel.add(getLblNewLabel_1_1_1_1_1());
			panel.add(getLblNewLabel_1_1_1_2());
			panel.add(getLblNewLabel_1_1_1_3());
			panel.add(getLblNewLabel_1_1_1_3_1());
			panel.add(getTextField_2());
			panel.add(getTextField_3());
			panel.add(getTextField_4());
			panel.add(getTextField_5());
			panel.add(getDateChooser());
			panel.add(getComboBox());
			panel.add(getTextField_6());
			panel.add(getTextField_7());
			panel.add(getTextField_8());
			panel.add(getComboBox_1());
			panel.add(getRdbtnNewRadioButton());
			panel.add(getRdbtnFemale());
			panel.add(getLblNewLabel_1_2_1_1());
			panel.add(getLblNewLabel_1_1_1_3_1_1());
			panel.add(getLblNewLabel_1_2_1());
			panel.add(getLblNewLabel_1_2());
			panel.add(getLblNewLabel_1_3());
			panel.add(getTextField_9());
			panel.add(getLblNewLabel_1_2_1_2());
			panel.add(getBtnSave());
			panel.add(getBtnNewButton_1_1());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.add(getLblNewLabel_1_1_1_4());
			panel_1.add(getTextField_10());
			panel_1.add(getLblNewLabel_1_1_1_4_1());
			panel_1.add(getTextField_11());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1());
			panel_1.add(getTextField_12());
			panel_1.add(getTextField_13());
			panel_1.add(getBtnTotal());
			panel_1.add(getBtnDeposite());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_1());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_1_1());
			panel_1.add(getLblNewLabel_2());
			panel_1.add(getLblNewLabel_2_1());
			panel_1.add(getLblNewLabel_2_1_1());
			panel_1.add(getLblNewLabel_2_1_1_1());
			panel_1.add(getLblNewLabel_2_1_1_1_1());
			panel_1.add(getLblNewLabel_2_1_1_1_1_1());
			panel_1.add(getBtnSearch());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_2());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_2_1());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_6());
			panel_1.add(getLblNewLabel_2_1_5());
			panel_1.add(getLblNewLabel_1_1_1_4_1_1_1_6_1());
			panel_1.add(getLblNewLabel_2_1_5_1());
			panel_1.add(getSeparator_2());
			panel_1.add(getTextField_28());
			panel_1.add(getTextField_29());
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.add(getBtnTotal_1());
			panel_2.add(getTextField_14());
			panel_2.add(getTextField_15());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_2());
			panel_2.add(getLblNewLabel_1_1_1_4_1_2());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_3());
			panel_2.add(getLblNewLabel_1_1_1_4_2());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_2_2());
			panel_2.add(getTextField_17());
			panel_2.add(getLblNewLabel_2_1_1_1_1_2());
			panel_2.add(getLblNewLabel_2_1_1_1_1_1_1());
			panel_2.add(getLblNewLabel_2_1_2());
			panel_2.add(getLblNewLabel_2_2());
			panel_2.add(getLblNewLabel_1_1_1_4_2_1());
			panel_2.add(getTextField_18());
			panel_2.add(getLblNewLabel_2_2_1());
			panel_2.add(getBtnSearch_1_1());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_2_2_1());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_3_1());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_1_1());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1());
			panel_2.add(getLblNewLabel_2_2_1_1());
			panel_2.add(getLblNewLabel_2_2_1_1_1());
			panel_2.add(getTextField_16());
			panel_2.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1());
			panel_2.add(getLblNewLabel_2_2_1_1_1_1());
			panel_2.add(getBtnSearch_1_1_1());
			panel_2.add(getSeparator_1());
			panel_2.add(getTextField_27());
			panel_2.add(getBtnSearch_1_1_2());
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(null);
			panel_3.add(getLblNewLabel_1_1_1_4_3());
			panel_3.add(getTextField_19());
			panel_3.add(getBtnSearch_1());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_1_2_3());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_2());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_1());
			panel_3.add(getTextField_20());
			panel_3.add(getTextField_21());
			panel_3.add(getLblNewLabel_2_1_1_1_1_3());
			panel_3.add(getLblNewLabel_2_1_1_1_1_1_2());
			panel_3.add(getLblNewLabel_2_1_1_1_2());
			panel_3.add(getLblNewLabel_2_1_1_2());
			panel_3.add(getLblNewLabel_2_1_3());
			panel_3.add(getLblNewLabel_2_3());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_1_4());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_1_1_2());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_1());
			panel_3.add(getLblNewLabel_1_1_1_4_1_3());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_3());
			panel_3.add(getLblNewLabel_1_1_1_4_1_1_3_1());
			panel_3.add(getLblNewLabel_2_1_1_1_1_1_2_1());
			panel_3.add(getTextField_22());
			panel_3.add(getBtnSearch_1_2());
			panel_3.add(getBtnSearch_1_2_1());
		}
		return panel_3;
	}
	private JPanel getPanel_4() {
		if (panel_4 == null) {
			panel_4 = new JPanel();
			panel_4.setLayout(null);
			panel_4.add(getScrollPane());
		}
		return panel_4;
	}
	private JPanel getPanel_5() {
		if (panel_5 == null) {
			panel_5 = new JPanel();
			panel_5.setLayout(null);
			panel_5.add(getScrollPane_1());
		}
		return panel_5;
	}
	private JPanel getPanel_6() {
		if (panel_6 == null) {
			panel_6 = new JPanel();
			panel_6.setLayout(null);
			panel_6.add(getLblNewLabel_1_1_1_4_4());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_5());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_3());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_2());
			panel_6.add(getLblNewLabel_2_1_1_1_3());
			panel_6.add(getLblNewLabel_2_1_1_3());
			panel_6.add(getLblNewLabel_2_1_4());
			panel_6.add(getLblNewLabel_2_4());
			panel_6.add(getTextField_23());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_4());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_3());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2());
			panel_6.add(getBtnSearch_2());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1());
			panel_6.add(getLblNewLabel_2_1_1_1_3_1());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1());
			panel_6.add(getLblNewLabel_2_1_1_1_3_1_1());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2());
			panel_6.add(getLblNewLabel_2_1_1_1_3_1_2());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1());
			panel_6.add(getLblNewLabel_2_1_1_1_3_1_2_1());
			panel_6.add(getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1());
		}
		return panel_6;
	}
	private JPanel getPanel_7() {
		if (panel_7 == null) {
			panel_7 = new JPanel();
			panel_7.setLayout(null);
			panel_7.add(getLblNewLabel_1_1_1_4_5());
			panel_7.add(getTextField_24());
			panel_7.add(getLblNewLabel_1_1_1_4_5_1());
			panel_7.add(getTextField_25());
			panel_7.add(getLblNewLabel_1_1_1_4_5_2());
			panel_7.add(getTextField_26());
			panel_7.add(getBtnSearch_2_1());
			panel_7.add(getBtnSearch_2_1_1());
		}
		return panel_7;
	}
	private JPanel getPanel_8() {
		if (panel_8 == null) {
			panel_8 = new JPanel();
			panel_8.setLayout(null);
			panel_8.add(getPanel_1_1());
			panel_8.add(getPanel_9());
			panel_8.add(getPanel_10());
		}
		return panel_8;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Full Name");
			lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1.setBounds(43, 38, 101, 27);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Number");
			lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_1.setBounds(43, 86, 101, 27);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("Address");
			lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_1_1.setBounds(43, 133, 101, 27);
		}
		return lblNewLabel_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_2() {
		if (lblNewLabel_1_1_1_2 == null) {
			lblNewLabel_1_1_1_2 = new JLabel("Caste");
			lblNewLabel_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_2.setBounds(43, 177, 101, 27);
		}
		return lblNewLabel_1_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_3() {
		if (lblNewLabel_1_1_1_3 == null) {
			lblNewLabel_1_1_1_3 = new JLabel("Date of Birth");
			lblNewLabel_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3.setBounds(43, 222, 116, 27);
		}
		return lblNewLabel_1_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_3_1() {
		if (lblNewLabel_1_1_1_3_1 == null) {
			lblNewLabel_1_1_1_3_1 = new JLabel("Nationality");
			lblNewLabel_1_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3_1.setBounds(43, 270, 116, 27);
		}
		return lblNewLabel_1_1_1_3_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(159, 38, 184, 27);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(159, 86, 184, 27);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(159, 133, 184, 27);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(159, 177, 184, 27);
		}
		return textField_5;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(159, 222, 184, 27);
		}
		return dateChooser;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(159, 269, 184, 27);
		}
		return comboBox;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setColumns(10);
			textField_6.setBounds(526, 38, 184, 27);
		}
		return textField_6;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(526, 86, 184, 27);
		}
		return textField_7;
	}
	private JTextField getTextField_8() {
		if (textField_8 == null) {
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			textField_8.setBounds(526, 133, 184, 27);
		}
		return textField_8;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(526, 179, 184, 27);
		}
		return comboBox_1;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Male");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.BOLD, 14));
			rdbtnNewRadioButton.setBounds(526, 227, 72, 21);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
			buttonGroup.add(rdbtnFemale);
			rdbtnFemale.setFont(new Font("Arial Black", Font.BOLD, 14));
			rdbtnFemale.setBounds(625, 227, 85, 21);
		}
		return rdbtnFemale;
	}
	private JLabel getLblNewLabel_1_2_1_1() {
		if (lblNewLabel_1_2_1_1 == null) {
			lblNewLabel_1_2_1_1 = new JLabel("Gender");
			lblNewLabel_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_1.setBounds(400, 222, 78, 27);
		}
		return lblNewLabel_1_2_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_3_1_1() {
		if (lblNewLabel_1_1_1_3_1_1 == null) {
			lblNewLabel_1_1_1_3_1_1 = new JLabel("Account Type");
			lblNewLabel_1_1_1_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_3_1_1.setBounds(400, 180, 116, 27);
		}
		return lblNewLabel_1_1_1_3_1_1;
	}
	private JLabel getLblNewLabel_1_2_1() {
		if (lblNewLabel_1_2_1 == null) {
			lblNewLabel_1_2_1 = new JLabel("Pin No.");
			lblNewLabel_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1.setBounds(400, 133, 116, 27);
		}
		return lblNewLabel_1_2_1;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("MICR No.");
			lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2.setBounds(400, 86, 116, 27);
		}
		return lblNewLabel_1_2;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("Account No.");
			lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_3.setBounds(400, 38, 116, 27);
		}
		return lblNewLabel_1_3;
	}
	private JTextField getTextField_9() {
		if (textField_9 == null) {
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			textField_9.setBounds(526, 270, 184, 27);
		}
		return textField_9;
	}
	private JLabel getLblNewLabel_1_2_1_2() {
		if (lblNewLabel_1_2_1_2 == null) {
			lblNewLabel_1_2_1_2 = new JLabel("Sec Question");
			lblNewLabel_1_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_2_1_2.setBounds(400, 270, 116, 27);
		}
		return lblNewLabel_1_2_1_2;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(24, 118, 762, 43);
		}
		return separator;
	}
	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("Save");
			btnSave.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnSave.setBounds(594, 338, 116, 48);
		}
		return btnSave;
	}
	private JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("Edit");
			btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 18));
			btnNewButton_1_1.setBounds(424, 338, 116, 48);
		}
		return btnNewButton_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4() {
		if (lblNewLabel_1_1_1_4 == null) {
			lblNewLabel_1_1_1_4 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4.setBounds(119, 24, 143, 27);
		}
		return lblNewLabel_1_1_1_4;
	}
	private JTextField getTextField_10() {
		if (textField_10 == null) {
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			textField_10.setBounds(332, 24, 184, 27);
		}
		return textField_10;
	}
	private JLabel getLblNewLabel_1_1_1_4_1() {
		if (lblNewLabel_1_1_1_4_1 == null) {
			lblNewLabel_1_1_1_4_1 = new JLabel("Available Balance");
			lblNewLabel_1_1_1_4_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1.setBounds(119, 186, 161, 27);
		}
		return lblNewLabel_1_1_1_4_1;
	}
	private JTextField getTextField_11() {
		if (textField_11 == null) {
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			textField_11.setBounds(332, 186, 184, 27);
		}
		return textField_11;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1() {
		if (lblNewLabel_1_1_1_4_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1 = new JLabel("Amount");
			lblNewLabel_1_1_1_4_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1.setBounds(119, 319, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1;
	}
	private JTextField getTextField_12() {
		if (textField_12 == null) {
			textField_12 = new JTextField();
			textField_12.setColumns(10);
			textField_12.setBounds(332, 319, 184, 27);
		}
		return textField_12;
	}
	private JTextField getTextField_13() {
		if (textField_13 == null) {
			textField_13 = new JTextField();
			textField_13.setColumns(10);
			textField_13.setBounds(537, 319, 87, 27);
		}
		return textField_13;
	}
	private JButton getBtnTotal() {
		if (btnTotal == null) {
			btnTotal = new JButton("Total");
			btnTotal.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnTotal.setBounds(650, 317, 81, 30);
		}
		return btnTotal;
	}
	private JButton getBtnDeposite() {
		if (btnDeposite == null) {
			btnDeposite = new JButton("Deposite");
			btnDeposite.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnDeposite.setBounds(358, 367, 124, 42);
		}
		return btnDeposite;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1 = new JLabel("Full Name");
			lblNewLabel_1_1_1_4_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1.setBounds(119, 63, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1 = new JLabel("User Name");
			lblNewLabel_1_1_1_4_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1.setBounds(119, 103, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1 = new JLabel("Number");
			lblNewLabel_1_1_1_4_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1.setBounds(119, 144, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel(":");
			lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2.setBounds(295, 24, 26, 27);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel(":");
			lblNewLabel_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1.setBounds(295, 63, 26, 27);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblNewLabel_2_1_1() {
		if (lblNewLabel_2_1_1 == null) {
			lblNewLabel_2_1_1 = new JLabel(":");
			lblNewLabel_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1.setBounds(295, 103, 26, 27);
		}
		return lblNewLabel_2_1_1;
	}
	private JLabel getLblNewLabel_2_1_1_1() {
		if (lblNewLabel_2_1_1_1 == null) {
			lblNewLabel_2_1_1_1 = new JLabel(":");
			lblNewLabel_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1.setBounds(295, 144, 26, 27);
		}
		return lblNewLabel_2_1_1_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1.setBounds(295, 186, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1_1.setBounds(295, 319, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1_1;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("Search");
			btnSearch.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch.setBounds(540, 21, 113, 30);
		}
		return btnSearch;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2 = new JLabel("Sushant Chaudhary");
			lblNewLabel_1_1_1_4_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2.setBounds(332, 61, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1 = new JLabel("Sushant1530");
			lblNewLabel_1_1_1_4_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1.setBounds(332, 103, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1.setBounds(332, 144, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1;
	}
	private JButton getBtnTotal_1() {
		if (btnTotal_1 == null) {
			btnTotal_1 = new JButton("Total");
			btnTotal_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnTotal_1.setBounds(622, 162, 81, 30);
		}
		return btnTotal_1;
	}
	private JTextField getTextField_14() {
		if (textField_14 == null) {
			textField_14 = new JTextField();
			textField_14.setColumns(10);
			textField_14.setBounds(507, 162, 87, 27);
		}
		return textField_14;
	}
	private JTextField getTextField_15() {
		if (textField_15 == null) {
			textField_15 = new JTextField();
			textField_15.setColumns(10);
			textField_15.setBounds(302, 162, 184, 27);
		}
		return textField_15;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_2 = new JLabel("Amount");
			lblNewLabel_1_1_1_4_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_2.setBounds(89, 162, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_2() {
		if (lblNewLabel_1_1_1_4_1_2 == null) {
			lblNewLabel_1_1_1_4_1_2 = new JLabel("Available Balance");
			lblNewLabel_1_1_1_4_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_2.setBounds(89, 117, 161, 27);
		}
		return lblNewLabel_1_1_1_4_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_3() {
		if (lblNewLabel_1_1_1_4_1_1_1_3 == null) {
			lblNewLabel_1_1_1_4_1_1_1_3 = new JLabel("Full Name");
			lblNewLabel_1_1_1_4_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_3.setBounds(89, 80, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_2() {
		if (lblNewLabel_1_1_1_4_2 == null) {
			lblNewLabel_1_1_1_4_2 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_2.setBounds(89, 40, 143, 27);
		}
		return lblNewLabel_1_1_1_4_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_2 = new JLabel("Sushant Chaudhary");
			lblNewLabel_1_1_1_4_1_1_1_2_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_2.setBounds(302, 78, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_2;
	}
	private JTextField getTextField_17() {
		if (textField_17 == null) {
			textField_17 = new JTextField();
			textField_17.setColumns(10);
			textField_17.setBounds(302, 117, 184, 27);
		}
		return textField_17;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_2() {
		if (lblNewLabel_2_1_1_1_1_2 == null) {
			lblNewLabel_2_1_1_1_1_2 = new JLabel(":");
			lblNewLabel_2_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1_2.setBounds(265, 117, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1_2;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_1_1() {
		if (lblNewLabel_2_1_1_1_1_1_1 == null) {
			lblNewLabel_2_1_1_1_1_1_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1_1_1.setBounds(265, 162, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_2_1_2() {
		if (lblNewLabel_2_1_2 == null) {
			lblNewLabel_2_1_2 = new JLabel(":");
			lblNewLabel_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_2.setBounds(265, 80, 26, 27);
		}
		return lblNewLabel_2_1_2;
	}
	private JLabel getLblNewLabel_2_2() {
		if (lblNewLabel_2_2 == null) {
			lblNewLabel_2_2 = new JLabel(":");
			lblNewLabel_2_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_2.setBounds(265, 40, 26, 27);
		}
		return lblNewLabel_2_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_2_1() {
		if (lblNewLabel_1_1_1_4_2_1 == null) {
			lblNewLabel_1_1_1_4_2_1 = new JLabel("Credit Account");
			lblNewLabel_1_1_1_4_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_2_1.setBounds(89, 255, 143, 27);
		}
		return lblNewLabel_1_1_1_4_2_1;
	}
	private JTextField getTextField_18() {
		if (textField_18 == null) {
			textField_18 = new JTextField();
			textField_18.setColumns(10);
			textField_18.setBounds(302, 255, 184, 27);
		}
		return textField_18;
	}
	private JLabel getLblNewLabel_2_2_1() {
		if (lblNewLabel_2_2_1 == null) {
			lblNewLabel_2_2_1 = new JLabel(":");
			lblNewLabel_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_2_1.setBounds(265, 255, 26, 27);
		}
		return lblNewLabel_2_2_1;
	}
	private JButton getBtnSearch_1_1() {
		if (btnSearch_1_1 == null) {
			btnSearch_1_1 = new JButton("Search");
			btnSearch_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1_1.setBounds(502, 253, 113, 30);
		}
		return btnSearch_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_2_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_2_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_2_1 = new JLabel("Sushant Chaudhary");
			lblNewLabel_1_1_1_4_1_1_1_2_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_2_1.setBounds(302, 292, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_3_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_3_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_3_1 = new JLabel("Full Name");
			lblNewLabel_1_1_1_4_1_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_3_1.setBounds(89, 294, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_3_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_1_1 = new JLabel("Number");
			lblNewLabel_1_1_1_4_1_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_1_1.setBounds(89, 329, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1.setBounds(302, 329, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_1_1;
	}
	private JLabel getLblNewLabel_2_2_1_1() {
		if (lblNewLabel_2_2_1_1 == null) {
			lblNewLabel_2_2_1_1 = new JLabel(":");
			lblNewLabel_2_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_2_1_1.setBounds(265, 292, 26, 27);
		}
		return lblNewLabel_2_2_1_1;
	}
	private JLabel getLblNewLabel_2_2_1_1_1() {
		if (lblNewLabel_2_2_1_1_1 == null) {
			lblNewLabel_2_2_1_1_1 = new JLabel(":");
			lblNewLabel_2_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_2_1_1_1.setBounds(265, 329, 26, 27);
		}
		return lblNewLabel_2_2_1_1_1;
	}
	private JTextField getTextField_16() {
		if (textField_16 == null) {
			textField_16 = new JTextField();
			textField_16.setColumns(10);
			textField_16.setBounds(302, 366, 184, 27);
		}
		return textField_16;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1 = new JLabel("Transfer Balance");
			lblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1.setBounds(89, 366, 143, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_2_2_1_1_1_1() {
		if (lblNewLabel_2_2_1_1_1_1 == null) {
			lblNewLabel_2_2_1_1_1_1 = new JLabel(":");
			lblNewLabel_2_2_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_2_1_1_1_1.setBounds(265, 366, 26, 27);
		}
		return lblNewLabel_2_2_1_1_1_1;
	}
	private JButton getBtnSearch_1_1_1() {
		if (btnSearch_1_1_1 == null) {
			btnSearch_1_1_1 = new JButton("Transfer");
			btnSearch_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1_1_1.setBounds(502, 363, 113, 30);
		}
		return btnSearch_1_1_1;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(89, 225, 618, 42);
		}
		return separator_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_3() {
		if (lblNewLabel_1_1_1_4_3 == null) {
			lblNewLabel_1_1_1_4_3 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_3.setBounds(100, 36, 143, 27);
		}
		return lblNewLabel_1_1_1_4_3;
	}
	private JTextField getTextField_19() {
		if (textField_19 == null) {
			textField_19 = new JTextField();
			textField_19.setColumns(10);
			textField_19.setBounds(313, 36, 184, 27);
		}
		return textField_19;
	}
	private JButton getBtnSearch_1() {
		if (btnSearch_1 == null) {
			btnSearch_1 = new JButton("Search");
			btnSearch_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1.setBounds(531, 33, 113, 30);
		}
		return btnSearch_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_3() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_3 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_3 = new JLabel("Sushant Chaudhary");
			lblNewLabel_1_1_1_4_1_1_1_2_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_3.setBounds(313, 73, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_2 = new JLabel("Sushant1530");
			lblNewLabel_1_1_1_4_1_1_1_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_2.setBounds(313, 115, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_1 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_1.setBounds(313, 156, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_1;
	}
	private JTextField getTextField_20() {
		if (textField_20 == null) {
			textField_20 = new JTextField();
			textField_20.setColumns(10);
			textField_20.setBounds(313, 200, 184, 27);
		}
		return textField_20;
	}
	private JTextField getTextField_21() {
		if (textField_21 == null) {
			textField_21 = new JTextField();
			textField_21.setColumns(10);
			textField_21.setBounds(313, 246, 184, 27);
		}
		return textField_21;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_3() {
		if (lblNewLabel_2_1_1_1_1_3 == null) {
			lblNewLabel_2_1_1_1_1_3 = new JLabel(":");
			lblNewLabel_2_1_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1_3.setBounds(276, 200, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1_3;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_1_2() {
		if (lblNewLabel_2_1_1_1_1_1_2 == null) {
			lblNewLabel_2_1_1_1_1_1_2 = new JLabel(":");
			lblNewLabel_2_1_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1_1_2.setBounds(276, 246, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1_1_2;
	}
	private JLabel getLblNewLabel_2_1_1_1_2() {
		if (lblNewLabel_2_1_1_1_2 == null) {
			lblNewLabel_2_1_1_1_2 = new JLabel(":");
			lblNewLabel_2_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_2.setBounds(276, 156, 26, 27);
		}
		return lblNewLabel_2_1_1_1_2;
	}
	private JLabel getLblNewLabel_2_1_1_2() {
		if (lblNewLabel_2_1_1_2 == null) {
			lblNewLabel_2_1_1_2 = new JLabel(":");
			lblNewLabel_2_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_2.setBounds(276, 115, 26, 27);
		}
		return lblNewLabel_2_1_1_2;
	}
	private JLabel getLblNewLabel_2_1_3() {
		if (lblNewLabel_2_1_3 == null) {
			lblNewLabel_2_1_3 = new JLabel(":");
			lblNewLabel_2_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_3.setBounds(276, 75, 26, 27);
		}
		return lblNewLabel_2_1_3;
	}
	private JLabel getLblNewLabel_2_3() {
		if (lblNewLabel_2_3 == null) {
			lblNewLabel_2_3 = new JLabel(":");
			lblNewLabel_2_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_3.setBounds(276, 36, 26, 27);
		}
		return lblNewLabel_2_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_4() {
		if (lblNewLabel_1_1_1_4_1_1_1_4 == null) {
			lblNewLabel_1_1_1_4_1_1_1_4 = new JLabel("Full Name");
			lblNewLabel_1_1_1_4_1_1_1_4.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_4.setBounds(100, 75, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_4;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_2 = new JLabel("User Name");
			lblNewLabel_1_1_1_4_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_2.setBounds(100, 115, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_1 = new JLabel("Number");
			lblNewLabel_1_1_1_4_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_1.setBounds(100, 156, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_3() {
		if (lblNewLabel_1_1_1_4_1_3 == null) {
			lblNewLabel_1_1_1_4_1_3 = new JLabel("Available Balance");
			lblNewLabel_1_1_1_4_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_3.setBounds(100, 200, 161, 27);
		}
		return lblNewLabel_1_1_1_4_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_3() {
		if (lblNewLabel_1_1_1_4_1_1_3 == null) {
			lblNewLabel_1_1_1_4_1_1_3 = new JLabel("Amount");
			lblNewLabel_1_1_1_4_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_3.setBounds(100, 246, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_3_1() {
		if (lblNewLabel_1_1_1_4_1_1_3_1 == null) {
			lblNewLabel_1_1_1_4_1_1_3_1 = new JLabel("Total Amount");
			lblNewLabel_1_1_1_4_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_3_1.setBounds(100, 296, 121, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_3_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_1_1_2_1() {
		if (lblNewLabel_2_1_1_1_1_1_2_1 == null) {
			lblNewLabel_2_1_1_1_1_1_2_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_1_1_2_1.setBounds(276, 296, 26, 27);
		}
		return lblNewLabel_2_1_1_1_1_1_2_1;
	}
	private JTextField getTextField_22() {
		if (textField_22 == null) {
			textField_22 = new JTextField();
			textField_22.setColumns(10);
			textField_22.setBounds(313, 296, 184, 27);
		}
		return textField_22;
	}
	private JButton getBtnSearch_1_2() {
		if (btnSearch_1_2 == null) {
			btnSearch_1_2 = new JButton("Total");
			btnSearch_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1_2.setBounds(531, 296, 113, 30);
		}
		return btnSearch_1_2;
	}
	private JButton getBtnSearch_1_2_1() {
		if (btnSearch_1_2_1 == null) {
			btnSearch_1_2_1 = new JButton("Withdrawal");
			btnSearch_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnSearch_1_2_1.setBounds(313, 350, 184, 51);
		}
		return btnSearch_1_2_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 10, 739, 399);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Acc_No", "Full Name", "DOB", "Acc_Type", "Gender", "Mobile_No", "Address"
				}
			));
		}
		return table;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 10, 739, 399);
			scrollPane_1.setViewportView(getTable_1());
		}
		return scrollPane_1;
	}
	private JTable getTable_1() {
		if (table_1 == null) {
			table_1 = new JTable();
			table_1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Acc_No", "Full Name", "Mobile_No", "MICR_No", "Balance"
				}
			));
		}
		return table_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_4() {
		if (lblNewLabel_1_1_1_4_4 == null) {
			lblNewLabel_1_1_1_4_4 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4_4.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_4.setBounds(109, 37, 143, 27);
		}
		return lblNewLabel_1_1_1_4_4;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_5() {
		if (lblNewLabel_1_1_1_4_1_1_1_5 == null) {
			lblNewLabel_1_1_1_4_1_1_1_5 = new JLabel("Full Name");
			lblNewLabel_1_1_1_4_1_1_1_5.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_5.setBounds(109, 85, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_5;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_3() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_3 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_3 = new JLabel("User Name");
			lblNewLabel_1_1_1_4_1_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_3.setBounds(109, 125, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_2 = new JLabel("MICR No");
			lblNewLabel_1_1_1_4_1_1_1_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_2.setBounds(109, 162, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_2;
	}
	private JLabel getLblNewLabel_2_1_1_1_3() {
		if (lblNewLabel_2_1_1_1_3 == null) {
			lblNewLabel_2_1_1_1_3 = new JLabel(":");
			lblNewLabel_2_1_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_3.setBounds(320, 162, 26, 27);
		}
		return lblNewLabel_2_1_1_1_3;
	}
	private JLabel getLblNewLabel_2_1_1_3() {
		if (lblNewLabel_2_1_1_3 == null) {
			lblNewLabel_2_1_1_3 = new JLabel(":");
			lblNewLabel_2_1_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_3.setBounds(320, 125, 26, 27);
		}
		return lblNewLabel_2_1_1_3;
	}
	private JLabel getLblNewLabel_2_1_4() {
		if (lblNewLabel_2_1_4 == null) {
			lblNewLabel_2_1_4 = new JLabel(":");
			lblNewLabel_2_1_4.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_4.setBounds(320, 85, 26, 27);
		}
		return lblNewLabel_2_1_4;
	}
	private JLabel getLblNewLabel_2_4() {
		if (lblNewLabel_2_4 == null) {
			lblNewLabel_2_4 = new JLabel(":");
			lblNewLabel_2_4.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_4.setBounds(320, 37, 26, 27);
		}
		return lblNewLabel_2_4;
	}
	private JTextField getTextField_23() {
		if (textField_23 == null) {
			textField_23 = new JTextField();
			textField_23.setColumns(10);
			textField_23.setBounds(376, 37, 184, 27);
		}
		return textField_23;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_4() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_4 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_4 = new JLabel("Sushant Chaudhary");
			lblNewLabel_1_1_1_4_1_1_1_2_4.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_4.setBounds(376, 83, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_4;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_3() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_3 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_3 = new JLabel("Sushant1530");
			lblNewLabel_1_1_1_4_1_1_1_2_1_3.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_3.setBounds(376, 125, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_3;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2.setBounds(376, 162, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_2;
	}
	private JButton getBtnSearch_2() {
		if (btnSearch_2 == null) {
			btnSearch_2 = new JButton("Search");
			btnSearch_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_2.setBounds(571, 34, 113, 30);
		}
		return btnSearch_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_2_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1 = new JLabel("Rate of Intrest ( % ) ");
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1.setBounds(109, 199, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_2_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_3_1() {
		if (lblNewLabel_2_1_1_1_3_1 == null) {
			lblNewLabel_2_1_1_1_3_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_3_1.setBounds(320, 199, 26, 27);
		}
		return lblNewLabel_2_1_1_1_3_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1.setBounds(376, 199, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1.setBounds(376, 236, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_3_1_1() {
		if (lblNewLabel_2_1_1_1_3_1_1 == null) {
			lblNewLabel_2_1_1_1_3_1_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_3_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_3_1_1.setBounds(320, 236, 26, 27);
		}
		return lblNewLabel_2_1_1_1_3_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1 = new JLabel("Available Balance");
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1.setBounds(109, 236, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2.setBounds(376, 273, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2;
	}
	private JLabel getLblNewLabel_2_1_1_1_3_1_2() {
		if (lblNewLabel_2_1_1_1_3_1_2 == null) {
			lblNewLabel_2_1_1_1_3_1_2 = new JLabel(":");
			lblNewLabel_2_1_1_1_3_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_3_1_2.setBounds(320, 273, 26, 27);
		}
		return lblNewLabel_2_1_1_1_3_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2 = new JLabel("MOD Balance");
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2.setBounds(109, 273, 101, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1 = new JLabel("9821224203");
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1.setBounds(376, 310, 184, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_2_1_1_2_1_2_1;
	}
	private JLabel getLblNewLabel_2_1_1_1_3_1_2_1() {
		if (lblNewLabel_2_1_1_1_3_1_2_1 == null) {
			lblNewLabel_2_1_1_1_3_1_2_1 = new JLabel(":");
			lblNewLabel_2_1_1_1_3_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_1_1_3_1_2_1.setBounds(320, 310, 26, 27);
		}
		return lblNewLabel_2_1_1_1_3_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1 = new JLabel("Nomination Registered");
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1.setBounds(109, 310, 202, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_1_1_2_1_2_1;
	}
	private JLabel getLblNewLabel_1_1_1_4_5() {
		if (lblNewLabel_1_1_1_4_5 == null) {
			lblNewLabel_1_1_1_4_5 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4_5.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_5.setBounds(151, 75, 143, 27);
		}
		return lblNewLabel_1_1_1_4_5;
	}
	private JTextField getTextField_24() {
		if (textField_24 == null) {
			textField_24 = new JTextField();
			textField_24.setColumns(10);
			textField_24.setBounds(322, 75, 300, 27);
		}
		return textField_24;
	}
	private JLabel getLblNewLabel_1_1_1_4_5_1() {
		if (lblNewLabel_1_1_1_4_5_1 == null) {
			lblNewLabel_1_1_1_4_5_1 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4_5_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_5_1.setBounds(151, 138, 143, 27);
		}
		return lblNewLabel_1_1_1_4_5_1;
	}
	private JTextField getTextField_25() {
		if (textField_25 == null) {
			textField_25 = new JTextField();
			textField_25.setColumns(10);
			textField_25.setBounds(322, 138, 300, 27);
		}
		return textField_25;
	}
	private JLabel getLblNewLabel_1_1_1_4_5_2() {
		if (lblNewLabel_1_1_1_4_5_2 == null) {
			lblNewLabel_1_1_1_4_5_2 = new JLabel("Account Number");
			lblNewLabel_1_1_1_4_5_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_5_2.setBounds(151, 197, 143, 27);
		}
		return lblNewLabel_1_1_1_4_5_2;
	}
	private JTextField getTextField_26() {
		if (textField_26 == null) {
			textField_26 = new JTextField();
			textField_26.setColumns(10);
			textField_26.setBounds(322, 197, 300, 27);
		}
		return textField_26;
	}
	private JButton getBtnSearch_2_1() {
		if (btnSearch_2_1 == null) {
			btnSearch_2_1 = new JButton("Change");
			btnSearch_2_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSearch_2_1.setBounds(322, 268, 123, 41);
		}
		return btnSearch_2_1;
	}
	private JButton getBtnSearch_2_1_1() {
		if (btnSearch_2_1_1 == null) {
			btnSearch_2_1_1 = new JButton("Clear");
			btnSearch_2_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			btnSearch_2_1_1.setBounds(499, 268, 123, 41);
		}
		return btnSearch_2_1_1;
	}
	private JPanel getPanel_1_1() {
		if (panel_1_1 == null) {
			panel_1_1 = new JPanel();
			panel_1_1.setLayout(null);
			panel_1_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1_1.setBounds(399, 16, 339, 201);
			panel_1_1.add(getLblName());
			panel_1_1.add(getLblSushantChaudhary());
			panel_1_1.add(getLblCsushantgmailcom());
			panel_1_1.add(getLblEmail_1());
			panel_1_1.add(getLblPhone_1());
			panel_1_1.add(getLblSushantChaudhary_1());
			panel_1_1.add(getLblSushantChaudhary_1_1());
			panel_1_1.add(getLblAdress());
			panel_1_1.add(getLblKalankiKathmandu());
			panel_1_1.add(getLblWebsite());
			panel_1_1.add(getLblSushantChaudhary_1_2());
		}
		return panel_1_1;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("Name   :- ");
			lblName.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblName.setBounds(15, 10, 86, 23);
		}
		return lblName;
	}
	private JLabel getLblSushantChaudhary() {
		if (lblSushantChaudhary == null) {
			lblSushantChaudhary = new JLabel("Sushant Chaudhary");
			lblSushantChaudhary.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary.setBounds(108, 10, 192, 23);
		}
		return lblSushantChaudhary;
	}
	private JLabel getLblCsushantgmailcom() {
		if (lblCsushantgmailcom == null) {
			lblCsushantgmailcom = new JLabel("csushant224@gmail.com");
			lblCsushantgmailcom.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblCsushantgmailcom.setBounds(108, 43, 205, 23);
		}
		return lblCsushantgmailcom;
	}
	private JLabel getLblEmail_1() {
		if (lblEmail_1 == null) {
			lblEmail_1 = new JLabel("Email   :- ");
			lblEmail_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblEmail_1.setBounds(15, 43, 86, 23);
		}
		return lblEmail_1;
	}
	private JLabel getLblPhone_1() {
		if (lblPhone_1 == null) {
			lblPhone_1 = new JLabel("Phone   :- ");
			lblPhone_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblPhone_1.setBounds(15, 76, 86, 23);
		}
		return lblPhone_1;
	}
	private JLabel getLblSushantChaudhary_1() {
		if (lblSushantChaudhary_1 == null) {
			lblSushantChaudhary_1 = new JLabel("9821224203");
			lblSushantChaudhary_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary_1.setBounds(110, 76, 132, 23);
		}
		return lblSushantChaudhary_1;
	}
	private JLabel getLblSushantChaudhary_1_1() {
		if (lblSushantChaudhary_1_1 == null) {
			lblSushantChaudhary_1_1 = new JLabel("9616680432");
			lblSushantChaudhary_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary_1_1.setBounds(110, 108, 132, 23);
		}
		return lblSushantChaudhary_1_1;
	}
	private JLabel getLblAdress() {
		if (lblAdress == null) {
			lblAdress = new JLabel("Adress :- ");
			lblAdress.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblAdress.setBounds(15, 139, 86, 23);
		}
		return lblAdress;
	}
	private JLabel getLblKalankiKathmandu() {
		if (lblKalankiKathmandu == null) {
			lblKalankiKathmandu = new JLabel("Kalanki , Kathmandu");
			lblKalankiKathmandu.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblKalankiKathmandu.setBounds(108, 139, 192, 23);
		}
		return lblKalankiKathmandu;
	}
	private JLabel getLblWebsite() {
		if (lblWebsite == null) {
			lblWebsite = new JLabel("Website :- ");
			lblWebsite.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblWebsite.setBounds(15, 167, 86, 23);
		}
		return lblWebsite;
	}
	private JLabel getLblSushantChaudhary_1_2() {
		if (lblSushantChaudhary_1_2 == null) {
			lblSushantChaudhary_1_2 = new JLabel("www.dsp.com.np");
			lblSushantChaudhary_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblSushantChaudhary_1_2.setBounds(108, 167, 174, 23);
		}
		return lblSushantChaudhary_1_2;
	}
	private JPanel getPanel_9() {
		if (panel_9 == null) {
			panel_9 = new JPanel();
			panel_9.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Social Media", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_9.setBounds(399, 224, 339, 185);
			panel_9.setLayout(null);
			panel_9.add(getLblNewLabel_3());
			panel_9.add(getLblNewLabel_3_1_1());
			panel_9.add(getLblNewLabel_3_1());
			panel_9.add(getLblNewLabel_3_1_1_1());
			panel_9.add(getLblNewLabel_3_1_2());
			panel_9.add(getLblNewLabel_3_1_1_1_1());
		}
		return panel_9;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Follow Me");
			lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_3.setBounds(36, 22, 84, 23);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_3_1_1() {
		if (lblNewLabel_3_1_1 == null) {
			lblNewLabel_3_1_1 = new JLabel("- www.facebook.com/dsp.1234");
			lblNewLabel_3_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_3_1_1.setBounds(46, 46, 248, 23);
		}
		return lblNewLabel_3_1_1;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("Instagram");
			lblNewLabel_3_1.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_3_1.setBounds(36, 78, 84, 23);
		}
		return lblNewLabel_3_1;
	}
	private JLabel getLblNewLabel_3_1_1_1() {
		if (lblNewLabel_3_1_1_1 == null) {
			lblNewLabel_3_1_1_1 = new JLabel("- www.instagram.com/dsp.1234");
			lblNewLabel_3_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_3_1_1_1.setBounds(46, 102, 248, 23);
		}
		return lblNewLabel_3_1_1_1;
	}
	private JLabel getLblNewLabel_3_1_2() {
		if (lblNewLabel_3_1_2 == null) {
			lblNewLabel_3_1_2 = new JLabel("Email");
			lblNewLabel_3_1_2.setFont(new Font("Arial Black", Font.BOLD, 12));
			lblNewLabel_3_1_2.setBounds(36, 132, 84, 23);
		}
		return lblNewLabel_3_1_2;
	}
	private JLabel getLblNewLabel_3_1_1_1_1() {
		if (lblNewLabel_3_1_1_1_1 == null) {
			lblNewLabel_3_1_1_1_1 = new JLabel("- csushant224@gmail.com");
			lblNewLabel_3_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
			lblNewLabel_3_1_1_1_1.setBounds(46, 152, 248, 23);
		}
		return lblNewLabel_3_1_1_1_1;
	}
	private JPanel getPanel_10() {
		if (panel_10 == null) {
			panel_10 = new JPanel();
			panel_10.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_10.setBounds(10, 16, 373, 393);
			panel_10.setLayout(null);
			panel_10.add(getLblNewLabel_4());
		}
		return panel_10;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setBounds(5, 5, 363, 383);
			lblNewLabel_4.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Sushant Chaudhary\\OneDrive\\Pictures\\sc1.jpg").getImage().getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), DO_NOTHING_ON_CLOSE)));
		}
		return lblNewLabel_4;
	}
	private JTextField getTextField_27() {
		if (textField_27 == null) {
			textField_27 = new JTextField();
			textField_27.setColumns(10);
			textField_27.setBounds(302, 40, 184, 27);
		}
		return textField_27;
	}
	private JButton getBtnSearch_1_1_2() {
		if (btnSearch_1_1_2 == null) {
			btnSearch_1_1_2 = new JButton("Search");
			btnSearch_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 14));
			btnSearch_1_1_2.setBounds(502, 38, 113, 30);
		}
		return btnSearch_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_6() {
		if (lblNewLabel_1_1_1_4_1_1_1_6 == null) {
			lblNewLabel_1_1_1_4_1_1_1_6 = new JLabel("Depositer Number");
			lblNewLabel_1_1_1_4_1_1_1_6.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_6.setBounds(119, 282, 161, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_6;
	}
	private JLabel getLblNewLabel_2_1_5() {
		if (lblNewLabel_2_1_5 == null) {
			lblNewLabel_2_1_5 = new JLabel(":");
			lblNewLabel_2_1_5.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_5.setBounds(295, 282, 26, 27);
		}
		return lblNewLabel_2_1_5;
	}
	private JLabel getLblNewLabel_1_1_1_4_1_1_1_6_1() {
		if (lblNewLabel_1_1_1_4_1_1_1_6_1 == null) {
			lblNewLabel_1_1_1_4_1_1_1_6_1 = new JLabel("Depositer Name");
			lblNewLabel_1_1_1_4_1_1_1_6_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_1_1_1_4_1_1_1_6_1.setBounds(119, 246, 143, 27);
		}
		return lblNewLabel_1_1_1_4_1_1_1_6_1;
	}
	private JLabel getLblNewLabel_2_1_5_1() {
		if (lblNewLabel_2_1_5_1 == null) {
			lblNewLabel_2_1_5_1 = new JLabel(":");
			lblNewLabel_2_1_5_1.setFont(new Font("Arial Black", Font.BOLD, 14));
			lblNewLabel_2_1_5_1.setBounds(295, 246, 26, 27);
		}
		return lblNewLabel_2_1_5_1;
	}
	private JSeparator getSeparator_2() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
			separator_2.setBounds(21, 232, 714, 13);
		}
		return separator_2;
	}
	private JTextField getTextField_28() {
		if (textField_28 == null) {
			textField_28 = new JTextField();
			textField_28.setColumns(10);
			textField_28.setBounds(332, 246, 184, 27);
		}
		return textField_28;
	}
	private JTextField getTextField_29() {
		if (textField_29 == null) {
			textField_29 = new JTextField();
			textField_29.setColumns(10);
			textField_29.setBounds(332, 282, 184, 27);
		}
		return textField_29;
	}
}
