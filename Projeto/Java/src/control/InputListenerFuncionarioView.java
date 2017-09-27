package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import model.Funcionario;
import model.FuncionarioDAO;
import view.CadastroFuncionarioView;
import view.EditarFuncionarioView;
import view.FuncionarioView;

public class InputListenerFuncionarioView implements MouseListener {
	FuncionarioView funcionarioView;
	//private Funcionario func;
	private FuncionarioDAO funcDAO = new FuncionarioDAO();
	

	public InputListenerFuncionarioView(FuncionarioView funcionarioView) {
		// TODO Auto-generated constructor stub
		this.funcionarioView = funcionarioView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == funcionarioView.getBuscarButton()) {
			ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
			funcs = funcDAO.buscaCPFNomeFuncionario(funcionarioView.getTextBusca().getText());
			System.out.println(funcs.size());
			//funcionarioView.getTableFuncionario() = 
			
			
			EditarFuncionarioView edicaoFuncionarioView = new EditarFuncionarioView();
			edicaoFuncionarioView.setVisible(true);
		} else if ((e.getSource()) == funcionarioView.getbtnNovoFuncionario()) {
			CadastroFuncionarioView cadastroFuncionarioView;
			System.out.println("Botão Novo Clicado");
			cadastroFuncionarioView = new CadastroFuncionarioView();
			cadastroFuncionarioView.setVisible(true);
		} else if (e.getSource() == funcionarioView.getTableFuncionario()) {
			System.err.println("Tabela clicada, linha: " + funcionarioView.getTableFuncionario().getSelectedRow());
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

}
