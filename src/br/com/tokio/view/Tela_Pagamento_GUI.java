package br.com.tokio.view;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import javax.swing.border.MatteBorder;

public class Tela_Pagamento_GUI {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Pagamento_GUI window = new Tela_Pagamento_GUI();
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
	public Tela_Pagamento_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 524, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 524, 344);
		panel.setBackground(new Color(20, 129, 99));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 504, 322);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pagamento ");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(203, 11, 157, 38);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(40, 179, 335, 111);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nº cartão");
		lblNewLabel_2.setBounds(21, 11, 84, 14);
		panel_2.add(lblNewLabel_2);
		
		MaskFormatter mascaraTel = null;
		try {
			mascaraTel = new MaskFormatter("#### #### #### ####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JFormattedTextField formattedTextField = new JFormattedTextField(mascaraTel);
		
		formattedTextField.setBounds(31, 24, 139, 20);
		panel_2.add(formattedTextField);
		
		JLabel lblNewLabel_3 = new JLabel("CVV");
		lblNewLabel_3.setBounds(21, 55, 46, 14);
		panel_2.add(lblNewLabel_3);
		
		MaskFormatter mascaraTel2 = null;
		try {
			mascaraTel2 = new MaskFormatter("###");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(mascaraTel2);
		formattedTextField_1.setBounds(31, 69, 55, 20);
		panel_2.add(formattedTextField_1);
		
		JLabel lblNewLabel_4 = new JLabel("Validade");
		lblNewLabel_4.setBounds(106, 55, 46, 14);
		panel_2.add(lblNewLabel_4);
		
		MaskFormatter marcaraTel3 = null;
		try {
			MaskFormatter mascaraTel3 = new MaskFormatter("##/##");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JFormattedTextField formattedTextField_2 = new JFormattedTextField(mascaraTel);
		formattedTextField_2.setBounds(131, 69, 64, 20);
		panel_2.add(formattedTextField_2);
		
		JButton btnNewButton_3 = new JButton("Confirmar");
		btnNewButton_3.setBounds(225, 88, 89, 23);
		panel_2.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\qrcode_resized.jpg"));
		lblNewLabel_1.setBounds(405, 194, 89, 96);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Debito");
		btnNewButton.setBounds(40, 127, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Credito");
		btnNewButton_1.setBounds(157, 127, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("PIX ");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(408, 166, 86, 28);
		panel_1.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("Boleto");
		btnNewButton_2.setBounds(271, 127, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("Escolha o meio de pagamento");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(89, 76, 234, 40);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_7.setIcon(new ImageIcon(Tela_Pagamento_GUI.class.getResource("/br/com/tokio/images/CLOSE_resized.png")));
		lblNewLabel_7.setBounds(479, 0, 25, 38);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tela_Main_GUI voltar = new Tela_Main_GUI();
				voltar.frame.setVisible(true);
			}
		});
		lblNewLabel_7_1.setIcon(new ImageIcon(Tela_Pagamento_GUI.class.getResource("/br/com/tokio/images/arrow_resized_resized.png")));
		lblNewLabel_7_1.setBounds(452, 0, 25, 38);
		panel_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("");
		lblNewLabel_7_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 openDulvidas();
			}
		});
		lblNewLabel_7_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\5a3698b221c196.3039888215135274741383_resized.png"));
		lblNewLabel_7_1_1.setBounds(419, 0, 25, 38);
		panel_1.add(lblNewLabel_7_1_1);
	}private static void openDulvidas() {
        try {
            URI uri = new URI("https://docs.google.com/document/d/1oALTDDmqvJZ56OjX-miOh3cdlJV5kLIB30OqqQmuUEs/edit?pli=1"); 
            Desktop.getDesktop().browse(uri);//https://www.instagram.com/tokiomarineseguradora
        } catch (Exception e) {
            e.printStackTrace();}
        }
}
