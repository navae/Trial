package com.infy.firstProject.String;

public class Counting
{
	public static void main(String args[])
	{
		int count=0;
		 String s = "Snehal Snehal Rushikesh";
		 
		 for (int i=0; i<s.length(); i++)
		 {
			 if(s.charAt(i)=='h')
			 {
				 count++;
				 System.out.println(count);
			 }
		 }
		 
		 System.out.println("Final count of e is==" + count);
		 
		 /*
		  * int count=0;
		  * String="Snehal rusholesj Navale"
		  * 
		  * for(int i=0;i<=s.lenght(); i++)
		  * {
		  *  if(s.charAt(i)=='j');
		  *  {
		  *  count++;
		  *  System.out.println(count);
		  *  }
		  *  
		  * }
		  */
		
	}

}
