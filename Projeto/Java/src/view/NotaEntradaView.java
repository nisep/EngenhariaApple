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

import control.InputListenerNotaEntradaView;

public class NotaEntradaView extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8141345248153320486L;
	private JPanel contentPane;
	JPanel panel;
	private JTable tablePedido;
	private JTextField textBusca;
	private JButton btnBuscarNota;
	private JButton btnNovaNota;
	private JLabel lblBuscarNota;
	private JScrollPane scrollBar;
	InputListenerNotaEntradaView listener;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotaEntradaView frame = new NotaEntradaView();
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
	public NotaEntradaView() {
		listener = new InputListenerNotaEntradaView(this);
		initialize();
		initializeListeners();
	}
	
	public JTable getTablePedido() {
		if(tablePedido == null){
			String[] colunas = {"id","Produto", "Quantidade", "Data da Compra","Fornecedor","Preço (R$)"};
			String[][] dados = {{"1","teste","teste","teste","teste","teste"},
					{"2","teste2","teste2","teste2","teste2","teste2"},
					{"3","teste3","teste3","teste3","teste3","teste3"}};
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
		if(btnBuscarNota == null){
			btnBuscarNota = new JButton("Buscar");
			btnBuscarNota.setBounds(266, 472, 75, 23);
		}
		return btnBuscarNota;
	}
	
	public JButton getbtnNovoPedido() {
		if(btnNovaNota == null){
			btnNovaNota = new JButton("Nova Nota");
			btnNovaNota.setBounds(469, 472, 150, 23);
		}
		return btnNovaNota;
	}
	
	public JLabel getlblBuscarPedido() {
		if(lblBuscarNota == null){
			lblBuscarNota = new JLabel("Buscar por N\u00FAmero da Nota:");
			lblBuscarNota.setBounds(58, 449, 185, 14);
		}
		return lblBuscarNota;
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
		setTitle("Nota de Entrada");
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
