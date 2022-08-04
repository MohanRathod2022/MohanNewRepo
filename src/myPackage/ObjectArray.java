package myPackage;

import java.util.ArrayList;

public class ObjectArray {

	public static void main(String[] args) {

	     ArrayList<Object> empdetails=new ArrayList<Object>();
	     
	     empdetails.add("Ayush");
	     empdetails.add(34);
	     empdetails.add("FullTime");
	     empdetails.add("25.34");
	     empdetails.add(12555);
	     empdetails.add(true);//onsite
	     System.out.println(empdetails);
	     
	     System.out.println(empdetails.size());
	     
	     for(Object e : empdetails) {
	    	 System.out.println(e);
	     }
	     
     
	}

}
