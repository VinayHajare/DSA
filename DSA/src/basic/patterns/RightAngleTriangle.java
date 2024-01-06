package basic.patterns;

/* Sam is making a forest visualizer. An N-Dimensional forest is represented by a NxN filled with '*'.
 * An N/2-dimensional forest is represented by the lower triangle of the pattern filled with '*'. For every value of n, help Sam to print a n/2-dimensional forest.
   *
   **
   ***
   ****
 * */
public class RightAngleTriangle {

	private static void rightAngleTriangle(int n) {
		// for columns
		for(int i=0; i<n;i++) {
			// for rows
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		RightAngleTriangle.rightAngleTriangle(3);
	}

}
