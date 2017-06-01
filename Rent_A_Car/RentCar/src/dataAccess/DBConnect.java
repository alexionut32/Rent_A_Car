package dataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	private Connection theConnection;
	private Statement theStatement;
	private ResultSet resultSet;

	public DBConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			theConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rent_a_car", "root", "");

			theStatement = theConnection.createStatement();

		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}

	public Connection getTheConnection() {
		return theConnection;
	}

	public void setTheConnection(Connection theConnection) {
		this.theConnection = theConnection;
	}

	public Statement getTheStatement() {
		return theStatement;
	}

	public void setTheStatement(Statement theStatement) {
		this.theStatement = theStatement;
	}

	public ResultSet getResultSet() {
		return resultSet;
	}

	public void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}
}
