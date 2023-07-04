package br.com.tokio.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tela_Main_GUI {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Main_GUI window = new Tela_Main_GUI();
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
	public Tela_Main_GUI() {
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
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(153, 153, 153));
		panel_1.setBounds(10, 11, 214, 278);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Seguro");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(67, 11, 104, 39);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Residencial");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(44, 28, 127, 56);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tela_Condominio_GUI cond = new Tela_Condominio_GUI();
				cond.frame.setVisible(true);
				frame.dispose();

			}
		});
		panel_2_1_1.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_2_1_1.setBackground(new Color(204, 204, 204));
		panel_2_1_1.setBounds(0, 192, 214, 28);
		panel_1.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("CONDOMINIO");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_8.setBounds(68, 0, 95, 25);
		panel_2_1_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Tela_Main_GUI.class.getResource("/br/com/tokio/images/condominium_resized.png")));
		lblNewLabel_9.setBounds(10, 0, 46, 25);
		panel_2_1_1.add(lblNewLabel_9);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tela_Apartamento_GUI apartamento = new Tela_Apartamento_GUI();
				apartamento.frame.setVisible(true);
				frame.dispose();

			}
		});
		panel_2_1_1_1.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_2_1_1_1.setBackground(new Color(204, 204, 204));
		panel_2_1_1_1.setBounds(0, 151, 214, 28);
		panel_1.add(panel_2_1_1_1);
		panel_2_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Tela_Main_GUI.class.getResource("/br/com/tokio/images/architect_resized.png")));
		lblNewLabel_6.setBounds(21, 0, 38, 25);
		panel_2_1_1_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("APARTAMENTO");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_7.setBounds(69, -3, 121, 28);
		panel_2_1_1_1.add(lblNewLabel_7);
		
		JPanel panel_2_1_1_2 = new JPanel();
		panel_2_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tela_Casa_GUI casa = new Tela_Casa_GUI();
				casa.frame.setVisible(true);
				frame.dispose();

			}
		});
		panel_2_1_1_2.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_2_1_1_2.setBackground(new Color(204, 204, 204));
		panel_2_1_1_2.setBounds(0, 112, 214, 28);
		panel_1.add(panel_2_1_1_2);
		panel_2_1_1_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(32, 0, 46, 25);
		panel_2_1_1_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Tela_Main_GUI.class.getResource("/br/com/tokio/images/house_resized.png")));
		lblNewLabel_4.setBounds(21, 0, 57, 25);
		panel_2_1_1_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CASA");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_5.setBounds(98, 0, 57, 25);
		panel_2_1_1_2.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.setBounds(401, 0, 49, 28);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tela_Main_GUI.class.getResource("/br/com/tokio/images/Main_Image.jpg")));
		lblNewLabel.setBounds(223, 11, 217, 278);
		panel.add(lblNewLabel);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
