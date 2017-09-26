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

import control.InputListenerPedidoView;

public class PedidoView extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8141345248153320486L;
	private JPanel contentPane;
	JPanel panel;
	private JTable tablePedido;
	private JTextField textBusca;
	private JButton btnBuscarPedido;
	private JButton btnNovoPedido;
	private JLabel lblBuscarPedido;
	private JScrollPane scrollBar;
	InputListenerPedidoView listener;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PedidoView frame = new PedidoView();
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
	public PedidoView() {
		listener = new InputListenerPedidoView(this);
		initialize();
		initializeListeners();
	}
	
	public JTable getTablePedido() {
		if(tablePedido == null){
			String[] colunas = {"id","Preco Total (R$)", "Data de Venda", "Cliente","Funcionário"};
			String[][] dados = {{"1","teste","teste","teste","teste"},
					{"2","teste2","teste2","teste2","teste2"},
					{"3","teste3","teste3","teste3","teste3"}};
			tablePedido = new JTable(new DefaultTableModel(dados,colunas) {
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
		return tablePedido;
	}
	
	public JScrollPane getScrollBar() {
		if(scrollBar == null){
			scrollBar = new JScrollPane(getTablePedido());
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
		if(btnBuscarPedido == null){
			btnBuscarPedido = new JButton("Buscar");
			btnBuscarPedido.setBounds(266, 472, 75, 23);
		}
		return btnBuscarPedido;
	}
	
	public JButton getbtnNovoPedido() {
		if(btnNovoPedido == null){
			btnNovoPedido = new JButton("Novo Pedido");
			btnNovoPedido.setBounds(469, 472, 150, 23);
		}
		return btnNovoPedido;
	}
	
	public JLabel getlblBuscarPedido() {
		if(lblBuscarPedido == null){
			lblBuscarPedido = new JLabel("Buscar por Número do Pedido:");
			lblBuscarPedido.setBounds(58, 449, 185, 14);
		}
		return lblBuscarPedido;
	}
	
	public void initializeListeners() {
		getBuscarButton().addMouseListener(listener);
		getbtnNovoPedido().addMouseListener(listener);
		getTablePedido().addMouseListener(listener);
	}
	
	public void initialize(){
		setModal(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(0, 0, 800, 600);
		setLocationRelativeTo(null);
		setTitle("Pedido");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		panel.add(getScrollBar());		
		panel.add(getBuscarButton());		
		panel.add(getbtnNovoPedido());	
		panel.add(getTextBusca());		
		panel.add(getlblBuscarPedido());
	}
}
