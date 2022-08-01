package com.infy.firstProject.String;

public class Reverse_String
{
	public static void main(String args [])
	{
		/*// StringBuilder Class
		String s="Snehal";
		
		StringBuilder sb= new StringBuilder(s);
		//sb.reverse();
		//System.out.println(sb);
		
		StringBuilder reverse = sb.reverse();
		System.out.println(reverse);*/
		
		
		
		/*String s="Aspire";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
			
		}*/
		
		String s="Rushikesh";
		
		char[] c = s.toCharArray();
		
		for(int i=c.length-1; i>=0; i--)
		{
			System.out.print(c[i]);
		}
		
	}

}
