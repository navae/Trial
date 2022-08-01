package com.infy.firstProject.Abstraction;

public abstract class Abstact_class
{
	public void demo()
	{
		System.out.println("I am from abstact class but a non abstatct method");
	}
	
	public abstract void principal();
	
/*	public static abstract void principal2();------>not possible create static abstatct method
	
	
	public static void main(String args[])
	{
		Abstact_class a=new Abstact_class(); ---->object creation not possible
		
	}*/

}
