package homework3;

import java.util.Scanner;

public class FactorialUsingWhile {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 1;
        int n = in.nextInt();
        while (n>1){
            result *= n;
            n--;
        }
        System.out.println(result);
    }
}
