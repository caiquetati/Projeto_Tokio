package br.com.tokio.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.text.ParseException;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import java.util.Locale;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TelaCadastro_GUI {

	JFrame frame;
	private JTextField nome;
	private JTextField idade;
	private JTextField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro_GUI window = new TelaCadastro_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws ParseException 
	 */
	public TelaCadastro_GUI() throws ParseException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize() throws ParseException {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 507, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(20, 129, 99));
		panel.setBounds(0, 0, 507, 346);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openDulvidas();
			}
		});
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tela_Inicial_GUI telacadastro = new Tela_Inicial_GUI();
				telacadastro.frame.setVisible(true);
			}
		});
		lblNewLabel_8.setIcon(new ImageIcon(TelaCadastro_GUI.class.getResource("/br/com/tokio/images/arrow_resized_resized.png")));
		lblNewLabel_8.setBounds(376, 20, 25, 30);
		panel.add(lblNewLabel_8);
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\problem (2)_resized.png"));
		lblNewLabel_2_1.setBounds(411, 20, 39, 30);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("PRIMEIRO ACESSO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(131, 9, 216, 41);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(41, 64, 59, 23);
		panel.add(lblNewLabel_2);
		
		nome = new JTextField();

		nome.setBorder(new MatteBorder(2, 2, 0, 0, (Color) new Color(0, 0, 0)));
		nome.setBounds(60, 88, 216, 20);
		panel.add(nome);
		nome.setColumns(10);
		; 
		
		JLabel lblNewLabel_3 = new JLabel("CPF:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(41, 208, 46, 14); 
		panel.add(lblNewLabel_3);
		
		JButton Cadastro = new JButton("CADASTRAR");
		Cadastro.setFont(new Font("Tahoma", Font.BOLD, 11));
		Cadastro.setBorder(new MatteBorder(2, 2, 3, 1, (Color) new Color(0, 0, 0)));
		Cadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!!");
				Tela_Main_GUI main = new Tela_Main_GUI();
				main.frame.setVisible(true);
				frame.dispose();
			}
		});
		Cadastro.setBounds(361, 323, 116, 23);
		panel.add(Cadastro);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\close_resized (2).png"));
		lblNewLabel_4.setBounds(449, 23, 28, 23);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Idade:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(41, 165, 46, 14);
		panel.add(lblNewLabel_5);
		
		idade = new JTextField();
		idade.setBorder(new MatteBorder(2, 2, 0, 0, (Color) new Color(0, 0, 0)));
		idade.setBounds(60, 180, 216, 20);
		panel.add(idade);
		idade.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Genero:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(289, 119, 46, 14);
		panel.add(lblNewLabel_6);
		
		JComboBox sexo = new JComboBox();
		sexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Não-binario", "Outro"}));
		sexo.setBounds(302, 134, 96, 22);
		panel.add(sexo);
		
		JLabel lblNewLabel_7 = new JLabel("Telefone:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(289, 68, 83, 14);
		panel.add(lblNewLabel_7);
		
		
		MaskFormatter mascaraTel = new MaskFormatter("(##)#####-####");
		JFormattedTextField telefone = new JFormattedTextField(mascaraTel);
		telefone.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		telefone.setLocale(new Locale("pt", "BR"));
		telefone.setToolTipText("");
		telefone.setName("");
		telefone.setBounds(302, 89, 108, 20);
		panel.add(telefone);
		
		MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
		
		JFormattedTextField cpf = new JFormattedTextField(mascaraCPF);
		cpf.setBorder(new MatteBorder(2, 2, 0, 0, (Color) new Color(0, 0, 0)));
		cpf.setBounds(60, 221, 216, 20);
		panel.add(cpf);
		
		JLabel lblNewLabel_9 = new JLabel("Senha");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(41, 119, 46, 14);
		panel.add(lblNewLabel_9);
		
		senha = new JTextField();
		senha.setColumns(10);
		senha.setBorder(new MatteBorder(2, 2, 0, 0, (Color) new Color(0, 0, 0)));
		senha.setBounds(60, 135, 216, 20);
		panel.add(senha);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblNewLabel.setIcon(new ImageIcon(TelaCadastro_GUI.class.getResource("/br/com/tokio/images/Image_Cadastro_resized_resized_updated.png")));
		lblNewLabel.setBounds(27, 20, 450, 310);
		panel.add(lblNewLabel);
	}private static void openDulvidas() {
        try {
            URI uri = new URI("https://docs.google.com/document/d/1oALTDDmqvJZ56OjX-miOh3cdlJV5kLIB30OqqQmuUEs/edit?pli=1"); 
            Desktop.getDesktop().browse(uri);//https://www.instagram.com/tokiomarineseguradora
        } catch (Exception e) {
            e.printStackTrace();}
        }
}
