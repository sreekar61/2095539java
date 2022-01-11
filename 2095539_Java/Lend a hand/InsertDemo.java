package com.cognizant;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) throws SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Associates ID : ");
		int id = scanner.nextInt();
		System.out.println("Enter Associates Name : ");
		String name = scanner.next();
		System.out.println("Enter Associates Email : ");
		String email = scanner.next();
		System.out.println("Enter Associates Mobile : ");
		long mobile =  scanner.nextLong();
		Connection connection=null;
		PreparedStatement pStatement = null;
		try {
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);		
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dd", "root", "12345");

			String qry = "insert into associates values(?,?,?,?)";			
			pStatement = connection.prepareStatement(qry);
			pStatement.setInt(1, id);
			pStatement.setString(2, name);
			pStatement.setString(3, email);
			pStatement.setLong(4, mobile);

			// 4. Execute the query or statement

			int a = pStatement.executeUpdate();
			if(a>0) {
				System.out.println(a+" Records Inserted....");
			}else {
				System.out.println("Records Not Inserted....");
			}

		} catch (Exception e) {
			System.out.println("Error : " + e);
		}finally {
			pStatement.close();
			connection.close();
		}
	}

}



