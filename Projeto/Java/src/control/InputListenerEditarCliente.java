package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import model.Funcionario;
import view.EditarClienteView;

public class InputListenerEditarCliente implements MouseListener {
	private EditarClienteView edicaoCliente;
	private JFileChooser jFileChooser;
	private ImageIcon imageIcon;
	private Funcionario func;

	public InputListenerEditarCliente(EditarClienteView edicaoCliente) {
		// TODO Auto-generated constructor stub
		this.edicaoCliente = edicaoCliente;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == edicaoCliente.getBtnCancelar()) {
			edicaoCliente.dispose();
		} else if ((e.getSource()) == edicaoCliente.getBtnGravar()) {
			System.out.println("Botão ok Clicado");
			capturarDadosFunc();
		} else if ((e.getSource()) == edicaoCliente.getbtnPesquisarImagem()) {
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
		if (!(edicaoCliente.getTextNome().getText().equals("") || edicaoCliente.getTextCPF().getText().equals("")
				|| edicaoCliente.getTextTelefone().getText().equals("")
				|| edicaoCliente.getTextCelular().getText().equals("")
				|| edicaoCliente.getTextRua().getText().equals("")
				|| edicaoCliente.getTextComplemento().getText().equals("")
				|| edicaoCliente.getTextNumero().getText().equals("")
				|| edicaoCliente.getTextBairro().getText().equals("")
				|| edicaoCliente.getTextCidade().getText().equals("") || edicaoCliente.getTextCEP().getText().equals("")
				|| edicaoCliente.getTextCelular().getText().equals("")
				|| edicaoCliente.getTextRua().getText().equals("")
				|| edicaoCliente.getTextDataNascimento().getText().equals(""))) {
			if (!(imageIcon == null)) {
				getFunc().setNome(edicaoCliente.getTextNome().getText());
				System.out.println(getFunc().getNome());

				try {

					getFunc().setCpf(Long.parseLong(edicaoCliente.getTextCPF().getText()));
					System.out.println(getFunc().getCpf());

					getFunc().setTelefone(Long.parseLong(edicaoCliente.getTextTelefone().getText()));
					System.out.println(getFunc().getTelefone());

					getFunc().setCelular(Long.parseLong(edicaoCliente.getTextCelular().getText()));
					System.out.println(getFunc().getCelular());
				} catch (NumberFormatException e) {
					// TODO: handle exception
					System.out.println("Valor Errado!");
				}

				getFunc().setRua(edicaoCliente.getTextRua().getText());
				System.out.println(getFunc().getRua());

				getFunc().setComplemento(edicaoCliente.getTextComplemento().getText());
				System.out.println(getFunc().getComplemento());

				getFunc().setNumero(edicaoCliente.getTextNumero().getText());
				System.out.println(getFunc().getNumero());

				getFunc().setBairro(edicaoCliente.getTextBairro().getText());
				System.out.println(getFunc().getBairro());

				getFunc().setCidade(edicaoCliente.getTextCidade().getText());
				System.out.println(getFunc().getCidade());

				getFunc().setCep(edicaoCliente.getTextCEP().getText());
				System.out.println(getFunc().getCep());

				getFunc().setDataAdmissao();
				System.out.println(getFunc().getDataAdmissao());

				// getFunc().setDataNascimento(cadastroFuncionario.getTextDataNascimento().getText());
				getFunc().setDataNascimento(getFunc().getDataAdmissao());
				System.out.println(getFunc().getDataNascimento());

				// TODO: Chamar DAO Cliente

			} else {
				int result = JOptionPane.showConfirmDialog(null, "Deseja Realizar a Edição sem adicionar uma Imagem?",
						"Cadastrar", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					// TODO: Chamar DAO Cliente
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
			edicaoCliente.getLblFoto().setIcon(imageIcon);
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
