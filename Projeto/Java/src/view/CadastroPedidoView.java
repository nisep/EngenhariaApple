package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import control.InputListenerCadastroPedido;

public class CadastroPedidoView extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7876262101294494488L;
	private InputListenerCadastroPedido listener;
	private JPanel contentPanel;
	private JPanel panelFoto;
	private JTextField textCodigo;
	private JLabel lblCodigo;
	private JButton btnPesquisarImagem;
	private JLabel lblNomeCliente;
	private JLabel lblDataCadastro;
	private JTextField txtDataDoCadastro;
	private JButton btnCancelar;
	private JButton btnGravar;

	public static void main(String[] args) {
		try {
			CadastroPedidoView dialog = new CadastroPedidoView();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public CadastroPedidoView() {
		listener = new InputListenerCadastroPedido(this);
		initialize();
		initializeListeners();

	}

	public void initializeListeners() {
		getBtnGravar().addMouseListener(listener);
		getBtnCancelar().addMouseListener(listener);
		getbtnPesquisarImagem().addMouseListener(listener);
	}

	public void initialize() {
		this.setModal(true);
		setBounds(100, 100, 649, 500);
		setContentPane(getContentPanel());

	}

	public JButton getbtnPesquisarImagem() {
		if (btnPesquisarImagem == null) {
			btnPesquisarImagem = new JButton("Pesquisar Imagem");
			btnPesquisarImagem.setBounds(403, 362, 147, 23);
		}
		return btnPesquisarImagem;
	}

	public JPanel getpanelFoto() {
		if (panelFoto == null) {
			panelFoto = new JPanel();
			panelFoto.setBounds(340, 70, 275, 281);
		}
		return panelFoto;

	}

	public JPanel getContentPanel() {
		if (contentPanel == null) {
			contentPanel = new JPanel();
			contentPanel.setBackground(Color.WHITE);
			contentPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

			contentPanel.setLayout(null);
			contentPanel.add(getTextCodigo());
			contentPanel.add(getLblCodigo());
			contentPanel.add(getLblNomeCliente());
			contentPanel.add(getTextDataCadastro());
			contentPanel.add(getLblDataCadastro());
			contentPanel.add(getbtnPesquisarImagem());

			contentPanel.add(getpanelFoto());
			contentPanel.add(getBtnCancelar());
			contentPanel.add(getBtnGravar());

		}
		return contentPanel;
	}

	public JTextField getTextCodigo() {
		if (textCodigo == null) {
			textCodigo = new JTextField();
			textCodigo.setBounds(30, 37, 281, 22);
		}
		return textCodigo;
	}

	public JLabel getLblCodigo() {
		if (lblCodigo == null) {
			lblCodigo = new JLabel("Código");
			lblCodigo.setBounds(34, 12, 46, 14);
		}
		return lblCodigo;
	}

	public JLabel getLblNomeCliente() {
		if (lblNomeCliente == null) {
			lblNomeCliente = new JLabel("Nome Cliente");
			lblNomeCliente.setBounds(30, 70, 86, 14);
		}
		return lblNomeCliente;
	}

	public JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(534, 427, 89, 23);
		}
		return btnCancelar;
	}

	public JButton getBtnGravar() {
		if (btnGravar == null) {
			btnGravar = new JButton("Gravar");
			btnGravar.setBounds(435, 427, 89, 23);
		}
		return btnGravar;
	}

	public JTextField getTextDataCadastro() {
		if (txtDataDoCadastro == null) {
			txtDataDoCadastro = new JTextField();
			txtDataDoCadastro.setBounds(339, 38, 86, 20);
			txtDataDoCadastro.setColumns(10);
		}
		return txtDataDoCadastro;
	}

	public JLabel getLblDataCadastro() {
		if (lblDataCadastro == null) {
			lblDataCadastro = new JLabel("Data do Cadastro");
			lblDataCadastro.setBounds(339, 12, 120, 14);
		}
		return lblDataCadastro;
	}
	
	public InputListenerCadastroPedido getListener() {
		return listener;
	}

}
