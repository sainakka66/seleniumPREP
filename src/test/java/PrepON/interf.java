package PrepON;

interface it
{
	void m1();
	void m2();
	void m3();
}


public class interf implements it{
	
	public void m1()
	{
		System.out.println("M1 -method");
	}
	public void m2()
	{
		System.out.println("M2 -method");
	}
	public void m3()
	{
		System.out.println("M3 -method");
	}

	public static void main(String[] args) 
	{
		
		interf no = new interf();
		no.m1();
		no.m2();
		no.m3();
		
	}

}
