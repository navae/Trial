package com.infy.firstProject.Array;

public class Fixed_Array
{
	public static void main(String args[])
	{
		int [] a= new int[4];
		a[0]=11;
		a[1]=22;
		a[2]=33;
		a[3]=44;
		
		
		System.out.println("======simple for loop=====");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("=====for each loop======");
		for(int q:a)
		{
			System.out.println(q);
		}
		
	
		
	
	}
}
