package com.infy.firstProject.Iterative_Statments;

public class Do_while_loop 
{
	public static void main(String[] args)
	{
		
		//it executes the condition atleast once in the program
		
		/*Syntax:
		 * do
		 *   {
		 *      Statement;
		 *      increment/decremet'
		 * 
		 *   }
		 *   
		 *   while(condition);
		 * 
		 */
		
		int i=1;
		do 
		{
			System.out.println(i);
			i++;
		}
		while(i<=100);
	}

}
