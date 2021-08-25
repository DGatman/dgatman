package homework3;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i == 0 ? 1 : array[i - 1] + 2;
        System.out.print(i != array.length-1 ? array[i] + "," : array[i]);
        }
    }
}
