package homework3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + "\t*\t" + i + "\t=\t" + x * i);
        }
    }
}
