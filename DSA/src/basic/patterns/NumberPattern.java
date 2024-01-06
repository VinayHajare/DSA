package basic.patterns;
/** 
   You must print the number pattern as given below :
   
   4 4 4 4 4 4 4
   4 3 3 3 3 3 4
   4 3 2 2 2 3 4
   4 3 2 1 2 3 4
   4 3 2 2 2 3 4
   4 3 3 3 3 3 4
   4 4 4 4 4 4 4
   
 */
public class NumberPattern {

	private static void getNumberPattern(int n) {
		for(int i=0; i<2*n-1; i++) {
			for(int j=0; j<2*n-1; j++) {
				int top = i;
				int left = j;
				int right = (2*n-2)-j;
				int bottom = (2*n-2)-i;
				System.out.print(n-(Math.min(Math.min(top, bottom),Math.min(right, left)))+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		NumberPattern.getNumberPattern(4);
	}

}
