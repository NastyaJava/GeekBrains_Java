package lesson2;

import java.io.EOFException;

public class Main {
    public static void main(String[] args){
        int sumElements = 0;
        String[][] array = {{"1", "2", "3", "4"},
                            {"1", "2", "3", "4"},
                            {"1", "2", "3", "4"},
                            {"1", "2", "3", "4"}};
        try{
            sumElements = strToIntAndSum( array );

            System.out.printf("Sum of array's elements is "+sumElements);
        }catch (MySizeArrayException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }
    }

    private static int strToIntAndSum(String[][] stringArray) throws MySizeArrayException, MyArrayDataException{
        int[][] intArray = new int[4][4];
        int sumElements = 0;

        if( stringArray.length != 4 ){
            throw new MySizeArrayException("Incorrect array size");
        }
        else{
            for( int i = 0; i < stringArray.length; i++ ){
                if(stringArray[i].length != 4 ){
                    throw new MySizeArrayException("Incorrect array size");
                }
            }
        }

        for( int i = 0; i < stringArray.length; i++ ){
            for( int j = 0; j < stringArray[i].length; j++ ){
                try{
                    intArray[i][j] = Integer.parseInt(stringArray[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Incorrect element "+stringArray[i][j]+": ["+i+";"+j+"]",i,j);
                }
                sumElements +=intArray[i][j];
            }
        }
        return sumElements;
    }
}
