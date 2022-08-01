package com.infy.firstProject.Types_of_Variables;

public class Local_Variable 
{
	//local variable is non static in nature
	//it is used inside the method where it is created
	//we cannot use local variable in any other method, it can be business method or main method
	//we need to initalize the local variable
	
	public void demo()
	{
		int a=100;
		System.out.println(a);
		
	}
	
	public void demo_copy()
	{
		int a=20;
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		Local_Variable obj=new Local_Variable();
		obj.demo();
		obj.demo_copy();
	}
	

}
