package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import control.InputListenerCadastroFuncionario;

public class CadastroFuncionarioView extends JDialog {

	
	private static final long serialVersionUID = -6915111385220052899L;
	InputListenerCadastroFuncionario listener;
	private JPanel contentPanel;
	private JPanel panelFoto;
	private JTextField textCodigo;
	private JLabel lblCodigo;
	private JButton btnPesquisarImagem;
	private JLabel lblNome;
	private JTextField textNome;
	private JLabel lblDataCadastro;
	private JTextField txtDataDoCadastro;
	private JButton btnCancelar;
	private JButton btnGravar;
	private JTextField textSalario;
	private JLabel lblSalario;
	private JLabel lblComissao;
	private JTextField textComissao;
	private JLabel lblCPF;
	private JTextField textCPF;
	private JLabel lblRua;
	private JTextField textRua;
	private JTextField textBairro;
	private JTextField textCidade;
	private JLabel lblBairro;
	private JLabel lblCidade;
	private JLabel lblNumero;
	private JTextField textNumero;
	private JLabel lblComplemento;
	private JTextField textComplemento;
	private JLabel lblCEP;
	private JTextField textCEP;
	private JLabel lblDataNascimento;
	private JTextField textDataNascimento;
	private JLabel lblTelefone;
	private JTextField textTelefone;
	private JLabel lblCelular;
	private JTextField textCelular;
	private JPasswordField password1;
	private JPasswordField password2;

	public static void main(String[] args) {
		try {
			CadastroFuncionarioView dialog = new CadastroFuncionarioView();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public CadastroFuncionarioView() {
		listener = new InputListenerCadastroFuncionario(this);
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
		setBounds(100, 100, 649, 700);
		setContentPane(getContentPanel());

	}

	public JButton getbtnPesquisarImagem() {
		if (btnPesquisarImagem == null) {
			btnPesquisarImagem = new JButton("Pesquisar Imagem");
			btnPesquisarImagem.setBounds(411, 584, 147, 23);
		}
		return btnPesquisarImagem;
	}
	
	public JPanel getpanelFoto() {
		if (panelFoto == null) {
			panelFoto = new JPanel();
			panelFoto.setBounds(348, 292, 275, 281);
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
			contentPanel.add(getLblNome());
			contentPanel.add(getTextNome());
			contentPanel.add(getTextDataCadastro());
			contentPanel.add(getLblDataCadastro());
			contentPanel.add(getbtnPesquisarImagem());

			contentPanel.add(getpanelFoto());
			contentPanel.add(getBtnCancelar());
			contentPanel.add(getBtnGravar());
			contentPanel.add(getTextSalario());
			contentPanel.add(getLblSalario());
			contentPanel.add(getLblComissao());
			contentPanel.add(getTextComissao());
			contentPanel.add(getLblCPF());
			contentPanel.add(getTextCPF());
			contentPanel.add(getLblRua());
			contentPanel.add(getTextRua());
			contentPanel.add(getTextBairro());
			contentPanel.add(getTextCidade());
			contentPanel.add(getLblBairro());
			contentPanel.add(getLblCidade());
			contentPanel.add(getLblNumero());
			contentPanel.add(getTextNumero());
			contentPanel.add(getLblComplemento());
			contentPanel.add(getTextComplemento());
			contentPanel.add(getLblCEP());
			contentPanel.add(getTextCEP());
			contentPanel.add(getLblDataNascimento());
			contentPanel.add(getTextDataNascimento());
			contentPanel.add(getLblTelefone());
			contentPanel.add(getTextTelefone());
			contentPanel.add(getLblCelular());
			
			textCelular = new JTextField();
			textCelular.setBounds(339, 152, 284, 20);
			contentPanel.add(textCelular);
			textCelular.setColumns(10);
			
			JLabel lblSenha = new JLabel("Senha");
			lblSenha.setBounds(339, 183, 284, 14);
			contentPanel.add(lblSenha);
			
			password1 = new JPasswordField();
			password1.setBounds(339, 208, 284, 20);
			contentPanel.add(password1);
			
			JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
			lblConfirmarSenha.setBounds(339, 242, 284, 14);
			contentPanel.add(lblConfirmarSenha);
			
			password2 = new JPasswordField();
			password2.setBounds(339, 261, 284, 20);
			contentPanel.add(password2);
			
			JCheckBox chckbxAdministrador = new JCheckBox("Administrador");
			chckbxAdministrador.setBounds(30, 615, 147, 23);
			contentPanel.add(chckbxAdministrador);
			
			
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
			lblCodigo.setBounds(30, 12, 277, 14);
		}
		return lblCodigo;
	}

	private JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome");
			lblNome.setBounds(30, 70, 46, 14);
		}
		return lblNome;
	}
	
