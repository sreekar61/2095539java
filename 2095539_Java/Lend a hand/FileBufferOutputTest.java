package com.cognizant;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileBufferOutputTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutput = null;
		BufferedOutputStream bufferOutput =  null;
		Scanner scanner= null;
		scanner = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int empId = scanner.nextInt();
		System.out.println("Enter Employee Name");
		String empName = scanner.next();
		String finalValue = "Welcome"+ empName+
				", your Employee Id is" +empId;
		try {
			fileOutput= new FileOutputStream("C:/newFile.txt");
			bufferOutput = new BufferedOutputStream(fileOutput)	;
			bufferOutput.write(finalValue.getBytes());
			System.out.println("Data is written into the file");
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			try {
				bufferOutput.flush();
				bufferOutput.close();
				fileOutput.close();
			}
		catch(IOException io) {
			io.printStackTrace();
		}
		}

	}

}
