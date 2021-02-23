package lesson2;

public class MyArrayDataException extends IllegalArgumentException{
    int i;
    int j;

    MyArrayDataException(int i, int j){
        this.i = i;
        this.j = j;
    }

    MyArrayDataException(String message, int i, int j){
        super(message);
        this.i = i;
        this.j = j;
    }
}
