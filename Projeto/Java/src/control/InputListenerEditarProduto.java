package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.Produto;
import view.EditarProdutoView;

public class InputListenerEditarProduto implements MouseListener{
	private EditarProdutoView edicaoProduto;
	private Produto produto;
	public InputListenerEditarProduto(EditarProdutoView edicaoProduto) {
		// TODO Auto-generated constructor stub
		this.edicaoProduto = edicaoProduto;
	}
	


	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == edicaoProduto.getBtnCancelar()) {
			edicaoProduto.dispose();
		}else if ((e.getSource()) == edicaoProduto.getBtnGravar()) {
			System.out.println("Botão ok Clicado");
			capturaDados();
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
	
	public void capturaDados() {
		if(!(edicaoProduto.getTextCodigo().equals("") || edicaoProduto.getTextNome().equals("")
				|| edicaoProduto.getTextPrecoCompra().equals("") || edicaoProduto.getTextPrecoVenda().equals("")
				|| edicaoProduto.getTextDescricao().equals("") || edicaoProduto.getTextDataCadastro().equals("")
				)) {
			
		}
	}
	
	public Produto getProduto() {
		if(produto == null) {
			produto = new Produto();
		}
		return produto;
	}
}
