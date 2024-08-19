import java.util.Scanner;

public class IT24100082Lab4Q3 
{

		public static void main(String[]args) 
		{
		
		//Declare the variables 
		int number;
		String result;
		
		//Create a scanner object to read input
		Scanner input = new Scanner (System.in);
		
		//prompt the user to input data
		System.out.print("Enter a number: ");
		number= input.nextInt();
		
		//Determine whether the number is positive or negative
		result = (number > 0) ? "The number is: Positive": 
				 (number < 0) ? "The number is: Negative":
				 "The number is: Zero";
				 
		//Print the result
		System.out.println(result);
		
		}
}