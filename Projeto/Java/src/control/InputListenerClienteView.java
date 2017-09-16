package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.ClienteView;

public class InputListenerClienteView implements MouseListener {
	ClienteView clienteView;

	public InputListenerClienteView(ClienteView clienteView) {
		// TODO Auto-generated constructor stub
		this.clienteView = clienteView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == clienteView.getBuscarButton()) {
			System.out.println("Botão Ok clicado");
		}else if ((e.getSource()) == clienteView.getbtnNovoCliente()) {
			System.out.println("Botão Novo Clicado");
		}else if(e.getSource() == clienteView.getTableCliente()) {
			System.err.println("Tabela clicada, linha: "+clienteView.getTableCliente().getSelectedRow());
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
