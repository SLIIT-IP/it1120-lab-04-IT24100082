import java.util.Scanner;

public class IT24100082Lab4Q1 
{

		public static void main(String[]args) 
		{
		
		//Declare the variables 
		int number;
		
		//Create a scanner object to read input
		Scanner input = new Scanner (System.in);
		
		//prompt the user to input data
		System.out.print("Enter a number: ");
		number= input.nextInt();
		
		//Determine whether the number is positive or negative
		if (number > 0){
			System.out.println("The number is: Positive");
		}
		else if (number < 0){
			System.out.println("The number is: Negative");
		}
		else {
			System.out.println("The number is: Zero");
		}
				
		
		}
}