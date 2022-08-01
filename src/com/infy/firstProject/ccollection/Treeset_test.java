package com.infy.firstProject.ccollection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_test 
{
	public static void main(String args [])
	{
		TreeSet t=new TreeSet();
		
		t.add("snehal");
		t.add("pooja");
		t.add("aspire");
		t.add("rishi");
		
		
		System.out.println(t + "\n");
		
		System.out.println(t.add("shlok"));
		System.out.println(t.contains("pooja") + "\n");
		
		Iterator itr = t.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
