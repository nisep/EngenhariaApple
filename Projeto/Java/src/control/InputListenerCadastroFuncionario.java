package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import model.Funcionario;
import view.CadastroFuncionarioView;

public class InputListenerCadastroFuncionario implements MouseListener {
	CadastroFuncionarioView cadastroFuncionario;
	JFileChooser jFileChooser;
	
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
			jFileChooser = new JFileChooser();
			jFileChooser.setFileFilter(new javax.swing.filechooser.FileFilter(){
				   public boolean accept(File f){
				      return (f.getName().endsWith(".jpg") || f.getName().endsWith(".PNG") ) ||  f.isDirectory();
				   }
				   public String getDescription(){
				       return "Arquivo de Imagem(*.jpg, *.png)";
				   }
				});
			jFileChooser.showOpenDialog(null);
			jFileChooser.getSelectedFile().getAbsolutePath();
			cadastroFuncionario.getLblFoto().setIcon(new ImageIcon(jFileChooser.getSelectedFile().getAbsolutePath()));
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
		Funcionario func = new Funcionario();
		func.setNome(cadastroFuncionario.getTextNome().getText());
		System.out.println(func.getNome());
		
		try {
			func.setIdFuncionario(Integer.parseInt(cadastroFuncionario.getTextCodigo().getText()));
			System.out.println(func.getIdFuncionario());
			
			func.setSalario(Double.parseDouble(cadastroFuncionario.getTextSalario().getText()));
			System.out.println(func.getSalario());
			
			func.setComissao(Double.parseDouble(cadastroFuncionario.getTextComissao().getText()));
			System.out.println(func.getComissao());
			
			func.setCpf(Long.parseLong(cadastroFuncionario.getTextCPF().getText()));
			System.out.println(func.getCpf());
			
			func.setTelefone(Long.parseLong(cadastroFuncionario.getTextTelefone().getText()));
			System.out.println(func.getTelefone());
			
			func.setCelular(Long.parseLong(cadastroFuncionario.getTextCelular().getText()));
			System.out.println(func.getCelular());
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Valor Errado!");
		}
		
		func.setRua(cadastroFuncionario.getTextRua().getText());
		System.out.println(func.getRua());
		
		func.setComplemento(cadastroFuncionario.getTextComplemento().getText());
		System.out.println(func.getComplemento());
		
		func.setNumero(cadastroFuncionario.getTextNumero().getText());
		System.out.println(func.getNumero());
		
		func.setBairro(cadastroFuncionario.getTextBairro().getText());
		System.out.println(func.getBairro());
		
		func.setCidade(cadastroFuncionario.getTextCidade().getText());
		System.out.println(func.getCidade());
		
		func.setCep(cadastroFuncionario.getTextCEP().getText());
		System.out.println(func.getCep());
		
		func.setDataAdmissao(cadastroFuncionario.getTextDataCadastro().getText());
		System.out.println(func.getDataAdmissao());
		
		func.setDataNascimento(cadastroFuncionario.getTextDataNascimento().getText());
		System.out.println(func.getDataNascimento());
		
		if(cadastroFuncionario.getTextPassword1().getText().equals(cadastroFuncionario.getTextPassword2().getText())
				&& !cadastroFuncionario.getTextPassword1().getText().equals("")) {
			func.setSenha(cadastroFuncionario.getTextPassword1().getText());
		}else {
			System.out.println("Senhas não conferem!");
		}
		
		
	}
	
}