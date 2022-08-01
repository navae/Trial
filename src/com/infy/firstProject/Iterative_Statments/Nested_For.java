package com.infy.firstProject.Iterative_Statments;

public class Nested_For 
{
	public static void main(String[] args)
	{

		System.out.println("Displaying the table 0f 2");
		for(int i=1; i<=3;i++)
		{
			for(int j=1; j<=10;j++)
			{
				System.out.println(i + "*" + j + "=" + i*j);
				
			}
			System.out.println("");
			
		}
	}

}
