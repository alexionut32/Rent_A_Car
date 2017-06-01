package BusinessLayer;

import java.util.ArrayList;

import dataAccess.CustomerGateway;
import dataAccess.UserGateway;
import model.Customer;
import model.User;

public class LogInBusiness {
	public User logIn1(String userName, String password) {
		ArrayList<User> allUsers = new ArrayList<User>();

		UserGateway ug = new UserGateway();
		allUsers = ug.findALL();
		for (int i = 0; i < allUsers.size(); i++)
			if (allUsers.get(i).getUsername().equals(userName) && allUsers.get(i).getPassword().equals(password))
				return allUsers.get(i);

		return null;
	}

	public Customer logIn2(String userName, String password) {
		ArrayList<Customer> allCustomers = new ArrayList<Customer>();
		CustomerGateway cg = new CustomerGateway();
		allCustomers = cg.findALL();
		for (int i = 0; i < allCustomers.size(); i++)
			if (allCustomers.get(i).getUsername().equals(userName)
					&& allCustomers.get(i).getPassword().equals(password))
				return allCustomers.get(i);

		return null;

	}
}
