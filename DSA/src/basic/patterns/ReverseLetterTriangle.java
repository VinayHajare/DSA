package basic.patterns;
/** For a given integer 'N', print the reverse letter triangle.
    A B C D E
    A B C D
    A B C
    A B
    A
 */
 
public class ReverseLetterTriangle {
	
	private static void nLetterTriangle(int n) {
		for(int i=0; i<n; i++) {
			for(char ch = 'A'; ch<='A'+(n-i-1); ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ReverseLetterTriangle.nLetterTriangle(5);
	}
}
