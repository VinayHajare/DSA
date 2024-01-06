package basic.patterns;

/** For a given 'n' integer, print a increasing number triangle.
    1
    2 3
    4 5 6
    7 8 9 10

 */
 
public class IncreasingNumberTriangle {

	private static void nNumberTriangle(int n) {
		int counter = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((++counter)+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		IncreasingNumberTriangle.nNumberTriangle(4);
	}
}
