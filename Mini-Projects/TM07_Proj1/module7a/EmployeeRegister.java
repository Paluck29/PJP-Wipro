package module7a;

import java.util.*;

public class EmployeeRegister {
	
	public static void main(String[] args) {
		String firstName;
		String lastName;
		int number;
		String email;
		String address;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int count = sc.nextInt();
		sc.nextLine();
		
		List<Employee> emp = new ArrayList<>();
		
		for (int i = 0; i < count; i++) {
			System.out.println("Enter Employee " + (i + 1) + " Details");
			System.out.print("First Name: ");
			firstName = sc.nextLine();
			System.out.print("Last Name: ");
			lastName = sc.nextLine();
			System.out.print("Mobile Number: ");
			number = sc.nextInt();
			sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Address: ");
			address = sc.nextLine();
			
			emp.add(new Employee(firstName, lastName, number, email, address));
		}
		
		Collections.sort(emp);
		
		System.out.println("Employee List: ");
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "First Name", "Last Name", "Mobile", "Email", "Address");
		
		Iterator<Employee> it = emp.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n", e.getfName(), e.getlName(), e.getNumber(), e.getEmail(), e.getAddress());
		}
		
		sc.close();
	}
	
}
