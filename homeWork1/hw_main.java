public class hw_main
{
    public static void main( String[] args)
    {
        // primitive data types and their initialization are presented below (task №2)
        byte tmpByte = 1;
        short tmpShort = 2;
        int tmpInt = 3;
        long tmpLong = 4;

        float tmpFloat = 5.6f;
        double tmpDouble = 7.8;

        char tmpChar = 'a';

        boolean tmpBoolean = false;

        // task №3
        float a = 1.1f;
        float b = 2.2f;
        float c = 3.3f;
        float d = 4.4f;
        float result = formula( a, b, c, d );
        System.out.println(" Result: " + a + " * (" + b + " + (" + c + " / " + d + "))" + " = " + result);

        // task №4
        int num1 = 11;
        int num2 = 10;
        System.out.println("Is the sum of " + num1 + " and " + num2 + " between 10 and 20 inclusive? => " + checkSum( num1, num2 ));

        // task №5
        int checkedNumber = -1;
        numberSign( checkedNumber );

        // task №6
        System.out.println("is_negativeNumber( " + checkedNumber + " ) => " + is_negativeNumber( checkedNumber ) );

        // task №7
        String name = "Lily";
        greetingSmb( name );

        // task №8
        int year = 200;
        leapYear( year );



    }

    /**
     * Method that evaluates the expression a * (b + (c / d))
     * @param a,b,c,d
     * @return expression value
     */
    public static float formula( float a, float b, float c, float d )
    {
        return a * ( b + ( c / d ) );
    }

    /**
     * Method for checking the sum of two numbers
     * @return True if the sum is between 20 and 30, otherwise False
     */
    public static boolean checkSum( int num1, int num2 )
    {
        int sum = num1 + num2;
        if( sum >= 10 && sum <= 20 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Method that checks the sign of a number.
     * As a result, it outputs to the console: positive or negative.
     */
    public static void numberSign( int a )
    {
        if( a < 0)
        {
            System.out.println("Number " + a + " is negative.");
        }
        else
        {
            System.out.println("Number " + a + " is positive.");
        }
    }

    /**
     * @return true, if number is negative
     *         false, if otherwise
     */
    public static boolean is_negativeNumber( int number )
    {
        return number < 0;
    }

    public static void greetingSmb( String name )
    {
        System.out.printf("Привет, %s!\n", name);
    }

    /**
     * The function determines if the year is a leap year
     */
    public static void leapYear( int year )
    {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year!");
        } else {
            System.out.println("Simple year.");
        }
    }
}
