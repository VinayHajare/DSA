package basic.patterns;

/* Sam is planting trees on the upper half region separated by the diagonal of the square shaped field.
 * For every value of N, print the field if the trees are represented by '*'.
   * * * *
   * * *
   * *
   * 
   
 * */

public class Seeding {
	
	private static void seeding(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void seeding2(int n) {
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void seeding3(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Seeding.seeding(4);
		Seeding.seeding2(4);
		Seeding.seeding3(4);
	}

}
