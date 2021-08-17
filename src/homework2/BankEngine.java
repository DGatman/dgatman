package homework2;

public class BankEngine {
    public static void main(String[] args) {
        int deposit,duration;
        float percentage;

        try {
            System.out.println("How much many do you want to deposit?");
            deposit = (int) (TwoNumbersAverage.in.nextDouble() * 100);// 500,75 $ -> 50075 cents
            System.out.println(deposit);
            System.out.println("At what percentage do you want to deposit money?(Use <,> as a separator)");
            percentage = TwoNumbersAverage.in.nextFloat() / 100f;
            System.out.print("For how long do you want to put money?(years,integer)");
            duration = TwoNumbersAverage.in.nextInt();
            for (int i = 0; i < duration; i++) {
                System.out.println("Deposit :\t" + (float) deposit / 100 + "\t\t+ " + (float) Math.ceil(percentage * deposit) / 100);
                deposit += Math.ceil(percentage * deposit);
            }
            System.out.println("Final sum : " + (float) deposit / 100);
        }
        catch (java.util.InputMismatchException e ) {
            System.out.println("Incorrect values!");
        }
    }
}
