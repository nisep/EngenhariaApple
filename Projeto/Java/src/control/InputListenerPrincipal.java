package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.LoginView;
import view.Principal;

public class InputListenerPrincipal implements MouseListener{
	
	private Principal principal;
	
	public InputListenerPrincipal(Principal principal) {
		this.principal = principal;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == principal.getBtnIniciar()) {
			new LoginView().setVisible(true);
			principal.getT1().interrupt();
			principal.dispose();
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
