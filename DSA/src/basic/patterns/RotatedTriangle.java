package basic.patterns;
/*
 Ninja has a fond of patterns. For a given integer 'N', he wants to make the N-Star rotated triangle.
   
   *
   * *
   * * *
   * * * *
   * * * * *
   * * * *
   * * *
   * *
   *
 
 
 * */
public class RotatedTriangle {
	
	private static void nStarTriangle(int n) {
		for(int i=1; i<=2*n-1; i++) {
			int stars = i;
			if( i > n) {
				stars = 2*n-i;
			}
			for(int j=1; j<=stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		RotatedTriangle.nStarTriangle(5);
	}
}
