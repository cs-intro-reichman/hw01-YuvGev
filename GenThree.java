/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here	
	int a = Integer.parseInt(args[0]); 
	int b = Integer.parseInt(args[1]);

	int maxVal = Math.max(a, b);
	int minVal = Math.min(a, b);

	int num1 = (int) ( Math.random()*(maxVal - minVal + 1) + minVal );
	int num2 = (int) ( Math.random()*(maxVal - minVal + 1) + minVal );
	int num3 = (int) ( Math.random()*(maxVal - minVal + 1) + minVal );
		
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
		
	int minNum = Math.min(Math.min(num1, num2), Math.min(num2, num3));
		
	System.out.println("The minimal generated number was " + minNum);
		

	}
}

