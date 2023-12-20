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

	int n1 = (int) ( Math.random()*(maxVal - minVal) + minVal);
	int n2 = (int) ( Math.random()*(maxVal - minVal) + minVal);
	int n3 = (int) ( Math.random()*(maxVal - minVal) + minVal);
	
	System.out.println(n1);
	System.out.println(n2);
	System.out.println(n3);

	int minNum = Math.min(Math.min(n1, n2), Math.min(n2, n3));

	System.out.println("The minimal generated number was " + minNum);
	}
}

