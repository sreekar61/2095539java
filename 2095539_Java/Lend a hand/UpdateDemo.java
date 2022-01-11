package com.cognizant;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDemo {

	public static void main(String[] args) throws SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Associates ID : ");
		int id = scanner.nextInt();		
		System.out.println("Enter Associates Name : ");
		String name = scanner.next();

		Connection connection=null;
		PreparedStatement pStatement = null;
		try {
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);		
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dd", "root", "12345");

			String qry = "update associates set name=? where id=?";			
			pStatement = connection.prepareStatement(qry);
			pStatement.setInt(2, id);			
			pStatement.setString(1, name);			

			int a = pStatement.executeUpdate();
			if(a>0) {
				System.out.println(a+" Records Updated....");
			}else {
				System.out.println("Records Not Updated....");
			}

		} catch (Exception e) {
			System.out.println("Error : " + e);
		}finally {
			pStatement.close();
			connection.close();
		}
	}

}
