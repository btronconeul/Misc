package arrayCompare;


import java.util.ArrayList;
import java.util.List;

public class ArrayCompare {

	private static ArrayList<Integer> arrayComparison (int [] arrayToFix, int [] arrayToCompare) {

		ArrayList<Integer> firstArray = new ArrayList<Integer>();
		
		for (Integer i : arrayToFix) {
			firstArray.add(i);
		}
		for (Integer i : arrayToCompare) {
			if(firstArray.contains(i)) {
				firstArray.remove(i);
			}			
	}
		return firstArray;
	}
	
	public static List<ArrayList<Integer>> removeDuplicates (int[] arrayOne, int[] arrayTwo){
		
		List<ArrayList<Integer>> duplicatesRemoved = new ArrayList<ArrayList<Integer>>();
		
		duplicatesRemoved.add(arrayComparison(arrayOne, arrayTwo));
		duplicatesRemoved.add(arrayComparison(arrayTwo, arrayOne));
		
		return duplicatesRemoved;	
	}
}
 