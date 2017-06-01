package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import BusinessLayer.ReservationBusiness;
import dataAccess.CarGateway;
import dataAccess.ContractGateway;
import dataAccess.CustomerGateway;
import model.Car;
import model.Contract;
import model.Customer;
import view.CustomerView;

public class CustomerController {
	private Customer theCustomer;
	private CustomerView customerView;

	public CustomerController(Customer theCustomer) {
		this.theCustomer = theCustomer;
		this.customerView = new CustomerView();
		customerView.setVisible(true);
		refresh();
		this.customerView.getBtnReservACar().addMouseListener(new Reserve());
		this.customerView.getBtnEditReservation().addMouseListener(new EditReservation());
		this.customerView.getBtnDeleteReservation().addMouseListener(new DeleteReservation());
	}

	public void refresh() {
		customerView.getTextField().setText("");
		customerView.getTextField_1().setText("");
		customerView.getTextField_2().setText("");
		customerView.getTextField_3().setText("");
		ArrayList<Contract> customerContracts = new ArrayList<Contract>();
		try {
			ContractGateway theContractGateway = new ContractGateway();
			customerContracts = theContractGateway.findALL();
			customerView.getAntetTabel().setRowCount(0);
			for (int i = 0; i < customerContracts.size(); i++) {
				Contract index = customerContracts.get(i);
				if (index.getCustomerID().equals(this.theCustomer.getCustomerID())) {
					Object[] rowData = { index.getContractID(), index.getCarID(), index.getCustomerID(),
							index.getStarting_date(), index.getEnding_date(), index.getCost() };
					customerView.getAntetTabel().addRow(rowData);
				}
			}

			ArrayList<Car> allCars = new ArrayList<Car>();
			CarGateway theCarGateway = new CarGateway();
			allCars = theCarGateway.findALL();
			customerView.getAntetTabel_1().setRowCount(0);
			for (int i = 0; i < allCars.size(); i++) {
				Car index = allCars.get(i);
				Object[] rowData = { index.getCarID(), index.getBrand(), index.getModel(), index.getPrice_per_day(),
						index.isAvailable() };
				customerView.getAntetTabel_1().addRow(rowData);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	class Reserve implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				BigInteger carID = new BigInteger(customerView.getTextField().getText());
				SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
				String starting_date = customerView.getTextField_1().getText();
				String ending_date = customerView.getTextField_2().getText();
				Date start = (Date) format.parse(starting_date);
				Date end = (Date) format.parse(ending_date);

				ReservationBusiness reservB = new ReservationBusiness();
				String messaj = reservB.reservation(starting_date, ending_date, theCustomer, carID);
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

	class EditReservation implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				BigInteger contractID = new BigInteger(customerView.getTextField_3().getText());
				SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
				String starting_date = customerView.getTextField_1().getText();
				String ending_date = customerView.getTextField_2().getText();
				Date start = (Date) format.parse(starting_date);
				Date end = (Date) format.parse(ending_date);

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

	class DeleteReservation implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				Contract theContract = new Contract();
				theContract.setContractID(new BigInteger(customerView.getTextField_3().getText()));
				ReservationBusiness reservB = new ReservationBusiness();
				String mesaj = reservB.deleteReservation(theContract);
				JOptionPane.showMessageDialog(null, mesaj);
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
}
