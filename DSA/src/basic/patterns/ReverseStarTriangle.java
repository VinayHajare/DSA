package basic.patterns;

/* Ninja has a fond of printing the star patterns. He wants to print a full star Triangle.
   * * * *
    * * *
     * *
      * 
* */

public class ReverseStarTriangle {

	private static void nStarTriangle(int rows) {
		// for each row in the triangle
		for(int i=0; i<rows; i++) {
			// printing the spaces
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			// printing the stars
			for(int j=0; j<2*rows-(2*i+1); j++) {
				System.out.print("*");
			}
			// printing the spaces
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
		  System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ReverseStarTriangle.nStarTriangle(4);
	}

}
