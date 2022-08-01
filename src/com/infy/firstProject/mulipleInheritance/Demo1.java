package com.infy.firstProject.mulipleInheritance;

public interface Demo1 extends Demo2 , Demo3
{
	public static void demo1()
	{
		System.out.println("i m complete method from interface");
	}
	
	public void Nonstatic();
	
	int a=10;
	
	

}
