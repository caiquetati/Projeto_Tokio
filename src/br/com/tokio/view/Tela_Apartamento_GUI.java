package br.com.tokio.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

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
	public Tela_Apartamento_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 541, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 541, 364);
		panel.setBackground(new Color(20, 129, 99));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 521, 342);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton confirmar = new JButton("Confirmar");
		confirmar.setFont(new Font("Tahoma", Font.BOLD, 12));
		confirmar.addActionListener(new ActionListener() {
			private Object texto;
			private int resposta;

			public void actionPerformed(ActionEvent e) {
				
				escolha();
				if (resposta == JOptionPane.YES_OPTION) {
		            JOptionPane.showMessageDialog(null, "Boa, soldado!");
		        } else {
		        	Tela_Pagamento_GUI pagamento = new Tela_Pagamento_GUI();
					pagamento.frame.setVisible(true);
					frame.dispose();
		        }
//					Tela_Pagamento_GUI pagamento = new Tela_Pagamento_GUI();
//					pagamento.frame.setVisible(true);
//					frame.dispose();
				
					
				
				
			}
		});
		confirmar.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		confirmar.setBounds(410, 319, 111, 23);
		panel_1.add(confirmar);
		
		JLabel lblNewLabel_1 = new JLabel("Seguro Apartamento");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblNewLabel_1.setBounds(162, 11, 238, 33);
		panel_1.add(lblNewLabel_1);
		
		JLabel Value_basico = new JLabel("Valor: R$19,53 /mes");
		Value_basico.setVisible(false);
		Value_basico.setFont(new Font("Tahoma", Font.BOLD, 11));
		Value_basico.setBounds(378, 94, 126, 14);
		panel_1.add(Value_basico);
		
		
		JTextPane basico = new JTextPane();
		basico.setFont(new Font("Tahoma", Font.BOLD, 12));
		basico.setVisible(false);
		basico.setText("Incêndio\r\nroubo\r\ndanos elétricos\r\ndisp. aluguel \r\nResponsabilidade civil\r\n");
		basico.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		basico.setBounds(294, 118, 210, 85);
		panel_1.add(basico);
		
		
		JLabel Value_intermediario = new JLabel("Valor: R$22,94 /mes");
		Value_intermediario.setVisible(false);
		Value_intermediario.setFont(new Font("Tahoma", Font.BOLD, 11));
		Value_intermediario.setBounds(378, 94, 126, 14);
		panel_1.add(Value_intermediario);
		
		JLabel Value_completo = new JLabel("Valor: R$28,43 /mes");
		Value_completo.setVisible(false);
		Value_completo.setFont(new Font("Tahoma", Font.BOLD, 11));
		Value_completo.setBounds(378, 94, 126, 14);
		panel_1.add(Value_completo);
		
		JTextPane intermediario = new JTextPane();
		intermediario.setFont(new Font("Tahoma", Font.BOLD, 12));
		intermediario.setVisible(false);
		intermediario.setText("incêndio\r\nroubo\r\ndanos elétricos\r\ndesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\n");
		intermediario.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		intermediario.setBounds(294, 118, 210, 109);
		panel_1.add(intermediario);
		
		JTextPane completo = new JTextPane();
		completo.setFont(new Font("Tahoma", Font.BOLD, 12));
		completo.setVisible(false);
		completo.setText("incêndio                              \r\nroubo                                   \r\ndanos elétricos  \r\ndesp. aluguel \r\nResponsabilidade civil\r\nVendável\r\nVidros \r\nvazamento de tubulações \r\nincêndio\r\nroubo\r\ndanos elétricos\r\n");
		completo.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		completo.setBounds(294, 118, 210, 168);
    
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
				Value_basico.setVisible(true);
				Value_intermediario.setVisible(false);;
				Value_completo.setVisible(false);
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
				Value_basico.setVisible(false);
				Value_intermediario.setVisible(true);;
				Value_completo.setVisible(false);
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
		panel_1_2.setBounds(26, 176, 107, 27);
		panel_1.add(panel_1_2);
		
		JLabel lblCompleto = new JLabel("Completo");
		lblCompleto.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		lblCompleto.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompleto.addMouseListener(new MouseAdapter() {
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
		btnNewButton_1.setBounds(490, 0, 31, 33);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Main_GUI main = new Tela_Main_GUI();
				main.frame.setVisible(true);
				main.frame.setLocationRelativeTo(null);
				frame.dispose();
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon(Tela_Apartamento_GUI.class.getResource("/br/com/tokio/images/arrow_resized_resized.png")));
		btnNewButton_1_1.setBounds(441, 0, 39, 33);
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Escolha seu plano:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 62, 133, 14);
		panel_1.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Alberto Nunes ", "Maria Angelina", "Ricardo Soares", "João Alberto", "Cristiane Silva"}));
		comboBox.setName("Alberto Nunes \r\nMaria Angelina\r\nRicardo Soares\r\nJoão Alberto\r\nCristiane Silva\r\n");
		comboBox.setToolTipText("");
		comboBox.setBounds(46, 245, 140, 22);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Escolhe um corretor:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(26, 231, 156, 14);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tela_Apartamento_GUI.class.getResource("/br/com/tokio/images/apartamento_resized_updated.jpeg")));
		lblNewLabel.setBounds(0, 0, 521, 342);
		panel_1.add(lblNewLabel);
		
		
	}public void escolha(){
		String[] options = { "Sim", "Não" };
        int resposta = JOptionPane.showOptionDialog(null, "Você é um soldado?", "Pergunta",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	}
}
