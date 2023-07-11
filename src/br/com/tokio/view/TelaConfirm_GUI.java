package br.com.tokio.view;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import br.com.tokio.controller.CreditoDAO;
import br.com.tokio.controller.SeguroDAO;
import br.com.tokio.model.Credito;
import br.com.tokio.model.Seguro;

public class TelaConfirm_GUI {

	public JFrame frame;
	private static int meioPagamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConfirm_GUI window = new TelaConfirm_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws Exception
	 */
	public TelaConfirm_GUI() {
		try {
			initialize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws Exception
	 */
	private void initialize() throws Exception {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaConfirm_GUI.class.getResource("/br/com/tokio/images/confirmgif-unscreen.gif")));
		lblNewLabel.setBounds(10, 11, 484, 300);
		panel_1.add(lblNewLabel);

		MaskFormatter mascaraTel = null;
		try {
			mascaraTel = new MaskFormatter("#### #### #### ####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		MaskFormatter mascaraTel2 = null;
		try {
			mascaraTel2 = new MaskFormatter("###");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		MaskFormatter marcaraTel3 = null;
		try {
			MaskFormatter mascaraTel3 = new MaskFormatter("##/##");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		MaskFormatter mascaraValidade = new MaskFormatter("##/##/####");

	}
}
