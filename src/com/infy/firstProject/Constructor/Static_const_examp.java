package com.infy.firstProject.Constructor;

public class Static_const_examp 
{
	
	static int a;
	static String b;
	
	
	Static_const_examp()
	{
		a=10;
		b="aspire";
	}
	
	Static_const_examp(int c)
	{
		a=20;
		b="team";
	}
	
	public static void demo()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String args [])
	{
		
		demo();
		
		System.out.println("++++++++++++++++++++");
		
		new Static_const_examp();
		demo();
		
		System.out.println("++++++++++++++++++");
		
		new Static_const_examp(89);
		demo();
		
	}
	
	

}
