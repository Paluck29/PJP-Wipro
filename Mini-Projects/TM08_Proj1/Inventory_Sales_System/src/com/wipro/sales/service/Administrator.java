package com.wipro.sales.service;

import java.util.ArrayList;

import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.bean.Stock;
import com.wipro.sales.dao.SalesDao;
import com.wipro.sales.dao.StockDao;

public class Administrator {
	
	public String insertStock(Stock stockobj) {
		if(stockobj == null || stockobj.getProductName().length() < 2) {
			return "Data not valid for insertion";
		}else {
			StockDao stk = new StockDao();			
			stockobj.setProductID(stk.generateProductID(stockobj.getProductName()));
			
			int rec_count = stk.insertStock(stockobj);
			if(rec_count == 1) {
				System.out.println("Stock Record successfully inserted");
			}
			
		}
		
		return stockobj.getProductID(); 
	}
	
	public String deleteStock(String productID) {
		
		StockDao stk = new StockDao();
		int rec_count = stk.deleteStock(productID);
		if(rec_count == 1) {
			return "Deleted";
		}
		
		return "Record cannot be deleted"; 
	} 
	
	public String insertSales(Sales salesobj) {
		if(salesobj == null)
			return "Object not valid for insertion";
		
		StockDao stk = new StockDao();
		
		Stock stock = stk.getStock(salesobj.getProductID());
		if(stock == null)
			return "Unknown product for sales";
		
		if(stock.getQuantityOnHand() < salesobj.getQuantitySold())
			return "Not enough stock on hand for sales";
		
		java.util.Date today = new java.util.Date();
		if(salesobj.getSalesDate().compareTo(today) > 0)
			return "Invalid date";
		
		SalesDao saldao = new SalesDao();
		salesobj.setSalesID(saldao.generateSalesID(salesobj.getSalesDate()));
		
		int rec_count = saldao.insertSales(salesobj);
		
		if(rec_count == 1) {
			int up_count = stk.updateStock(stock.getProductID(), salesobj.getQuantitySold());
			if(up_count == 1)
				return "Sales completed";
		}
		 
		return "Error";	
	}
	
	public ArrayList<SalesReport> getSalesReport(){
		ArrayList<SalesReport> result_array = new ArrayList<SalesReport>();
		SalesDao sales_report = new SalesDao();
		result_array = sales_report.getSalesReport();
		
		return result_array;		
	}

}
