package br.com.tokio.view;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;

import br.com.tokio.controller.UsuarioDAO;

public class Tela_Inicial_GUI {

	public JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				try {
					Tela_Inicial_GUI window = new Tela_Inicial_GUI();
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
	public Tela_Inicial_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBackground(new Color(20, 129, 99));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(0, 0, 450, 300);
		panel.setBackground(new Color(20, 129, 99));
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();

		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(46, 139, 87));
		panel_1.setBounds(10, 11, 430, 278);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openInstagram();
			}
		});
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\instagram_resized (1).png"));
		lblNewLabel.setBounds(50, 237, 30, 30);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openFacebook();
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\facebook (1)_resized.png"));
		lblNewLabel_1.setBounds(130, 237, 30, 30);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openLinkedin();
			}
		});
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\linkedin_resized.png"));
		lblNewLabel_1_1.setBounds(90, 237, 30, 30);
		panel_1.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\close_resized (2).png"));
		lblNewLabel_2.setBounds(405, 0, 25, 30);
		panel_1.add(lblNewLabel_2);

		MaskFormatter mascaraCPF = null;
		try {
			mascaraCPF = new MaskFormatter("###.###.###-##");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(mascaraCPF);
		formattedTextField_1.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		formattedTextField_1.setBounds(138, 116, 180, 20);
		panel_1.add(formattedTextField_1);

		passwordField = new JPasswordField();
		passwordField.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		passwordField.setBounds(138, 147, 180, 20);
		panel_1.add(passwordField);

		JLabel lblNewLabel_3 = new JLabel("CPF:\r\n");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(81, 110, 37, 30);
		panel_1.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Senha:\r\n");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(81, 147, 60, 20);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Não possui cadastro?");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {
				lblNewLabel_5.setForeground(Color.BLUE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_5.setForeground(Color.BLACK);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				TelaCadastro_GUI cadastro = null;
				try {
					cadastro = new TelaCadastro_GUI();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				cadastro.frame.setVisible(true);
				frame.dispose();
			}
		});
		lblNewLabel_5.setBounds(183, 173, 135, 14);
		panel_1.add(lblNewLabel_5);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioDAO dao = new UsuarioDAO();
				int id = Integer.parseInt(formattedTextField_1.getText());
				dao.selectById(id);

				Tela_Main_GUI cadastro = new Tela_Main_GUI();
				JOptionPane.showMessageDialog(null, "Dados corretos, seja bem vindo!");
				cadastro.frame.setVisible(true);
				frame.dispose();

			}
		});
		btnNewButton.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton.setBounds(229, 200, 89, 23);
		panel_1.add(btnNewButton);

		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openWats();
			}
		});
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\whatsapp (1)_resized.png"));
		lblNewLabel_1_1_1.setBounds(10, 237, 30, 30);
		panel_1.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openDulvidas();
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\problem (2)_resized.png"));
		lblNewLabel_2_1.setBounds(373, 0, 25, 30);
		panel_1.add(lblNewLabel_2_1);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBackground(new Color(0, 0, 0));
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\ang.png"));
		lblNewLabel_6.setBounds(0, 0, 395, 105);
		panel_1.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\profile_resized.png"));
		lblNewLabel_7.setBounds(328, 116, 74, 59);
		panel_1.add(lblNewLabel_7);

	}

	private static void openInstagram() {
		try {
			URI uri = new URI("https://www.instagram.com/tokiomarineseguradora");
			Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void openFacebook() {
		try {
			URI uri = new URI("https://www.facebook.com/TokioMarineSeguradora");
			Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void openLinkedin() {
		try {
			URI uri = new URI("https://www.linkedin.com/company/tokio-marine-seguradora-s-a/");
			Desktop.getDesktop().browse(uri);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	private static void openWats() {
		try {
			URI uri = new URI("https://api.whatsapp.com/send/?phone=5511961762834&text&type=phone_number&app_absent=0");
			Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
}
