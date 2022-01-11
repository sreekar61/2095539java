package com.cognizant;

public class Emp {
	
	private int age ;
	
     public Emp(int age, String string, int i)
     {
    	 super();
    	 this.age=age;
     
     }
     
     public int hashCode()
     {
    	 return age;
    	 
     }
    public boolean equals (Object object)
    {
    	boolean flag = false;
    	Emp emp = (Emp) object;
    	if(emp.age==age)
    		flag = true;
    	return flag;
    }

}
