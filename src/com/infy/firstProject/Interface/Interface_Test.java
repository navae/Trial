package com.infy.firstProject.Interface;

public class Interface_Test implements Demo1 
{

	@Override
	public void demo2_method() 
	{
		System.out.println("I am from demo2");
	}

	@Override
	public void demo3_method() 
	{
		System.out.println("I am from demo3");	}

	@Override
	public void Nonstatic() 
	{
		System.out.println("I am from demo1");
	}
	
	public static void main(String args[])
	{
		Interface_Test i=new Interface_Test();
		i.demo2_method();
		i.demo3_method();
		i.Nonstatic();
		Demo1.dsatic();
	
		
		System.out.println(i.a);
		
		
	
		
	}

}
