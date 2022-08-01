package com.infy.firstProject.Inheritance;

public class H_I_test 
{
	public static void main(String args[])
	{
		Hierarchical_inheritance h=new Hierarchical_inheritance();
		h.username();
		h.pass();
		h.fasion();
		
		Single_Level_i_child s=new Single_Level_i_child();
		s.username();
		s.pass();
		s.mobile();
		
		Multilevel_inheritance m=new Multilevel_inheritance(); //hybrid
		
		m.username();
		m.pass();
		m.mobile();
		m.adress();
		m.payment();
		
	}

}
