package com.infy.firstProject.ccollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_test
{
	public static void main(String args[])
	{
		
		ArrayList a=new ArrayList();
		
		a.add("Aspi");
		a.add(null);
		a.add("snehal");
		a.add(100);
		
		System.out.println(a);
		
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains(100));
		
		
		System.out.println(" anilsdjkflksj" + a.get(3));
		
		
		a.add(1, "shlok");
		System.out.println(a);
		a.add(2, "Shweta");
		System.out.println(a);
		a.remove(5);
		System.out.println(a);
		
		System.out.println(a.get(3));
		
		
		System.out.println("===========Iterator==========");
		
		Iterator itr = a.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println("=======ListIterator=======");
		
		ListIterator li = a.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("=======Simple for loop=======");
		
		for(int i=0 ; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("====for each loop");
		{
			for(Object o:a)
			{
				System.out.println(o);
			}
		}
	}

}
