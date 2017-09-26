package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import model.Funcionario;
import view.CadastroClienteView;

public class InputListenerCadastroCliente implements MouseListener {
	private CadastroClienteView cadastroCliente;
	private JFileChooser jFileChooser;
	private ImageIcon imageIcon;
	private Funcionario func;

	public InputListenerCadastroCliente(CadastroClienteView cadastroCliente) {
		// TODO Auto-generated constructor stub
		this.cadastroCliente = cadastroCliente;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == cadastroCliente.getBtnCancelar()) {
			cadastroCliente.dispose();
		} else if ((e.getSource()) == cadastroCliente.getBtnGravar()) {
			System.out.println("Botão ok Clicado");
			capturarDadosFunc();
		} else if ((e.getSource()) == cadastroCliente.getbtnPesquisarImagem()) {
			getImagem();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {

		// TODO Auto-generated method stub

	}

	public void capturarDadosFunc() {
		// TODO Auto-generated method stub
		if (!(cadastroCliente.getTextNome().getText().equals("")
				|| cadastroCliente.getTextCPF().getText().equals("")
				|| cadastroCliente.getTextTelefone().getText().equals("")
				|| cadastroCliente.getTextCelular().getText().equals("")
				|| cadastroCliente.getTextRua().getText().equals("")
				|| cadastroCliente.getTextComplemento().getText().equals("")
				|| cadastroCliente.getTextNumero().getText().equals("")
				|| cadastroCliente.getTextBairro().getText().equals("")
				|| cadastroCliente.getTextCidade().getText().equals("")
				|| cadastroCliente.getTextCEP().getText().equals("")
				|| cadastroCliente.getTextCelular().getText().equals("")
				|| cadastroCliente.getTextRua().getText().equals("")
				|| cadastroCliente.getTextDataNascimento().getText().equals(""))) {
				if (!(imageIcon == null)) {
					getFunc().setNome(cadastroCliente.getTextNome().getText());
					System.out.println(getFunc().getNome());

					try {

						getFunc().setCpf(Long.parseLong(cadastroCliente.getTextCPF().getText()));
						System.out.println(getFunc().getCpf());

						getFunc().setTelefone(Long.parseLong(cadastroCliente.getTextTelefone().getText()));
						System.out.println(getFunc().getTelefone());

						getFunc().setCelular(Long.parseLong(cadastroCliente.getTextCelular().getText()));
						System.out.println(getFunc().getCelular());
					} catch (NumberFormatException e) {
						// TODO: handle exception
						System.out.println("Valor Errado!");
					}

					getFunc().setRua(cadastroCliente.getTextRua().getText());
					System.out.println(getFunc().getRua());

					getFunc().setComplemento(cadastroCliente.getTextComplemento().getText());
					System.out.println(getFunc().getComplemento());

					getFunc().setNumero(cadastroCliente.getTextNumero().getText());
					System.out.println(getFunc().getNumero());

					getFunc().setBairro(cadastroCliente.getTextBairro().getText());
					System.out.println(getFunc().getBairro());

					getFunc().setCidade(cadastroCliente.getTextCidade().getText());
					System.out.println(getFunc().getCidade());

					getFunc().setCep(cadastroCliente.getTextCEP().getText());
					System.out.println(getFunc().getCep());

					getFunc().setDataAdmissao();
					System.out.println(getFunc().getDataAdmissao());

					// getFunc().setDataNascimento(cadastroFuncionario.getTextDataNascimento().getText());
					getFunc().setDataNascimento(getFunc().getDataAdmissao());
					System.out.println(getFunc().getDataNascimento());

					//TODO: Chamar DAO Cliente

				} else {
					int result = JOptionPane.showConfirmDialog(null, "Deseja Realizar o Cadastro sem Imagem?",
							"Cadastrar", JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.YES_OPTION) {
						//TODO: Chamar DAO Cliente
					}
				}
		} else
			JOptionPane.showMessageDialog(null, "Valores em Branco!", null, JOptionPane.WARNING_MESSAGE);

	}

	public Funcionario getFunc() {
		if (func == null) {
			func = new Funcionario();
		}
		return func;
	}

	public void getImagem() {
		getJFileChooser().showOpenDialog(null);
		if (!(getJFileChooser().getSelectedFile() == null)) {
			getFunc().setFoto(getJFileChooser().getSelectedFile().getAbsolutePath());
			imageIcon = new ImageIcon(getJFileChooser().getSelectedFile().getAbsolutePath());
			imageIcon.setImage(imageIcon.getImage().getScaledInstance(275, 281, 100));
			cadastroCliente.getLblFoto().setIcon(imageIcon);
			System.out.println(getFunc().getFoto());
		}

	}

	public JFileChooser getJFileChooser() {
		if (jFileChooser == null) {
			jFileChooser = new JFileChooser();
			jFileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
				public boolean accept(File f) {
					return (f.getName().endsWith(".jpg") || f.getName().endsWith(".PNG")) || f.isDirectory();
				}

				public String getDescription() {
					return "Arquivo de Imagem(*.jpg, *.png)";
				}
			});
		}

		return jFileChooser;
	}

}