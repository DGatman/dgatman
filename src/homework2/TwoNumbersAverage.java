package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class TwoNumbersAverage {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        double firstNumber,secondNumber;


        try {
            firstNumber = in.nextDouble();
            secondNumber = in.nextDouble();
            System.out.println("Average =" + (firstNumber + secondNumber) / 2);
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Incorrect number. Use <,> as a separator.");
        }



    }
}
