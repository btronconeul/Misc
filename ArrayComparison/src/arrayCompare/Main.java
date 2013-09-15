package arrayCompare;

public class Main {

	
	public static void main(String[] args) {
		
		int[] x = new int[] {1,3,5,6};
		int[] y = new int[] {2,5,6,8};
		
		Object[] myArrays = ArrayCompare.arrayCompare(x, y);
		for (Object object : myArrays) {
			System.out.println(object.toString());
		}	
				
				
	}
	

}
