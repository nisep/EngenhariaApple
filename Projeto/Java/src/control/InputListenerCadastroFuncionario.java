package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.CadastroFuncionarioView;

public class InputListenerCadastroFuncionario implements MouseListener {
	CadastroFuncionarioView cadastroFuncionario;

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