package basic.patterns;

/** Sam is curious about symmetric pattern, so he decided to create one.
 *  For every value of n, print the symmetry pattern as shown in the example.
    * * * * * * * * * * 
    * * * *     * * * *
    * * *         * * *
    * *             * *
    *                 *
    *                 *
    * *             * *
    * * *         * * *
    * * * *     * * * *
    * * * * * * * * * *
 
 */

public class SymmetricVoid {
	
	private static void symmetry(int n) {
		// for upper-part
		int initialSpaces = 0;
		for(int i=0; i<n; i++) {
			// for stars
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			
			// for spaces
			for(int j=0; j<initialSpaces; j++) {
				System.out.print(" ");
			}
			
			// for stars
			for(int j=0; j<n-i; j++) {
				System.out.print("*");
			}
			initialSpaces += 2;
			System.out.println();
		}
		
		// for lower-part
		initialSpaces = 2*n-2;
		for(int i=0; i<n; i++) {
			// for stars
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			
			// for spaces
			for(int j=0; j<initialSpaces; j++) {
				System.out.print(" ");
			}
			
			// for stars
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			initialSpaces -= 2;
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		SymmetricVoid.symmetry(5);
	}

}
