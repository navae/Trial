package com.infy.firstProject.Array;

public class Not_Fixed_array 
{
	public static void main(String args[])
	{
	int a[][]= {{10,20,30} , {40,50,60,70} , {70,80,90,60}};
	
	for(int i=0; i<3;i++)
	{
		//System.out.println(a[i].length);
		for(int j=0; j<a[i].length; j++)
		{
			System.out.print(a[i][j] + " ");
		}
		
	System.out.println(" ");	
	}
	}
}
