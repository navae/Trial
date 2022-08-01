package com.infy.firstProject.Method_calling;

public class Simple_Method 
{
	public static void main(String[] args)
	{
		first();
		first(10);
		
		
		Simple_Method t=new Simple_Method();
		t.second();
		
		t.second(7);
	}
	
	public static void first()
	{
	   System.out.println("i am first static method");	
	}
	
	public static void first(int a)
	{
	   System.out.println("i am first paramitrized static method");	
	}
	
	public void second()
	{
		System.out.println("I am second non-static method");
	}
	
	public void second(int a)
	{
		System.out.println("I am second non-static parametrized method");
	}


}
