package com.infy.firstProject.ExceptionHandling;

public class Nested_try_catch 
{
	public static void main(String args [])
	{
		String s=null;
		try
		{
			System.out.println(5/1);
			
			try
			{
				System.out.println(s.length());
			}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println("i am in nested block");		
			}
		}	
			catch(Exception w)
			{
				System.out.println(w.getMessage());
				System.out.println("I am in try block");
			}
		System.out.println("Test completed");
		}
		
	}


