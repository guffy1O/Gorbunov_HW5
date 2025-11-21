import java.util.Arrays;

public class Main {

    public static void task1() {
        String[] numbers = {"0", "1", "2", "3", "4"};
        System.out.println("До перестановки: " + Arrays.toString(numbers));

        Swap.swapElements(numbers, 0, 3);

        System.out.println("После перестановки: " + Arrays.toString(numbers));
    }

    public static void task2() {
        Box<String> stringBox = new Box<>("Привет");
        Box<Integer> integerBox = new Box<>(10);
        Box<Float> floatBox = new Box<>(3.14f);

        double sum = calculateSum(integerBox.getItem(), floatBox.getItem());
        System.out.println("Общая сумма чисел: " + sum);
    }

    public static double calculateSum(Number... numbers) {
        double result = 0;
        for (Number num : numbers) {
            result += num.doubleValue();
        }
        return result;
    }

    public static void main(String[] args)
    {
        task1();
        task2();
    }
}