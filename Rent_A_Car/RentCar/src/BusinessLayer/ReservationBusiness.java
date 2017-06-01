package BusinessLayer;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import dataAccess.CarGateway;
import dataAccess.ContractGateway;
import model.Car;
import model.Contract;
import model.Customer;

public class ReservationBusiness {

	public String reservation(String starting_date, String ending_date, Customer theCustomer, BigInteger carID) {
		String mesaj = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date current = sdf.parse(sdf.format(new Date()));
			Date start = sdf.parse(starting_date);
			Date end = sdf.parse(ending_date);

			if (start.compareTo(current) <= 0) {
				mesaj = "Nu puteti face rezervare pentru o data anterioara datei curente!\n";
				return mesaj;
			}
			if (start.compareTo(end) > 0) {
				mesaj = "Data de incheiere a rezervarii trebuie sa preceada data inceperi ei!\n";
				return mesaj;
			}
			Car theCar = new Car();
			theCar.setCarID(carID);
			CarGateway theCarGateway = new CarGateway();
			theCar = theCarGateway.findByID(theCar);
			if (theCar.isAvailable() == 1) {
				long diff = end.getTime() - start.getTime();
				int cost_int = ((int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)) * theCar.getPrice_per_day();
				BigInteger cost = new BigInteger(String.valueOf(cost_int));
				Contract theContract = new Contract(carID, theCustomer.getCustomerID(), starting_date, ending_date,
						cost);
				ContractGateway theContractGateway = new ContractGateway();
				theContractGateway.create(theContract);
				return "Rezervarea s-a realizat cu succes!\n";
			} else
				return "Masina selectata nu este disponibila momentan!\n";
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return mesaj;
	}

	public String editReservation(String starting_date, String ending_date, Contract theContract) {
		String mesaj = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date current = sdf.parse(sdf.format(new Date()));
			Date start = sdf.parse(starting_date);
			Date end = sdf.parse(ending_date);
			if (start.compareTo(current) < 0) {
				mesaj = "Nu puteti face rezervare pentru o data anterioara datei curente!\n";
				return mesaj;
			}
			if (start.compareTo(end) > 0) {
				mesaj = "Data de incheiere a rezervarii trebuie sa preceada data inceperi ei!\n";
				return mesaj;
			}

			ContractGateway theContractGateway = new ContractGateway();
			theContract = theContractGateway.findByID(theContract);
			Date contractStaring = sdf.parse(theContract.getStarting_date());
			CarGateway theCarGateway = new CarGateway();
			Car theCar = new Car();
			theCar.setCarID(theContract.getCarID());
			theCar = theCarGateway.findByID(theCar);
			long diff = end.getTime() - start.getTime();
			if (((int) TimeUnit.DAYS.convert(contractStaring.getTime() - current.getTime(),
					TimeUnit.MILLISECONDS)) >= 2) {
				int cost_int = ((int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)) * theCar.getPrice_per_day();
				BigInteger cost = new BigInteger(String.valueOf(cost_int));
				theContract.setStarting_date(starting_date);
				theContract.setEnding_date(ending_date);
				theContract.setCost(cost);
				theContractGateway.update(theContract);
				return "Actualizarea a avut succes!\n";
			} else
				return "Actualizarea nu este permisa cu mai putin de 2 zile inainte de activarea contractului!\n";
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return mesaj;
	}

	public String deleteReservation(Contract theContract) {
		String mesaj = "";
		try {
			ContractGateway theContractGateway = new ContractGateway();
			theContract = theContractGateway.findByID(theContract);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date current = sdf.parse(sdf.format(new Date()));
			Date start = sdf.parse(theContract.getStarting_date());
			if (((int) TimeUnit.DAYS.convert(start.getTime() - current.getTime(), TimeUnit.MILLISECONDS)) >= 2) {
				theContractGateway.delete(theContract);
				return "Rezervarea s-a sters cu succes!\n";
			} else
				return "Nu puteti stergre rezervarea inainte cu mai putin de doua zile de la activarea contractului!\n";
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return mesaj;
	}
}
