package control;

<<<<<<< HEAD
import view.PrincipalAdm;
import view.PrincipalFunc;
=======
import view.CadastroProdutoView;
>>>>>>> 7bb5514ada46f202ae12ecd729ca4f226e753002

public class Main {

	public static void main(String[] args) {
		 try {
				javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
				com.birosoft.liquid.LiquidLookAndFeel.setLiquidDecorations(true, "mac");
		    } catch (Exception e) {}
<<<<<<< HEAD
		new PrincipalFunc().setVisible(true);
=======
		new CadastroProdutoView().setVisible(true);
>>>>>>> 7bb5514ada46f202ae12ecd729ca4f226e753002

	}

}
