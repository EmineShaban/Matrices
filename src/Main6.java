import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int row = Integer.parseInt(sc.nextLine());
         int [][] matrix = new int [row][row];
        int num = 0;



        for (int i = 0; i < row; i++) {
            matrix[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }


        for (int rows = 0; rows < row; rows++) {
            for (int cols = 0; cols < row; cols++) {


            }
        }

        for (int i = 0; i < row; i++) {

            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        for (int i = row-1; i >= 0 ; i--) {
            System.out.print(matrix[i][num] + " ");
            num++;
            if(num >= row){
                break;
            }
        }
    }
}

