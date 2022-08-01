package com.infy.firstProject.ccollection;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_test 
{
	public static void main(String args[])
	{
	  Vector v=new Vector();
	  v.add(199);
	  v.add("shubhangi");
	  v.add(90);
	  
	  System.out.println(v);
	  System.out.println(v.size());
	  System.out.println(v.contains(90));
	  System.out.println(v.get(2));
	  
	  System.out.println("====Enumeration====");
	  Enumeration a = v.elements();
	  
	  while(a.hasMoreElements())
	  {
		  System.out.println(a.nextElement());
	  }
	  
	}

}
