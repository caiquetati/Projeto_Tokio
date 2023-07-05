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
import javax.swing.JButton;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import java.util.Locale;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class TelaCadastro_GUI {

	private JFrame frame;
	private JTextField Nome;
	private JTextField textField;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(0, 0, 450, 300);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Primeiro acesso");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(138, 11, 230, 41);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setBounds(10, 67, 59, 23);
		panel.add(lblNewLabel_2);
		
		Nome = new JTextField();
		Nome.setBounds(20, 88, 216, 20);
		panel.add(Nome);
		Nome.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CPF:");
		lblNewLabel_3.setBounds(10, 119, 46, 14);
		panel.add(lblNewLabel_3);
		
		JButton Cadastro = new JButton("CADASTRAR");
		Cadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!!");
				Tela_Main_GUI main = new Tela_Main_GUI();
				main.frame.setVisible(true);
				frame.dispose();
			}
		});
		Cadastro.setBounds(324, 266, 116, 23);
		panel.add(Cadastro);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon(TelaCadastro_GUI.class.getResource("/br/com/tokio/images/CLOSE_resized.png")));
		lblNewLabel_4.setBounds(415, 11, 25, 28);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Idade:");
		lblNewLabel_5.setBounds(10, 165, 46, 14);
		panel.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(20, 178, 216, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Genero");
		lblNewLabel_6.setBounds(10, 208, 46, 14);
		panel.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Não-binario", "Outro"}));
		comboBox.setBounds(20, 229, 96, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_7 = new JLabel("Telefone");
		lblNewLabel_7.setBounds(138, 209, 46, 14);
		panel.add(lblNewLabel_7);
		
		
		MaskFormatter mascaraTel = new MaskFormatter("(##)#####-####");
		JFormattedTextField formattedTextField = new JFormattedTextField(mascaraTel);
		formattedTextField.setLocale(new Locale("pt", "BR"));
		formattedTextField.setToolTipText("");
		formattedTextField.setName("");
		formattedTextField.setBounds(148, 230, 108, 20);
		panel.add(formattedTextField);
		
		MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(mascaraCPF);
		formattedTextField_1.setBounds(20, 134, 216, 20);
		panel.add(formattedTextField_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastro_GUI.class.getResource("/br/com/tokio/images/Image_Cadastro_resized_resized_updated.png")));
		lblNewLabel.setBounds(0, 0, 450, 300);
		panel.add(lblNewLabel);
	}
	
}
