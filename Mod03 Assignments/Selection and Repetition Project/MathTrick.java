/**
 * 
 * @author APCS Team
 * @version2025
 * 
 * This Math trick and many more can be found at: http://www.pleacher.com/handley/puzzles/mtricks.html
 *
 */

public class MathTrick {
	
	/**
	 * 
	 ******  DO NOT USE ARRAYS AT ALL,  AND DO NOT CONVERT NUMBERS TO STRING UNTIL STEP 7 ******
	 *
	 */
	
	// Step 1) Create a random 3-digit (100-999) number where the first and last digits differ by more than one
	// Hint: Use Math.random() to create number in the correct range
	// 		 Use modulus to find the last digit and divide by 100 for the first digit.
	//		 Calculate the difference; which method can you use so it doesn't matter how the numbers are subtracted?
	// 		 While the difference between the digits is less than 2, create a new random number and try again

	public static int getRandomNum() 
	{	int num = 0;
		int firstDigit = 0;
		int lastDigit = 0;

		// complete the method		
        while (Math.abs(lastDigit-firstDigit) < 2)
        {
            num = (int) (Math.random() * (999 - 1)) + 100;
            firstDigit = num / 100;
            lastDigit = num % 10;
        }

		return num;
	}

	// Steps 2 & 4) Reverse the digits of a number
	// Hint: to reverse a number without converting it to a String:
	//		Create a new variable to store the reversed number
	//		while the original number > 0.
	//		For each digit, multiply the new variable by 10 (to make room for the new digit). 
	//		Then, add the last digit (remember modulus?) to the new variable.
	//		Divide the original number by 10 to eliminate the last digit.
	//	        Ex: 584--> (0 x 10) + 4 = 4 ; 58--> (4 x 10) + 8 = 48; 5-->(48 x 10) + 5 = 485

	public static int reverseDigits (int num) {
	
		// complete the method
        int reversedNum = 0;
        
        while (num > 0)
        {
            reversedNum *= 10;
            reversedNum += (num % 10);
            num /= 10;
        }
        
        return reversedNum;    
	}
	
	// Step 7) Replace characters in a String according to the chart.
	// Hint: Loop through the String and "replace" the numbers with the corresponding letter.
	public static String replaceLtr(String str)
	{
		// complete the method	
			return "";
	}
	
	// Step 8) Reverse the letters in a String
	// Hint: start with an empty String variable 
	//		 Loop through the original word.   
	//		 Add one letter at a time to the new variable using concatenation and .substring().
	public static String reverseString(String str) {
		// complete the method
	}
		
	public static void main(String[] args) 
	{
//		1.	Generate a random 3-digit number so that the first and third digits differ by more than one.
		int num1 = getRandomNum();
//		2.	Reverse the digits to form a second number.

//		3.	Subtract the smaller number from the larger one.

//		4.	In the result you got in step 3, reverse the digits. Add it to that number.

//		5.	Multiply by one million.

//		6.	Subtract 733,361,573.

//		7.	Convert the number to a string to replace the numbers with letters.
// 				Ex: String str = String.valueOf(myNumber);
//			Then, replace each of the digits in your answer with the corresponding letter using the table in the instructions.

//		8.	Reverse the letters in the string to read your message backward.

	} // end main
} // end class
