package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.CadastroNotaEntradaView;
import view.NotaEntradaView;

public class InputListenerNotaEntradaView implements MouseListener {
	NotaEntradaView notaEntradaView;

	public InputListenerNotaEntradaView(NotaEntradaView notaEntradaView) {
		// TODO Auto-generated constructor stub
		this.notaEntradaView = notaEntradaView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == notaEntradaView.getBuscarButton()) {
			System.out.println("Botão Ok clicado");
		}else if ((e.getSource()) == notaEntradaView.getbtnNovoPedido()) {
			System.out.println("Botão Novo Clicado");
			new CadastroNotaEntradaView().setVisible(true);
		}else if(e.getSource() == notaEntradaView.getTablePedido()) {
			System.err.println("Tabela clicada, linha: "+notaEntradaView.getTablePedido().getSelectedRow());
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
