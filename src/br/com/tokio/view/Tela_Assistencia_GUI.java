package br.com.tokio.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.border.MatteBorder;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		JList hrs = new JList();
		hrs.setVisible(false);

		JList especial = new JList();
		especial.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		especial.setVisible(false);

		JList list = new JList();
		list.setVisible(false);

		JLabel lblNewLabel_2 = new JLabel("24HRS");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				hrs.setVisible(true);
				especial.setVisible(false);
				list.setVisible(false);

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

		hrs.setFont(new Font("Tahoma", Font.BOLD, 12));
		hrs.setModel(new AbstractListModel() {
			String[] values = new String[] { "Chaveiro", "Encanador", "Eletricista", "Desentupidora", "Vidraceiro",
					"Help Desk" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		hrs.setName("\r\n");
		hrs.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		hrs.setBackground(new Color(255, 255, 224));
		hrs.setBounds(316, 82, 151, 110);
		panel_1.add(hrs);

		especial.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		especial.setVisible(false);
		especial.setFont(new Font("Tahoma", Font.BOLD, 12));
		especial.setBackground(new Color(255, 255, 224));
		especial.setModel(new AbstractListModel() {
			String[] values = new String[] { "Linha Branca ", "Linha Marrom", "Limpeza de caixa de agua ",
					"Limpeza de calhas", "Verificaçao de possiveis vazamentos",
					"Troca de lampada, tomada e interrupitores", "Chaveiro", "Encanador", "Eletricista",
					"Desentupidora", "Vidraceiro", "Help Desk" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		especial.setBounds(316, 82, 151, 208);
		panel_1.add(especial);

		list.setVisible(false);
		list.setFont(new Font("Tahoma", Font.BOLD, 12));
		list.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		list.setBackground(new Color(255, 255, 224));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "Linha Branca", "Linha Marrom", "Limpeza de ar condicionado", "Caçamba",
					"Instalaçao de suporte de TV", "Limpeza de raios e trovões", "Descarte Inteligente" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(316, 82, 151, 126);
		panel_1.add(list);

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
		lblNewLabel_5.setBounds(487, -4, 32, 32);
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
		lblNewLabel_5_1.setBounds(450, -4, 32, 32);
		panel_1.add(lblNewLabel_5_1);

		JLabel lblNewLabel = new JLabel("ASSISTÊNCIA");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 519, 52);
		panel_1.add(lblNewLabel);

		JLabel valor_hrs = new JLabel("Valor: R$19,53");
		valor_hrs.setHorizontalAlignment(SwingConstants.CENTER);
		valor_hrs.setBounds(370, 63, 97, 23);
		panel_1.add(valor_hrs);

		JLabel Valor_especial = new JLabel("Valor: R$29,23");
		Valor_especial.setHorizontalAlignment(SwingConstants.CENTER);
		Valor_especial.setBounds(370, 63, 97, 23);
		panel_1.add(Valor_especial);

		JLabel valor_vip = new JLabel("Valor: R$38,15");
		valor_vip.setHorizontalAlignment(SwingConstants.CENTER);
		valor_vip.setBounds(370, 63, 97, 23);
		panel_1.add(valor_vip);

		JLabel lblNewLabel_4 = new JLabel("VIP");
		lblNewLabel_4.setBounds(34, 246, 82, 33);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				hrs.setVisible(false);
				especial.setVisible(false);
				list.setVisible(true);
				valor_hrs.setVisible(false);

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

		JButton btnNewButton = new JButton("Confrmar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Pagamento_GUI tela = new Tela_Pagamento_GUI();
				tela.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(420, 304, 89, 23);
		panel_1.add(btnNewButton);

		panel_2_1.add(lblNewLabel_3);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				hrs.setVisible(false);
				especial.setVisible(true);
				list.setVisible(false);
			}
		});
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
	}
}
