package arrayCompare;

import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		
		int[] x = new int[] {1,3,5,6};
		int[] y = new int[] {2,5,6,8};
		
		List<ArrayList<Integer>> newList = ArrayCompare.removeDuplicates(x, y);
		for (ArrayList<Integer> arrayList : newList) {
			System.out.println(arrayList.toString());		
			}
	}								
}
	


