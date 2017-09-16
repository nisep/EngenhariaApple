package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.CadastroProdutoView;
import view.ProdutoView;

public class InputListenerProdutoView implements MouseListener {
	ProdutoView produtoView;

	public InputListenerProdutoView(ProdutoView produtoView) {
		// TODO Auto-generated constructor stub
		this.produtoView = produtoView;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == produtoView.getBuscarButton()) {
			System.out.println("Botão Ok clicado");
		}else if ((e.getSource()) == produtoView.getbtnNovoProduto()) {
			new CadastroProdutoView().setVisible(true);
		}else if(e.getSource() == produtoView.getTableProduto()) {
			System.err.println("Tabela clicada, linha: "+produtoView.getTableProduto().getSelectedRow());
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
