package dataAccess;

import java.awt.geom.Area;
import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Car;
import model.User;

public class UserGateway {

	public void create(User theUser) {
		DBConnect databaseConnection = new DBConnect();
		try {
			String theStatement = "insert into user(name,username,password,isAdmin) values(?,?,?,?)";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);

			thePreparedStatement.setString(1, theUser.getName());
			thePreparedStatement.setString(2, theUser.getUsername());
			thePreparedStatement.setString(3, theUser.getPassword());
			thePreparedStatement.setBoolean(4, theUser.isAdmin());
			thePreparedStatement.executeUpdate();
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void update(User theUser) {
		DBConnect databaseConnection = new DBConnect();
		try {
			String theStatement;
			PreparedStatement thePreparedStatement;
			if (!theUser.getPassword().equals("")) {
				theStatement = "update user set password = ? where id = ?";
				thePreparedStatement = databaseConnection.getTheConnection().prepareStatement(theStatement);

				thePreparedStatement.setString(1, theUser.getPassword());
				thePreparedStatement.setObject(2, theUser.getUserID());
				thePreparedStatement.executeUpdate();
			}
			theStatement = "update user set isAdmin = ? where id = ?";
			thePreparedStatement = databaseConnection.getTheConnection().prepareStatement(theStatement);
			thePreparedStatement.setBoolean(1, theUser.isAdmin());
			thePreparedStatement.setObject(2, theUser.getUserID());
			thePreparedStatement.executeUpdate();

			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void delete(User theUser) {
		DBConnect databaseConnection = new DBConnect();
		try {
			String theStatement = "delete from user where id = ?";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);
			thePreparedStatement.setObject(1, theUser.getUserID());
			thePreparedStatement.executeUpdate();
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public User findByID(User theUser) {
		DBConnect databaseConnection = new DBConnect();
		User resultedUser = new User();
		try {
			String theStatement = "select * from user where id = ?";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);
			thePreparedStatement.setObject(1, theUser.getUserID());
			ResultSet result;
			databaseConnection.setTheStatement(thePreparedStatement);
			result = thePreparedStatement.executeQuery();
			while (result.next()) {
				BigInteger id = new BigInteger(result.getString("id"));
				String name = result.getString("name");
				String username = result.getString("username");
				String password = result.getString("password");
				boolean isAdmin = result.getBoolean("isAdmin");
				resultedUser = new User(id, name, username, password, isAdmin);
			}
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return resultedUser;
	}

	public ArrayList<User> findALL() {
		DBConnect databaseConnection = new DBConnect();
		ArrayList<User> resultedUsers = new ArrayList<User>();
		try {
			String theStatement = "select * from user";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);
			ResultSet result;
			databaseConnection.setTheStatement(thePreparedStatement);
			result = thePreparedStatement.executeQuery();
			while (result.next()) {
				BigInteger id = new BigInteger(result.getString("id"));
				String name = result.getString("name");
				String username = result.getString("username");
				String password = result.getString("password");
				boolean isAdmin = result.getBoolean("isAdmin");
				User resultedUser = new User(id, name, username, password, isAdmin);
				resultedUsers.add(resultedUser);
			}
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return resultedUsers;
	}
}
