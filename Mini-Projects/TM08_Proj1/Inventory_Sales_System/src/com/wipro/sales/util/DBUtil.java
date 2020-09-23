package com.wipro.sales.util;

import java.sql.*;

public class DBUtil {

	public static Connection con;
	public Connection getDBConnection(){
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@0.0.0.0:1521:xe", "system", "root");
			System.out.println("Connection Established Successfully");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return null;
		}
		
		return con;
	}
}
