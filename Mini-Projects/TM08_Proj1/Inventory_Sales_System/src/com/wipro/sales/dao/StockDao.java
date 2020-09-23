package com.wipro.sales.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;

import com.wipro.sales.bean.Stock;
import com.wipro.sales.util.*;

public class StockDao {

	Connection con;
	
	public StockDao(){
		DBUtil db = new DBUtil();
		con = db.getDBConnection();
	}
	 
	public int insertStock(Stock stock) {
		
		String in_qry = "INSERT INTO TBL_STOCK VALUES(?,?,?,?,?)";
		try {
			PreparedStatement pst = con.prepareStatement(in_qry);
			pst.setString(1, stock.getProductID());
			pst.setString(2, stock.getProductName());
			pst.setInt(3, stock.getQuantityOnHand());
			pst.setDouble(4, stock.getProductUnitPrice());
			pst.setInt(5, stock.getReorderLevel());
			
			int rec_count = pst.executeUpdate();
			
			if(rec_count == 1) {
				return 1;  //record inserted
			}
			
		} catch (SQLException | InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("In inserting stock " + e);
		}
		
		return 0;		
	}
	
	public String generateProductID(String productName) {
		String productID = "";
		productID += productName.substring(0, 2);
		
		String s_qry = "SELECT SEQ_PRODUCT_ID.NEXTVAL FROM DUAL";
		try {
			PreparedStatement pst = con.prepareStatement(s_qry);
			ResultSet res = pst.executeQuery();
			
			res.next();
			int seq_no = res.getInt(1);
			productID += seq_no;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("In generating product ID " + e);
		}
		
		return productID;		
	}
	
	public int updateStock(String productID, int soldQty) {
		
		String up_qry = "UPDATE TBL_STOCK SET quant_on_hand = quant_on_hand - ? WHERE prod_id = ?";
		try {
			PreparedStatement pst = con.prepareStatement(up_qry);
			pst.setInt(1, soldQty);
			pst.setString(2, productID);
			int rec_count = pst.executeUpdate();
			if(rec_count == 1) {
				System.out.println("Stock updated successfully");
				return 1;
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("In updating stock " + e);
		}
		
		return 0;	
	}
	
	public Stock getStock(String productID) {
		
		String sel_qry = "SELECT * FROM TBL_STOCK WHERE prod_id = ?";
		Stock stock = null;
		try {
			PreparedStatement pst = con.prepareStatement(sel_qry);
			pst.setString(1, productID);
			ResultSet res = pst.executeQuery();
			
			res.next();
			stock = new Stock();
			stock.setProductID(res.getString(1));
			stock.setProductName(res.getString(2));
			stock.setQuantityOnHand(res.getInt(3));
			stock.setProductUnitPrice(res.getDouble(4));
			stock.setReorderLevel(res.getInt(5));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("In getting stock " + e);
		}
		
		
		return stock;	
	}
	
	public int deleteStock(String productID) {
		
		String del_qry = "DELETE FROM TBL_STOCK WHERE prod_id = ?";
		try {
			PreparedStatement pst = con.prepareStatement(del_qry);
			pst.setString(1, productID);
			int rec_count = pst.executeUpdate();
			
			if(rec_count == 1) {
				return 1;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("In deleting stock " + e);
		}
		
		return 0;
	}
	
	
}
