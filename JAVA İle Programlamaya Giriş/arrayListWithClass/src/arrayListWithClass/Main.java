package arrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer(1, "Furkan", "Ayhan"));
		customers.add(new Customer(2, "Sena", "Ayhan"));
		customers.add(new Customer(3, "Pirtik", "Ayhan"));
		
		
		
		for (Customer customer:customers) {
			System.out.println(customer.firstName);
		}

	}

}
