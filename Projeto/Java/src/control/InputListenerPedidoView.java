package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.PedidoView;

public class InputListenerPedidoView implements MouseListener {
	PedidoView pedidoView;

	public InputListenerPedidoView(PedidoView clienteView) {
		// TODO Auto-generated constructor stub
		this.pedidoView = clienteView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == pedidoView.getBuscarButton()) {
			System.out.println("Botão Ok clicado");
		}else if ((e.getSource()) == pedidoView.getbtnNovoPedido()) {
			System.out.println("Botão Novo Clicado");
		}else if(e.getSource() == pedidoView.getTablePedido()) {
			System.err.println("Tabela clicada, linha: "+pedidoView.getTablePedido().getSelectedRow());
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
