package control;

<<<<<<< HEAD
import view.PrincipalAdm;
=======
import view.Principal;

>>>>>>> bac62566695f3fc162763d45792a64fb81716c67

public class Main {

	public static void main(String[] args) {
		 try {
				javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
				com.birosoft.liquid.LiquidLookAndFeel.setLiquidDecorations(true, "mac");
		    } catch (Exception e) {}
<<<<<<< HEAD
		new PrincipalAdm().setVisible(true);

=======
		new Principal().setVisible(true);
>>>>>>> bac62566695f3fc162763d45792a64fb81716c67

	}

}
