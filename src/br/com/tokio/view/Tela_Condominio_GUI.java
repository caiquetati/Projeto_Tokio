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
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

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
					window.frame.setLocationRelativeTo(null);
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
		frame.setBounds(100, 100, 541, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(20, 129, 99));
		panel.setBounds(0, 0, 541, 361);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 521, 339);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Seguro Condomínio");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblNewLabel_1.setBounds(161, 11, 232, 45);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("Basico");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(0, 0, 53, 25);

		JTextPane basico = new JTextPane();
		basico.setFont(new Font("Tahoma", Font.BOLD, 12));
		basico.setVisible(false);
		basico.setText("Incêndio\r\nRoubo\r\nDanos elétricos\r\nDisp. aluguel \r\nResponsabilidade civil\r\n");
		basico.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		basico.setBounds(287, 118, 210, 84);

		JTextPane intermediario = new JTextPane();
		intermediario.setFont(new Font("Tahoma", Font.BOLD, 12));
		intermediario.setVisible(false);
		intermediario.setText(
				"Incêndio\r\nRoubo\r\nDanos elétricos\r\nDesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\n");
		intermediario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		intermediario.setBounds(287, 118, 210, 96);

		JLabel Value_basico = new JLabel("Valor:  R$52,73 /mes");
		Value_basico.setFont(new Font("Tahoma", Font.BOLD, 12));
		Value_basico.setVisible(false);
		Value_basico.setBounds(362, 97, 133, 14);
		panel_1.add(Value_basico);
		
		JLabel Value_intermediario = new JLabel("Valor:  R$55,31 /mes");
		Value_intermediario.setFont(new Font("Tahoma", Font.BOLD, 12));
		Value_intermediario.setVisible(false);
		Value_intermediario.setBounds(362, 97, 133, 14);
		panel_1.add(Value_intermediario);
		
		JLabel Value_completo = new JLabel("Valor:  R$61,66 /mes");
		Value_completo.setFont(new Font("Tahoma", Font.BOLD, 12));
		Value_completo.setVisible(false);
		Value_completo.setBounds(362, 97, 133, 14);
		panel_1.add(Value_completo);
		
		JTextPane completo = new JTextPane();
		completo.setFont(new Font("Tahoma", Font.BOLD, 12));
		completo.setVisible(false);
		completo.setText(
				"Incêndio                              \r\nRoubo                                   \r\nDanos elétricos  \r\nDesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\nVidros \r\nVazamento de tubulações \r\nIncêndio\r\nRoubo\r\nDanos elétricos\r\n");
		completo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		completo.setBounds(287, 118, 210, 176);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				basico.setVisible(true);
				Value_basico.setVisible(true);
				Value_intermediario.setVisible(false);;
				Value_completo.setVisible(false);
				intermediario.setVisible(false);
				completo.setVisible(false);
			}
		});
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(153, 153, 153));
		panel_1_1.setBounds(45, 84, 107, 27);
		panel_1.add(panel_1_1);

		panel_1_1.add(lblNewLabel_3);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(153, 153, 153));
		panel_1_1_1.setBounds(45, 133, 107, 27);
		panel_1.add(panel_1_1_1);
		
				JLabel lblNewLabel_3_1 = new JLabel("Intermediario");
				lblNewLabel_3_1.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
				lblNewLabel_3_1.setBounds(0, 0, 107, 25);
				panel_1_1_1.add(lblNewLabel_3_1);
				lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						basico.setVisible(false);
						Value_basico.setVisible(false);
						Value_intermediario.setVisible(true);;
						Value_completo.setVisible(false);
						intermediario.setVisible(true);
						completo.setVisible(false);
					}
				});
				lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));

		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Assistencia_GUI assistencia = new Tela_Assistencia_GUI();
				assistencia.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(411, 316, 110, 23);
		panel_1.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\close_resized (2).png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(482, 1, 39, 28);
		panel_1.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
			}
		});
		btnNewButton_1_1.setIcon(
				new ImageIcon(Tela_Condominio_GUI.class.getResource("/br/com/tokio/images/arrow_resized_resized.png")));
		btnNewButton_1_1.setBounds(433, 1, 39, 28);
		panel_1.add(btnNewButton_1_1);

		panel_1.add(basico);
		panel_1.add(intermediario);
		panel_1.add(completo);
		
		JLabel lblNewLabel_3_3 = new JLabel("Escolha seu plano:");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_3.setBounds(9, 61, 133, 23);
		panel_1.add(lblNewLabel_3_3);

						JComboBox comboBox = new JComboBox();
						comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
						comboBox.setModel(new DefaultComboBoxModel(new String[] {"Alberto Nunes ", "Maria Angelina", "Ricardo Soares", "João Alberto", "Cristiane Silva"}));
						comboBox.setBounds(68, 256, 133, 22);
						panel_1.add(comboBox);
								
								JLabel lblNewLabel_2 = new JLabel("Escolha um corretor:");
								lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
								lblNewLabel_2.setBounds(38, 238, 156, 14);
								panel_1.add(lblNewLabel_2);
										
												JPanel panel_1_2 = new JPanel();
												panel_1_2.setLayout(null);
												panel_1_2.setBackground(new Color(153, 153, 153));
												panel_1_2.setBounds(45, 183, 107, 27);
												panel_1.add(panel_1_2);
												
														JLabel lblNewLabel_3_2 = new JLabel("Completo");
														lblNewLabel_3_2.setBounds(0, 0, 108, 25);
														panel_1_2.add(lblNewLabel_3_2);
														lblNewLabel_3_2.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
														lblNewLabel_3_2.addMouseListener(new MouseAdapter() {
															@Override
															public void mouseClicked(MouseEvent e) {
																basico.setVisible(false);
																Value_basico.setVisible(false);
																Value_intermediario.setVisible(false);;
																Value_completo.setVisible(true);
																intermediario.setVisible(false);
																completo.setVisible(true);
															}
														});
														lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
												
												
												
														JLabel lblNewLabel = new JLabel("");
														lblNewLabel.setIcon(new ImageIcon(Tela_Condominio_GUI.class.getResource("/br/com/tokio/images/condominio_resized_updated.jpg")));
														lblNewLabel.setBounds(0, 0, 521, 339);
														panel_1.add(lblNewLabel);
	}
}
