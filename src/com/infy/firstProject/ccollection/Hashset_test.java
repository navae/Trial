package com.infy.firstProject.ccollection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_test 
{
	public static void main(String args [])
	{
		HashSet h=new HashSet();
		 h.add(100);
		 h.add('a');
		 h.add("Aspire");
		 
		 System.out.println(h);
		 
		 System.out.println(h.size());
		 System.out.println(h.isEmpty());
		 
		 h.remove('a');
		 System.out.println(h);
		 
		 Iterator itr = h.iterator();
		 
		 while(itr.hasNext())
		 {
			 System.out.println(itr.next());
		 }
	}

}
