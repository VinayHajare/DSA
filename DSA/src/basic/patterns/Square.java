package basic.patterns;

/** Return a star pattern for nxn matrix.
 * 
 *  * * * *
 *  *     *
 *  *     *
 *  * * * *
 */
public class Square {

	private static void getStar(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0|| j==0|| i==n-1 || j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	    Square.getStar(4);	
	}

}
