package homework3;

import java.util.Scanner;

public class FactorialUsingDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 1;
        int n = in.nextInt();
        do{
            result *= n;
            n--;
        }while (n>1);
        result = n == 0 ? 1 : result;
        System.out.println(result);
    }
}
