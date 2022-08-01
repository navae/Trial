package com.infy.firstProject.Types_of_Variables;

public class Static_Variable
{
	//static variable isdeclared insude class body
	//static keyword is compulsary
	//we can call static variable inside any method(main method/business static method/non ststic method)
	//we can create and access non initalized static variables
	
	static int a=100;
	static double b;
	
	public void demo() // Non Static method
	{
		System.out.println("This is non static methd= "+a);
		System.out.println("This is non static methd= "+b);
	}
	
	public static void demo_duplicate() //Static meyhod
	{
		System.out.println("This is static methd= "+a);
		System.out.println("This is static methd= "+b);
	}
	
	public static void main(String[] args)
	{
		demo_duplicate();
		Static_Variable obj=new Static_Variable();
		obj.demo();
		System.out.println(a);
	}

}
