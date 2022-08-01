package com.infy.firstProject.Operator;

public class Relational_Operator 
{
	int a=9; //instance variaable
	static int b=10; //static variable
	
	public static void main(String[] args)
	{
		int c=29;
		
		Relational_Operator r=new Relational_Operator();
		
		System.out.println("Less than Operator is ="+(r.a<b));
		
		  boolean v = (c<=b);
		  System.out.println("Less than equal to="+v);
		  
		  boolean g = (c>b);
		  System.out.println("Greater than operater is="+g);
		  
		  System.out.println("Greater  than equal to is="+(b>=c));
		  
		  System.out.println("Equal to Operator is="+(10==b));
		  
		  System.out.println("Not equal to Operator is="+(29!=c));
	}
	

	
}
