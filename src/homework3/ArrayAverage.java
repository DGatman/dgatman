package homework3;

import java.util.Arrays;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] array ={231,42,432,432,234,2,3,3};
        System.out.println("Average :\t" + Arrays.stream(array).average().getAsDouble());
    }
}
