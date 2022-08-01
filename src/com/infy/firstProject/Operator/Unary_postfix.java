package com.infy.firstProject.Operator;

public class Unary_postfix
{
	int a=10; //instance variable
	static int b=20; //satatic variable
	
	public void postfix() //non static method
	{
		System.out.println(a); //10
		System.out.println(b); //20
		
		System.out.println("Postfix Addition" );
		System.out.println(a++); //10
		System.out.println(a);   //11
		
		
		System.out.println("Postfix Substraction");
		System.out.println(a--); //11
		System.out.println(a);   //10
	}
	
	public static void main(String[] args)
	{
		 Unary_postfix obj=new  Unary_postfix();
		 obj.postfix();
		
	}

}
