package control;

<<<<<<< HEAD
import view.Principal;
import view.PrincipalAdm;
import view.PrincipalFunc;
=======
import javax.swing.JOptionPane;

import view.LoginView;
>>>>>>> refs/remotes/origin/master

public class Main {

	public static void main(String[] args) {
		 try {
				javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
				com.birosoft.liquid.LiquidLookAndFeel.setLiquidDecorations(true, "mac");
		    } catch (Exception e) {}
<<<<<<< HEAD
		new Principal().setVisible(true);
=======
		JOptionPane.showMessageDialog(null, "Login Inválido!","Erro",JOptionPane.ERROR_MESSAGE);
>>>>>>> refs/remotes/origin/master


	}

}
