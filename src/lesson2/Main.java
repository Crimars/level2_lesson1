package lesson2;
/**
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить
 исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование
не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой
именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.
 */
public class Main {
    public static void main(String[] args) {
        String[][] strArr = {
                {"0", "1", "0", "0"},
                {"0", "7", "1", "0"},
                {"1", "0", "0", "5"},
                {"0", "0", "0", "4"},
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
            System.out.println("Неверные данные ");
            System.out.println("Ошибка в ячейке ");
        }

    }

    public static int method(String[][] strArr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (strArr.length != 4) {
            throw new MyArraySizeException("ошибка");
        }
        for (String[] strings : strArr) {
            if (strings.length != 4) {
                throw new MyArraySizeException("ошибка");
            }
            for (String string : strings) {
                try {
                    count = count + Integer.parseInt(string);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("i, j");
                }
            }

        }
        return count;
    }

}