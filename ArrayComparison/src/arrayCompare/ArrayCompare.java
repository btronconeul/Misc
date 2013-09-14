package arrayCompare;


import java.util.HashSet;

public class ArrayCompare {

	
	public static void arrayCompare (int [] arrayOne, int [] arrayTwo) {

		HashSet<Integer> firstArray = new HashSet<Integer>();
		HashSet<Integer> secondArray = new HashSet<Integer>();
		
		for (Integer i : arrayOne) {
			firstArray.add(i);
		}
		for (Integer i : arrayTwo) {
			if(firstArray.contains(i)) {
				firstArray.remove(i);
			}
			else{
				secondArray.add(i);
			}
			
		}
		System.out.println(firstArray.toString());
		System.out.println(secondArray.toString());
		
		
	}

}
