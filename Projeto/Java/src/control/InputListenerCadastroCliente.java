package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import model.Cliente;
import model.ClienteDAO;
import view.CadastroClienteView;

public class InputListenerCadastroCliente implements MouseListener {
	private CadastroClienteView cadastroCliente;
	private JFileChooser jFileChooser;
	private ImageIcon imageIcon;
	private Cliente clie;
	private ClienteDAO clieDAO = new ClienteDAO();

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
			capturarDadosCliente();
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

	public void capturarDadosCliente() {
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
					getClie().setNome(cadastroCliente.getTextNome().getText());
					System.out.println(getClie().getNome());

					try {

						getClie().setCpf(Long.parseLong(cadastroCliente.getTextCPF().getText()));
						System.out.println(getClie().getCpf());

						getClie().setTelefone(Long.parseLong(cadastroCliente.getTextTelefone().getText()));
						System.out.println(getClie().getTelefone());

						getClie().setCelular(Long.parseLong(cadastroCliente.getTextCelular().getText()));
						System.out.println(getClie().getCelular());
					} catch (NumberFormatException e) {
						// TODO: handle exception
						System.out.println("Valor Errado!");
					}

					getClie().setRua(cadastroCliente.getTextRua().getText());
					System.out.println(getClie().getRua());

					getClie().setComplemento(cadastroCliente.getTextComplemento().getText());
					System.out.println(getClie().getComplemento());

					getClie().setNumero(cadastroCliente.getTextNumero().getText());
					System.out.println(getClie().getNumero());

					getClie().setBairro(cadastroCliente.getTextBairro().getText());
					System.out.println(getClie().getBairro());

					getClie().setCidade(cadastroCliente.getTextCidade().getText());
					System.out.println(getClie().getCidade());

					getClie().setCep(cadastroCliente.getTextCEP().getText());
					System.out.println(getClie().getCep());


					// getClie().setDataNascimento(cadastroFuncionario.getTextDataNascimento().getText());
					getClie().setDataNascimento(getClie().getDataCadastro());
					//System.out.println(getClie().getDataNascimento());

					if (clieDAO.verificaCPF(clie.getCpf()))
						JOptionPane.showMessageDialog(null, "CPF já se encontra cadastrado em nosso sistema!", null,
								JOptionPane.ERROR_MESSAGE);
					else
						clieDAO.gravarCliente(clie);

				} else {
					int result = JOptionPane.showConfirmDialog(null, "Deseja Realizar o Cadastro sem Imagem?",
							"Cadastrar", JOptionPane.YES_NO_OPTION);
					if (result == JOptionPane.YES_OPTION) {
						if (clieDAO.verificaCPF(clie.getCpf()))
							JOptionPane.showMessageDialog(null, "CPF já se encontra cadastrado em nosso sistema!", null,
									JOptionPane.ERROR_MESSAGE);
						else
							clieDAO.gravarCliente(clie);
					}
				}
		} else
			JOptionPane.showMessageDialog(null, "Valores em Branco!", null, JOptionPane.WARNING_MESSAGE);

	}

	public Cliente getClie() {
		if (clie == null) {
			clie = new Cliente();
		}
		return clie;
	}

	public void getImagem() {
		getJFileChooser().showOpenDialog(null);
		if (!(getJFileChooser().getSelectedFile() == null)) {
			getClie().setFoto(getJFileChooser().getSelectedFile().getAbsolutePath());
			imageIcon = new ImageIcon(getJFileChooser().getSelectedFile().getAbsolutePath());
			imageIcon.setImage(imageIcon.getImage().getScaledInstance(275, 281, 100));
			cadastroCliente.getLblFoto().setIcon(imageIcon);
			System.out.println(getClie().getFoto());
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