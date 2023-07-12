package br.com.tokio.view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class Tela_Concluir_GUI {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Concluir_GUI window = new Tela_Concluir_GUI();
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
	public Tela_Concluir_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 541, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		panel.setBounds(0, 0, 541, 364);
		panel.setBackground(new Color(20, 129, 99));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 521, 342);
		panel_1.setBackground(new Color(46, 139, 87));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Value_completo = new JLabel("Compra realizada com sucesso, obrigado pela confiança em nossos serviços");
		Value_completo.setHorizontalAlignment(SwingConstants.CENTER);
		Value_completo.setFont(new Font("Tahoma", Font.BOLD, 12));
		Value_completo.setBounds(0, 260, 521, 41);
		panel_1.add(Value_completo);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Tela_Concluir_GUI.class.getResource("/br/com/tokio/images/close_resized (2).png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(490, 0, 31, 33);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tela_Concluir_GUI.class.getResource("/br/com/tokio/images/ang.png")));
		lblNewLabel.setBounds(10, 11, 416, 108);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Tela_Concluir_GUI.class.getResource("/br/com/tokio/images/pagamento_confirmado.gif")));
		lblNewLabel_1.setBounds(159, 118, 190, 131);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("FINALIZAR ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Main_GUI tela = new Tela_Main_GUI();
				tela.frame.setLocationRelativeTo(null);
				tela.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(395, 308, 116, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Tela_Concluir_GUI.class.getResource("/br/com/tokio/images/fundo_casa.png")));
		lblNewLabel_4.setBounds(0, 0, 541, 364);
		panel.add(lblNewLabel_4);
		
		
	}
}
