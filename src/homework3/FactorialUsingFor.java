package homework3;

import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 1;
        for (int n = in.nextInt(); n > 1; n--) {
            result *= n;
        }
        System.out.println("Result = " + result);
    }
}