	public JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(534, 627, 89, 23);
		}
		return btnCancelar;
	}
	public JButton getBtnGravar() {
		if (btnGravar == null) {
			btnGravar = new JButton("Gravar");
			btnGravar.setBounds(435, 627, 89, 23);
		}
		return btnGravar;
	}
	

	public JTextField getTextDataCadastro() {
		if (txtDataDoCadastro == null) {
			txtDataDoCadastro = new JTextField();
			txtDataDoCadastro.setBounds(339, 38, 284, 20);
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

	private JTextField getTextSalario() {
		if (textSalario == null) {
			textSalario = new JTextField();
			textSalario.setBounds(30, 152, 281, 20);
			textSalario.setColumns(10);
		}
		return textSalario;
	}
	private JLabel getLblSalario() {
		if (lblSalario == null) {
			lblSalario = new JLabel("Sal\u00E1rio (R$)");
			lblSalario.setBounds(30, 126, 281, 14);
		}
		return lblSalario;
	}
	
	
	private JLabel getLblComissao() {
		if (lblComissao == null) {
			lblComissao = new JLabel("Comiss\u00E3o (%)");
			lblComissao.setBounds(30, 183, 281, 14);
		}
		return lblComissao;
	}
	private JTextField getTextComissao() {
		if (textComissao == null) {
			textComissao = new JTextField();
			textComissao.setBounds(30, 208, 281, 20);
			textComissao.setColumns(10);
		}
		return textComissao;
	}
	
	private JLabel getLblCPF() {
		if (lblCPF == null) {
			lblCPF = new JLabel("CPF");
			lblCPF.setBounds(30, 242, 281, 14);
		}
		return lblCPF;
	}
	private JTextField getTextCPF() {
		if (textCPF == null) {
			textCPF = new JTextField();
			textCPF.setBounds(30, 261, 281, 20);
			textCPF.setColumns(10);
		}
		return textCPF;
	}
	
	
	
	private JLabel getLblRua() {
		if (lblRua == null) {
			lblRua = new JLabel("Rua");
			lblRua.setBounds(30, 292, 281, 14);
		}
		return lblRua;
	}
	private JTextField getTextRua() {
		if (textRua == null) {
			textRua = new JTextField();
			textRua.setBounds(30, 310, 204, 20);
			textRua.setColumns(10);
		}
		return textRua;
	}
	private JTextField getTextBairro() {
		if (textBairro == null) {
			textBairro = new JTextField();
			textBairro.setBounds(30, 363, 281, 20);
			textBairro.setColumns(10);
		}
		return textBairro;
	}
	private JTextField getTextCidade() {
		if (textCidade == null) {
			textCidade = new JTextField();
			textCidade.setBounds(30, 414, 281, 20);
			textCidade.setColumns(10);
		}
		return textCidade;
	}
	private JLabel getLblBairro() {
		if (lblBairro == null) {
			lblBairro = new JLabel("Bairro");
			lblBairro.setBounds(30, 341, 281, 14);
		}
		return lblBairro;
	}
	
	
	private JLabel getLblCidade() {
		if (lblCidade == null) {
			lblCidade = new JLabel("Cidade");
			lblCidade.setBounds(30, 394, 281, 14);
		}
		return lblCidade;
	}
	private JLabel getLblNumero() {
		if (lblNumero == null) {
			lblNumero = new JLabel("Numero");
			lblNumero.setBounds(249, 292, 62, 14);
		}
		return lblNumero;
	}
	private JTextField getTextNumero() {
		if (textNumero == null) {
			textNumero = new JTextField();
			textNumero.setBounds(244, 310, 67, 20);
			textNumero.setColumns(10);
		}
		return textNumero;
	}
	private JLabel getLblComplemento() {
		if (lblComplemento == null) {
			lblComplemento = new JLabel("Complemento");
			lblComplemento.setBounds(30, 445, 281, 14);
		}
		return lblComplemento;
	}
	private JTextField getTextComplemento() {
		if (textComplemento == null) {
			textComplemento = new JTextField();
			textComplemento.setBounds(30, 470, 281, 20);
			textComplemento.setColumns(10);
		}
		return textComplemento;
	}
	private JLabel getLblCEP() {
		if (lblCEP == null) {
			lblCEP = new JLabel("CEP");
			lblCEP.setBounds(30, 501, 281, 14);
		}
		return lblCEP;
	}
	private JTextField getTextCEP() {
		if (textCEP == null) {
			textCEP = new JTextField();
			textCEP.setBounds(30, 517, 281, 20);
			textCEP.setColumns(10);
		}
		return textCEP;
	}
	private JLabel getLblDataNascimento() {
		if (lblDataNascimento == null) {
			lblDataNascimento = new JLabel("Data Nascimento");
			lblDataNascimento.setBounds(30, 548, 281, 14);
		}
		return lblDataNascimento;
	}
	private JTextField getTextDataNascimento() {
		if (textDataNascimento == null) {
			textDataNascimento = new JTextField();
			textDataNascimento.setBounds(30, 569, 281, 20);
			textDataNascimento.setColumns(10);
		}
		return textDataNascimento;
	}
	private JLabel getLblTelefone() {
		if (lblTelefone == null) {
			lblTelefone = new JLabel("Telefone");
			lblTelefone.setBounds(339, 70, 284, 14);
		}
		return lblTelefone;
	}
	private JTextField getTextTelefone() {
		if (textTelefone == null) {
			textTelefone = new JTextField();
			textTelefone.setBounds(339, 95, 284, 20);
			textTelefone.setColumns(10);
		}
		return textTelefone;
	}
	private JLabel getLblCelular() {
		if (lblCelular == null) {
			lblCelular = new JLabel("Celular");
			lblCelular.setBounds(339, 126, 284, 14);
		}
		return lblCelular;
	}
}
