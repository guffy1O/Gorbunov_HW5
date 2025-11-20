public class Swap {
    public static void swapElements(Object[] array, int firstIndex, int secondIndex) {
        if (firstIndex < 0 || firstIndex >= array.length ||
                secondIndex < 0 || secondIndex >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Выход за границу массива");
        }

        Object temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}