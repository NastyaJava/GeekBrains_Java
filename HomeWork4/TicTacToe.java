import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static Scanner sc = new Scanner( System.in );
    static Random rn = new Random();
    static int fieldSize;
    static int winningScore;
    static final char varX = 'X';
    static final char var0 = '0';
    static final char varEmpty = '*';

    public static void main( String[] args ){
        char[][] playingField;

        System.out.println("Введите размер поля:");
        fieldSize = sc.nextInt();
        System.out.println("Введите необходимое количество фишек в ряд для победы:");
        winningScore = sc.nextInt();

        playingField = new char[fieldSize][fieldSize];
        initPlayingField( playingField );
        printGame( playingField );

        do{
            stepOfVarX( playingField );
            if( isWin( playingField, varX ) || isDeadHeat( playingField ) ){
                break;
            }

            stepOfVar0( playingField );
            if( isWin( playingField, var0 ) ){
                break;
            }

        }while( !isDeadHeat(playingField) );

    }

    public static void initPlayingField( char[][] field ){
        for( int i = 0; i < fieldSize; i++ ){
            for( int j = 0; j < fieldSize; j++ ){
                field[j][i] = varEmpty;
            }
        }
    }

    public static void printGame( char[][] game ){
        for( int i = 0; i < fieldSize; i++ ){
            for( int j = 0; j < fieldSize; j++ ){
                System.out.print( game[j][i] );
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static boolean isDeadHeat( char[][] field ){
        for( int i = 0; i < fieldSize; i++ ) {
            for (int j = 0; j < fieldSize; j++) {
                if( field[j][i] == varEmpty ){
                    return false;
                }
            }
        }
        System.out.println("Dead heat!");
        return  true;
    }

    public static void stepOfVarX( char[][] field ){
        int x;
        int y;

        System.out.println("Enter the coordinates of X[x;y]:");
        do{
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }while( !isCorrectVar( field, x, y ));

        field[y][x] = varX;
        printGame(field);
    }

    public static boolean isCorrectVar( char[][] field, int x, int y ){
        if( x > fieldSize - 1 || x < 0 ){
            System.out.println("Please enter coordinates within [1;"+fieldSize+"]");
            return false;
        }
        else if( y > fieldSize - 1 || y < 0 ){
            System.out.println("Please enter coordinates within [1;"+fieldSize+"]");
            return false;
        }
        else if( field[y][x] != varEmpty ){
            System.out.println("This field is taken, please enter other coordinates.");
            return false;
        }
        else{
            return true;
        }
    }

    public static void stepOfVar0(char[][] field){
        int x = 0;
        int y = 0;

        System.out.println("Computer step:");
        x = check(field)[0];
        y = check(field)[1];

        System.out.println("[x;y] = ["+(x+1)+";"+(y+1)+"]");
        field[y][x] = var0;
        printGame(field);
    }

    public static int[] check(char[][] field ){
        int score = 0;
        int maxScore = 0;
        int[] mas = new int[2];

        for( int i = 0; i < fieldSize; i++ ) {
            for (int j = 0; j < fieldSize; j++) {
                if( field[i][j] == varEmpty ) {
                    score = calculateScore(field, i, j);
                    if( maxScore < score )
                    {
                        maxScore = score;
                        mas[0] = j;
                        mas[1] = i;
                    }
                }
            }
        }
        return mas;
    }

    public static int calculateScore( char[][] field, int i, int j )
    {
        int sumVer = 0;
        int sumGor = 0;
        int sumDiag1 = 0;
        int sumDiag2 = 0;

        for(int a = 0; a < fieldSize; a++ )
        {
            if( field[i][a] == var0 ){
                sumVer++;
            }
            else if( field[i][a] == varX ){
                sumVer--;
            }
            if( field[a][j] == var0 ){
                sumGor++;
            }
            else if( field[a][j] == varX ){
                sumGor--;
            }
            if( i == j && field[a][a] == var0 )
            {
                sumDiag1++;
            }
            else if( i == j && field[a][a] == varX ){
                sumDiag1--;
            }
            if( i + j == fieldSize - 1 && field[a][fieldSize-a-1] == var0 )
            {
                sumDiag2++;
            }
            else if( i + j == fieldSize - 1 && field[a][fieldSize-a-1] == varX ){
                sumDiag2--;
            }
        }
        return  Math.max(Math.max(Math.abs(sumVer),Math.abs(sumDiag1)),Math.max(Math.abs(sumGor),Math.abs(sumDiag2)));
    }

    public static boolean isWin( char[][] field, char var ){
        int sumGoriz = 0;
        int sumVertic = 0;
        int sumDiag1 = 0;
        int sumDiag2 = 0;
        for( int i = 0; i < fieldSize; i ++ ){
            sumGoriz = 0;
            sumVertic = 0;
            for( int j = 0; j < fieldSize; j ++ ){
                if( field[i][j] == var ){
                    sumGoriz++;
                }
                else{
                    sumGoriz = 0;
                }
                if( field[j][i] == var ){
                    sumVertic++;
                }
                else{
                    sumVertic = 0;
                }
                if( i == j && field[j][i] == var )
                {
                    sumDiag1++;
                }
                else{
                    sumDiag1 = 0;
                }
                if( i + j == fieldSize - 1 && field[j][i] == var )
                {
                    sumDiag2++;
                }
                else{
                    sumDiag2 = 0;
                }
            }
            if( sumGoriz >= winningScore || sumVertic >= winningScore ||
                sumDiag1 >= winningScore || sumDiag2 >= winningScore )
            {
                System.out.println("Congratulation! Winner - "+var);
                return true;
            }
        }
        return  false;
    }
}
