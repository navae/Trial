package com.infy.firstProject.String;

public class Reverse_Sentence 
{
	public static void main(String args[])
	{
		/*String s="welcome to Asire";
		
		char[] c = s.toCharArray();
		
		for(int i=c.length-1; i>=0; i--)
		{
			System.out.print(c[i]);
		}*/
		
		
		/*String s="Welcome to aspire";
		
		String[] str = s.split(" ");
		
		for(String temp:str)
		{
			System.out.print(temp + " ");
		}
		
		System.out.println(" ");
		
		for(int i=0;i<str.length;i++)
		{
			char[] s1=str[i].toCharArray();
			for(int j=s1.length-1; j>=0; j--)
			{
				System.out.print(s1[j]);
			}
			
			System.out.print(" ");
		}*/
		
		
		/*String s="My name is snehal";
		String[] str = s.split(" ");
		
		for(String temp:str)
		{
			System.out.print(temp + " ");
		}
		
		System.out.println(" ");
		for(int i=0; i<str.length; i++)
		{
			char[] s1 = str[i].toCharArray();
			
			for(int j=s1.length-1; j>=0; j--)
			{
				System.out.print(s1[j]) ;
			}
			System.out.print(" ");
		}*/
		
		
		String s="My name is Shlok rushikesh navale aptil";
		
		String[] str = s.split(" ");
		
		for(String temp:str)
		{
			System.out.print(temp + " ");
		}
		System.out.println(" ");
		
		for(int i=0; i<str.length; i++)
		{
			
			char[] s1 = str[i].toCharArray();
			
			for(int j=s1.length-1; j>=0 ;j--)
			{
				System.out.print(s1[j]);
			}
			
			System.out.print(" ");
		}
		
		
		
	}

}
