package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import model.Funcionario;
import model.FuncionarioDAO;
import view.CadastroFuncionarioView;

public class InputListenerCadastroFuncionario implements MouseListener {
	private CadastroFuncionarioView cadastroFuncionario;
	private JFileChooser jFileChooser;
	private ImageIcon imageIcon;
	private Funcionario func;
	private FuncionarioDAO funcDAO = new FuncionarioDAO();
	

	
	public InputListenerCadastroFuncionario(CadastroFuncionarioView cadastroFuncionario) {
		// TODO Auto-generated constructor stub
		this.cadastroFuncionario = cadastroFuncionario;
	}
	


	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == cadastroFuncionario.getBtnCancelar()) {
			cadastroFuncionario.dispose();
		}else if ((e.getSource()) == cadastroFuncionario.getBtnGravar()) {
			System.out.println("Botão ok Clicado");
			capturarDadosFunc();
		}else if((e.getSource()) == cadastroFuncionario.getbtnPesquisarImagem()) {
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
		if(!(cadastroFuncionario.getTextNome().getText().equals("") || cadastroFuncionario.getTextCodigo().getText().equals("")
				|| cadastroFuncionario.getTextSalario().getText().equals("") || cadastroFuncionario.getTextComissao().getText().equals("")
				|| cadastroFuncionario.getTextCPF().getText().equals("") || cadastroFuncionario.getTextTelefone().getText().equals("")
				|| cadastroFuncionario.getTextCelular().getText().equals("") || cadastroFuncionario.getTextRua().getText().equals("")
				|| cadastroFuncionario.getTextComplemento().getText().equals("") || cadastroFuncionario.getTextNumero().getText().equals("")
				|| cadastroFuncionario.getTextBairro().getText().equals("") || cadastroFuncionario.getTextCidade().getText().equals("")
				|| cadastroFuncionario.getTextCEP().getText().equals("") 
				|| cadastroFuncionario.getTextCelular().getText().equals("") || cadastroFuncionario.getTextRua().getText().equals("")
				|| cadastroFuncionario.getTextDataNascimento().getText().equals("") )) {
			if(cadastroFuncionario.getTextPassword1().getText().equals(cadastroFuncionario.getTextPassword2().getText())
					&& !cadastroFuncionario.getTextPassword1().getText().equals("")) {
				if(!(imageIcon == null)) {
					getFunc().setNome(cadastroFuncionario.getTextNome().getText());
					System.out.println(getFunc().getNome());
					
					try {
						getFunc().setIdFuncionario(Integer.parseInt(cadastroFuncionario.getTextCodigo().getText()));
						System.out.println(getFunc().getIdFuncionario());
						
						getFunc().setSalario(Double.parseDouble(cadastroFuncionario.getTextSalario().getText()));
						System.out.println(getFunc().getSalario());
						
						getFunc().setComissao(Double.parseDouble(cadastroFuncionario.getTextComissao().getText()));
						System.out.println(getFunc().getComissao());
						
						getFunc().setCpf(Long.parseLong(cadastroFuncionario.getTextCPF().getText()));
						System.out.println(getFunc().getCpf());
						
						getFunc().setTelefone(Long.parseLong(cadastroFuncionario.getTextTelefone().getText()));
						System.out.println(getFunc().getTelefone());
						
						getFunc().setCelular(Long.parseLong(cadastroFuncionario.getTextCelular().getText()));
						System.out.println(getFunc().getCelular());
					} catch (NumberFormatException e) {
						// TODO: handle exception
						System.out.println("Valor Errado!");
					}
					
					getFunc().setRua(cadastroFuncionario.getTextRua().getText());
					System.out.println(getFunc().getRua());
					
					getFunc().setComplemento(cadastroFuncionario.getTextComplemento().getText());
					System.out.println(getFunc().getComplemento());
					
					getFunc().setNumero(cadastroFuncionario.getTextNumero().getText());
					System.out.println(getFunc().getNumero());
					
					getFunc().setBairro(cadastroFuncionario.getTextBairro().getText());
					System.out.println(getFunc().getBairro());
					
					getFunc().setCidade(cadastroFuncionario.getTextCidade().getText());
					System.out.println(getFunc().getCidade());
					
					getFunc().setCep(cadastroFuncionario.getTextCEP().getText());
					System.out.println(getFunc().getCep());
					//TODO: resolver
					SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
					formato.parse(cadastroFuncionario.getTextDataCadastro().getText());
					getFunc().setDataAdmissao((Date) formato);
					System.out.println(getFunc().getDataAdmissao());
					
					getFunc().setDataNascimento(cadastroFuncionario.getTextDataNascimento().getText());
					System.out.println(getFunc().getDataNascimento());
					
					if(cadastroFuncionario.getChckbxAdministrador().isSelected()) getFunc().setAdministrador(true);
					else getFunc().setAdministrador(false);
		
					getFunc().setSenha(cadastroFuncionario.getTextPassword1().getText());
					
					funcDAO.gravarFuncionario(func);
					
				}else {
					int result = JOptionPane.showConfirmDialog(null, "Deseja Realizar o Cadastro sem Imagem?","Cadastrar", JOptionPane.YES_NO_OPTION);
					if(result==JOptionPane.YES_OPTION) {
						funcDAO.gravarFuncionario(func);
						//System.out.println(func.get);
					} 
				}
			}else {
				JOptionPane.showMessageDialog(null, "Senhas não Conferem!", null, JOptionPane.ERROR_MESSAGE);
			}
		}else JOptionPane.showMessageDialog(null, "Valores em Branco!", null, JOptionPane.WARNING_MESSAGE);
		
	}
	
	public Funcionario getFunc() {
		if(func == null) {
			func = new Funcionario();
		}
		return func;
	}
	
	public void getImagem() {
		getJFileChooser().showOpenDialog(null);
		if(!(getJFileChooser().getSelectedFile()==null)) {
			getFunc().setFoto(getJFileChooser().getSelectedFile().getAbsolutePath());
			imageIcon = new ImageIcon(getJFileChooser().getSelectedFile().getAbsolutePath());
			imageIcon.setImage(imageIcon.getImage().getScaledInstance(275, 281, 100));
			cadastroFuncionario.getLblFoto().setIcon(imageIcon);
		}
		
	}
	
	public JFileChooser getJFileChooser() {
		if(jFileChooser == null) {
			jFileChooser = new JFileChooser();
			jFileChooser.setFileFilter(new javax.swing.filechooser.FileFilter(){
				   public boolean accept(File f){
				      return (f.getName().endsWith(".jpg") || f.getName().endsWith(".PNG") ) ||  f.isDirectory();
				   }
				   public String getDescription(){
				       return "Arquivo de Imagem(*.jpg, *.png)";
				   }
				});
		}
		
		return jFileChooser;
	}
	
}