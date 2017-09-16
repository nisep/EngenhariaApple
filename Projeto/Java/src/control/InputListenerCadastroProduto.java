package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.CadastroProdutoView;

public class InputListenerCadastroProduto implements MouseListener{
	CadastroProdutoView cadastroProduto;
	
	public InputListenerCadastroProduto(CadastroProdutoView cadastroProduto) {
		// TODO Auto-generated constructor stub
		this.cadastroProduto = cadastroProduto;
	}
	


	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == cadastroProduto.getBtnCancelar()) {
			cadastroProduto.dispose();
		}else if ((e.getSource()) == cadastroProduto.getBtnGravar()) {
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
