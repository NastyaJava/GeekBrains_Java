import java.util.Random;
import java.util.Scanner;

public class twoGames
{
        public static Random rn = new Random();
        public static Scanner sc = new Scanner(System.in);


        public static void main(String[] args)
        {
            int chosenGame;
            int repeatGame = 0;
            do {
                System.out.print("Choose the game you want to play:\n  1 - guess number\n  2 - guess word\n");

                while (!sc.hasNextInt()) {
                    System.out.println("You didn't enter a number. Please enter an integer.");
                    sc.nextLine();
                }
                chosenGame = sc.nextInt();

                switch (chosenGame) {
                    case 1:
                        guessNumber();
                        break;
                    case 2:
                        guessWord();
                        break;
                    default:
                        System.out.println("Please enter the number from the menu.");
                        repeatGame = 1;
                        continue;

                }
                System.out.println("Do you want to select the game again? 0 - no, 1 - yes");
                repeatGame = sc.nextInt();
            }while( repeatGame == 1 );

            sc.close();
        }

        public static void guessNumber()
        {
            int repeatGame = 0;
            int hiddenNumber;
            int answer;

            do {
                hiddenNumber = rn.nextInt(10);
                System.out.println("The computer guessed a number from 0 to 9. Let's try to solve it.");

                for( int i = 0; i < 3; i ++ )
                {
                    System.out.println("Attempt " + (i + 1));

                    while( !sc.hasNextInt() )
                    {
                        System.out.println("You didn't enter a number. Please enter an integer.");
                        sc.nextLine();
                    }
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
                System.out.println("Right number is " + hiddenNumber);
                System.out.println("Want to play again? 0 - no, 1 - yes");
                repeatGame = sc.nextInt();

            } while ( repeatGame == 1 );
        }

        public static void guessWord()
        {
            String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                              "avocado", "broccoli", "carrot", "cherry", "garlic",
                              "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                              "nut", "olive", "pea", "peanut", "pear", "pepper",
                              "pineapple", "pumpkin", "potato"};
            String hiddenWord = new String();
            String enteredWord = new String();
            int randomWordId;

            randomWordId = rn.nextInt(words.length);
            hiddenWord = words[randomWordId];

            do{
                System.out.println("Please enter a word:");
                enteredWord = sc.nextLine();

            }while( !is_true_word(hiddenWord, enteredWord) );
        }

        public static boolean is_true_word( String hiddenWord, String enteredWord )
        {
            if( hiddenWord.equals(enteredWord) )
            {
                System.out.println("Congratulations! You guessed!");
                return true;
            }
            else
            {
                printHint( hiddenWord, enteredWord );
                return false;
            }
        }

        public static void printHint( String wordA, String wordB )
        {
            char[] hint = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};

            for(int i = 0; i < Math.min(wordA.length(), wordB.length() ); i++ )
            {
                if( wordA.charAt(i) == wordB.charAt(i) ) {
                    hint[i] = wordA.charAt(i);
                }
            }
            System.out.println(hint);
        }
}


