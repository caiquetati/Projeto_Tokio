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
import java.sql.Date;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;

import br.com.tokio.controller.UsuarioDAO;
import br.com.tokio.model.Usuario;
import br.com.tokio.util.CriptografiaAES;
import javax.swing.JPasswordField;

import javax.swing.JFormattedTextField.AbstractFormatter;

public class Tela_Cadastro_GUI {

	JFrame frame;
	private JTextField nome;
	private JPasswordField senha;
	public String[] data;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Cadastro_GUI window = new Tela_Cadastro_GUI();
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
	public Tela_Cadastro_GUI() throws ParseException {
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
				Tela_Login_GUI telacadastro = new Tela_Login_GUI();
				telacadastro.frame.setVisible(true);
			}
		});
		lblNewLabel_8.setIcon(new ImageIcon(Tela_Cadastro_GUI.class.getResource("/br/com/tokio/images/arrow_resized_resized.png")));
		lblNewLabel_8.setBounds(376, 20, 25, 30);
		panel.add(lblNewLabel_8);
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\problem (2)_resized.png"));
		lblNewLabel_2_1.setBounds(411, 20, 39, 30);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("PRIMEIRO ACESSO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(131, 9, 216, 41);
		panel.add(lblNewLabel_1);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(41, 68, 235, 14);
		panel.add(lblNome);
		
		nome = new JTextField();

		nome.setBorder(new MatteBorder(2, 2, 0, 0, (Color) new Color(0, 0, 0)));
		nome.setBounds(60, 88, 216, 20);
		panel.add(nome);
		nome.setColumns(10);
		; 
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCPF.setBounds(41, 208, 235, 14); 
		panel.add(lblCPF);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\close_resized (2).png"));
		lblNewLabel_4.setBounds(449, 23, 28, 23);
		panel.add(lblNewLabel_4);
		
		JLabel lblDtNascimento = new JLabel("Data de nascimento: ");
		lblDtNascimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDtNascimento.setBounds(41, 165, 235, 14);
		panel.add(lblDtNascimento);
		
		JLabel lblGenero = new JLabel("Gênero");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGenero.setBounds(289, 119, 46, 14);
		panel.add(lblGenero);
		
		JComboBox sexo = new JComboBox();
		sexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Não-binario", "Outro"}));
		sexo.setBounds(302, 134, 96, 22);
		panel.add(sexo);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefone.setBounds(289, 68, 121, 14);
		panel.add(lblTelefone);
		
		
		MaskFormatter mascaraTel = new MaskFormatter("(##)#####-####");
		JFormattedTextField txtTelefone = new JFormattedTextField(mascaraTel);
		txtTelefone.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		txtTelefone.setLocale(new Locale("pt", "BR"));
		txtTelefone.setToolTipText("");
		txtTelefone.setName("");
		txtTelefone.setBounds(302, 89, 108, 20);
		panel.add(txtTelefone);
		
		MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
		
		JFormattedTextField txtCpf = new JFormattedTextField(mascaraCPF);
		txtCpf.setBorder(new MatteBorder(2, 2, 0, 0, (Color) new Color(0, 0, 0)));
		txtCpf.setBounds(60, 221, 216, 20);
		panel.add(txtCpf);
		
		MaskFormatter mascaraNascimento = new MaskFormatter("##/##/####");
		JFormattedTextField txtNascimento = new JFormattedTextField(mascaraNascimento);
		txtNascimento.setBorder(new MatteBorder(2, 2, 0, 0, (Color) new Color(0, 0, 0)));
		txtNascimento.setBounds(60, 179, 216, 20);
		
		panel.add(txtNascimento);
		
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenha.setBounds(41, 119, 235, 14);
		panel.add(lblSenha);
		
		JButton Cadastro = new JButton("CADASTRAR");
		Cadastro.setFont(new Font("Tahoma", Font.BOLD, 11));
		Cadastro.setBorder(new MatteBorder(2, 2, 3, 1, (Color) new Color(0, 0, 0)));
		Cadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioDAO dao = new UsuarioDAO();
				boolean estado = false;
				try {
					dao.verificarSenha(senha.getText());	
					//Formatação de data para nosso região
					data = txtNascimento.getText().split("/");
					Date dtNascimento = new Date(Integer.parseInt(data[2]), Integer.parseInt(data[1]), Integer.parseInt(data[0]));
					Usuario novoUsuario = new Usuario(txtCpf.getText(), nome.getText(), senha.getText(),dtNascimento,(String) sexo.getSelectedItem(), txtTelefone.getText());					
					dao.insert(novoUsuario);
					
					//Chamar outra Janela
					JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!!");
					Tela_Login_GUI main = new Tela_Login_GUI();
					main.frame.setLocationRelativeTo(null);
					main.frame.setVisible(true);
					main.frame.setLocationRelativeTo(null);
					frame.dispose();			
				} catch(Exception error) {
					error.getStackTrace();
				}

			}
		});
		Cadastro.setBounds(361, 323, 116, 23);
		panel.add(Cadastro);
		
		senha = new JPasswordField();
		senha.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		senha.setBounds(60, 135, 216, 20);
		panel.add(senha);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Tela_Cadastro_GUI.class.getResource("/br/com/tokio/images/Image_Cadastro_resized_resized_updated.png")));
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
