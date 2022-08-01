package com.infy.firstProject.ExceptionHandling;

public class ArithmeticException
{
	public static void main(String args [])
	{
		System.out.println(5+2);
		System.out.println(3/4);
		
		try 
		{
		System.out.println(10/0);

		}
		
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("I am in exception block");
		}
		
		/*catch(NullPointerException ne)
		{
			System.out.println(ne.getMessage());
			System.out.println("I am in exception block");
		}*/
		
		
		finally
		{
			System.out.println("I am in fiannally block");
			System.out.println(23*3);
			System.out.println(43-9);
		}
		
		
		
		
	}

}

