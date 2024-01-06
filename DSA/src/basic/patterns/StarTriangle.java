package basic.patterns;

/* Ninja has a fond of printing the star patterns. He wants to print a full star Triangle.
      *
    * * *
  * * * * *
* * * * * * *
  
 * */
public class StarTriangle {

	private static void nStarTriangle(int rows) {
	  for(int i = 0; i<rows; i++) {
		// print the spaces before star
		for(int j = 0; j < rows-i-1; j++) {
			System.out.print(" ");
		}
		// print the star
		for(int j = 0; j < 2*i+1; j++) {
			System.out.print("*");
		}
		// print spaces after star
		for(int j = 0; j < rows-i-1; j++) {
			System.out.print(" ");
		}
		System.out.println();
	  }
	}
	
	public static void main(String[] args) {
		nStarTriangle(4);
	}

}
