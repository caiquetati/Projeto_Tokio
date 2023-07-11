package br.com.tokio.view;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import br.com.tokio.model.Corretor;
import br.com.tokio.model.Seguro;
import br.com.tokio.model.Usuario;

public class Tela_Main_GUI {

	JFrame frame;
	private static Usuario usuarioAtual;
	private static Seguro seguro = new Seguro();
	private static Corretor corretor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Main_GUI window = new Tela_Main_GUI();
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
	public Tela_Main_GUI() {
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
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		panel.setBackground(new Color(20, 129, 99));
		panel.setBounds(0, 0, 539, 360);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(60, 179, 113));
		panel_1.setBounds(49, 35, 435, 314);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Seguro");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblNewLabel_1.setBounds(10, 12, 188, 39);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Residencial");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Lucida Bright", Font.BOLD, 22));
		lblNewLabel_2.setBounds(10, 48, 188, 28);
		panel_1.add(lblNewLabel_2);

		JPanel panelCondominio = new JPanel();
		panelCondominio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tela_Condominio_GUI cond = new Tela_Condominio_GUI();
				cond.frame.setVisible(true);
				cond.frame.setLocationRelativeTo(null);

			}
		});
		panelCondominio.setBorder(UIManager.getBorder("CheckBox.border"));
		panelCondominio.setBackground(new Color(204, 204, 204));
		panelCondominio.setBounds(10, 234, 197, 28);
		panel_1.add(panelCondominio);
		panelCondominio.setLayout(null);

		JLabel lblCondominio = new JLabel("CONDOMÍNIO");
		lblCondominio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCondominio.setBounds(68, 0, 119, 25);
		panelCondominio.add(lblCondominio);

		JLabel lblCondominioIcon = new JLabel("");
		lblCondominioIcon.setIcon(
				new ImageIcon(Tela_Main_GUI.class.getResource("/br/com/tokio/images/condominium_resized.png")));
		lblCondominioIcon.setBounds(10, -10, 48, 38);
		panelCondominio.add(lblCondominioIcon);

		JPanel panelApartamento = new JPanel();
		panelApartamento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tela_Apartamento_GUI apartamento = new Tela_Apartamento_GUI();
				apartamento.frame.setVisible(true);
				apartamento.frame.setLocationRelativeTo(null);

			}
		});
		panelApartamento.setBorder(UIManager.getBorder("CheckBox.border"));
		panelApartamento.setBackground(new Color(204, 204, 204));
		panelApartamento.setBounds(10, 174, 197, 28);
		panel_1.add(panelApartamento);
		panelApartamento.setLayout(null);

		JLabel lblApartamentoICon = new JLabel("");
		lblApartamentoICon
				.setIcon(new ImageIcon(Tela_Main_GUI.class.getResource("/br/com/tokio/images/architect_resized.png")));
		lblApartamentoICon.setBounds(21, 0, 38, 25);
		panelApartamento.add(lblApartamentoICon);

		JLabel lblApartamento = new JLabel("APARTAMENTO");
		lblApartamento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApartamento.setBounds(69, -3, 121, 28);
		panelApartamento.add(lblApartamento);

		JPanel panelCasa = new JPanel();
		panelCasa.setBorder(UIManager.getBorder("CheckBox.border"));
		panelCasa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setEnabled(false); // Impedir do usuario mexer na janela anterior
				seguro.setTipoSeguro("casa");
				Tela_Casa_GUI casa = new Tela_Casa_GUI();
				casa.frame.setLocationRelativeTo(null);
				casa.frame.setVisible(true);
				;

			}
		});
		panelCasa.setBackground(new Color(204, 204, 204));
		panelCasa.setBounds(10, 112, 197, 28);
		panel_1.add(panelCasa);
		panelCasa.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(-21, -3, 56, 28);
		panelCasa.add(lblNewLabel_3);

		JLabel lblCasaIcon = new JLabel("");
		lblCasaIcon.setIcon(new ImageIcon(Tela_Main_GUI.class.getResource("/br/com/tokio/images/house_resized.png")));
		lblCasaIcon.setBounds(10, 0, 57, 25);
		panelCasa.add(lblCasaIcon);

		JLabel lblCasa = new JLabel("CASA");
		lblCasa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCasa.setBounds(68, 0, 119, 25);
		panelCasa.add(lblCasa);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNewLabel.setBounds(208, 12, 217, 288);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Tela_Main_GUI.class.getResource("/br/com/tokio/images/Main_Image.jpg")));

		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_10.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(255, 0, 0)));
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\close_resized (2).png"));
		lblNewLabel_10.setBounds(494, 11, 35, 30);
		panel.add(lblNewLabel_10);

		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openDulvidas();
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\problem (2)_resized.png"));
		lblNewLabel_2_1.setBounds(494, 52, 35, 30);
		panel.add(lblNewLabel_2_1);
	}

	private static void openDulvidas() {
		try {
			URI uri = new URI(
					"https://docs.google.com/document/d/1oALTDDmqvJZ56OjX-miOh3cdlJV5kLIB30OqqQmuUEs/edit?pli=1");
			Desktop.getDesktop().browse(uri);// https://www.instagram.com/tokiomarineseguradora
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		Tela_Main_GUI.seguro = seguro;
	}

	public static Usuario getUsuarioAtual() {
		return usuarioAtual;
	}

	public static void setUsuarioAtual(Usuario usuarioAtual) {
		Tela_Main_GUI.usuarioAtual = usuarioAtual;
	}

	public static Corretor getCorretor() {
		return corretor;
	}

	public static void setCorretor(Corretor corretor) {
		Tela_Main_GUI.corretor = corretor;
	}	
	
	

}
