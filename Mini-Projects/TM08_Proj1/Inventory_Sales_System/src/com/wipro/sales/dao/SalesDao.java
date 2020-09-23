package com.wipro.sales.dao;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.wipro.sales.bean.Sales;
import com.wipro.sales.bean.SalesReport;
import com.wipro.sales.util.DBUtil;

public class SalesDao {
	
	Connection con;
	
	public SalesDao() {
		DBUtil db = new DBUtil();
		con = db.getDBConnection();		
	}

	public int insertSales(Sales sale) {
		
		String in_qry = "INSERT INTO TBL_SALES VALUES(?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(in_qry);
			pst.setString(1, sale.getSalesID());
			
			java.util.Date date = sale.getSalesDate();
			String Date_str = new SimpleDateFormat("yyyy-MM-dd").format(date);
			java.sql.Date sqlDate = java.sql.Date.valueOf(Date_str);
			
			pst.setDate(2, sqlDate);
			pst.setString(3, sale.getProductID());
			pst.setInt(4,sale.getQuantitySold());
			pst.setDouble(5, sale.getSalesPricePerUnit());
			int rec_count = pst.executeUpdate();
			if(rec_count == 1) {
				return 1;	//inserted sales 
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("In inserting sales" + e);
		}
		
		
		return 0;
	}
	
	public String generateSalesID(java.util.Date salesDate) {
		String salesID = "";
		String date = salesDate.toString();
		salesID += date.substring(date.length()-2, date.length());
		
		String s_qry = "SELECT SEQ_SALES_ID.NEXTVAL FROM DUAL";
		try {
			PreparedStatement pst = con.prepareStatement(s_qry);
			ResultSet res = pst.executeQuery();
			
			res.next();
			int seq_no = res.getInt(1);
			salesID += seq_no;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("In generating sales ID" + e);
		} 
		
		return salesID;	
	}
	
	public ArrayList<SalesReport> getSalesReport(){
		SalesReport report = null;
		ArrayList<SalesReport> result_array = new ArrayList<SalesReport>();
		
		String sel_qry = "SELECT * FROM v_sales_report";
		try {
			PreparedStatement pst = con.prepareStatement(sel_qry);
			ResultSet res = pst.executeQuery();
 
			while(res.next()) {
				report = new SalesReport();
				report.setSalesID(res.getString(1));
				report.setSalesDate(res.getDate(2));
				report.setProductID(res.getString(3));
				report.setProductName(res.getString(4));
				report.setQuantitySold(res.getInt(5));
				report.setProductUnitPrice(res.getDouble(6));
				report.setSalesPricePerUnit(res.getDouble(7));
				report.setProfitAmount(res.getDouble(8));
				
				result_array.add(report);
			}
			
			pst.close();
			res.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result_array;	
	}
	
}
