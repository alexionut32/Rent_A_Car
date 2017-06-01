package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import BusinessLayer.LogInBusiness;
import model.Customer;
import model.User;
import view.LogInView;

public class LogInController {
	private LogInView theLogInView;
	private User theUser;
	private Customer theCustomer;
	private CustomerController theCustomerController;
	private AdminController theAdminController;
	private UserController theUserController;

	public LogInController() {
		this.theLogInView = new LogInView();
		this.theLogInView.setVisible(true);
		this.theLogInView.getBtnLogIn().addMouseListener(new openLogInView());
	}

	class openLogInView implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				LogInBusiness logInBusiness = new LogInBusiness();
				theCustomer = logInBusiness.logIn2(theLogInView.getTextField().getText(),
						theLogInView.getPasswordField().getText());
				theUser = logInBusiness.logIn1(theLogInView.getTextField().getText(),
						theLogInView.getPasswordField().getText());
				if (theCustomer != null)
					theCustomerController = new CustomerController(theCustomer);
				else if (theUser != null) {
					if (theUser.isAdmin() == true)
						theAdminController = new AdminController(theUser);
					else
						theUserController = new UserController(theUser);
				} else
					JOptionPane.showMessageDialog(null, "Credentiale de logare incorecte!\n");
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex);
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
}
