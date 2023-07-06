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
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
public class TelaCadastro_GUI {

	JFrame frame;
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
		frame.setBounds(100, 100, 507, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(20, 129, 99));
		panel.setBounds(0, 0, 507, 346);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Primeiro acesso");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(180, 16, 230, 41);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setBounds(41, 64, 59, 23);
		panel.add(lblNewLabel_2);
		
		Nome = new JTextField();
		Nome.setBorder(new MatteBorder(2, 2, 0, 0, (Color) new Color(0, 0, 0)));
		Nome.setBounds(60, 88, 216, 20);
		panel.add(Nome);
		Nome.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CPF:");
		lblNewLabel_3.setBounds(41, 119, 46, 14);
		panel.add(lblNewLabel_3);
		
		JButton Cadastro = new JButton("CADASTRAR");
		Cadastro.setBorder(new MatteBorder(3, 2, 1, 1, (Color) new Color(0, 0, 0)));
		Cadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!!");
				Tela_Main_GUI main = new Tela_Main_GUI();
				main.frame.setVisible(true);
				frame.dispose();
			}
		});
		Cadastro.setBounds(381, 312, 116, 23);
		panel.add(Cadastro);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.RED));
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon(TelaCadastro_GUI.class.getResource("/br/com/tokio/images/CLOSE_resized.png")));
		lblNewLabel_4.setBounds(472, 11, 25, 28);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Idade:");
		lblNewLabel_5.setBounds(41, 165, 46, 14);
		panel.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(2, 2, 0, 0, (Color) new Color(0, 0, 0)));
		textField.setBounds(60, 180, 216, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Genero");
		lblNewLabel_6.setBounds(289, 119, 46, 14);
		panel.add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Não-binario", "Outro"}));
		comboBox.setBounds(302, 134, 96, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_7 = new JLabel("Telefone");
		lblNewLabel_7.setBounds(289, 68, 46, 14);
		panel.add(lblNewLabel_7);
		
		
		MaskFormatter mascaraTel = new MaskFormatter("(##)#####-####");
		JFormattedTextField formattedTextField = new JFormattedTextField(mascaraTel);
		formattedTextField.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		formattedTextField.setLocale(new Locale("pt", "BR"));
		formattedTextField.setToolTipText("");
		formattedTextField.setName("");
		formattedTextField.setBounds(302, 89, 108, 20);
		panel.add(formattedTextField);
		
		MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(mascaraCPF);
		formattedTextField_1.setBorder(new MatteBorder(2, 2, 0, 0, (Color) new Color(0, 0, 0)));
		formattedTextField_1.setBounds(60, 134, 216, 20);
		panel.add(formattedTextField_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaCadastro_GUI.class.getResource("/br/com/tokio/images/Image_Cadastro_resized_resized_updated.png")));
		lblNewLabel.setBounds(30, 0, 477, 346);
		panel.add(lblNewLabel);
	}
	
}
