package homework2;

import java.util.Arrays;

public class SomeNumbersAverage {
    public static void main(String[] args) {
        int numbersCount;
        double[] numbers;

        try {
            System.out.println("Enter the number of numbers : ");
            numbersCount = TwoNumbersAverage.in.nextInt();
            numbers = new double[numbersCount];
            System.out.println("Enter each number.");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = TwoNumbersAverage.in.nextDouble();
            }
            System.out.printf("Average = %.3f%n%n",Arrays.stream(numbers).average().getAsDouble() );
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Incorrect input. Use <,> as a separator.");
        }
    }

}
