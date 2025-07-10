
public class arrays {

	public static void main(String[] args) 
	{
		
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println(a[1]);
		
		int a1[] = {60,70,80,90,100};
		System.out.println(a1[4]);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("The New Array: " + a[i]);
		}
		
		for(int values:a1)
		{
			System.out.println("The Array: " + values);
		}
		
	}

}
