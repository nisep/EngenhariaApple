package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1244, 700);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(1129, 627, 89, 23);
		contentPane.add(btnIniciar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\danie\\Desktop\\git\\Engenharia_SoftW\\Projeto\\Java\\Interno\\logo2.png"));
		label.setBounds(472, 200, 300, 300);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\danie\\Desktop\\git\\Engenharia_SoftW\\Projeto\\Java\\Interno\\01_1.jpg"));
		label_1.setBounds(0, 0, 1244, 700);
		contentPane.add(label_1);
		
		
	}
	
	public void initilize() {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setContentPane(getContentPane());
	}
	
	public JPanel getContentPane() {
		if(contentPane == null) {
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(new BorderLayout(0, 0));
		}
		return contentPane;
	}
}
