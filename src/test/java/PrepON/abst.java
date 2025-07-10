package PrepON;


abstract class parent
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4()
	{
		System.out.println("M4 -Method");
	}
}



public class abst extends parent {
	
	void m1()
	{
		System.out.println("M1 -Method");
	}
	void m2()
	{
		System.out.println("M2 -Method");
	}
	void m3()
	{
		System.out.println("M3 -Method");
	}

	public static void main(String[] args) {
		
		abst ob = new abst();
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();
		
	}
}
