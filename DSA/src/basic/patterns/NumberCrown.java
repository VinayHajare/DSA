package basic.patterns;

/** 
 * Aryan and his friend has a very fond of pattern, help them to print a pattern of
 * reverse N-number crown for given integer 'n'.
   1             1
   1 2         2 1
   1 2 3     3 2 1
   1 2 3 4 4 3 2 1
   
 */
public class NumberCrown {

	private static void numberCrown(int n) {
		int spaces = 2*(n-1);
		for(int i = 0; i<n; i++) {
			// print the number from forward
			for(int j = 0; j<=i; j++) {
				System.out.print(j+1);
			}
			// print the spaces
			for(int j = 0; j<spaces; j++) {
				System.out.print(" ");
			}
			// print the number from reverse
			for(int j = i;j>=0;j--) {
				System.out.print(j+1);
			}
			// reducing the space by 2 everytime
			spaces -= 2;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		NumberCrown.numberCrown(4);
	}

}
