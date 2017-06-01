package dataAccess;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Car;
import model.Customer;

public class CustomerGateway {

	public void create(Customer theCustomer) {
		DBConnect databaseConnection = new DBConnect();
		try {
			String theStatement = "insert into customer(cnp,name,address,username,password) values(?,?,?,?,?)";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);
			thePreparedStatement.setObject(1, theCustomer.getCnp());
			thePreparedStatement.setString(2, theCustomer.getName());
			thePreparedStatement.setString(3, theCustomer.getAddress());
			thePreparedStatement.setString(4, theCustomer.getUsername());
			thePreparedStatement.setString(5, theCustomer.getPassword());

			thePreparedStatement.executeUpdate();
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void update(Customer theCustomer) {
		DBConnect databaseConnection = new DBConnect();
		try {
			if (!theCustomer.getAddress().equals("")) {
				String theStatement = "update customer set address = ? where id = ?";
				PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
						.prepareStatement(theStatement);
				thePreparedStatement.setString(1, theCustomer.getAddress());
				thePreparedStatement.setObject(2, theCustomer.getCustomerID());
				thePreparedStatement.executeUpdate();
			}
			if (!theCustomer.getPassword().equals("")) {
				String theStatement = "update customer set password = ? where id = ?";
				PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
						.prepareStatement(theStatement);
				thePreparedStatement.setString(1, theCustomer.getPassword());
				thePreparedStatement.setObject(2, theCustomer.getCustomerID());
				thePreparedStatement.executeUpdate();
			}
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void delete(Customer theCustomer) {
		DBConnect databaseConnection = new DBConnect();
		try {
			String theStatement = "delete from customer where id = ?";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);
			thePreparedStatement.setObject(1, theCustomer.getCustomerID());

			thePreparedStatement.executeUpdate();
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public Customer findByID(Customer theCustomer) {
		DBConnect databaseConnection = new DBConnect();
		Customer resultedCustomer = new Customer();
		try {
			String theStatement = "select * from customer where id = ?";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);
			thePreparedStatement.setObject(1, theCustomer.getCustomerID());
			ResultSet result;
			databaseConnection.setTheStatement(thePreparedStatement);
			result = thePreparedStatement.executeQuery();
			while (result.next()) {
				BigInteger id = new BigInteger(result.getString("id"));
				BigInteger cnp = new BigInteger(result.getString("cnp"));
				String name = result.getString("name");
				String address = result.getString("address");
				String username = result.getString("username");
				String password = result.getString("password");
				resultedCustomer = new Customer(id, cnp, name, address, username, password);
			}
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return resultedCustomer;
	}

	public ArrayList<Customer> findALL() {
		DBConnect databaseConnection = new DBConnect();
		ArrayList<Customer> resultedCustomers = new ArrayList<Customer>();
		try {
			String theStatement = "select * from customer";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);
			ResultSet result;
			databaseConnection.setTheStatement(thePreparedStatement);
			result = thePreparedStatement.executeQuery();
			while (result.next()) {
				BigInteger id = new BigInteger(result.getString("id"));
				BigInteger cnp = new BigInteger(result.getString("cnp"));
				String name = result.getString("name");
				String address = result.getString("address");
				String username = result.getString("username");
				String password = result.getString("password");
				Customer resultedCustomer = new Customer(id, cnp, name, address, username, password);
				resultedCustomers.add(resultedCustomer);
			}
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return resultedCustomers;
	}
}
