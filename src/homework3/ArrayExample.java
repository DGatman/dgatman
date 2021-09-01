package homework3;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 2;
        System.out.print(i != array.length-1 ? array[i] + "," : array[i]);
        }
    }
}
