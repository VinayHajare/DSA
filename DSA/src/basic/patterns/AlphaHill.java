package basic.patterns;
/**
 * Sam is curious about the alpha hill, so he decided to create a alpha hills of different sizes.
 * An alpha hill is represented by a triangle, where alphabets are filled in palindromic order .
 * For every value of N, help him to return the corresponding Alpha-hills.
       A
     A B A
   A B C B A
 A B C D C B A
 
 */
public class AlphaHill {
	
	private static void alphaHill(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			
			char ch = 'A';
			int breakPoint = (2*i+1)/2;
			for(int j=0; j<2*i+1; j++) {
				System.out.print(ch);
				if(j < breakPoint) {
					ch++;
				}else {
					ch--;
				}
			}
			
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		AlphaHill.alphaHill(4);
	}

}
