package br.com.tokio.view;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.text.ParseException;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import javax.swing.text.MaskFormatter;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.border.MatteBorder;

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
		panel.setBorder(new MatteBorder(5, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 450, 300);
		panel.setBackground(new Color(20, 129, 99));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		
		panel_1.setBorder(new MatteBorder(5, 4, 2, 3, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(10, 11, 430, 278);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openInstagram();
			}
		});
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icon_instagram_resized.png"));
		lblNewLabel.setBounds(368, 237, 30, 30);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openFacebook();
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icon facebook_resized.png"));
		lblNewLabel_1.setBounds(328, 237, 30, 30);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openLinkedin();
			}
		});
		lblNewLabel_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\linkedin_tokio_resized.png"));
		lblNewLabel_1_1.setBounds(288, 237, 30, 30);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(new MatteBorder(1, 1, 1, 2, (Color) new Color(255, 0, 0)));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(Tela_Inicial_GUI.class.getResource("/br/com/tokio/images/CLOSE_resized.png")));
		lblNewLabel_2.setBounds(395, 11, 25, 30);
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
		formattedTextField_1.setBounds(138, 122, 180, 20);
		panel_1.add(formattedTextField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		passwordField.setBounds(138, 163, 180, 20);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("CPF:\r\n");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(118, 93, 60, 30);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Senha:\r\n");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(118, 142, 60, 20);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Não possui cadastro?");
		lblNewLabel_5.setForeground(Color.WHITE);
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
		lblNewLabel_5.setBounds(209, 183, 149, 14);
		panel_1.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tela_Main_GUI cadastro = new Tela_Main_GUI();
				JOptionPane.showMessageDialog(null,"Dados corretos, seja bem vindo!");
				cadastro.frame.setVisible(true);
				frame.dispose();
					
			}
		});
		btnNewButton.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton.setBounds(229, 203, 89, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 openWats();
			}
		});
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\watts_logo_resized.jpg"));
		lblNewLabel_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1.setBounds(248, 237, 30, 30);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openDulvidas();
			}
		});
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\5a3698b221c196.3039888215135274741383_resized.png"));
		lblNewLabel_2_1.setBounds(360, 11, 25, 30);
		panel_1.add(lblNewLabel_2_1);
		
		
		
		
	}
	 private static void openInstagram() {
	        try {
	            URI uri = new URI("https://www.instagram.com/tokiomarineseguradora"); 
	            Desktop.getDesktop().browse(uri);
	        } catch (Exception e) {
	            e.printStackTrace();}
	        }
	        private static void openFacebook() {
		        try {
		            URI uri = new URI("https://www.facebook.com/TokioMarineSeguradora");
		            Desktop.getDesktop().browse(uri);
		        } catch (Exception e) {
		            e.printStackTrace();
		        }}
	        private static void openLinkedin() {
		        try {
		            URI uri = new URI("https://www.linkedin.com/company/tokio-marine-seguradora-s-a/");
		            Desktop.getDesktop().browse(uri);
		        } catch (Exception e) {
		            
		        	 e.printStackTrace();
		        	 }}	private static void openWats() {
		        try {
		            URI uri = new URI("https://api.whatsapp.com/send/?phone=5511961762834&text&type=phone_number&app_absent=0");
		            Desktop.getDesktop().browse(uri);
		        } catch (Exception e) {
		            e.printStackTrace();}
		        }private static void openDulvidas() {
			        try {
			            URI uri = new URI("https://docs.google.com/document/d/1oALTDDmqvJZ56OjX-miOh3cdlJV5kLIB30OqqQmuUEs/edit?pli=1"); 
			            Desktop.getDesktop().browse(uri);//https://www.instagram.com/tokiomarineseguradora
			        } catch (Exception e) {
			            e.printStackTrace();}
			        }
}

