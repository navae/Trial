package com.infy.firstProject.Abstraction;

public class Upcasting_test 
{
	public static void main(String [] args)
	{
		
		//upcasting--->calls methods from parent class only
		
		Abstact_class a=new Concrete_class();
		a.demo();
		a.principal();
		
		//upcasting--->calls methods from parent class only
		Abstact_class t=new test();
		t.principal();
		t.demo();
		
	
	
	}
	
	
	
	
	

}
