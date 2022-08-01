package com.infy.firstProject.Constructor;

public class User_Defined_Constructor 
{
	//declaration
	
	int a;
	String b;
	
	//initization
	//need to create constuctor
	
	User_Defined_Constructor ()  //Non-parameterized constructor
	{
		a=10;
		b="Snehal";
	}
	
	User_Defined_Constructor(int c)
	{
		a=10;
		b="team";
	}
	
	//usage
	
	public void demo_const()
	{
		System.out.println(a);
		System.out.println(b);

		
	}
	
	public static void main(String[] args)
	{
		User_Defined_Constructor u=new User_Defined_Constructor ();  //Non parameterized constuctor
		//System.out.println(c.a);
		//System.out.println(c.b);
		
		u.demo_const();
		
		System.out.println("=====================");
		
		User_Defined_Constructor p=new User_Defined_Constructor (70);
		p.demo_const();
		
	}

}
