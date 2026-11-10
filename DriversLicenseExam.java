import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

public class DriversLicenseExam {
     public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        char[] correctAnswers = {
            'A', 'D', 'B', 'B', 'C',
            'B', 'A', 'B', 'C', 'D',
            'A', 'C', 'D', 'B', 'D',
            'C', 'C', 'A', 'D', 'B',
        };
        char[] studentAnswers = new char[20];
        int correct = 0;
        int incorrect = 0;
        String answer;

        for(int index = 0; index < studentAnswers.length; index++)
        {
            do
            {
                System.out.print("Enter answer for question " + (index + 1) + ": ");
                answer = keyboard.next();
                studentAnswers[index] = checkAnswer(answer);
                if(studentAnswers[index] == ' ')
                {
                    System.out.println("invalid answer. enter A, B, C or D");
                }                
            } while(studentAnswers[index] == '');
        }
        
        for(int index = 0; index < correctAnswers.length; index++)
        {
            if(studentAnswers[index] == correctAnswers[index])
            {
                correct++;
            }
            else
            {
                incorrect++;
            }
        }
         System.out.println();
         System.out.println("correct answers: " + correct);
         System.out.println("Incorrect answers: " + incorrect);

         if (correct >= 15)
         {
         System.out.println("Result: PASS");
         }
         else 
         {
            System.out.println("Results: FAIL");
         }
         System.out.println();
         System.out.println("Questions answered incorrectly:");
         for(int index = 0; index < correctAnswers.length; index++)
         {
            if(studentAnswers[index] != correctAnswers[index])
            {
                System.out.print((index +1) + " ");
            }
         }
         System.out.println();
     }

     public static char checkAnswer(String answer)
     {
        switch(answer)
        {
            case "A":
            case "a":
                return 'A';
            case "B":
            case "b":
                return 'B';
            case "C":
            case "c":
                return 'C';
            case "D":
            case "d":
                return 'D';
            default:
                return ' ';
        }
     }
}