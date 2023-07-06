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

		JLabel lblNewLabel_1 = new JLabel("Seguro Condomínio");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblNewLabel_1.setBounds(88, 11, 232, 45);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("Basico");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(10, 0, 53, 25);

		JTextPane basico = new JTextPane();
		basico.setFont(new Font("Tahoma", Font.BOLD, 11));
		basico.setVisible(false);
		basico.setText("Incêndio\r\nroubo\r\ndanos elétricos\r\ndisp. aluguel \r\nResponsabilidade civil\r\n");
		basico.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		basico.setBounds(210, 79, 210, 165);

		JTextPane intermediario = new JTextPane();
		intermediario.setVisible(false);
		intermediario.setText(
				"incêndio\r\nroubo\r\ndanos elétricos\r\ndesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\n");
		intermediario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		intermediario.setBounds(210, 79, 210, 165);

		JTextPane completo = new JTextPane();
		completo.setVisible(false);
		completo.setText(
				"incêndio                              \r\nroubo                                   \r\ndanos elétricos  \r\ndesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\nVidros \r\nvazamento de tubulações \r\nincêndio\r\nroubo\r\ndanos elétricos\r\n");
		completo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		completo.setBounds(210, 79, 210, 165);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				basico.setVisible(true);
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
				lblNewLabel_3_1.setBounds(0, 0, 107, 25);
				panel_1_1_1.add(lblNewLabel_3_1);
				lblNewLabel_3_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						basico.setVisible(false);
						intermediario.setVisible(true);
						completo.setVisible(false);
					}
				});
				lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(153, 153, 153));
		panel_1_2.setBounds(45, 188, 107, 27);
		panel_1.add(panel_1_2);

		JLabel lblNewLabel_3_2 = new JLabel("Completo");
		lblNewLabel_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				basico.setVisible(false);
				intermediario.setVisible(false);
				completo.setVisible(true);
			}
		});
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3_2.setBounds(0, 0, 108, 25);
		panel_1_2.add(lblNewLabel_3_2);

		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Pagamento_GUI pagamento = new Tela_Pagamento_GUI();
				pagamento.frame.setVisible(true);
			}
		});
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
				frame.dispose();

			}
		});
		btnNewButton_1_1.setIcon(
				new ImageIcon(Tela_Condominio_GUI.class.getResource("/br/com/tokio/images/arrow_resized_resized.png")));
		btnNewButton_1_1.setBounds(330, 1, 39, 28);
		panel_1.add(btnNewButton_1_1);

		panel_1.add(basico);
		panel_1.add(intermediario);
		panel_1.add(completo);
		
		JLabel lblNewLabel_3_3 = new JLabel("Escolha seu plano:");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3_3.setBounds(9, 61, 133, 14);
		panel_1.add(lblNewLabel_3_3);
		
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(Tela_Condominio_GUI.class
						.getResource("/br/com/tokio/images/seguro_condominio_updated_resized (1).jpg")));
				lblNewLabel.setBounds(0, 0, 430, 278);
				panel_1.add(lblNewLabel);
	}
}
