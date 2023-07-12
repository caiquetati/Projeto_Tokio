package br.com.tokio.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import br.com.tokio.model.Corretor;
import br.com.tokio.model.Seguro;

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
		frame.setBounds(100, 100, 542, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 522, 338);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Seguro Casa");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblNewLabel_1.setBounds(200, 11, 147, 45);
		panel.add(lblNewLabel_1);

		JPanel panelBasico = new JPanel();
		panelBasico.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panelBasico.setBounds(36, 91, 107, 27);
		panelBasico.setBackground(new Color(153, 153, 153));
		panelBasico.setLayout(null);
		panel.add(panelBasico);

		JPanel panelIntermediario = new JPanel();
		panelIntermediario.setBounds(36, 129, 107, 27);
		panelIntermediario.setLayout(null);
		panelIntermediario.setBackground(new Color(153, 153, 153));
		panel.add(panelIntermediario);

		JPanel panelCompleto = new JPanel();
		panelCompleto.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panelCompleto.setBounds(36, 191, 107, 27);
		panel.add(panelCompleto);
		panelCompleto.setLayout(null);
		panelCompleto.setBackground(new Color(153, 153, 153));

		JLabel lblCompleto = new JLabel("Completo");
		lblCompleto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompleto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCompleto.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		lblCompleto.setBounds(0, 0, 107, 25);
		panelCompleto.add(lblCompleto);

		JTextPane txtpBasico = new JTextPane();
		txtpBasico.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpBasico.setVisible(false);
		txtpBasico.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtpBasico.setText("Incêndio\r\nRoubo\r\nDanos elétricos\r\nDisp. aluguel \r\nResponsabilidade civil\r\n");
		txtpBasico.setBounds(302, 111, 210, 81);
		panel.add(txtpBasico);

		JTextPane txtpIntermediario = new JTextPane();
		txtpIntermediario.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpIntermediario.setVisible(false);
		txtpIntermediario.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtpIntermediario.setText(
				"incêndio\r\nroubo\r\ndanos elétricos\r\ndesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\n");
		txtpIntermediario.setBounds(302, 111, 210, 94);
		panel.add(txtpIntermediario);

		JTextPane txtpCompleto = new JTextPane();
		txtpCompleto.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpCompleto.setVisible(false);
		txtpCompleto.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtpCompleto.setText(
				"Incêndio                              \r\nRoubo                                   \r\nDanos elétricos  \r\nDesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\nVidros \r\nVazamento de tubulações \r\nIncêndio\r\nRoubo\r\nDanos elétricos\r\n");
		txtpCompleto.setBounds(302, 111, 210, 173);
		panel.add(txtpCompleto);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Tela_Casa_GUI.class.getResource("/br/com/tokio/images/close_resized (2).png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(495, 0, 27, 28);
		panel.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1_1.setIcon(
				new ImageIcon(Tela_Casa_GUI.class.getResource("/br/com/tokio/images/arrow_resized_resized.png")));
		btnNewButton_1_1.setBounds(446, 0, 39, 28);
		panel.add(btnNewButton_1_1);

		JLabel Value_completo = new JLabel("Valor: R$ 13,85 /mês ");
		Value_completo.setFont(new Font("Tahoma", Font.BOLD, 12));
		Value_completo.setVisible(false);
		Value_completo.setBounds(351, 72, 147, 28);
		panel.add(Value_completo);

		JLabel Value_intermediario = new JLabel("Valor: R$ 8,75 /mês ");
		Value_intermediario.setFont(new Font("Tahoma", Font.BOLD, 12));
		Value_intermediario.setVisible(false);
		Value_intermediario.setBounds(351, 72, 147, 28);
		panel.add(Value_intermediario);

		JLabel Value_basico = new JLabel("Valor: R$ 7,87 /mês ");
		Value_basico.setFont(new Font("Tahoma", Font.BOLD, 12));
		Value_basico.setVisible(false);
		Value_basico.setBounds(351, 72, 147, 28);
		panel.add(Value_basico);

		JLabel lblBasico = new JLabel("Básico");
		lblBasico.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		lblBasico.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtpBasico.setVisible(true);
				Value_basico.setVisible(true);
				Value_intermediario.setVisible(false);
				Value_completo.setVisible(false);
				txtpIntermediario.setVisible(false);
				txtpCompleto.setVisible(false);
			}
		});
		lblBasico.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBasico.setBounds(0, 0, 107, 25);
		panelBasico.add(lblBasico);

		panelIntermediario.setBounds(36, 143, 107, 27);
		panel.add(panelIntermediario);
		panelIntermediario.setLayout(null);
		panelIntermediario.setBackground(new Color(153, 153, 153));

		JLabel lblIntermediario = new JLabel("Intermediário");
		lblIntermediario.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntermediario.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		lblIntermediario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtpBasico.setVisible(false);
				Value_basico.setVisible(false);
				Value_intermediario.setVisible(true);
				;
				Value_completo.setVisible(false);
				txtpIntermediario.setVisible(true);
				txtpCompleto.setVisible(false);
			}
		});
		lblIntermediario.setBounds(0, 0, 107, 27);
		panelIntermediario.add(lblIntermediario);
		lblIntermediario.setFont(new Font("Tahoma", Font.BOLD, 14));

		JLabel lblNewLabel_3 = new JLabel("Escolha seu plano:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 66, 133, 14);
		panel.add(lblNewLabel_3);

		JComboBox comboCorretor = new JComboBox();
		comboCorretor.setModel(new DefaultComboBoxModel(new String[] { "João Silva", "Pedro Santos", "Cássio Oliveira",
				"Neymar da Silva Santos Júnior", "Yuri Alberto Rodrigues" }));
		comboCorretor.setToolTipText("");
		comboCorretor
				.setName("Alberto Nunes \r\nMaria Angelina\r\nRicardo Soares\r\nJoão Alberto\r\nCristiane Silva\r\n");
		comboCorretor.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboCorretor.setBounds(47, 262, 140, 22);
		panel.add(comboCorretor);

		JLabel lblNewLabel_2 = new JLabel("Escolha um corretor:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(22, 247, 156, 14);
		panel.add(lblNewLabel_2);

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConfirmar.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seguro seguro = Tela_Main_GUI.getSeguro();

				if (txtpBasico.isVisible()) {
					seguro.setPlanoSeguro("basico");
					seguro.setVlSeguro(100000);
				} else if (txtpIntermediario.isVisible()) {
					seguro.setPlanoSeguro("intermediario");
					seguro.setVlSeguro(100000);
				} else if (txtpCompleto.isVisible()) {
					seguro.setPlanoSeguro("completo");
					seguro.setVlSeguro(100000);
				}

				Corretor corretor = Tela_Main_GUI.getCorretor();
				Tela_Assistencia_GUI assistencia = new Tela_Assistencia_GUI();
				assistencia.frame.setVisible(true);
			}
		});
		btnConfirmar.setBounds(412, 315, 110, 23);
		panel.add(btnConfirmar);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setIcon(
				new ImageIcon(Tela_Casa_GUI.class.getResource("/br/com/tokio/images/casa_resized_updated.jpg")));
		lblNewLabel.setBounds(0, 0, 522, 338);
		panel.add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 542, 360);
		panel_2.setBackground(new Color(20, 129, 99));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Tela_Casa_GUI.class.getResource("/br/com/tokio/images/fundo_casa.png")));
		lblNewLabel_4.setBounds(0, 0, 542, 360);
		panel_2.add(lblNewLabel_4);

	}

	private static class __Tmp {
		private static void __tmp() {
			javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}

}
