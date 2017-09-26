package view;

import java.awt.Color;

import javax.swing.ImageIcon;
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
	private JButton btnPesquisarImagem;
	private JLabel lblNome;
	private JTextField textNome;
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
	private JLabel lblSenha;
	private JPasswordField textPassword1;
	private JLabel lblConfirmarSenha;
	private JPasswordField textPassword2;
	private JCheckBox chckbxAdministrador;
	private JLabel lblFoto;

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
		setBounds(100, 100, 649, 661);
		setContentPane(getContentPanel());
		setLocationRelativeTo(null);
		setResizable(false);

	}

	public JButton getbtnPesquisarImagem() {
		if (btnPesquisarImagem == null) {
			btnPesquisarImagem = new JButton("Pesquisar Imagem");
			btnPesquisarImagem.setBounds(407, 540, 147, 23);
		}
		return btnPesquisarImagem;
	}
	
	public JPanel getpanelFoto() {
		if (panelFoto == null) {
			panelFoto = new JPanel();
			panelFoto.setBounds(344, 248, 275, 281);
			panelFoto.setLayout(null);
			panelFoto.add(getLblFoto());
		}
		return panelFoto;

	}

	public JPanel getContentPanel() {
		if (contentPanel == null) {
			contentPanel = new JPanel();
			contentPanel.setBackground(Color.WHITE);
			contentPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

			contentPanel.setLayout(null);
			contentPanel.add(getLblNome());
			contentPanel.add(getTextNome());
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
			contentPanel.add(getTextCelular());
			contentPanel.add(getLblSenha());
			contentPanel.add(getTextPassword1());
			contentPanel.add(getLblConfirmarSenha());
			contentPanel.add(getTextPassword2());
			
			
			contentPanel.add(getChckbxAdministrador());
			
			
		}
		return contentPanel;
	}

	
	public JTextField getTextNome() {
		if (textNome == null) {
			textNome = new JTextField();
			textNome.setBounds(26, 51, 281, 20);
			textNome.setColumns(10);
		}
		return textNome;
	}
	
	
	public JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome");
			lblNome.setBounds(26, 26, 46, 14);
		}
		return lblNome;
	}
	
	public JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(530, 583, 89, 23);
		}
		return btnCancelar;
	}
	public JButton getBtnGravar() {
		if (btnGravar == null) {
			btnGravar = new JButton("Gravar");
			btnGravar.setBounds(431, 583, 89, 23);
		}
		return btnGravar;
	}
	
	public JTextField getTextSalario() {
		if (textSalario == null) {
			textSalario = new JTextField();
			textSalario.setBounds(26, 108, 281, 20);
			textSalario.setColumns(10);
		}
		return textSalario;
	}
	public JLabel getLblSalario() {
		if (lblSalario == null) {
			lblSalario = new JLabel("Sal\u00E1rio (R$)");
			lblSalario.setBounds(26, 82, 281, 14);
		}
		return lblSalario;
	}
	
	
	public JLabel getLblComissao() {
		if (lblComissao == null) {
			lblComissao = new JLabel("Comiss\u00E3o (%)");
			lblComissao.setBounds(26, 139, 281, 14);
		}
		return lblComissao;
	}
	public JTextField getTextComissao() {
		if (textComissao == null) {
			textComissao = new JTextField();
			textComissao.setBounds(26, 164, 281, 20);
			textComissao.setColumns(10);
		}
		return textComissao;
	}
	
	public JLabel getLblCPF() {
		if (lblCPF == null) {
			lblCPF = new JLabel("CPF");
			lblCPF.setBounds(26, 198, 281, 14);
		}
		return lblCPF;
	}
	public JTextField getTextCPF() {
		if (textCPF == null) {
			textCPF = new JTextField();
			textCPF.setBounds(26, 217, 281, 20);
			textCPF.setColumns(10);
		}
		return textCPF;
	}
	
	
	
	public JLabel getLblRua() {
		if (lblRua == null) {
			lblRua = new JLabel("Rua");
			lblRua.setBounds(26, 248, 281, 14);
		}
		return lblRua;
	}
	public JTextField getTextRua() {
		if (textRua == null) {
			textRua = new JTextField();
			textRua.setBounds(26, 266, 204, 20);
			textRua.setColumns(10);
		}
		return textRua;
	}
	public JTextField getTextBairro() {
		if (textBairro == null) {
			textBairro = new JTextField();
			textBairro.setBounds(26, 319, 281, 20);
			textBairro.setColumns(10);
		}
		return textBairro;
	}
	public JTextField getTextCidade() {
		if (textCidade == null) {
			textCidade = new JTextField();
			textCidade.setBounds(26, 370, 281, 20);
			textCidade.setColumns(10);
		}
		return textCidade;
	}
	public JLabel getLblBairro() {
		if (lblBairro == null) {
			lblBairro = new JLabel("Bairro");
			lblBairro.setBounds(26, 297, 281, 14);
		}
		return lblBairro;
	}
	
	
	public JLabel getLblCidade() {
		if (lblCidade == null) {
			lblCidade = new JLabel("Cidade");
			lblCidade.setBounds(26, 350, 281, 14);
		}
		return lblCidade;
	}
	public JLabel getLblNumero() {
		if (lblNumero == null) {
			lblNumero = new JLabel("Numero");
			lblNumero.setBounds(245, 248, 62, 14);
		}
		return lblNumero;
	}
	public JTextField getTextNumero() {
		if (textNumero == null) {
			textNumero = new JTextField();
			textNumero.setBounds(240, 266, 67, 20);
			textNumero.setColumns(10);
		}
		return textNumero;
	}
	public JLabel getLblComplemento() {
		if (lblComplemento == null) {
			lblComplemento = new JLabel("Complemento");
			lblComplemento.setBounds(26, 401, 281, 14);
		}
		return lblComplemento;
	}
	public JTextField getTextComplemento() {
		if (textComplemento == null) {
			textComplemento = new JTextField();
			textComplemento.setBounds(26, 426, 281, 20);
			textComplemento.setColumns(10);
		}
		return textComplemento;
	}
	public JLabel getLblCEP() {
		if (lblCEP == null) {
			lblCEP = new JLabel("CEP");
			lblCEP.setBounds(26, 457, 281, 14);
		}
		return lblCEP;
	}
	public JTextField getTextCEP() {
		if (textCEP == null) {
			textCEP = new JTextField();
			textCEP.setBounds(26, 473, 281, 20);
			textCEP.setColumns(10);
		}
		return textCEP;
	}
	public JLabel getLblDataNascimento() {
		if (lblDataNascimento == null) {
			lblDataNascimento = new JLabel("Data Nascimento");
			lblDataNascimento.setBounds(26, 504, 281, 14);
		}
		return lblDataNascimento;
	}
	public JTextField getTextDataNascimento() {
		if (textDataNascimento == null) {
			textDataNascimento = new JTextField();
			textDataNascimento.setBounds(26, 525, 281, 20);
			textDataNascimento.setColumns(10);
		}
		return textDataNascimento;
	}
	public JLabel getLblTelefone() {
		if (lblTelefone == null) {
			lblTelefone = new JLabel("Telefone");
			lblTelefone.setBounds(335, 26, 284, 14);
		}
		return lblTelefone;
	}
	public JTextField getTextTelefone() {
		if (textTelefone == null) {
			textTelefone = new JTextField();
			textTelefone.setBounds(335, 51, 284, 20);
			textTelefone.setColumns(10);
		}
		return textTelefone;
	}
	public JLabel getLblCelular() {
		if (lblCelular == null) {
			lblCelular = new JLabel("Celular");
			lblCelular.setBounds(335, 82, 284, 14);
		}
		return lblCelular;
	}
	
	public JTextField getTextCelular() {
		if (textCelular == null) {
			textCelular = new JTextField();
			textCelular.setBounds(335, 108, 284, 20);
			textCelular.setColumns(10);
		}
		return textCelular;
	}
	
	public JLabel getLblSenha() {
		if (lblSenha == null) {
			lblSenha = new JLabel("Senha");
			lblSenha.setBounds(335, 139, 284, 14);
		}
		return lblSenha;
	}
	
	public JTextField getTextPassword1() {
		if (textPassword1 == null) {
			textPassword1 = new JPasswordField();
			textPassword1.setBounds(335, 164, 284, 20);
		}
		return textPassword1;
	}
	
	public JLabel getLblConfirmarSenha() {
		if (lblConfirmarSenha == null) {
			lblConfirmarSenha = new JLabel("Confirmar Senha");
			lblConfirmarSenha.setBounds(335, 198, 284, 14);
			
		}
		return lblConfirmarSenha;
	}
	
	public JTextField getTextPassword2() {
		if (textPassword2 == null) {
			textPassword2 = new JPasswordField();
			textPassword2.setBounds(335, 217, 284, 20);
		}
		return textPassword2;
	}
	
	public JCheckBox getChckbxAdministrador() {
		if (chckbxAdministrador == null) {
			chckbxAdministrador = new JCheckBox("Administrador");
			chckbxAdministrador.setBounds(26, 571, 147, 23);
		}
		return chckbxAdministrador;
	}
	
	public JLabel getLblFoto() {
		if (lblFoto == null) {
			lblFoto = new JLabel("");
			lblFoto.setBounds(0, 0, 275, 281);
			lblFoto.setIcon(new ImageIcon("Interno/default-avatar.png"));
		}
		return lblFoto;
	}
}
