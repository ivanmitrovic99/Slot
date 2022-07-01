package slotmachine;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCredit;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setForeground(new Color(0, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldCredit = new JTextField();
		textFieldCredit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldCredit.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCredit.setToolTipText("");
		textFieldCredit.setBounds(181, 216, 347, 43);
		contentPane.add(textFieldCredit);
		textFieldCredit.setColumns(10);
		
		JButton btnNewStart = new JButton("Start");
		btnNewStart.setForeground(new Color(204, 0, 51));
		btnNewStart.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnNewStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			float credit=0;
				try{credit= Float.parseFloat(textFieldCredit.getText());
				Game game = new Game(credit);
				game.setVisible(true);}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Amount must not be empty, and it must be a number!");
				}
				
				
			}
		});
		btnNewStart.setBounds(261, 138, 187, 43);
		contentPane.add(btnNewStart);
		
		lblNewLabel = new JLabel("Input credit amount");
		lblNewLabel.setBounds(308, 191, 121, 14);
		contentPane.add(lblNewLabel);
	}
}
