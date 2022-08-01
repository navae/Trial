package com.infy.firstProject.String;

public class String_test 
{
	public static void main(String args[])
	{
		
	
	String s="SnehalSnehal";
	String s1="SNEHAL";
	s.codePointAt(4);
	//System.out.println("chars"+ s.codePointAt(4));
	
	System.out.println(s);
	System.out.println(s1);
	
	System.out.println(s.indexOf('n'));
	System.out.println(s.charAt(0));
	
	System.out.println("===========");
	System.out.println(s.toLowerCase());

	
	System.out.println("===========");
	
	
	System.out.println(s.lastIndexOf('h'));
	System.out.println(s.lastIndexOf('a'));
	
	
	System.out.println(s.equals(s1));
	System.out.println(s.equalsIgnoreCase(s1));
	
	
	
	}
}
