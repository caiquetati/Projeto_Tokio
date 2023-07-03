package br.com.tokio.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Condominio_GUI {


	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Condominio_GUI window = new Tela_Condominio_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_Condominio_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(20, 129, 99));
		panel.setBounds(0, 0, 450, 300);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 430, 278);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Seguro");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(183, 11, 94, 45);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Condominio");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(152, 43, 156, 25);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(153, 153, 153));
		panel_1_1.setBounds(45, 84, 84, 27);
		panel_1.add(panel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Basico");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(10, 0, 53, 25);
		panel_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Intermediario");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3_1.setBounds(170, 84, 107, 25);
		panel_1.add(lblNewLabel_3_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(153, 153, 153));
		panel_1_1_1.setBounds(170, 84, 107, 27);
		panel_1.add(panel_1_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(153, 153, 153));
		panel_1_2.setBounds(312, 84, 84, 27);
		panel_1.add(panel_1_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Completo");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3_2.setBounds(0, 0, 84, 25);
		panel_1_2.add(lblNewLabel_3_2);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBounds(320, 255, 110, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(379, 1, 51, 28);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Main_GUI main = new Tela_Main_GUI();
				main.frame.setVisible(true);
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(Tela_Condominio_GUI.class.getResource("/br/com/tokio/images/arrow_resized_resized.png")));
		btnNewButton_1_1.setBounds(330, 1, 39, 28);
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tela_Condominio_GUI.class.getResource("/br/com/tokio/images/seguro_condominio_updated_resized (1).jpg")));
		lblNewLabel.setBounds(0, 0, 430, 278);
		panel_1.add(lblNewLabel);
	}

}
