package module7b;

import java.util.*;

public class StringListMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringList sl = new StringList();
		String str = "";
		Scanner sc = new Scanner(System.in);
		int choice=0;
		
		System.out.println("1. Insert");
		System.out.println("2. Search");
		System.out.println("3. Delete");
		System.out.println("4. Display");
		System.out.println("5. Exit");
		System.out.println();
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		
		while(choice!=5) {
			switch(choice) {
			case 1:
				//insertion
				System.out.println("Enter the item to be inserted:");
				sc.nextLine();
				str = sc.nextLine();
				sl.insertString(str);
				//sc.nextLine();
				break;
			case 2:
				//search
				System.out.println("Enter the item to search:");
				sc.nextLine();
				str = sc.nextLine();
				System.out.println(sl.searchString(str));
				break;
			case 3:
				//deletion
				System.out.println("Enter the item to delete:");
				sc.nextLine();
				str = sc.nextLine();
				System.out.println(sl.deleteString(str));
				break;
			case 4:
				//display
				System.out.println("The items in the list are:");
				sl.printAll();
				break;
			default:
				System.out.println("Enter number between 1-5");
			}
			
			
			System.out.println("\n1. Insert");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println();
			System.out.println("Enter your choice");
			choice = sc.nextInt();
		}
		
		
		
		sc.close();
	}

}
