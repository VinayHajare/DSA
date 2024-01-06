package basic.simple;

public class SwitchCaseStatement {
	public static double areaSwitchCase(int ch, double []a) {
        double result = 0.0;
        switch(ch){
	        case 1: 
	             result = java.lang.Math.PI * a[0] * a[0];
	             break;
	        case 2:
	             result = a[0]*a[1];
	             break;
        }
      return result;       
    }
}
