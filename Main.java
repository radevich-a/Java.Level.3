import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String[] arrayToString = {"A", "B", "C", "D"};


        swap(arr1, 5,1);
        stringToList(arrayToString);

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();


        orangeBox.addFruit(new Orange(),10);
        appleBox1.addFruit(new Apple(),20);
        System.out.println("Mass orangeBox: " + orangeBox.getWeightBox());
        System.out.println("Mass appleBox1: " + appleBox1.getWeightBox());

        System.out.println("Mass orangeBox ?= Mass appleBox: " + orangeBox.compare(appleBox1));

        appleBox2.addFruit(new Apple(), 12);
        appleBox1.fillBoxToBox(appleBox2);
        System.out.println(String.format("Mass appleBox1 = %s, Mass appleBox2 = %s",
                appleBox1.getWeightBox(), appleBox2.getWeightBox()));
    }


    public static void swap(Object[] arr, int n1, int n2){
        System.out.println(Arrays.toString(arr));
        Object buf = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = buf;
        System.out.println("Swapping: " + Arrays.toString(arr));
    }


    public static <T> void stringToList(T[]arr){
        System.out.println(Arrays.toString(arr));
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Result: " + alt);
    }

}
