package slotmachine;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Game extends JFrame {
	private float credit;
	private JPanel contentPane;
	private JTextField textFieldBet;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Game(float credit) {
		String jagoda = "C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\jagoda.png";
		String borovnica = "C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\borovnica.png";
		String narandza = "C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\narandza.png";
		String jabuka = "C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\jabuka.png";
		String sljiva = "C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\sljiva.png";
		this.credit=credit;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 870);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRow1Col1 = new JLabel("");
		lblRow1Col1.setForeground(new Color(51, 51, 204));
		lblRow1Col1.setIcon(new ImageIcon("C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\borovnica.png"));
		lblRow1Col1.setBounds(73, 217, 155, 191);
		contentPane.add(lblRow1Col1);
		
		JLabel lblRow1Col2 = new JLabel("");
		lblRow1Col2.setIcon(new ImageIcon("C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\borovnica.png"));
		lblRow1Col2.setBounds(301, 217, 155, 191);
		contentPane.add(lblRow1Col2);
		
		JLabel lblRow1Col3 = new JLabel("");
		lblRow1Col3.setIcon(new ImageIcon("C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\borovnica.png"));
		lblRow1Col3.setBounds(538, 217, 155, 191);
		contentPane.add(lblRow1Col3);
		
		JLabel lblRow2Col1 = new JLabel("");
		lblRow2Col1.setIcon(new ImageIcon("C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\jagoda.png"));
		lblRow2Col1.setBounds(73, 419, 155, 191);
		contentPane.add(lblRow2Col1);
		
		JLabel lblRow2Col2 = new JLabel("");
		lblRow2Col2.setIcon(new ImageIcon("C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\jagoda.png"));
		lblRow2Col2.setBounds(301, 419, 155, 191);
		contentPane.add(lblRow2Col2);
		
		JLabel lblRow2Col3 = new JLabel("");
		lblRow2Col3.setIcon(new ImageIcon("C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\jagoda.png"));
		lblRow2Col3.setBounds(538, 419, 155, 191);
		contentPane.add(lblRow2Col3);
		
		JLabel lblRow3Col1 = new JLabel("");
		lblRow3Col1.setIcon(new ImageIcon("C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\jabuka.png"));
		lblRow3Col1.setBounds(73, 621, 155, 191);
		contentPane.add(lblRow3Col1);
		
		JLabel lblRow3Col2 = new JLabel("");
		lblRow3Col2.setIcon(new ImageIcon("C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\jabuka.png"));
		lblRow3Col2.setBounds(311, 621, 155, 191);
		contentPane.add(lblRow3Col2);
		
		JLabel lblRow3Col3 = new JLabel("");
		lblRow3Col3.setIcon(new ImageIcon("C:\\Users\\Ivan\\eclipse-workspace\\Slot\\pics\\jabuka.png"));
		lblRow3Col3.setBounds(538, 629, 155, 191);
		contentPane.add(lblRow3Col3);
		
		JLabel lblNewLabel = new JLabel("CREDITS:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(236, 57, 92, 35);
		contentPane.add(lblNewLabel);

		JLabel lblWinings = new JLabel("GOOD LUCK!");
		lblWinings.setForeground(new Color(0, 255, 153));
		lblWinings.setFont(new Font("Wide Latin", Font.PLAIN, 22));
		lblWinings.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinings.setBounds(10, 165, 683, 56);
		contentPane.add(lblWinings);
		
		JLabel lblCredit = new JLabel("");
		lblCredit.setBounds(338, 54, 143, 41);
		contentPane.add(lblCredit);
		lblCredit.setText(String.valueOf(getCredit()));
		
		JButton btnSpin = new JButton("SPIN");
		btnSpin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float win=0;
				float bet=Float.parseFloat(textFieldBet.getText());
				if(bet>Float.parseFloat(lblCredit.getText())) {
					bet=0;
					JOptionPane.showMessageDialog(null, "Insufficent funds!");
					
				}
				if(Float.parseFloat(lblCredit.getText())==0) {
					JOptionPane.showMessageDialog(null, "Credits are 0!");
					dispose();
				}
				if(bet<0) {
					bet=0;
					JOptionPane.showMessageDialog(null, "Invalid input!");
				}
				
				
				int arr[][] = new int[3][3];
				for(int i=0;i<3;i++) {
					for(int j=0;j<3;j++) {
						Random rand = new Random();
						arr[i][j]=rand.nextInt((5-1)+1)+1;
					}
				}
				
				switch(arr[0][0]) {
				case 1: lblRow1Col1.setIcon(new ImageIcon(jagoda)); break;
				case 2: lblRow1Col1.setIcon(new ImageIcon(borovnica)); break;
				case 3: lblRow1Col1.setIcon(new ImageIcon(jabuka)); break;
				case 4: lblRow1Col1.setIcon(new ImageIcon(narandza)); break;
				case 5: lblRow1Col1.setIcon(new ImageIcon(sljiva)); break;
				
				}
				switch(arr[0][1]) {
				case 1: lblRow1Col2.setIcon(new ImageIcon(jagoda)); break;
				case 2: lblRow1Col2.setIcon(new ImageIcon(borovnica)); break;
				case 3: lblRow1Col2.setIcon(new ImageIcon(jabuka)); break;
				case 4: lblRow1Col2.setIcon(new ImageIcon(narandza)); break;
				case 5: lblRow1Col2.setIcon(new ImageIcon(sljiva)); break;
				
				}
				switch(arr[0][2]) {
				case 1: lblRow1Col3.setIcon(new ImageIcon(jagoda)); break;
				case 2: lblRow1Col3.setIcon(new ImageIcon(borovnica)); break;
				case 3: lblRow1Col3.setIcon(new ImageIcon(jabuka)); break;
				case 4: lblRow1Col3.setIcon(new ImageIcon(narandza)); break;
				case 5: lblRow1Col3.setIcon(new ImageIcon(sljiva)); break;
				
				}
				switch(arr[1][0]) {
				case 1: lblRow2Col1.setIcon(new ImageIcon(jagoda)); break;
				case 2: lblRow2Col1.setIcon(new ImageIcon(borovnica)); break;
				case 3: lblRow2Col1.setIcon(new ImageIcon(jabuka)); break;
				case 4: lblRow2Col1.setIcon(new ImageIcon(narandza)); break;
				case 5: lblRow2Col1.setIcon(new ImageIcon(sljiva)); break;
				
				}
				switch(arr[1][1]) {
				case 1: lblRow2Col2.setIcon(new ImageIcon(jagoda)); break;
				case 2: lblRow2Col2.setIcon(new ImageIcon(borovnica)); break;
				case 3: lblRow2Col2.setIcon(new ImageIcon(jabuka)); break;
				case 4: lblRow2Col2.setIcon(new ImageIcon(narandza)); break;
				case 5: lblRow2Col2.setIcon(new ImageIcon(sljiva)); break;
				
				}
				switch(arr[1][2]) {
				case 1: lblRow2Col3.setIcon(new ImageIcon(jagoda)); break;
				case 2: lblRow2Col3.setIcon(new ImageIcon(borovnica)); break;
				case 3: lblRow2Col3.setIcon(new ImageIcon(jabuka)); break;
				case 4: lblRow2Col3.setIcon(new ImageIcon(narandza)); break;
				case 5: lblRow2Col3.setIcon(new ImageIcon(sljiva)); break;
				
				}
				switch(arr[2][0]) {
				case 1: lblRow3Col1.setIcon(new ImageIcon(jagoda)); break;
				case 2: lblRow3Col1.setIcon(new ImageIcon(borovnica)); break;
				case 3: lblRow3Col1.setIcon(new ImageIcon(jabuka)); break;
				case 4: lblRow3Col1.setIcon(new ImageIcon(narandza)); break;
				case 5: lblRow3Col1.setIcon(new ImageIcon(sljiva)); break;
				
				}
				switch(arr[2][1]) {
				case 1: lblRow3Col2.setIcon(new ImageIcon(jagoda)); break;
				case 2: lblRow3Col2.setIcon(new ImageIcon(borovnica)); break;
				case 3: lblRow3Col2.setIcon(new ImageIcon(jabuka)); break;
				case 4: lblRow3Col2.setIcon(new ImageIcon(narandza)); break;
				case 5: lblRow3Col2.setIcon(new ImageIcon(sljiva)); break;
				
				}
				switch(arr[2][2]) {
				case 1: lblRow3Col3.setIcon(new ImageIcon(jagoda)); break;
				case 2: lblRow3Col3.setIcon(new ImageIcon(borovnica)); break;
				case 3: lblRow3Col3.setIcon(new ImageIcon(jabuka)); break;
				case 4: lblRow3Col3.setIcon(new ImageIcon(narandza)); break;
				case 5: lblRow3Col3.setIcon(new ImageIcon(sljiva)); break;
				
				}
				win=0;
				for(int i=0;i<3;i++) {
				
						if(arr[i][0]==arr[i][1] && arr[i][0]==arr[i][2]) {
							if(win==0)win=bet*5;
							else win=bet*10;
						}
					}
				
				setCredit(Float.parseFloat(lblCredit.getText())+win-bet);
				
				
				lblCredit.setText(String.valueOf(getCredit()));
				
				if(win==0) {
					lblWinings.setText("No win this time.");
				}
				else {
					lblWinings.setText("Congrats! You won "+win+" credits.");
				}
				
				
			}
		});
		btnSpin.setForeground(new Color(51, 102, 51));
		btnSpin.setFont(new Font("Stencil", Font.PLAIN, 16));
		btnSpin.setBackground(new Color(255, 255, 153));
		btnSpin.setRequestFocusEnabled(false);
		btnSpin.setBounds(277, 102, 219, 56);
		contentPane.add(btnSpin);
		
		textFieldBet = new JTextField();
		textFieldBet.setBounds(104, 102, 126, 56);
		contentPane.add(textFieldBet);
		textFieldBet.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Bet amount");
		lblNewLabel_1.setBounds(104, 67, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		
		
	}

	public float getCredit() {
		return credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}
}
