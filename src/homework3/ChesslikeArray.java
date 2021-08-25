package homework3;

public class ChesslikeArray {
    public static void main(String[] args) {
        char[][] array = new char[8][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[j][i] = j % 2 != i % 2 ? 'B' : 'W';
                System.out.print(array[j][i] + "\t");
            }
            System.out.print("\n");
        }
    }
}
