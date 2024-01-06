package basic.patterns;
/** Sam is curious about the alpha ramp, so he decided to create a alpha ramp of different sizes.
 * An alpha ramp is represented by a triangle, where alphabets are filled from the top in order.
 * For every value of n, help Sam to return the corresponding Alpha-Ramp.
 * A
 * B B
 * C C C
 * D D D D
 * E E E E E
 */
public class AlphaRamp {
	
	private static void alphaRamp(int n) {
		char ch = 'A';
		for(int i=0; i<n; i++) {
			for(int j=0;j<=i; j++) {
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		AlphaRamp.alphaRamp(5);
	}

}
