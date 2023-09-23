import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] command = sc.nextLine().split(" ");
        int row = Integer.parseInt(command[0]);
        int col = Integer.parseInt(command[1]);
        int [][] matrix = new int [row][col];
        int [][] matrix1 = new int [row][col];
        int [][] result = new int[row][col];
        for (int i = 0; i < row; i++) {
            matrix[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        for (int i = 0; i < row; i++) {
            matrix1[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        for (int rows = 0; rows < row; rows++) {
            for (int cols = 0; cols < col; cols++) {
                 int num = matrix[rows][cols] + matrix1[rows][cols];
                result[rows][cols] = num;
//                System.out.println();

            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}