import java.util.Random;
import java.util.Scanner;
public class Lottery {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random randomNumbers = new Random();
        int[] lottery = new int[5];
        int[] user = new int[5];
        for (int index = 0; index < lottery.length; index++)
        {
            lottery[index] = randomNumbers.nextInt(10); 
        }
        System.out.println("Enter 5 lottery digits");
        System.out.println();

        for(int index = 0; index < user.length; index++)
        {
            do
            {
                system.out.print("Enter Digit " + (index + 1) + ": ");
                input = keyboard.next();
                user[index] = checkDigit(input);

                if(user[index] == -1)
                {
                    System.out.println("Invalid digit. Enter 0 to 9");
                }
            } while(user[index] == -1);
        }
        for (int index = 0; index < lottery.length; index++)
        {
            System.out.print(lottery[index] + " ");
        }
        System.out.println();
        System.out.print("Your numbers:      ");

        for(int index = 0; index < user.length; index++)
        {
            System.out.print(user[index] + " ");
        }

        System.out.println();
        System.out.println("Matching digits: " + matches);
        if(matches == 5)
        {
            System.out.println("congrats! you are the grand prize winner!");
        }
        
    }

    public static int checkDigit(String input)
    {
        switch (input)
        {
            case "0":
                return 0;
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 5;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
                
                default:
                    return -1;

        }
    }
}