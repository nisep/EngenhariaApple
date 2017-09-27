package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.EditarPedidoView;

public class InputListenerEditarPedido implements MouseListener{
	EditarPedidoView editarPedido;

	public InputListenerEditarPedido(EditarPedidoView editarPedido) {
		// TODO Auto-generated constructor stub
		this.editarPedido = editarPedido;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == editarPedido.getBtnCancelar()) {
			editarPedido.dispose();
		} else if ((e.getSource()) == editarPedido.getBtnGravar()) {
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
