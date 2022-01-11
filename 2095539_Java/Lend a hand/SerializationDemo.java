package com.cognizant;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		try{
			Emp emp = new Emp(11223,"Ramesh",125000);
		System.out.println("Employee before serialization"+emp);
		FileOutputStream fileOut = new FileOutputStream("C:/data.txt");
		//serialization
		ObjectOutputStream oos = new ObjectOutputStream(fileOut);
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		}
          catch(IOException) {
        	  ioe.printStackTrace();
          }
	try{
		Emp emp;
		FileInputStream fileInputStream = new FileInputStream("C:/date.txt");
		//serialization
		ObjectInputStream ois = new ObjectInputStream(fileInputStream);
		emp = (Emp) ois.readObject();
		ois.close();
		System.out.println("Employee After deserialization"+emp);	
	}
	catch (IOException ioe) {
		ioe.printStackTrace();
	}
	catch (ClassNotFoundException cnf) {
		cnf.printStackTrace();
	}
	}

}
