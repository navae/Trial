package com.infy.firstProject.Types_of_Variables;

public class Instance_Variable
{
	//It is declared inside class body.
	//We cannot call instance variable inside static method i.e (static Business method/main method)
	//We can call instance variable inside NON-STATIC method only.
	//We can create non initialized instance variable.
	//We can call and use non initalized instance variable inside NON-STATIC method.
	//Instance variable is NON STATIC in nature.
	
	int a=100;
	double b;
	
	public void demo()   //Non-Static Method
	{
		System.out.println("This is demo method "+a);
		System.out.println("This is demo method "+b);
	}
	
	public void demo_duplicate()   //Non-Static Method
	{
		System.out.println("This is demo duplicate method "+a);
		System.out.println("This is demo duplicate method "+b);
	}
	
	public static void demo_copy() //Static Method
	{
		//System.out.println("This is non static method "+a);
		//System.out.println("This is Non static method "+b);
		
	}
	
	public static void main(String[] args)
	{
		Instance_Variable obj=new Instance_Variable();
		obj.demo();
		obj.demo_duplicate();
		System.out.println(obj.a);
	}
	

}
