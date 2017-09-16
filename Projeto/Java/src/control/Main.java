package control;

import view.PrincipalAdm;

public class Main {

	public static void main(String[] args) {
		 try {
				javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");

				// if you want decorations for frames and dialogs you can put this line
				//
				// com.birosoft.liquid.LiquidLookAndFeel.setLiquidDecorations(true);
				//
				// or if you want to use simulated Mac window decorations, put this line
				//
			 com.birosoft.liquid.LiquidLookAndFeel.setLiquidDecorations(true, "mac");
				 // For a full list of custom properties, checkout the project site at: https://liquidlnf.dev.java.net/
		    } catch (Exception e) {}
		new PrincipalAdm().setVisible(true);

	}

}
