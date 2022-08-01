package com.infy.firstProject.mulipleInheritance;

public class Interface_test implements Demo1
{

	@Override
	public void demo2()
	{
System.out.println("i am from demo2");
		
	}

	@Override
	public void demo3()
	{
		
		System.out.println("i am from demo3");
	}

	@Override
	public void Nonstatic() 
	{
		System.out.println("i am from demo1");		
	}
	
	public static void main(String args [])
	{
		
		Interface_test i=new Interface_test();
		i.demo2();
		i.demo3();
		i.Nonstatic();
		Demo1.demo1();
		System.out.println(i.a);
		
		
	}


}
