package com.infy.firstProject.Abstraction;

public class Concrete_class  extends Abstact_class
{

	@Override
	public void principal()
	{
		System.out.println("I am from croncrete class but a abstract method");
	}
	
	public static void main(String [] args)
	{
		Concrete_class c=new Concrete_class();
		c.demo();
		c.principal();
	}
	
	
	public void demo2()
	{
		System.out.println("I am freom concrere class Demo2");
	}
	
	//it is rgular class
	//we can use any ather name insted of concrtre but for better understanding we can use concerete andstarct names only
	//we can create object of concrete class
	
	
	

}
