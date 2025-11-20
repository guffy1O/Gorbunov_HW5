import java.util.Arrays;

public class Main {

    public static void swapElements(Object[] array, int firstIndex, int secondIndex) {
        if (firstIndex < 0 || firstIndex >= array.length ||
                secondIndex < 0 || secondIndex >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Выход за границу массива");
        }

        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }


    public static void main(String[] args) {
        String[] numbers = {"0", "1", "2", "3", "4"};
        System.out.println("До перестановки: " + Arrays.toString(numbers));

        swapElements(numbers, 0, 3);

        System.out.println("После перестановки: " + Arrays.toString(numbers)); // ["cherry", "banana", "apple"]
    }
}