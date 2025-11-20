import java.util.Arrays;

public class Main {

    public static void task1() {
        String[] numbers = {"0", "1", "2", "3", "4"};
        System.out.println("До перестановки: " + Arrays.toString(numbers));

        Swap.swapElements(numbers, 0, 3);

        System.out.println("После перестановки: " + Arrays.toString(numbers));
    }

    public static void main(String[] args)
    {
        task1();
    }
}