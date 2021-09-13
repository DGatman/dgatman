package homework6;

import java.math.BigDecimal;
import java.util.Scanner;

public class DepositCalculatorToRefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада в банк в гривнах: ");
        int sum =sc.nextInt();
        System.out.print("Какой процент годовых? ");
        double percent = sc.nextDouble();
        System.out.print("Длительность вклада (лет): ");
        int term = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= term; i++) {
            double y = sum / 100 * percent;
            sum = (int)(sum + y);
            System.out.println("Накопленная сумма за " + i + (i % 10 == 1 ? " год" :
                    i % 10 == 2 || i % 10 == 3 || i % 10 == 4 ? " года"
                            : " лет") + " составила: " + String.format("%.2f",sum));
            System.out.println("Начисленные проценты в грн: " + String.format("%.2f",y));
        }
    }
}