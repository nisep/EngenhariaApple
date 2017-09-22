package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.CadastroClienteView;

public class InputListenerCadastroCliente implements MouseListener {
	private CadastroClienteView cadastroCliente;
	public InputListenerCadastroCliente(CadastroClienteView cadastroCliente) {
		// TODO Auto-generated constructor stub
		this.cadastroCliente = cadastroCliente;
	}
	


	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == cadastroCliente.getBtnCancelar()) {
			cadastroCliente.dispose();
		}else if ((e.getSource()) == cadastroCliente.getBtnGravar()) {
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