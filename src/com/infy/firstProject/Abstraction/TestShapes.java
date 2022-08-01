package com.infy.firstProject.Abstraction;

public class TestShapes extends Shape
{
	
	public void testing()
	{
		System.out.println("I am testing shapes");
	}
	public static void main(String args [])
	{
	Shape s=new Circle();
	s.Draw(9);
	
	Shape s1=new Rectangle();
	s1.Draw(10);
	
	TestShapes t=new TestShapes();
	t.testing();
	t.Draw(6);
	
		
	}
	@Override
	public void Draw(int a) 
	{
			System.out.println("Tested successfully");
	}

}
