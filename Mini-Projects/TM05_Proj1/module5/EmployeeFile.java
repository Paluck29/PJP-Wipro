package module5;

import java.util.*;
import java.io.*;

public class EmployeeFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Users\\paluc\\eclipse-workspace\\IOStream\\src\\module5\\";
		System.out.println("Main Menu");
		System.out.println("1. Add an Employee");
		System.out.println("2. Display All");
		System.out.println("3. Exit");
		
		int choice = 0;
		choice = sc.nextInt();
		
		while(choice!=3) {
			switch(choice) {
			case 1:
				Employee emp = new Employee(); 
				System.out.print("\nEnter Employee ID: ");
				emp.setId(sc.nextInt());
				sc.nextLine();
				System.out.println("\nEnter Employee Name: ");
				emp.setName(sc.nextLine());
				System.out.println("\nEnter Employee Age: ");
				emp.setAge(sc.nextInt());
				System.out.println("Enter Employee Salary: ");  
				emp.setSal(sc.nextDouble());
				System.out.println(emp.getName());
				try {
					FileWriter f = new FileWriter(path+"employee_details.txt", true);
					f.append(emp.toString());
					f.close();
				}catch(Exception e) {
					System.out.println("Can't add details to file: "+e);
				}
				
				break;
			case 2:
				FileReader fr = new FileReader(path+"employee_details.txt");
				
				System.out.println("-----Report-----");
				try {

					int c=0;
					while((c=fr.read())!= -1) {
						System.out.print((char)c);						
					}
				}catch(Exception e) {
					System.out.println(e);
				}
				
				System.out.println("--End of Report--");
				break;
			default:
				
			}
			System.out.println("Main Menu");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display All");
			System.out.println("3. Exit");
			choice = sc.nextInt();
		}
		System.out.println("Exiting the System");
		sc.close();
	}

}
