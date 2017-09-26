package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import control.InputListenerClienteView;

public class ClienteView extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8141345248153320486L;
	private JPanel contentPane;
	JPanel panel;
	private JTable tableCliente;
	private JTextField textBusca;
	private JButton btnBuscarCliente;
	private JButton btnNovoCliente;
	private JLabel lblBuscarPorNome;
	private JScrollPane scrollBar;
	InputListenerClienteView listener;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteView frame = new ClienteView();
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
	public ClienteView() {
		listener = new InputListenerClienteView(this);
		initialize();
		initializeListeners();
	}
	
	public JTable getTableCliente() {
		if(tableCliente == null){
			String[] colunas = {"id","Nome", "CPF", "Endereço", "Telefone","Nascimento"};
			String[][] dados = {{"1","teste","teste","teste","teste","teste"},
					{"2","teste2","teste2","teste2","teste2","teste"},
					{"3","teste3","teste3","teste3","teste3","teste"}};
			tableCliente = new JTable(new DefaultTableModel(dados,colunas) {
				 /**
				 * 
				 */
				private static final long serialVersionUID = -7018342759131611914L;
				boolean[] canEdit = new boolean []{  
				            false, false, false, false,false,false
				        };  
				        @Override  
				        public boolean isCellEditable(int rowIndex, int columnIndex) {  
				            return canEdit [columnIndex];  
				        }
			});
		}
		return tableCliente;
	}
	
	public JScrollPane getScrollBar() {
		if(scrollBar == null){
			scrollBar = new JScrollPane(getTableCliente());
			scrollBar.setBounds(58, 52, 668, 359);
		}
		return scrollBar;
	}
	
	public JTextField getTextBusca() {
		if(textBusca == null){
			textBusca = new JTextField();
			textBusca.setColumns(10);
			textBusca.setBounds(58, 473, 198, 23);
		}
		return textBusca;
	}
	
	public JButton getBuscarButton() {
		if(btnBuscarCliente == null){
			btnBuscarCliente = new JButton("Buscar");
			btnBuscarCliente.setBounds(266, 472, 75, 23);
		}
		return btnBuscarCliente;
	}
	
	public JButton getbtnNovoCliente() {
		if(btnNovoCliente == null){
			btnNovoCliente = new JButton("Novo Cliente");
			btnNovoCliente.setBounds(469, 472, 150, 23);
		}
		return btnNovoCliente;
	}
	
	public JLabel getlblBuscarPorNome() {
		if(lblBuscarPorNome == null){
			lblBuscarPorNome = new JLabel("Buscar por Nome ou CPF:");
			lblBuscarPorNome.setBounds(58, 449, 185, 14);
		}
		return lblBuscarPorNome;
	}
	
	public void initializeListeners() {
		getBuscarButton().addMouseListener(listener);
		getbtnNovoCliente().addMouseListener(listener);
		getTableCliente().addMouseListener(listener);
	}
	
	public void initialize(){
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(0, 0, 800, 600);
		setLocationRelativeTo(null);
		setTitle("Cliente");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		panel.add(getScrollBar());		
		panel.add(getBuscarButton());		
		panel.add(getbtnNovoCliente());	
		panel.add(getTextBusca());		
		panel.add(getlblBuscarPorNome());
	}
}
