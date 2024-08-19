import java.util.Scanner;
    public class IT24100082Lab4Q2
{
        public static void main(String[] args)
        {
            //Creating an object for the Scanner to read
            Scanner input =  new Scanner(System.in);

            //Declare variables
            double examMark;
            double labMark;
            int examPerc;
            int labPerc;
            double finalMark;

            //Input Exam Marks
            System.out.print("Please enter exam marks (out of 100): ");
            examMark = input.nextDouble();

            //Validate Exam Marks
            if (examMark < 0 || examMark > 100)
            {
                System.out.print("Invalid input for exam marks. Terminating program");
                return; //Exit the program 
            }
            
            //Input Lab submission Marks
            System.out.print("Please enter lab submission marks (out of 100): ");
            labMark = input.nextDouble();

            
            //Validate Lab Marks
            if (labMark < 0 || labMark > 100)
            {
                System.out.print("Invalid input for exam marks. Terminating program");
                return; //Exit the program
            }

             
            //Input Exam and Lab Percentages
            System.out.print("Please enter the percentage given for the exam: ");
            examPerc = input.nextInt();
            System.out.print("Please enter the percentage given for the lab submission: ");
            labPerc = input.nextInt();
                
             
            //Validate Percentages
            if (examPerc + labPerc !=100)
            {
                System.out.print("The percentages must add up to 100. Terminating program.");
                return; // Exit the program
            }

            //Calculate the Final mark
            finalMark = ((examMark*examPerc)/100 )+((labMark*labPerc)/100 );
           
            //Output the Final mark
            System.out.println();
            System.out.print("Final Exam Mark is : " +finalMark);
            
        }

}

    

    

