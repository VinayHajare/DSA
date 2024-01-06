package basic.patterns;

/** Sam is curious about symmetric pattern, so he decided to create one.
 *  For every integer 'n', print the symmetry as shown in below example.
 
    *                 *
    * *             * *
    * * *         * * *
    * * * *     * * * *
    * * * * * * * * * * 
    * * * *     * * * *
    * * *         * * *
    * *             * *
    *                 *       
  
 */
public class Symmetry {

	private static void symmetry(int n) {
		int initialSpace = 2*n-2;
		
		for(int i=1;i<=2*n-1;i++) {
			int stars = i;
			if(i>n) {
				stars = 2*n-i;
			}
			
		    // printing stars
			for(int j=0; j<stars; j++) {
				System.out.print("*");
			}
			
			// printing the spaces
			for(int j=0; j<initialSpace; j++) {
				System.out.print(" ");
			}
			
			// printing stars
			for(int j=0; j<stars; j++) {
				System.out.print("*");
			}
			
			// decide to decrease or increase the spaces
			if(i<n) {
				initialSpace -= 2;
			}else {
				initialSpace += 2;
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Symmetry.symmetry(5);
	}

}
