package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigInteger;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dataAccess.CarGateway;
import dataAccess.UserGateway;
import model.Car;
import model.User;
import view.AdminView;

public class AdminController {
	private User theAdmin;
	private AdminView adminView;

	public AdminController(User theAdmin) {
		this.theAdmin = theAdmin;
		this.adminView = new AdminView();
		adminView.setVisible(true);
		refresh();
		adminView.getBtnAddNewEmployee().addMouseListener(new AddEmpl());
		adminView.getBtnUpdateEmployeeInfo().addMouseListener(new UpdateEmpl());
		adminView.getBtnFindEmployeeBy().addMouseListener(new FindEmpl());
		adminView.getBtnDeleteEmployee().addMouseListener(new DelEmpl());

		adminView.getBtnAddNewCar().addMouseListener(new AddCar());
		adminView.getBtnUpdateCarInfo().addMouseListener(new UpdateCar());
		adminView.getBtnDeleteACar().addMouseListener(new DelCar());
		adminView.getBtnFindCarBy().addMouseListener(new FindCar());
	}

	class AddEmpl implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				// BigInteger userID = new
				// BigInteger(adminView.getTextField().getText());
				String name = adminView.getTextField_1().getText();
				String username = adminView.getTextField_2().getText();
				String password = adminView.getTextField_3().getText();
				boolean isAdmin = adminView.getRdbtnIsadmin().isSelected();
				User theUser = new User(name, username, password, isAdmin);
				UserGateway theGateway = new UserGateway();
				theGateway.create(theUser);
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

	class UpdateEmpl implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				BigInteger userID = new BigInteger(adminView.getTextField().getText());
				String password = adminView.getTextField_3().getText();
				boolean isAdmin = adminView.getRdbtnIsadmin().isSelected();
				User theUser = new User();
				theUser.setUserID(userID);
				theUser.setPassword(password);
				theUser.setAdmin(isAdmin);
				UserGateway theGateway = new UserGateway();
				theGateway.update(theUser);
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

	class FindEmpl implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				BigInteger id = new BigInteger(adminView.getTextField().getText());
				User theUser = new User();
				theUser.setUserID(id);
				UserGateway theGateway = new UserGateway();
				theUser = theGateway.findByID(theUser);
				JOptionPane.showMessageDialog(null, theUser.toString());

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

	class DelEmpl implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				User theUser = new User();
				theUser.setUserID(new BigInteger(adminView.getTextField().getText()));
				UserGateway theGateway = new UserGateway();
				theGateway.delete(theUser);
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

	class AddCar implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				String brand = adminView.getTextField_5().getText();
				String model = adminView.getTextField_6().getText();
				int price_per_day = Integer.parseInt(adminView.getTextField_7().getText());
				int available = Integer.parseInt(adminView.getTextField_8().getText());
				Car theCar = new Car(brand, model, price_per_day, available);
				CarGateway theGateway = new CarGateway();
				theGateway.create(theCar);
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

	class UpdateCar implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				Car theCar = new Car();
				theCar.setCarID(new BigInteger(adminView.getTextField_4().getText()));
				int isAvailable;
				if (adminView.getTextField_8().getText().equals(""))
					isAvailable = 0;
				else
					isAvailable = Integer.parseInt(adminView.getTextField_8().getText());
				theCar.setAvailable(isAvailable);
				if (!adminView.getTextField_7().getText().equals(""))
					theCar.setPrice_per_day(Integer.parseInt(adminView.getTextField_7().getText()));
				CarGateway theGateway = new CarGateway();
				theGateway.update(theCar);
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

	class DelCar implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				Car theCar = new Car();
				BigInteger carID = new BigInteger(adminView.getTextField_4().getText());
				theCar.setCarID(carID);
				CarGateway theGateway = new CarGateway();
				theGateway.delete(theCar);
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

	class FindCar implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				Car theCar = new Car();
				BigInteger carID = new BigInteger(adminView.getTextField_4().getText());
				theCar.setCarID(carID);
				CarGateway theGateway = new CarGateway();
				theCar = theGateway.findByID(theCar);
				JOptionPane.showMessageDialog(null, theCar.toString());

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
			adminView.getTextField().setText("");
			adminView.getTextField_1().setText("");
			adminView.getTextField_2().setText("");
			adminView.getTextField_3().setText("");
			adminView.getTextField_4().setText("");
			adminView.getTextField_5().setText("");
			adminView.getTextField_6().setText("");
			adminView.getTextField_7().setText("");
			adminView.getTextField_8().setText("");
			adminView.getRdbtnIsadmin().setSelected(false);

			ArrayList<User> allUsers = new ArrayList<User>();
			UserGateway theUserGateway = new UserGateway();
			allUsers = theUserGateway.findALL();
			adminView.getAntetTabel().setRowCount(0);
			for (int i = 0; i < allUsers.size(); i++) {
				User index = allUsers.get(i);
				Object[] rowData = { index.getUserID(), index.getName(), index.getUsername(), index.getPassword(),
						index.isAdmin() };
				adminView.getAntetTabel().addRow(rowData);
			}

			ArrayList<Car> allCars = new ArrayList<Car>();
			CarGateway theCarGateway = new CarGateway();
			allCars = theCarGateway.findALL();
			adminView.getAntetTabel_1().setRowCount(0);
			for (int i = 0; i < allCars.size(); i++) {
				Car index = allCars.get(i);
				Object[] rowData = { index.getCarID(), index.getBrand(), index.getModel(), index.getPrice_per_day(),
						index.isAvailable() };
				adminView.getAntetTabel_1().addRow(rowData);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
}
