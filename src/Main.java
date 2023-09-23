import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] command = sc.nextLine().split(" ");
        int row = Integer.parseInt(command[0]);
        int col = Integer.parseInt(command[1]);
        int [][] matrix = new int [row][col];
        for (int i = 0; i < row; i++) {
            matrix[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        String [] command1 = sc.nextLine().split(" ");
        int row1 = Integer.parseInt(command1[0]);
        int col1 = Integer.parseInt(command1[1]);
        int [][] matrix1 = new int [row1][col1];
        for (int i = 0; i < row1; i++) {
            matrix1[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        if(col != col1 || row != row1){
            System.out.println("not equal");
            return;

        }
        for (int rows = 0; rows < row; rows++) {
            for (int cols = 0; cols < col; cols++) {
                if(matrix[rows][cols] != matrix1[rows][cols]){
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");

    }
}