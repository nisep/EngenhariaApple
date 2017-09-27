package control;

import javax.swing.JOptionPane;

import view.LoginView;

public class Main {

	public static void main(String[] args) {
		 try {
				javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
				com.birosoft.liquid.LiquidLookAndFeel.setLiquidDecorations(true, "mac");
		    } catch (Exception e) {}
		JOptionPane.showMessageDialog(null, "Login Inválido!","Erro",JOptionPane.ERROR_MESSAGE);


	}

}
