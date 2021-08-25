package homework3;

import java.util.Arrays;

public class ReplacingInArray {
    public static void main(String[] args) {
        int[] array ={12,43,532,5,63,2,3,5,432};
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min){
                array[i] = max;
            }
            else if (array[i] == max){
                array[i]=min;
            }
            System.out.print(array[i] + ",");
        }
    }
}
