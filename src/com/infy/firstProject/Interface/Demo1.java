package com.infy.firstProject.Interface;

public interface Demo1 extends Demo2 , Demo3
{
	public static void dsatic() //static and incomplete method
	{
		System.out.println("I am complete method from interface");
	}

	
	public void Nonstatic();//--->this is non statoc abstract and incomplete method
	
	
	//we cannot create constructos and objects of interface because it has incomplete methods
	//and variables are static and final
	
	int a=10;
}
