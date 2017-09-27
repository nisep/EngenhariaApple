package control;

import view.EditarNotaEntradaView;

public class Main {

	public static void main(String[] args) {
		 try {
				javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
				com.birosoft.liquid.LiquidLookAndFeel.setLiquidDecorations(true, "mac");
		    } catch (Exception e) {}
		new EditarNotaEntradaView().setVisible(true);


	}

}
