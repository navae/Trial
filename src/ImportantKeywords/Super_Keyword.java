package ImportantKeywords;

public class Super_Keyword extends ThisKeyword
{


	Super_Keyword(String Name, int MobileNo) {
		super(Name, MobileNo);
		// TODO Auto-generated constructor stub
	}


	static int b=10;
	
	public void demo()
	{
		System.out.println(super.b);
	}
	
	
	public static void main(String args[])
	{
		Super_Keyword s=new Super_Keyword("aniket",768768);
		s.demo();
	
		System.out.println(b);
	}

}
