package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.CadastroPedidoView;

public class InputListenerCadastroPedido implements MouseListener {
	CadastroPedidoView cadastroPedido;

	public InputListenerCadastroPedido(CadastroPedidoView cadastroPedido) {
		// TODO Auto-generated constructor stub
		this.cadastroPedido = cadastroPedido;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == cadastroPedido.getBtnCancelar()) {
			cadastroPedido.dispose();
		} else if ((e.getSource()) == cadastroPedido.getBtnGravar()) {
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