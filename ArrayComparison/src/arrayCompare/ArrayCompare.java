package arrayCompare;


import java.util.HashSet;

public class ArrayCompare {

	
	public static Object[] arrayCompare (int [] arrayOne, int [] arrayTwo) {

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
		
		return new Object[] {firstArray,secondArray};		
	}

}
 