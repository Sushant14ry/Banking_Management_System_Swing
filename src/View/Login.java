package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JSeparator separator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setFont(new Font("Arial Black", Font.BOLD, 16));
			panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 6, true), "Authentication", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(10, 24, 494, 406);
			panel.setLayout(null);
			panel.add(getLblNewLabel());
			panel.add(getLblNewLabel_1());
			panel.add(getLblNewLabel_1_1());
			panel.add(getTextField());
			panel.add(getPasswordField());
			panel.add(getBtnNewButton());
			panel.add(getLblNewLabel_2());
			panel.add(getSeparator());
		}
		return panel;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("iBanking");
			lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 32));
			lblNewLabel.setBounds(160, 42, 177, 72);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Mobile Number");
			lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1.setBounds(42, 168, 144, 23);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Secret Pin");
			lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 16));
			lblNewLabel_1_1.setBounds(42, 222, 144, 23);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			textField.setBounds(209, 167, 217, 31);
			textField.setColumns(10);
		}
		return textField;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			passwordField.setBounds(209, 220, 217, 31);
		}
		return passwordField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Login");
			btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
			btnNewButton.setBounds(250, 273, 130, 37);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Forget Pin");
			lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
			lblNewLabel_2.setBounds(75, 347, 101, 17);
		}
		return lblNewLabel_2;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(56, 370, 114, 9);
		}
		return separator;
	}
}
