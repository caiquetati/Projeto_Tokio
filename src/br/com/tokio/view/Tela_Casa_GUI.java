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
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;

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
		btnNewButton.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	JOptionPane.showMessageDialog(null, "voce escolheu...");
			}
		});
		btnNewButton.setBounds(315, 254, 110, 23);
		panel.add(btnNewButton);
		
		JTextPane basico = new JTextPane();
		basico.setVisible(false);
		basico.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		basico.setText("Incêndio\r\nroubo\r\ndanos elétricos\r\ndisp. aluguel \r\nResponsabilidade civil\r\n");
		basico.setBounds(186, 81, 210, 162);
		panel.add(basico);
		
		JTextPane intermediario = new JTextPane();
		intermediario.setVisible(false);
		intermediario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		intermediario.setText("incêndio\r\nroubo\r\ndanos elétricos\r\ndesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\n");
		intermediario.setBounds(186, 81, 210, 162);
		panel.add(intermediario);
		
		JTextPane completo = new JTextPane();
		completo.setVisible(false);
		completo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		completo.setText("incêndio                              \r\nroubo                                   \r\ndanos elétricos  \r\ndesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\nVidros \r\nvazamento de tubulações \r\nincêndio\r\nroubo\r\ndanos elétricos\r\n");
		completo.setBounds(186, 81, 210, 162);
		panel.add(completo);
		
		JLabel lblNewLabel_1 = new JLabel("Seguro");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(186, 11, 94, 45);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Casa");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(196, 48, 84, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorder(new LineBorder(Color.RED, 1, true));
		btnNewButton_1.setIcon(new ImageIcon(Tela_Casa_GUI.class.getResource("/br/com/tokio/images/CLOSE_resized.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(374, 0, 27, 28);
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
		
		JPanel panelBasico = new JPanel();
		panelBasico.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panelBasico.setBounds(36, 91, 107, 27);
		panel.add(panelBasico);
		panelBasico.setBackground(new Color(153, 153, 153));
		panelBasico.setLayout(null);
		
		JLabel lblBasico = new JLabel("Basico");
		lblBasico.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				basico.setVisible(true);
				intermediario.setVisible(false);
				completo.setVisible(false);
			}
		});
		lblBasico.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblBasico.setBounds(0, 0, 107, 25);
		panelBasico.add(lblBasico);
		
		
		JPanel panelIntermediario = new JPanel();
		panelIntermediario.setBounds(36, 143, 107, 27);
		panel.add(panelIntermediario);
		panelIntermediario.setLayout(null);
		panelIntermediario.setBackground(new Color(153, 153, 153));
		
		JLabel lblIntermediario = new JLabel("Intermediario");
		lblIntermediario.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntermediario.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		lblIntermediario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				basico.setVisible(false);
				intermediario.setVisible(true);
				completo.setVisible(false);
			}
		});
		lblIntermediario.setBounds(0, 0, 107, 27);
		panelIntermediario.add(lblIntermediario);
		lblIntermediario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		JPanel panelCompleto = new JPanel();
		panelCompleto.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panelCompleto.setBounds(36, 204, 107, 27);
		panel.add(panelCompleto);
		panelCompleto.setLayout(null);
		panelCompleto.setBackground(new Color(153, 153, 153));
		
		JLabel lblCompleto = new JLabel("Completo");
		lblCompleto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompleto.setBounds(0, 0, 107, 25);
		panelCompleto.add(lblCompleto);
		lblCompleto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				basico.setVisible(false);
				intermediario.setVisible(false);
				completo.setVisible(true);
			}
		});
		lblCompleto.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		JLabel lblNewLabel_3 = new JLabel("Escolha seu plano:");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_3.setBounds(10, 66, 133, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setIcon(new ImageIcon(Tela_Casa_GUI.class.getResource("/br/com/tokio/images/planos_updated_resized_updated.jpg")));
		lblNewLabel.setBounds(0, 0, 425, 277);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 450, 300);
		panel_2.setBackground(new Color(20, 129, 99));
		frame.getContentPane().add(panel_2);
	}
}
