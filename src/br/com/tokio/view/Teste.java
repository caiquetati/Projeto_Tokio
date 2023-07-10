package br.com.tokio.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
public class Teste {
    private JFrame frame;
    private JProgressBar progressBar;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Teste window = new Teste();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Teste() {
        initialize();
        startProgressBar();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setUndecorated(true);
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        panel.setBackground(new Color(47, 79, 79));
        panel.setBounds(0, 0, 450, 300);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\bloggif_64a75a2f339b6.gif"));
        lblNewLabel_1.setBounds(152, 191, 146, 34);
        panel.add(lblNewLabel_1);

        progressBar = new JProgressBar();
        progressBar.setBounds(152, 236, 146, 14);
        panel.add(progressBar);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\ang.png"));
        lblNewLabel.setBounds(0, 31, 450, 82);
        panel.add(lblNewLabel);
    }

    private void startProgressBar() {
        int delay = 50; // Tempo de espera entre as atualizações (100 milissegundos neste exemplo)
        Timer timer = new Timer(delay, (ActionListener) new ActionListener() {
            private int progress = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar.setValue(progress);
                progress++;

                if (progress > progressBar.getMaximum()) {
                    ((Timer) e.getSource()).stop();
                    Tela_Inicial_GUI tela = new Tela_Inicial_GUI();
                    tela.frame.setVisible(true);
                    frame.dispose();
                    
                }
            }
        });

        timer.start();
    }
}
//
//public class Teste {
//
//	private JFrame frame;
//	private JProgressBar progressBar;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		
//
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Teste window = new Teste();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public Teste() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.setUndecorated(true);
//		frame.setBounds(100, 100, 450, 300);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		JPanel panel = new JPanel();
//		panel.setBounds(0, 0, 450, 300);
//		frame.getContentPane().add(panel);
//		panel.setLayout(null);
//		
//		 progressBar = new JProgressBar();
//		progressBar.setBounds(180, 246, 146, 14);
//		panel.add(progressBar);
//		
//
//	}
//
//}
