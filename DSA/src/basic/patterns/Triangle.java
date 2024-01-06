package basic.patterns;
/* Sam is making a triangular pattern for a maths project.
 * An n-dimensional triangle is represented by the lower triangle of the pattern filled with the integers representing the row number.
 * For every value of N help Sam to print the corresponding Triangle.
 * 1
 * 2 2
 * 3 3 3
 * */
public class Triangle {
	
	private static void nTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Triangle.nTriangle(3);
	}
}
