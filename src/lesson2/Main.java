package lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] strArr = {
                {"0", "1", "0", "0"},
                {"0", "0", "1", "0"},
                {"1", "0", "0", "2"},
                {"0", "0", "0", "1"}
        };

        try {
            try {
                int result = method(strArr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("размер превышен");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неверные данные");
            System.out.println("Ошибка в ячейке");
        }

    }


    public static int method(String[][] strArr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (strArr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < strArr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(strArr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("i, j");
                }
            }

        }
        return count;
    }

}