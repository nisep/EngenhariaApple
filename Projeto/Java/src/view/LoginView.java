package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JPasswordField pwSenha;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(150, 155, 89, 23);
		contentPane.add(btnEntrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(160, 189, 66, 23);
		contentPane.add(btnSair);
		
		pwSenha = new JPasswordField();
		pwSenha.setBounds(120, 124, 148, 20);
		contentPane.add(pwSenha);
		
		textField = new JTextField();
		textField.setBounds(120, 68, 148, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setBounds(0, 99, 384, 14);
		contentPane.add(lblSenha);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setHorizontalAlignment(SwingConstants.CENTER);
		lblCPF.setBounds(0, 43, 384, 14);
		contentPane.add(lblCPF);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Carlos\\Dropbox\\Inatel\\P7\\EC_206\\LAB\\EngenhariaApple\\Projeto\\Java\\Interno\\logo.png"));
		lblNewLabel.setBounds(0, -74, 294, 281);
		contentPane.add(lblNewLabel);
	}
}
