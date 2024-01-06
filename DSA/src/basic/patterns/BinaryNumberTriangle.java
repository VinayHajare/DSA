package basic.patterns;

/**
 * For a given integer N print the N-dimensional binary number triangle.
 * 1
 * 0 1
 * 1 0 1
 * 0 1 0 1
 * 1 0 1 0 1 
 */
 

public class BinaryNumberTriangle {
	
	private static void nBinaryTriangle(int n) {
		int startBit = 1;
		for(int i=0; i<n; i++) {
			// check if the row is even/odd then flip the startBit
			if(i%2 == 0) {
				startBit = 1;
			}else {
				startBit = 0;
			}
				
			for(int j=0; j<=i; j++) {
				System.out.print(startBit+" ");
				// flip the startBit after every print
				startBit = 1 - startBit;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		BinaryNumberTriangle.nBinaryTriangle(5);
	}
	
}
