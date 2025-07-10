package PrepON;

public class Unary {
	public static int a;

	public static void main(String[] args) 
	{
		a = 10;
		
		System.out.println(a++); //10>>11
		System.out.println(++a); //12>>12
		System.out.println(a--); //12>>12
		System.out.println(--a); //11>>10
		System.out.println(a);   //    10
	}

}
