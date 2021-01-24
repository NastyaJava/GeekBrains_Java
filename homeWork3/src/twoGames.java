
import java.util.Random;
import java.util.Scanner;

public class twoGames
{
    public static Random rn = new Random(10);
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args)
    {
        guessNumber();
    }

    public static void guessNumber()
    {
        int repeatGame = 0;
        int hiddenNumber;
        int answer;

        do {
            hiddenNumber = rn.nextInt();
            System.out.println("The computer guessed a number from 0 to 9. Let's try to solve it.");

            for( int i = 0; i < 3; i ++ )
            {
                System.out.println("Attempt " + (i + 1));
                answer = sc.nextInt();

                if( answer == hiddenNumber )
                {
                    System.out.println("Congratulations! You guessed!");
                    break;
                }
                else if( answer > hiddenNumber )
                {
                    System.out.println("You haven't guessed right :( Your number is greater than the intended number.");
                }
                else
                {
                    System.out.println("You haven't guessed right :( Your number is less than the intended number.");
                }

            }

            System.out.println("Want to play again? 0 - no, 1 - yes");
            repeatGame = sc.nextInt();

        } while ( repeatGame == 1 );

        sc.close();
    }
}
