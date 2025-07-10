package collections;

import java.util.ArrayList;
import java.util.List;

public class lists {

	public static String name;
	public static String name1;
	
	public static int num;
	public static int num1;
	
	
	public static void main(String[] args) 
	{
		
		name = "sai";
		name1 = "sai";
		num = 100;
		num1 = 1000;
		
		List<String> word = new ArrayList<>();
		word.add(name);
		word.add(name1);
		
		List<Integer> nums = new ArrayList<>();
		nums.add(num);
		nums.add(num1);
		
		System.out.println(word);
		System.out.println(nums);
		
		//List<Type> word = new ArrayList<>();
		//Set<String> cities = new HashSet<>();
		
//
//		public class QueueExample {
//		    public static void main(String[] args) {
//		        Queue<String> tasks = new LinkedList<>();
//		        tasks.add("Task 1");
//		        tasks.add("Task 2");
//		        tasks.add("Task 3");
//
//		        System.out.println(tasks.poll()); // removes Task 1
//		        System.out.println(tasks.peek()); // sees Task 2
//		    }
//		}

		//Map<Integer, String> students = new HashMap<>();
		
		
	}

}
