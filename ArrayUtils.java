public final class ArrayUtils {
    private static final int EMPTY_INDEX = -1;
    private ArrayUtils(){}

    public static int[] findElementsAfterDigit(int[] numbers, int digit){
        if (numbers == null || numbers.length == 0){
            throw new NullPointerException("Array cannot be null nor empty");
        }

        int idx = EMPTY_INDEX;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == digit){
                idx = i + 1;
            }
        }
        if (idx == EMPTY_INDEX){
            throw new RuntimeException("Array does not contain any digit like: " + digit);
        }
        int size = numbers.length - idx;
        int[] foundValues = new int[size];
        System.arraycopy(numbers,idx,foundValues,0,size);
        return foundValues;

    }

    public static boolean Only1And4(int[] arr) {
        boolean i1 = false, i4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) i1 = true;
            else if (arr[i] == 4) i4 = true;
            else return false;
        }
        return i1 && i4;
    }
}
