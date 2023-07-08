package br.com.tokio.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class Tela_Apartamento_GUI {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Apartamento_GUI window = new Tela_Apartamento_GUI();
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
	public Tela_Apartamento_GUI() {
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
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 450, 300);
		panel.setBackground(new Color(20, 129, 99));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 430, 278);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Pagamento_GUI pagamento = new Tela_Pagamento_GUI();
				pagamento.frame.setVisible(true);
			}
		});
		btnNewButton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		btnNewButton.setBounds(321, 255, 111, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Seguro Apartamento");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblNewLabel_1.setBounds(81, 11, 238, 33);
		panel_1.add(lblNewLabel_1);
		
		JTextPane basico = new JTextPane();
		basico.setFont(new Font("Tahoma", Font.BOLD, 11));
		basico.setVisible(false);
		basico.setText("Incêndio\r\nroubo\r\ndanos elétricos\r\ndisp. aluguel \r\nResponsabilidade civil\r\n");
		basico.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		basico.setBounds(210, 87, 210, 155);
		panel_1.add(basico);
		
		JTextPane intermediario = new JTextPane();
		intermediario.setVisible(false);
		intermediario.setText("incêndio\r\nroubo\r\ndanos elétricos\r\ndesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\n");
		intermediario.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		intermediario.setBounds(210, 87, 210, 155);
		panel_1.add(intermediario);
		
		JTextPane completo = new JTextPane();
		completo.setVisible(false);
		completo.setText("incêndio                              \r\nroubo                                   \r\ndanos elétricos  \r\ndesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\nVidros \r\nvazamento de tubulações \r\nincêndio\r\nroubo\r\ndanos elétricos\r\n");
		completo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		completo.setBounds(210, 87, 210, 155);
		panel_1.add(completo);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(153, 153, 153));
		panel_1_1.setBounds(26, 87, 107, 27);
		panel_1.add(panel_1_1);
		
		JLabel lblBasico = new JLabel("Básico");
		lblBasico.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		lblBasico.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				basico.setVisible(true);
				intermediario.setVisible(false);
				completo.setVisible(false);
			}
		});
		lblBasico.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBasico.setBounds(0, 0, 107, 27);
		panel_1_1.add(lblBasico);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(153, 153, 153));
		panel_1_1_1.setBounds(26, 131, 107, 27);
		panel_1.add(panel_1_1_1);
		
		JLabel lblIntermediario = new JLabel("Intermediario");
		lblIntermediario.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		lblIntermediario.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntermediario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				basico.setVisible(false);
				intermediario.setVisible(true);
				completo.setVisible(false);
			}
		});
		lblIntermediario.setBounds(0, 0, 107, 27);
		panel_1_1_1.add(lblIntermediario);
		lblIntermediario.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(153, 153, 153));
		panel_1_2.setBounds(26, 169, 107, 27);
		panel_1.add(panel_1_2);
		
		JLabel lblCompleto = new JLabel("Completo");
		lblCompleto.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		lblCompleto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompleto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				basico.setVisible(false);
				intermediario.setVisible(false);
				completo.setVisible(true);
			}
		});
		lblCompleto.setBounds(0, 0, 107, 25);
		panel_1_2.add(lblCompleto);
		lblCompleto.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\close_resized (2).png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(389, 11, 31, 33);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Main_GUI main = new Tela_Main_GUI();
				main.frame.setVisible(true);
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(Tela_Apartamento_GUI.class.getResource("/br/com/tokio/images/arrow_resized_resized.png")));
		btnNewButton_1_1.setBounds(340, 11, 39, 33);
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Escolha seu plano:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 62, 133, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tela_Apartamento_GUI.class.getResource("/br/com/tokio/images/apartamento_resized_updated.jpg")));
		lblNewLabel.setBounds(0, 0, 430, 278);
		panel_1.add(lblNewLabel);
	}

}
