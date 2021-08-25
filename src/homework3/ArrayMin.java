package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size : ");
        int[] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number #" + i+1);
            array[i]= in.nextInt();
        }
        System.out.print("\nMin :\t");
        for (int i: array) {
            if (i == Arrays.stream(array).min().getAsInt()){
                System.out.print(i + ",");
            }
        }
        System.out.println("\t\tMax =\t" + Arrays.stream(array).max().getAsInt());
    }

}

