package lesson2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    public MyArraySizeException(String s) {
        super(s);
    }

    public void printStackTrace() {
    }

}