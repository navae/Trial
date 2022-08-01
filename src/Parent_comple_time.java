
public class Parent_comple_time 
{
	
	public void addiyion()
	{
		System.out.println("I an non-static with no arguments");
	}
	
	public void addiyion(int a)
	{
		System.out.println("I an non-static with one arguments");
	}
	
	public static void addiyion(char a)
	{
		System.out.println("I an static with one arguments but of diff type");
	}
	
	public static void main(String args [])
	{
		Parent_comple_time p=new Parent_comple_time();
		p.addiyion();
		p.addiyion(1);
		addiyion('s');
		
	}
		

}
