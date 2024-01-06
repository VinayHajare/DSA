package basic.patterns;

/** Sam is researching on the alpha triangle, he wants to create it for different integers 'N'.
    An alpha triangle is represented by triangular pattern of the alphabets in reverse order.
    For every value of N, help Sam to print the Alpha triangle.
    D
    C D
    B C D
    A B C D
*/
public class AlphaTriangle {

	private static void alphaTriangle(int n) {
		for(int i=0; i<n; i++) {
			for(char ch=(char) (('A'+n-1)-i); ch<='A'+n-1; ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
	
	private static void alphaTriangle1(int n) {
		for(int i=0; i<n; i++) {
			char startLetter = (char) ('A' + n - 1);
			for(int k = 0; k <= i; k++) {
				char letter = (char) (startLetter - k);
				System.out.print(letter+" ");
			}
			System.out.println();
		}
	}
	
	private static void alphaTriangle2(int n) {
		for(int i=0; i<n; i++) {
			for(char ch=(char) ('A'+n-1); ch>=(('A'+n-1)-i);ch--) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		AlphaTriangle.alphaTriangle(3);
		AlphaTriangle.alphaTriangle1(3);
		AlphaTriangle.alphaTriangle2(3);
	}

}
