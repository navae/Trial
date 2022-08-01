package com.infy.firstProject.Iterative_Statments;

public class Armstraong 
{
	public static void main(String args[])
	{
	     int num=1634;
	     int temp=0;
	     int number=0;
	     int total=0;
	     
	     number=num;
	     
	     
	     
	     while(number!=0)
	     {
	    	 temp=number%10;
	    	 total=total+temp*temp*temp;
	    	 number=number/10;
	    	
	     }
	     if(total==num)
	     
	    	 
	    	 System.out.println(num  +  "is an armsttrong number");
	    	 
	    	 else
	    		 
	          System.out.println(num + "is not an armstrong number");
	     		
	    	 
	     
	     
	     
	}

}
