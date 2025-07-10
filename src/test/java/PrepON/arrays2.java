package PrepON;

public class arrays2 {

	public static void main(String[] args) 
	{
		
		//1st METHOD
		int[][] arr = {
				{100,200},	
				{300,400},	
				{500,600}	
		};
		System.out.println(arr[0][1]); //200
		System.out.println(arr[1][1]); //400
		System.out.println(arr[1][0]); //300
		System.out.println(arr[2][1]); //600
		
		//2nd METHOD
		int[][] a = new int[3][2];
		a[0][0] = 1000;
		a[0][1] = 2000;
		a[1][0] = 3000;
		a[1][1] = 4000;
		a[2][0] = 5000;
		a[2][1] = 6000;
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
