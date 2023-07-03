package br.com.tokio.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Casa_GUI {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Casa_GUI window = new Tela_Casa_GUI();
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
	public Tela_Casa_GUI() {
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
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 425, 277);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	JOptionPane.showMessageDialog(null, "voce escolheu...");
			}
		});
		btnNewButton.setBounds(315, 254, 110, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Seguro");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(186, 11, 94, 45);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Casa");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(196, 48, 84, 14);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 153, 153));
		panel_1.setBounds(48, 84, 84, 27);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Basico");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(10, 0, 53, 25);
		panel_1.add(lblNewLabel_3);
		
		JTextPane basico = new JTextPane();
		basico.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		basico.setText("Incêndio\r\nroubo\r\ndanos elétricos\r\ndisp. aluguel \r\nResponsabilidade civil\r\n");
		basico.setBounds(128, 115, 115, 104);
		panel.add(basico);
		
		JTextPane intermediario = new JTextPane();
		intermediario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		intermediario.setText("incêndio\r\nroubo\r\ndanos elétricos\r\ndesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\n");
		intermediario.setBounds(128, 115, 188, 104);
		panel.add(intermediario);
		
		JTextPane completo = new JTextPane();
		completo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		completo.setText("incêndio                              \r\nroubo                                   \r\ndanos elétricos  \r\ndesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\nVidros \r\nvazamento de tubulações \r\nincêndio\r\nroubo\r\ndanos elétricos\r\n");
		completo.setBounds(128, 115, 210, 162);
		panel.add(completo);
		
		JLabel lblNewLabel_3_1 = new JLabel("Intermediario");
		lblNewLabel_3_1.setBounds(173, 84, 107, 25);
		panel.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(153, 153, 153));
		panel_1_1.setBounds(173, 84, 107, 27);
		panel.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(153, 153, 153));
		panel_1_2.setBounds(315, 84, 84, 27);
		panel.add(panel_1_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Completo");
		lblNewLabel_3_2.setBounds(0, 0, 84, 25);
		panel_1_2.add(lblNewLabel_3_2);
		lblNewLabel_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(374, 0, 51, 28);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Main_GUI main = new Tela_Main_GUI();
				main.frame.setVisible(true);
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(Tela_Casa_GUI.class.getResource("/br/com/tokio/images/arrow_resized_resized.png")));
		btnNewButton_1_1.setBounds(325, 0, 39, 28);
		panel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tela_Casa_GUI.class.getResource("/br/com/tokio/images/planos_updated_resized_updated.jpg")));
		lblNewLabel.setBounds(0, 0, 425, 277);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 450, 300);
		panel_2.setBackground(new Color(20, 129, 99));
		frame.getContentPane().add(panel_2);
	}
}
