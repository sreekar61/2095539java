package com.cognizant;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RetriveDemo3 {

	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Associates ID : ");
		int id = scanner.nextInt();


		Connection connection=null;
		PreparedStatement pStatement = null;
		try {
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);		
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dd", "root", "12345");

			String qry = "select * from associates where id=?";			
			pStatement = connection.prepareStatement(qry);
			pStatement.setInt(1, id);

			ResultSet rSet = pStatement.executeQuery();

			while(rSet.next()) {
				System.out.println(rSet.getInt(1)+"\t"+rSet.getString(2)+"\t"+rSet.getString(3)+"\t"+rSet.getLong(4));
			}

		} catch (Exception e) {
			System.out.println("Error : " + e);
		}finally {
			pStatement.close();
			connection.close();
		}
	}

}


