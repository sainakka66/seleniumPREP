package collections;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicatesList {

	public static void main(String[] args) 
	{
		
		List<Integer> dup = Arrays.asList(1,2,2,2,3,3,4,5,5);
		Set<Integer> seet = new HashSet<>(dup);
		System.out.println(seet);
		
	}

}
