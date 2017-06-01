package dataAccess;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Car;

public class CarGateway {

	public void create(Car theCar) {
		DBConnect databaseConnection = new DBConnect();
		try {
			String theStatement = "insert into car(brand,model,price_per_day,availability) values(?,?,?,?)";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);

			thePreparedStatement.setString(1, theCar.getBrand());
			thePreparedStatement.setString(2, theCar.getModel());
			thePreparedStatement.setInt(3, theCar.getPrice_per_day());
			thePreparedStatement.setInt(4, theCar.isAvailable());
			thePreparedStatement.executeUpdate();
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void update(Car theCar) {
		DBConnect databaseConnection = new DBConnect();
		try {
			if (new Integer(theCar.getPrice_per_day()) != null) {
				String theStatement = "update car set price_per_day = ? where id = ?";
				PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
						.prepareStatement(theStatement);

				thePreparedStatement.setInt(1, theCar.getPrice_per_day());
				thePreparedStatement.setObject(2, theCar.getCarID());
				thePreparedStatement.executeUpdate();
			}

			if (theCar.isAvailable() == 1 || theCar.isAvailable() == -1) {
				String theStatement = "update car set availability = ? where id = ?";
				PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
						.prepareStatement(theStatement);

				thePreparedStatement.setInt(1, theCar.isAvailable());
				thePreparedStatement.setObject(2, theCar.getCarID());
				thePreparedStatement.executeUpdate();
			}
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void delete(Car theCar) {
		DBConnect databaseConnection = new DBConnect();
		try {
			String theStatement = "delete from car where id = ?";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);

			thePreparedStatement.setObject(1, theCar.getCarID());

			thePreparedStatement.executeUpdate();
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public Car findByID(Car theCar) {
		DBConnect databaseConnection = new DBConnect();
		Car resultedCar = new Car();
		try {
			String theStatement = "select * from Car where id = ?";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);

			thePreparedStatement.setObject(1, theCar.getCarID());
			ResultSet result;
			databaseConnection.setTheStatement(thePreparedStatement);
			result = thePreparedStatement.executeQuery();
			while (result.next()) {
				BigInteger id = new BigInteger(result.getString("id"));
				String brand = result.getString("brand");
				String model = result.getString("model");
				int price_per_day = result.getInt("price_per_day");
				int available = result.getInt("availability");
				resultedCar = new Car(id, brand, model, price_per_day, available);
			}
			databaseConnection.getTheConnection().close();
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
		return resultedCar;
	}

	public ArrayList<Car> findALL() {
		DBConnect databaseConnection = new DBConnect();
		ArrayList<Car> resultedCars = new ArrayList<Car>();
		try {
			String theStatement = "select * from Car";
			PreparedStatement thePreparedStatement = databaseConnection.getTheConnection()
					.prepareStatement(theStatement);

			ResultSet result;
			databaseConnection.setTheStatement(thePreparedStatement);
			result = thePreparedStatement.executeQuery();
			while (result.next()) {
				BigInteger id = new BigInteger(result.getString("id"));
				String brand = result.getString("brand");
				String model = result.getString("model");
				int price_per_day = result.getInt("price_per_day");
				int available = result.getInt("availability");
				Car resultedCar = new Car(id, brand, model, price_per_day, available);
				resultedCars.add(resultedCar);
			}
			databaseConnection.getTheConnection().close();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return resultedCars;
	}
}
