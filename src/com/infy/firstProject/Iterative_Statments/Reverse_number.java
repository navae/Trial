package com.infy.firstProject.Iterative_Statments;

public class Reverse_number
{
	public static void main(String[] args)
	{
		/*int number=1234;
		int rev=0;
		 while(number!=0)
		 {
			 int rem=number%10;
			  rev=rev*10+rem;
			 number=number/10;
			 
		
			 
		 }
		 
		 System.out.println(rev);*/
		 
		 /*int number=1234;
			int rev=0;
			 while(number!=0)
			 {
				 int rem=number%10;
				  rev=rev*10+rem;
				 number=number/10;
				 System.out.println(rev);
				 
			
				 
			 }*/
		 
		 
		 int rev=0;
		 int number=1234;
		 
		 while(number!=0)
		 {
			 int rem=number%10;
			 rev=rev*10+rem;
			 number=number/10;			 
		 }
		 
		 
		 
		 System.out.println(rev);
		 
		 
	}

}
