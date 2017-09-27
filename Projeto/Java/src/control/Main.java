package control;

import view.Principal;
import view.PrincipalAdm;
import view.PrincipalFunc;

public class Main {

	public static void main(String[] args) {
		 try {
				javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
				com.birosoft.liquid.LiquidLookAndFeel.setLiquidDecorations(true, "mac");
		    } catch (Exception e) {}
		new Principal().setVisible(true);


	}

}
