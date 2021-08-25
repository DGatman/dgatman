package homework3;

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }while (i<=99);
    }
}
