import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = Integer.parseInt(sc.nextLine());
        int col = Integer.parseInt(sc.nextLine());
        String [][] matrix = new String [row][col];
        String [][] matrix1 = new String[row][col];
        String [][] result = new String [row][col];
        for (int i = 0; i < row; i++) {
            matrix[i] = sc.nextLine().split(" ");
        }

        for (int i = 0; i < row; i++) {
            matrix1[i] = sc.nextLine().split(" ");
        }
        for (int rows = 0; rows < row; rows++) {
            for (int cols = 0; cols < col; cols++) {
                if(matrix[rows][cols].equals(matrix1[rows][cols])){
                     result[rows][cols] = matrix[rows][cols];

                }else{
                     result[rows][cols] = "*";

                }
//                System.out.println();

            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}