package br.com.tokio.view;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

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
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(46, 139, 87));
		panel_1.setBounds(10, 11, 504, 322);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pagamento ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(157, 11, 184, 59);
		panel_1.add(lblNewLabel);
		
		JPanel debito = new JPanel();
		debito.setVisible(false);
		debito.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		debito.setBounds(40, 179, 335, 120);
		debito.setBackground(new Color(60, 179, 113));
		panel_1.add(debito);
		debito.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nº cartão");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(21, 11, 84, 14);

		debito.add(lblNewLabel_2);
		
		MaskFormatter mascaraTel = null;
		try {
			mascaraTel = new MaskFormatter("#### #### #### ####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JFormattedTextField formattedTextField = new JFormattedTextField(mascaraTel);
		
		formattedTextField.setBounds(31, 24, 139, 20);
		debito.add(formattedTextField);
		
		JLabel lblNewLabel_3 = new JLabel("CVV");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(21, 55, 46, 14);
		debito.add(lblNewLabel_3);
		
		MaskFormatter mascaraTel2 = null;
		try {
			mascaraTel2 = new MaskFormatter("###");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(mascaraTel2);
		formattedTextField_1.setBounds(31, 69, 55, 20);
		debito.add(formattedTextField_1);
		
		JLabel lblNewLabel_4 = new JLabel("Validade");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(106, 55, 64, 14);
		debito.add(lblNewLabel_4);
		
		MaskFormatter marcaraTel3 = null;
		try {
			MaskFormatter mascaraTel3 = new MaskFormatter("##/##");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JFormattedTextField formattedTextField_2 = new JFormattedTextField(mascaraTel);
		formattedTextField_2.setBounds(131, 69, 64, 20);
		debito.add(formattedTextField_2);
		
		JButton btnNewButton_3 = new JButton("Confirmar");
		btnNewButton_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(225, 88, 100, 23);
		debito.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\qrcode_resized.jpg"));
		lblNewLabel_1.setBounds(405, 194, 89, 96);
		panel_1.add(lblNewLabel_1);
		
		JPanel credito = new JPanel();
		credito.setVisible(false);
		credito.setBounds(40, 179, 335, 120);
		panel_1.add(credito);
		credito.setLayout(null);
		credito.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		credito.setBackground(new Color(60, 179, 113));
		
		JButton btnNewButton = new JButton("Debito");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				debito.setVisible(true);
				credito.setVisible(false);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(40, 127, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Credito");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				debito.setVisible(false);
				credito.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(157, 127, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("PIX ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(408, 166, 86, 28);
		panel_1.add(lblNewLabel_5);
		
		JButton btnNewButton_2 = new JButton("Boleto");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gerar();                                                                                       
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(271, 127, 89, 23);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("Escolha o meio de pagamento");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(54, 81, 287, 40);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\close_resized (2).png"));
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
		lblNewLabel_7_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\problem (2)_resized.png"));
		lblNewLabel_7_1_1.setBounds(426, 0, 25, 38);
		panel_1.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nº cartão");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_1.setBounds(21, 11, 84, 14);
		credito.add(lblNewLabel_2_1);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField((AbstractFormatter) null);
		formattedTextField_3.setBounds(31, 24, 139, 20);
		credito.add(formattedTextField_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("CVV");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(21, 55, 46, 14);
		credito.add(lblNewLabel_3_1);
		
		JFormattedTextField formattedTextField_1_1 = new JFormattedTextField((AbstractFormatter) null);
		formattedTextField_1_1.setBounds(31, 69, 55, 20);
		credito.add(formattedTextField_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Validade");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1.setBounds(106, 55, 64, 14);
		credito.add(lblNewLabel_4_1);
		
		JFormattedTextField formattedTextField_2_1 = new JFormattedTextField((AbstractFormatter) null);
		formattedTextField_2_1.setBounds(131, 69, 64, 20);
		credito.add(formattedTextField_2_1);
		
		JButton btnNewButton_3_1 = new JButton("Confirmar");
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_3_1.setBounds(225, 88, 100, 23);
		credito.add(btnNewButton_3_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1X", "2X", "3X", "4X", "5X", "6X", "7X", "8X", "9X", "10X", "11X", "12X"}));
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(225, 27, 72, 23);
		credito.add(comboBox);
		
		JLabel lblNewLabel_2_2 = new JLabel("Qtd parcelas");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2_2.setBounds(196, 11, 129, 14);
		credito.add(lblNewLabel_2_2);
	}private static void openDulvidas() {
        try {
            URI uri = new URI("https://docs.google.com/document/d/1oALTDDmqvJZ56OjX-miOh3cdlJV5kLIB30OqqQmuUEs/edit?pli=1"); 
            Desktop.getDesktop().browse(uri);//https://www.instagram.com/tokiomarineseguradora
        } catch (Exception e) {
            e.printStackTrace();}
        } public static void gerar() {
    	  Document document = new Document();

          try {
              PdfWriter.getInstance(document, new FileOutputStream("Boleto .pdf"));
              document.open();

              Paragraph paragraph = new Paragraph("GenerateBoleto");
              Paragraph tipo_seguro = new Paragraph("Seguro         Valor ");
              document.add(paragraph);
              document.add(tipo_seguro);

              document.close();

             JOptionPane.showMessageDialog(null,"Boleto gerado com sucesso!");
          } catch (DocumentException | IOException e) {
              
              JOptionPane.showMessageDialog(null,"Erro ao gerar boleto:"+ e.getMessage());
          }
}	
}
