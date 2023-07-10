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

import br.com.tokio.model.Seguro;


public class Tela_Casa_GUI {

	JFrame frame;
	private Seguro seguro = new Seguro();

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
		
		JLabel lblNewLabel_1 = new JLabel("Seguro Casa");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblNewLabel_1.setBounds(128, 11, 147, 45);
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
		panelCompleto.setBounds(36, 181, 107, 27);
		panel.add(panelCompleto);
		panelCompleto.setLayout(null);
		panelCompleto.setBackground(new Color(153, 153, 153));
		
		JLabel lblCompleto = new JLabel("Completo");
		lblCompleto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompleto.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCompleto.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		lblCompleto.setBounds(0, 0, 107, 25);
		panelCompleto.add(lblCompleto);
		
		JTextPane basico = new JTextPane();
		basico.setFont(new Font("Tahoma", Font.BOLD, 12));
		basico.setVisible(false);
		basico.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		basico.setText("Incêndio\r\nroubo\r\ndanos elétricos\r\ndisp. aluguel \r\nResponsabilidade civil\r\n");
		basico.setBounds(205, 81, 210, 81);
		panel.add(basico);
		
		JTextPane intermediario = new JTextPane();
		intermediario.setFont(new Font("Tahoma", Font.BOLD, 12));
		intermediario.setVisible(false);
		intermediario.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		intermediario.setText("incêndio\r\nroubo\r\ndanos elétricos\r\ndesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\n");
		intermediario.setBounds(205, 81, 210, 94);
		panel.add(intermediario);
		
		JTextPane completo = new JTextPane();
		completo.setFont(new Font("Tahoma", Font.BOLD, 12));
		completo.setVisible(false);
		completo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		completo.setText("incêndio                              \r\nroubo                                   \r\ndanos elétricos  \r\ndesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\nVidros \r\nvazamento de tubulações \r\nincêndio\r\nroubo\r\ndanos elétricos\r\n");
		completo.setBounds(205, 81, 210, 173);
		panel.add(completo);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorder(new LineBorder(Color.RED, 1, true));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\close_resized (2).png"));
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
		
		JLabel Value_completo = new JLabel("Valor: R$ 13,85 /mes ");
		Value_completo.setVisible(false);
		Value_completo.setBounds(272, 52, 124, 28);
		panel.add(Value_completo);
		
		JLabel Value_intermediario = new JLabel("Valor: R$ 8,75 /mes ");
		Value_intermediario.setVisible(false);
		Value_intermediario.setBounds(272, 52, 124, 28);
		panel.add(Value_intermediario);
		
		JLabel Value_basico = new JLabel("Valor: R$ 7,87 /mes ");
		Value_basico.setVisible(false);
		Value_basico.setBounds(272, 53, 124, 28);
		panel.add(Value_basico);
		
		JLabel lblBasico =new JLabel("Básico");
		lblBasico.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		lblBasico.setHorizontalAlignment(SwingConstants.CENTER);
		lblBasico.addMouseListener(new MouseAdapter() {
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
		lblBasico.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBasico.setBounds(0, 0, 107, 25);
		panelBasico.add(lblBasico);
		
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
				Value_basico.setVisible(false);
				Value_intermediario.setVisible(true);;
				Value_completo.setVisible(false);
				intermediario.setVisible(true);
				completo.setVisible(false);
			}
		});
		lblIntermediario.setBounds(0, 0, 107, 27);
		panelIntermediario.add(lblIntermediario);
		lblIntermediario.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3 = new JLabel("Escolha seu plano:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 66, 133, 14);
		panel.add(lblNewLabel_3);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Alberto Nunes ", "Maria Angelina", "Ricardo Soares", "João Alberto", "Cristiane Silva"}));
		comboBox.setToolTipText("");
		comboBox.setName("Alberto Nunes \r\nMaria Angelina\r\nRicardo Soares\r\nJoão Alberto\r\nCristiane Silva\r\n");
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setBounds(25, 244, 140, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Escolhe um corretor:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(9, 229, 156, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	JOptionPane.showMessageDialog(null, "voce escolheu...");
				if(basico.isVisible()) {
					seguro.setTipoSeguro("basico");
				} else if (intermediario.isVisible()) {
					seguro.setTipoSeguro("intermediario");
				} else if (completo.isVisible()) {
					seguro.setTipoSeguro("completo");
				}
				Tela_Pagamento_GUI pagamento = new Tela_Pagamento_GUI();
				pagamento.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(315, 254, 110, 23);
		panel.add(btnNewButton);
		
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
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
