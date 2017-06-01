package BusinessLayer;

import java.util.ArrayList;

import dataAccess.ContractGateway;
import model.Contract;
import model.Customer;

public class GeneratingBills {

	public String generateBill(Customer theCustomer) {
		String mesaj = "";
		try {
			int total = 0;
			ContractGateway contrGateway = new ContractGateway();
			ArrayList<Contract> allContracts = new ArrayList<Contract>();
			allContracts = contrGateway.findALL();
			for (int i = 0; i < allContracts.size(); i++) {
				if (theCustomer.getCustomerID().equals(allContracts.get(i).getCustomerID())) {
					mesaj += allContracts.get(i).toString();
					total += allContracts.get(i).getCost().intValue();
				}
			}
			if (total == 0)
				return "Nu s-au gasit contracte pentru acest client!\n";
			else
				return mesaj + "\ntotal:\t" + total;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return mesaj;
	}
}
