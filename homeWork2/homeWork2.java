import java.util.Arrays;

import static java.lang.Math.abs;

public class homeWork2
{
    public static void main( String[] args )
    {
        int i;

        //task 1
        System.out.println("Task 1");

        int[] integer_array = { 1, 0, 1, 0 , 0, 0, 1, 1 };

        System.out.print("Before:");
        System.out.println( Arrays.toString(integer_array) );
        for( i = 0; i < integer_array.length; i++ )
        {
            if( integer_array[i] == 0 )
                integer_array[i] = 1;
            else
                integer_array[i] = 0;
        }
        System.out.print("After: ");
        System.out.println( Arrays.toString(integer_array) );

        //task 2
        System.out.println("Task 2");

        int[] array_task2 = new int[8];

        for( i = 0; i < array_task2.length; i++ )
        {
            array_task2[i] = i * 3;
        }
        System.out.print("Filled array: ");
        System.out.println( Arrays.toString(array_task2) );

        //task 3
        System.out.println("Task 3");

        int[] array_task3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for( i = 0; i < array_task3.length; i++ )
        {
            if( array_task3[i] < 6 )
                array_task3[i] *= 2;
        }
        System.out.println( Arrays.toString(array_task3) );

        //task 4
        System.out.println("Task 4");

        int n = 5;

        int[][] square_array = new int[n][n];

        for( i = 0; i < n; i++ )
        {
            for( int j = 0; j < square_array[i].length; j++ )
            {
                if( (i == j) || (i + j == square_array.length - 1) ) square_array[i][j] = 1;
            }
            System.out.println( Arrays.toString(square_array[i]) );
        }

        //task 5
        System.out.println("Task 5");
         int max_value = 0;
         int min_value = 0;
         int[] array_task5 = { 1, 3, 5, 7, 9, 8, 6, 4, 2 };

         for(i = 0; i < array_task5.length; i++ )
         {
             if( min_value > array_task5[i] )
             {
                 min_value = array_task5[i];
             }
             if( max_value < array_task5[i] )
             {
                 max_value = array_task5[i];
             }
         }
         System.out.print("Array:");
         System.out.println(Arrays.toString(array_task5));
         System.out.printf("Max value: %d \nMin value: %d\n", max_value, min_value );

        //task 6
        System.out.println("Task 6");
        int[] array_task6 = { 1, 1, 1, 2, 1 };
        System.out.println(checkBalance(array_task6));

        //task 7
        System.out.println("Task 7");

        int[] arr = {1,2,3,4,5};
        int shift = 2;
        System.out.println(Arrays.toString(arr));
        arrayShift(arr, shift);
        System.out.println(Arrays.toString(arr));


    }

    public static boolean checkBalance( int[] array )
    {
        for( int i = 1; i < array.length; i++ )
        {
            if( sum_array(array, 0, i) == sum_array(array, i, array.length) )
                return true;
        }
        return false;
    }

    public static int sum_array( int[] array, int from, int to )
    {
        int sum_result = 0;
        for( int i = from; i < to; i++ )
        {
            sum_result += array[i];
        }
        return sum_result;
    }

    public static void arrayShift( int[] arr, int n )
    {
        int a;
        for( int i = 0; i < abs(n); i++ )
        {
            if( n > 0)
            {
                for (int j = arr.length - 1; j > 0; j--)
                {
                    a = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = a;
                }
            }
            else
            {
                for (int j = 0; j < arr.length - 1; j++)
                {
                    a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
    }

}
