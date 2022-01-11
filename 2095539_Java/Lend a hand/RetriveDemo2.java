package com.cognizant;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RetriveDemo2 {

	public static void main(String[] args) throws SQLException {



		Connection connection=null;
		Statement statement = null;
		try {
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);		
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dd", "root", "12345");

			String qry = "select id,email from associates";			
			statement = connection.createStatement();

			ResultSet rSet = statement.executeQuery(qry);

			while(rSet.next()) {
				System.out.println(rSet.getInt(1)+"\t"+rSet.getString(2));
			}

		} catch (Exception e) {
			System.out.println("Error : " + e);
		}finally {
			statement.close();
			connection.close();
		}
	}

}

