package homework3;

import java.util.Scanner;

public class PowerExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("x = ");
        int x = in.nextInt();
        System.out.println("n = ");
        int n = in.nextInt();
        System.out.println("Result = " + Math.pow(x,n));
    }
}
