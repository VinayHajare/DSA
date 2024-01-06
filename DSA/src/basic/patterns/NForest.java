package basic.patterns;
/* Sam is making a n-dimensional forest visualizer. An N-Dimensional forest is represented by the pattern of NxN filled with '*'
 * For every value of 'N', help Sam to print the corresponding N-dimensional forest.
   ***
   ***
   ***
 **/

public class NForest {

	private static void nForest(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		NForest.nForest(3);
	}
}
