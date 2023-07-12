package br.com.tokio.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import br.com.tokio.model.Seguro;

public class Tela_Assistencia_GUI {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Assistencia_GUI window = new Tela_Assistencia_GUI();
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
	public Tela_Assistencia_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 539, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 539, 360);
		frame.getContentPane().add(panel);
		panel.setBackground(new Color(20, 129, 99));
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(46, 139, 87));
		panel_1.setBounds(10, 11, 519, 338);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(34, 111, 82, 33);
		panel_2.setBackground(new Color(60, 179, 113));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		JList listHrs = new JList();
		listHrs.setVisible(false);

		JList listEspecial = new JList();
		listEspecial.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		listEspecial.setVisible(false);

		JList listVIP = new JList();
		listVIP.setVisible(false);

		JLabel valor_hrs = new JLabel("Valor: R$19,53/mês");
		valor_hrs.setVisible(false);
		valor_hrs.setFont(new Font("Tahoma", Font.BOLD, 12));
		valor_hrs.setHorizontalAlignment(SwingConstants.LEFT);
		valor_hrs.setBounds(344, 63, 143, 23);
		panel_1.add(valor_hrs);

		JLabel Valor_especial = new JLabel("Valor: R$29,23/mês");
		Valor_especial.setVisible(false);
		Valor_especial.setFont(new Font("Tahoma", Font.BOLD, 12));
		Valor_especial.setHorizontalAlignment(SwingConstants.LEFT);
		Valor_especial.setBounds(344, 63, 143, 23);
		panel_1.add(Valor_especial);

		JLabel valor_vip = new JLabel("Valor: R$38,15/mês");
		valor_vip.setVisible(false);
		valor_vip.setFont(new Font("Tahoma", Font.BOLD, 12));
		valor_vip.setHorizontalAlignment(SwingConstants.LEFT);
		valor_vip.setBounds(344, 63, 123, 23);
		panel_1.add(valor_vip);
		
		JLabel lblNewLabel_2 = new JLabel("24HRS");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				listHrs.setVisible(true);
				listEspecial.setVisible(false);
				listVIP.setVisible(false);
				valor_hrs.setVisible(true);
				Valor_especial.setVisible(false);
				valor_vip.setVisible(false);

			}
		});
		
		
		
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 0, 82, 33);
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Especial");
		lblNewLabel_3.setBounds(0, 0, 82, 33);

		JLabel lblNewLabel_1 = new JLabel("Escolha sua assistência:\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 74, 185, 33);
		panel_1.add(lblNewLabel_1);

		listHrs.setFont(new Font("Tahoma", Font.BOLD, 12));
		listHrs.setModel(new AbstractListModel() {
			String[] values = new String[] { "Chaveiro", "Encanador", "Eletricista", "Desentupidora", "Vidraceiro",
					"Help Desk" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listHrs.setName("\r\n");
		listHrs.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		listHrs.setBackground(new Color(255, 255, 224));
		listHrs.setBounds(316, 82, 151, 110);
		panel_1.add(listHrs);

		listEspecial.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		listEspecial.setVisible(false);
		listEspecial.setFont(new Font("Tahoma", Font.BOLD, 12));
		listEspecial.setBackground(new Color(255, 255, 224));
		listEspecial.setModel(new AbstractListModel() {
			String[] values = new String[] {"Linha Branca ", "Linha Marrom", "Limpeza de caixa de água ", "Limpeza de calhas", "Verificação de possíveis", " vazamentos", "Troca de  lâmpada, ", "tomada e interrupitores", "Chaveiro", "Encanador", "Eletricista", "Desentupidora", "Vidraceiro", "Help Desk"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listEspecial.setBounds(316, 82, 171, 211);
		panel_1.add(listEspecial);

		listVIP.setVisible(false);
		listVIP.setFont(new Font("Tahoma", Font.BOLD, 12));
		listVIP.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		listVIP.setBackground(new Color(255, 255, 224));
		listVIP.setModel(new AbstractListModel() {
			String[] values = new String[] {"Linha Branca", "Linha Marrom", "Limpeza de ar condicionado", "Caçamba", "Instalação de suporte de TV", "Limpeza de raios e trovões", "Descarte Inteligente"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listVIP.setBounds(316, 82, 193, 126);
		panel_1.add(listVIP);

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(
				new ImageIcon(Tela_Assistencia_GUI.class.getResource("/br/com/tokio/images/close_resized (2).png")));
		lblNewLabel_5.setBounds(487, 0, 32, 32);
		panel_1.add(lblNewLabel_5);

		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		lblNewLabel_5_1.setIcon(new ImageIcon(
				Tela_Assistencia_GUI.class.getResource("/br/com/tokio/images/arrow_resized_resized.png")));
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setBounds(451, 0, 32, 32);
		panel_1.add(lblNewLabel_5_1);

		JLabel lblNewLabel = new JLabel("ASSISTÊNCIA");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 519, 52);
		panel_1.add(lblNewLabel);

		

		JLabel lblNewLabel_4 = new JLabel("VIP");
		lblNewLabel_4.setBounds(34, 246, 82, 33);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				listHrs.setVisible(false);
				listEspecial.setVisible(false);
				listVIP.setVisible(true);
				valor_hrs.setVisible(false);
				Valor_especial.setVisible(false);
				valor_vip.setVisible(true);

			}
		});
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));

		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(34, 246, 82, 33);
		panel_2_2.setBackground(new Color(60, 179, 113));
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(60, 179, 113));
		panel_2_1.setBounds(34, 175, 82, 33);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);

		JButton btnConfirmar = new JButton("Confrmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seguro seguro = Tela_Main_GUI.getSeguro();
				if(listHrs.isVisible()) {
					seguro.setTipoAssistencia("24HRS");
				} else if(listEspecial.isVisible()) {
					seguro.setTipoAssistencia("ESPECIAL");
				} else if(listVIP.isVisible()) {
					seguro.setTipoAssistencia("VIP");
				}
				Tela_Pagamento_GUI tela = new Tela_Pagamento_GUI();
				tela.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnConfirmar.setBounds(420, 304, 89, 23);
		panel_1.add(btnConfirmar);

		panel_2_1.add(lblNewLabel_3);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				listHrs.setVisible(false);
				listEspecial.setVisible(true);
				listVIP.setVisible(false);
				valor_hrs.setVisible(false);
				Valor_especial.setVisible(true);
				valor_vip.setVisible(false);
			}
		});
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Tela_Assistencia_GUI.class.getResource("/br/com/tokio/images/suporte-tecnico_resized.png")));
		lblNewLabel_6.setBounds(148, 132, 144, 119);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Tela_Assistencia_GUI.class.getResource("/br/com/tokio/images/fundo_casa.png")));
		lblNewLabel_7.setBounds(0, 0, 539, 360);
		panel.add(lblNewLabel_7);
	}
}
