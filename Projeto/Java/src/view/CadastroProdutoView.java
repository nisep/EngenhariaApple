package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import control.InputListenerCadastroProduto;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class CadastroProdutoView extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 158269313715179772L;
	private JPanel contentPanel;
	private JPanel panelFoto;
	private JTextField textCodigo;
	private JLabel lblCodigo;
	private JButton btnPesquisarImagem;
	InputListenerCadastroProduto listener;
	private JLabel lblNome;
	private JTextField textNome;
	private JLabel lblPrecoCompra;
	private JTextField textPrecoCompra;
	private JLabel lblPrecoVenda;
	private JTextField textPrecoVenda;
	private JLabel lblDescricao;
	private JLabel lblDataCadastro;
	private JTextField txtDataDoCadastro;
	private JButton btnCancelar;
	private JButton btnGravar;
	private JTextArea textDescricao;
	

	public static void main(String[] args) {
		try {
			CadastroProdutoView dialog = new CadastroProdutoView();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public CadastroProdutoView() {
		listener = new InputListenerCadastroProduto(this);
		initialize();
		initializeListeners();

	}

	public void initialize() {
		this.setModal(true);
		setBounds(100, 100, 649, 500);
		setContentPane(getContentPanel());

	}

	public void initializeListeners() {
		getBtnGravar().addMouseListener(listener);
		getBtnCancelar().addMouseListener(listener);
		getbtnPesquisarImagem().addMouseListener(listener);
	}

	public JButton getbtnPesquisarImagem() {
		if (btnPesquisarImagem == null) {
			btnPesquisarImagem = new JButton("Pesquisar Imagem");
			btnPesquisarImagem.setBounds(403, 362, 147, 23);
		}
		return btnPesquisarImagem;
	}

	public JPanel getContentPanel() {
		if (contentPanel == null) {
			contentPanel = new JPanel();
			contentPanel.setBackground(Color.WHITE);
			contentPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

			contentPanel.setLayout(null);
			contentPanel.add(getTextCodigo());
			contentPanel.add(getLblCodigo());
			contentPanel.add(getLblNome());
			contentPanel.add(getTextNome());
			contentPanel.add(getLblPrecoCompra());
			contentPanel.add(getTextPrecoCompra());
			contentPanel.add(getLblPrecoVenda());
			contentPanel.add(getTextPrecoVenda());
			contentPanel.add(getLblDescricao());
			contentPanel.add(getTextDataCadastro());
			contentPanel.add(getLblDataCadastro());
			contentPanel.add(getbtnPesquisarImagem());

			contentPanel.add(getpanelFoto());
			contentPanel.add(getBtnCancelar());
			contentPanel.add(getBtnGravar());
			contentPanel.add(getTextDescricao());

				
			

		}
		return contentPanel;
	}
	
	public JLabel getLblDataCadastro() {
		if (lblDataCadastro == null) {
			lblDataCadastro = new JLabel("Data do Cadastro");
			lblDataCadastro.setBounds(339, 12, 120, 14);
		}
		return lblDataCadastro;
	}

	public JPanel getpanelFoto() {
		if (panelFoto == null) {
			panelFoto = new JPanel();
			panelFoto.setBounds(340, 70, 275, 281);
		}
		return panelFoto;

	}

	public JTextField getTextDataCadastro() {
		if (txtDataDoCadastro == null) {
			txtDataDoCadastro = new JTextField();
			txtDataDoCadastro.setBounds(339, 38, 86, 20);
			txtDataDoCadastro.setColumns(10);
		}
		return txtDataDoCadastro;
	}

	public JTextField getTextCodigo() {
		if (textCodigo == null) {
			textCodigo = new JTextField();
			textCodigo.setBounds(30, 37, 281, 22);
		}
		return textCodigo;
	}

	public JTextField getTextNome() {
		if (textNome == null) {
			textNome = new JTextField();
			textNome.setBounds(30, 95, 281, 20);
			textNome.setColumns(10);
		}
		return textNome;
	}

	public JLabel getLblCodigo() {
		if (lblCodigo == null) {
			lblCodigo = new JLabel("Código");
			lblCodigo.setBounds(34, 12, 46, 14);
		}
		return lblCodigo;
	}

	public JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome");
			lblNome.setBounds(30, 70, 46, 14);
		}
		return lblNome;
	}

	public JLabel getLblPrecoCompra() {
		if (lblPrecoCompra == null) {
			lblPrecoCompra = new JLabel("Pre\u00E7o Compra (R$)");
			lblPrecoCompra.setBounds(30, 126, 221, 14);
		}
		return lblPrecoCompra;
	}

	public JTextField getTextPrecoCompra() {
		if (textPrecoCompra == null) {
			textPrecoCompra = new JTextField();
			textPrecoCompra.setBounds(30, 151, 281, 20);
			textPrecoCompra.setColumns(10);
		}
		return textPrecoCompra;
	}

	public JLabel getLblPrecoVenda() {
		if (lblPrecoVenda == null) {
			lblPrecoVenda = new JLabel("Pre\u00E7o Venda (R$)");
			lblPrecoVenda.setBounds(30, 182, 167, 14);
		}
		return lblPrecoVenda;
	}

	public JTextField getTextPrecoVenda() {
		if (textPrecoVenda == null) {
			textPrecoVenda = new JTextField();
			textPrecoVenda.setBounds(30, 207, 281, 20);
			textPrecoVenda.setColumns(10);
		}
		return textPrecoVenda;
	}

	public JLabel getLblDescricao() {
		if (lblDescricao == null) {
			lblDescricao = new JLabel("Descri\u00E7\u00E3o");
			lblDescricao.setBounds(30, 238, 69, 14);
		}
		return lblDescricao;
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
	
	public JTextArea getTextDescricao() {
		if (textDescricao == null) {
			textDescricao = new JTextArea();
			textDescricao.setBorder(UIManager.getBorder("TextField.border"));
			textDescricao.setBounds(30, 263, 281, 154);
		}
		return textDescricao;
	}
}
