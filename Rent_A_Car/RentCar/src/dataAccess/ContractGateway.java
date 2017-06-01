package dataAccess;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import model.Car;
import model.Contract;

public class ContractGateway {
	public void create(Contract theContract) {
		DBConnect databaseConnection = new DBConnect();
		try {
			String theStatement = "insert into contract(carID,clientID,starting_date,ending_date,cost) values(?,?,?,?,?)";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);
			thePreparedStatement.setObject(1, theContract.getCarID());
			thePreparedStatement.setObject(2, theContract.getCustomerID());
			thePreparedStatement.setString(3, theContract.getStarting_date());
			thePreparedStatement.setString(4, theContract.getEnding_date());
			thePreparedStatement.setObject(5, theContract.getCost());
			thePreparedStatement.executeUpdate();
			databaseConnection.getTheConnection().close();

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void update(Contract theContract) {
		DBConnect databaseConnection = new DBConnect();
		try {
			if (!theContract.getStarting_date().equals("")) {
				String theStatement = "update contract set starting_date = ? where id = ?";
				PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
						.prepareStatement(theStatement);
				thePreparedStatement.setString(1, theContract.getStarting_date());
				thePreparedStatement.setObject(2, theContract.getContractID());
				thePreparedStatement.executeUpdate();
			}
			if (!theContract.getEnding_date().equals("")) {
				String theStatement = "update contract set ending_date = ? where id = ?";
				PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
						.prepareStatement(theStatement);
				thePreparedStatement.setString(1, theContract.getEnding_date());
				thePreparedStatement.setObject(2, theContract.getContractID());
				thePreparedStatement.executeUpdate();
			}
			if (theContract.getCost() != null) {
				String theStatement = "update contract set cost = ? where id = ?";
				PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
						.prepareStatement(theStatement);
				thePreparedStatement.setObject(1, theContract.getCost());
				thePreparedStatement.setObject(2, theContract.getContractID());
				thePreparedStatement.executeUpdate();
			}
			databaseConnection.getTheConnection().close();

		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void delete(Contract theContract) {
		DBConnect databaseConnection = new DBConnect();
		try {
			String theStatement = "delete from contract where id = ?";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);
			thePreparedStatement.setObject(1, theContract.getContractID());
			thePreparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public Contract findByID(Contract theContract) {
		DBConnect databaseConnection = new DBConnect();
		Contract resultedContract = new Contract();
		try {
			String theStatement = "select * from contract where id = ?";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);
			thePreparedStatement.setObject(1, theContract.getContractID());
			ResultSet result;
			databaseConnection.setTheStatement(thePreparedStatement);
			result = thePreparedStatement.executeQuery();
			while (result.next()) {
				BigInteger id = new BigInteger(result.getString("id"));
				BigInteger carID = new BigInteger(result.getString("carID"));
				BigInteger clientID = new BigInteger(result.getString("clientID"));
				String starting_date = result.getString("starting_date");
				String ending_date = result.getString("ending_date");
				BigInteger cost = new BigInteger(result.getString("cost"));
				resultedContract = new Contract(id, carID, clientID, starting_date, ending_date, cost);
			}
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return resultedContract;
	}

	public ArrayList<Contract> findALL() {
		DBConnect databaseConnection = new DBConnect();
		ArrayList<Contract> resultedContracts = new ArrayList<Contract>();
		try {
			String theStatement = "select * from contract";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);
			ResultSet result;
			databaseConnection.setTheStatement(thePreparedStatement);
			result = thePreparedStatement.executeQuery();
			while (result.next()) {
				BigInteger id = new BigInteger(result.getString("id"));
				BigInteger carID = new BigInteger(result.getString("carID"));
				BigInteger clientID = new BigInteger(result.getString("clientID"));
				String starting_date = result.getString("starting_date");
				String ending_date = result.getString("ending_date");
				BigInteger cost = new BigInteger(result.getString("cost"));
				Contract resultedContract = new Contract(id, carID, clientID, starting_date, ending_date, cost);
				resultedContracts.add(resultedContract);
			}
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return resultedContracts;
	}
}
