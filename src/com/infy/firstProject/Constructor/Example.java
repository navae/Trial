package com.infy.firstProject.Constructor;

public class Example
{
	int a;
	int b;
	
	Example()
	{
		a=10;
		b=20;
				
	}
	
	Example(int c)
	{
		a=50;
		b=30;
		
	}
	
	public void addition() 
	{
		int e= a + b;
		System.out.println("Addition is"+e);
	}
	
	public void substraction()
	{
		int e=a-b;
		System.out.println("Substarction"+e);
	}
	
	public static void main(String args[])
	{
		Example e=new Example();
		e.addition();
		e.substraction();
		
		
		Example p=new Example(6);
		p.addition();
		p.substraction();
		
				
		
		
	}

}
