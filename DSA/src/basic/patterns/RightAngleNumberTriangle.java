package basic.patterns;

/* Sam is making a triangular  painting for a maths project. An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.
 * For every value of n, help sam to print the corresponding  N-Dimensional Triangle.
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * */
public class RightAngleNumberTriangle {
	
	private static void nTriangle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		RightAngleNumberTriangle.nTriangle(4);
	}
}
