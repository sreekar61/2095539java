package com.cognizant;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	
	public Set<String> getCountries(String c1, String c2, String c3,
			String c4,String c5) {
		Set<String> countries = new HashSet<String>();
	countries.add(c1);
	countries.add(c2);
	countries.add(c3);
	countries.add(c4);
	countries.add(c5);
	return countries;
	
	}
 public Set<Integer> get1to10() {
	 Set<Integer> numSet = new HashSet<Integer>();
	 for (int i=0;i<=10;i++) {
		 numSet.add(i);
		 
	 }
 return numSet;
 }

 public Set<Integer> get11To15(Set<Integer> numSet1) {
	 Set<Integer> numSet2 =new HashSet<Integer>();
	 numSet2.addAll(numSet1);
	 for(int i=11; i<=15;i++) {
		 numSet2.add(i);
		 
	 }
	return numSet2; 
 }
}
