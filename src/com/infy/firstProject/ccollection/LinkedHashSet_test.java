package com.infy.firstProject.ccollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_test 
{
	public static void main(String args[])
	{
		LinkedHashSet a= new LinkedHashSet();
		a.add(100);
		a.add("Snehal");
		a.add("pooja");
		a.add(100);
		
		System.out.println(a);
		
		Iterator h = a.iterator();
		
		while(h.hasNext())
		{
			System.out.println(h.next());
			
		}
		
		a.remove(100);
		System.out.println(a);
		
		System.out.println(a.isEmpty());
		System.out.println(a.containsAll(a));
		
	}

}
