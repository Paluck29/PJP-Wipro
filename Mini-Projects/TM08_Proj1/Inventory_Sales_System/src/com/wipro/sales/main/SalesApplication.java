package com.wipro.sales.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.bean.Stock;
import com.wipro.sales.service.Administrator;

public class SalesApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("MAIN MENU");
		System.out.println("1. Insert Stock");
		System.out.println("2. Delete Stock");
		System.out.println("3. Insert Sales");
		System.out.println("4. View Sales Report");
		System.out.println("5. Exit the application");
		
		int choice = 0;
		choice = sc.nextInt();
		
		while(choice!=5) {
			switch(choice) {
			case 1:
				//insert stock
				Stock stk = new Stock();
				System.out.print("Enter product ID: ");
				stk.setProductID(sc.nextLine());
				sc.nextLine();
				System.out.print("Enter product name: ");
				stk.setProductName(sc.nextLine());
				System.out.print("Enter quantity on hand: ");
				stk.setQuantityOnHand(sc.nextInt());
				System.out.print("Enter product unit price: ");
				stk.setProductUnitPrice(sc.nextDouble());
				System.out.print("Enter product reorder level: ");
				stk.setReorderLevel(sc.nextInt());
				
				System.out.println(stk.toString());
				
				Administrator adm = new Administrator();
				System.out.println(adm.insertStock(stk));
				
				break;
			case 2:
				//delete stock
				Administrator adm2 = new Administrator();
				System.out.println("Enter the product ID for whose stock has to be deleted");
				sc.nextLine();
				System.out.println(adm2.deleteStock(sc.nextLine()));
							
				break;
			case 3:
				//insert sales
				Sales sale = new Sales();
				System.out.print("Enter sales ID: ");
				sale.setSalesID(sc.nextLine());
				sc.nextLine();
				
				System.out.print("Enter date (yyyy-MM-dd): ");
				String input_date = sc.nextLine();
				
				Date date = null;
				try {
					date = new SimpleDateFormat("yyyy-MM-dd").parse(input_date);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  
				sale.setSalesDate(date);
				System.out.print("Enter product ID: ");
				sale.setProductID(sc.nextLine());
				System.out.print("Enter quantity sold: ");
				sale.setQuantitySold(sc.nextInt());
				System.out.print("Enter sales price per unit: ");
				sale.setSalesPricePerUnit(sc.nextDouble());
				
				System.out.println(sale.toString());
				
				Administrator adm3 = new Administrator();
				System.out.println(adm3.insertSales(sale));
				
				break;
			case 4:
				//view sales report
				Administrator adm4 = new Administrator();
				ArrayList<SalesReport> sales_report_list = new ArrayList<SalesReport>();
				sales_report_list = adm4.getSalesReport();
				
				for(SalesReport result:sales_report_list) {
					System.out.println(result.toString());
				}
				
				break;
			default:
				System.out.println("Enter values between 1-5");
			}
			
			System.out.println("MAIN MENU");
			System.out.println("1. Insert Stock");
			System.out.println("2. Delete Stock");
			System.out.println("3. Insert Sales");
			System.out.println("4. View Sales Report");
			System.out.println("5. Exit the application");
			
			choice = sc.nextInt();
		}
		
		sc.close();
		System.out.println("Exiting..");
		System.out.println("");
	}

}
