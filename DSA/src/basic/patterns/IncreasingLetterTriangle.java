package basic.patterns;
/** For a given 'n' integer print the increasing letter triangle
 * A
 * A B
 * A B C
 * A B C D
 */
public class IncreasingLetterTriangle {
	
	private static void nLetterTriangle(int n) {
		for(int i=0; i<n; i++) {
			for(char ch='A'; ch<='A'+i; ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		IncreasingLetterTriangle.nLetterTriangle(3);
	}

}
