package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import BusinessLayer.GeneratingBills;
import BusinessLayer.ReservationBusiness;
import dataAccess.ContractGateway;
import dataAccess.CustomerGateway;
import model.Contract;
import model.Customer;
import model.User;
import view.RegularUserView;

public class UserController {
	private User regularUser;
	private RegularUserView regularUserView;

	public UserController(User theEmployee) {
		this.regularUser = theEmployee;
		this.regularUserView = new RegularUserView();
		regularUserView.setVisible(true);
		refresh();
		regularUserView.getBtnAddCustomerInfo().addMouseListener(new AddCust());
		regularUserView.getBtnUpdateCustomerInfo().addMouseListener(new UpdateCust());
		regularUserView.getBtnDeleteCustomerInfo().addMouseListener(new DelCust());
		regularUserView.getBtnFindCustomerBy().addMouseListener(new FindCust());

		regularUserView.getBtnUpdateContractInfo().addMouseListener(new UpdateContr());
		regularUserView.getBtnDeleteContract().addMouseListener(new DelContr());
		regularUserView.getBtnFindContractBy().addMouseListener(new FindContr());
		regularUserView.getBtnNewButton().addMouseListener(new GenBills());
	}

	class GenBills implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				BigInteger customerID = new BigInteger(regularUserView.getTextField_8().getText());
				Customer c = new Customer();
				c.setCustomerID(customerID);
				GeneratingBills genB = new GeneratingBills();
				String ms = genB.generateBill(c);
				JOptionPane.showMessageDialog(null, ms);
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
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

	class AddCust implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				BigInteger cnp = new BigInteger(regularUserView.getTextField_1().getText());
				String name = regularUserView.getTextField_2().getText();
				String address = regularUserView.getTextField_3().getText();
				String username = regularUserView.getTextField_4().getText();
				String password = new RegularUserView().getTextField_5().getText();
				Customer c = new Customer(cnp, name, address, username, password);
				CustomerGateway cg = new CustomerGateway();
				cg.create(c);
				refresh();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
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

	class UpdateCust implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				BigInteger customerID = new BigInteger(regularUserView.getTextField().getText());
				String address = regularUserView.getTextField_3().getText();
				String password = regularUserView.getTextField_5().getText();
				Customer c = new Customer();
				c.setCustomerID(customerID);
				c.setAddress(address);
				c.setPassword(password);
				CustomerGateway cg = new CustomerGateway();
				cg.update(c);
				refresh();
			} catch (Exception e2) {
				JOptionPane.showInternalMessageDialog(null, e2);
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

	class DelCust implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				BigInteger customerID = new BigInteger(regularUserView.getTextField().getText());
				Customer c = new Customer();
				c.setCustomerID(customerID);
				CustomerGateway gateway = new CustomerGateway();
				gateway.delete(c);
				refresh();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
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

	class FindCust implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				BigInteger customerID = new BigInteger(regularUserView.getTextField().getText());
				Customer c = new Customer();
				c.setCustomerID(customerID);
				CustomerGateway gateway = new CustomerGateway();
				c = gateway.findByID(c);
				JOptionPane.showMessageDialog(null, c.toString());
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
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

	class UpdateContr implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				BigInteger contractID = new BigInteger(regularUserView.getTextField_6().getText());
				SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
				String starting_date = regularUserView.getTextField_9().getText();
				String ending_date = regularUserView.getTextField_10().getText();
			//	Date start = (Date) format.parse(starting_date);
			//	Date end = (Date) format.parse(ending_date);

				ReservationBusiness reservB = new ReservationBusiness();
				Contract theContract = new Contract();
				theContract.setContractID(contractID);
				String messaj = reservB.editReservation(starting_date, ending_date, theContract);
				JOptionPane.showMessageDialog(null, messaj);
				refresh();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
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

	class DelContr implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				BigInteger contractID = new BigInteger(regularUserView.getTextField_6().getText());
				Contract theContract = new Contract();
				ContractGateway theGateway = new ContractGateway();
				theContract.setContractID(contractID);
				theGateway.delete(theContract);
				refresh();

			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
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

	class FindContr implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				BigInteger contractID = new BigInteger(regularUserView.getTextField_6().getText());
				Contract theContract = new Contract();
				theContract.setContractID(contractID);
				ContractGateway theGateway = new ContractGateway();
				theContract = theGateway.findByID(theContract);
				JOptionPane.showMessageDialog(null, theContract.toString());
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, e2);
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

	public void refresh() {
		try {

			regularUserView.getTextField().setText("");
			regularUserView.getTextField_1().setText("");
			regularUserView.getTextField_2().setText("");
			regularUserView.getTextField_3().setText("");
			regularUserView.getTextField_4().setText("");
			regularUserView.getTextField_5().setText("");
			regularUserView.getTextField_6().setText("");
			regularUserView.getTextField_7().setText("");
			regularUserView.getTextField_8().setText("");
			regularUserView.getTextField_9().setText("");
			regularUserView.getTextField_10().setText("");
			regularUserView.getTextField_11().setText("");

			ArrayList<Contract> customerContracts = new ArrayList<Contract>();
			ContractGateway theContractGateway = new ContractGateway();
			customerContracts = theContractGateway.findALL();
			regularUserView.getAntetTabel_1().setRowCount(0);
			for (int i = 0; i < customerContracts.size(); i++) {
				Contract index = customerContracts.get(i);

				Object[] rowData = { index.getContractID(), index.getCarID(), index.getCustomerID(),
						index.getStarting_date(), index.getEnding_date(), index.getCost() };
				regularUserView.getAntetTabel_1().addRow(rowData);

			}

			ArrayList<Customer> allCustomers = new ArrayList<Customer>();
			CustomerGateway theCustomerGateway = new CustomerGateway();
			allCustomers = theCustomerGateway.findALL();
			regularUserView.getAntetTabel().setRowCount(0);
			for (int i = 0; i < allCustomers.size(); i++) {
				Customer index = allCustomers.get(i);

				Object[] rowData = { index.getCustomerID(), index.getCnp(), index.getName(), index.getAddress(),
						index.getUsername(), index.getPassword() };
				regularUserView.getAntetTabel().addRow(rowData);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
