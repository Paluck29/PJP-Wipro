package module3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterestCalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("MAIN MENU");
		System.out.println("----------");
		System.out.println("\t1. Interest Calculator - SB");
		System.out.println("\t2. Interest Calculator - FD");
		System.out.println("\t3. Interest Calculator - RD");
		System.out.println("\t4. Exit");
		System.out.println("Enter your option (1..4):");
		int choice=0;
		
		try {
			choice=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println(e);
			return;
		}
		
		while(choice!=4) {
			switch(choice) {
			case 1:
				//SB
				SBAccount sb=new SBAccount();
				
				try {
					System.out.print("Enter the average amount in your account: ");
					sb.setAmount(sc.nextDouble());
					if(sb.getAmount()<0) {
						throw new NegativeException("Please enter correct amount > 0");
					}
					sc.nextLine();
					System.out.print("Enter the type of account");
					sb.setType(sc.nextLine());
					if(!sb.getType().equals("Normal") && !sb.getType().contentEquals("NRI")) {
						throw new TypeException();
					}
					System.out.println("Interest gained: Rs. "+sb.calculateInterest());
					
				}catch(NegativeException e) {
					System.out.println(e);
					return;
				}catch(TypeException e) {
					System.out.println(e);
					return;
				}catch(InputMismatchException e) {
					System.out.println(e);
					return;
				}
				
				break;
			case 2:
				//FD
				FDAccount fd=new FDAccount();
				
				try {
					System.out.print("Enter the FD amount: ");
					fd.setAmount(sc.nextDouble());
					if(fd.getAmount()<0)
						throw new NegativeException("Please enter correct amount > 0");
					System.out.print("Enter the number of days: ");
					fd.setNoOfDays(sc.nextInt());
					if(fd.getDays()<7 || fd.getDays()>365)
						throw new NegativeException("Please enter correct no. of days (7-365)");
					System.out.print("Enter your age: ");
					fd.setAge(sc.nextInt());
					if(fd.getAge()<0)
						throw new NegativeException("Please enter correct age > 0");
					
					System.out.println("Interest gained: Rs. "+fd.calculateInterest());
				}catch(NegativeException e) {
					System.out.println(e);
					return;
				}catch(InputMismatchException e) {
					System.out.println(e);
					return;
				}
				
				break;
			case 3:
				//RD
				RDAccount rd=new RDAccount();
				try {
					System.out.print("Enter the amount: ");
					rd.setAmount(sc.nextDouble());
					if(rd.getAmount()<0)
						throw new NegativeException("Enter the correct amount > 0");
					System.out.print("Enter no. of months");
					rd.setMonths(sc.nextInt());
					if(rd.getMonths()!=6 || rd.getMonths()!=9 || rd.getMonths()!=12 || rd.getMonths()!=15 || rd.getMonths()!=18 || rd.getMonths()!=21)
						throw new NegativeException("No. of months should be in (6,9,12,15,18,21)");
					System.out.println("Enter your age");
					rd.setAge(sc.nextInt());
					if(rd.getAge()<0)
						throw new NegativeException("Enter correct age > 0");
					
					System.out.println("Interest gained: Rs. "+rd.calculateInterest());
				}catch(NegativeException e) {
					System.out.println(e);
					return;
				}catch(InputMismatchException e) {
					System.out.println(e);
					return;
				}
		
				break;
			default:
				System.out.println("Enter number between 1 and 4");
			}
			
			System.out.println();
			System.out.println("MAIN MENU");
			System.out.println("----------");
			System.out.println("\t1. Interest Calculator - SB");
			System.out.println("\t2. Interest Calculator - FD");
			System.out.println("\t3. Interest Calculator - RD");
			System.out.println("\t4. Exit");
			System.out.println("Enter your option (1..4):");	
			
			try {
				choice=sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println(e);
				return;
			}
			
		}
		System.out.println("Exiting..");
		
		sc.close();
	}

}
