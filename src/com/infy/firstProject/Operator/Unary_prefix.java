package com.infy.firstProject.Operator;

public class Unary_prefix 
{
	static int a =10;
	static int c=20;
	
	public static void main(String[] args)
	{
		System.out.println(++a); //11
		System.out.println(--a); //10
		
		//!
		boolean b=true;
		
		System.out.println(b); //true
		System.out.println(!b); //false
		
		//~
		System.out.println(c); //20
		System.out.println(~c); //-info-1 -21
		
		System.out.println(+a);
		System.out.println(-a);
		
	}
	

}
