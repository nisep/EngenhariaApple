package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.CadastroFuncionarioView;
import view.FuncionarioView;

public class InputListenerFuncionarioView implements MouseListener {
	FuncionarioView funcionarioView;
	CadastroFuncionarioView cadastroFuncionarioView;

	public InputListenerFuncionarioView(FuncionarioView funcionarioView) {
		// TODO Auto-generated constructor stub
		this.funcionarioView = funcionarioView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == funcionarioView.getBuscarButton()) {
			System.out.println("Botão Ok clicado");
		}else if ((e.getSource()) == funcionarioView.getbtnNovoFuncionario()) {
			System.out.println("Botão Novo Clicado");
			cadastroFuncionarioView = new CadastroFuncionarioView();
			cadastroFuncionarioView.setVisible(true);
		}else if(e.getSource() == funcionarioView.getTableFuncionario()) {
			System.err.println("Tabela clicada, linha: "+funcionarioView.getTableFuncionario().getSelectedRow());
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
