/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here	
	int input1 = Integer.parseInt(args[0]); 
	int input2 = Integer.parseInt(args[1]);

	int maxVal = Math.max(input1, input2);
	int minVal = Math.min(input1, input2);

	int num1 = (int) ( Math.random()*(maxVal - minVal) + minVal);
	int num2 = (int) ( Math.random()*(maxVal - minVal) + minVal);
	int num3 = (int) ( Math.random()*(maxVal - minVal) + minVal);
	
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);

	int minNum = Math.min(Math.min(num1, num2), Math.min(num2, num3));

	System.out.println("The minimal generated number was " + minNum);
	}
}

