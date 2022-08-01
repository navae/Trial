
public class Child extends Parent
{
	public void demo1()
	{
		System.out.println("I am from child");
	}
	
	public static void demo11()
	{
		System.out.println("I am static method of child class");	
	}
	
	int a=30;
	static int b=40;
	
	public static void main(String args[])
	{
		Child c=new Child();
		c.demo1();
		System.out.println(c.a);
		System.out.println(b);
	
		Parent p=new Child();
		p.demo11();
		p.demo1();
		demo11();
	}

}
