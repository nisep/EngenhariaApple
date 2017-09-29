package control;

import javax.swing.table.DefaultTableModel;

import model.FuncionarioDAO;
import view.FuncionarioView;

public class AtualizaTabela implements Runnable{
	
	FuncionarioView funcionarioView;
	FuncionarioDAO funcDAO = new FuncionarioDAO();
	
	public AtualizaTabela(FuncionarioView funcionarioView) {
		this.funcionarioView = funcionarioView;
	}

	@Override
	public void run() {
		try {
			for(;;) {
				Thread.sleep(3000);
				atualizarTabela();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generatee.printStackTrace();
		}
	}

	private void atualizarTabela() {
		String[][] funcs = funcDAO.listaFuncionarioArray("");
		String[] colunas = {"id","Nome", "CPF", "Endereço", "Telefone","Nascimento"};
		
		DefaultTableModel model = new DefaultTableModel(funcs,colunas) {
			 
			/**
			 * 
			 */
			private static final long serialVersionUID = -7680235106608274804L;
			boolean[] canEdit = new boolean []{  
			            false, false, false, false,false,false
			        };  
			        @Override  
			        public boolean isCellEditable(int rowIndex, int columnIndex) {  
			            return canEdit [columnIndex];  
			        }
		};
		funcionarioView.getTableFuncionario().setModel(model);
		funcionarioView.repaint();
		funcionarioView.revalidate();
	}
	
}
