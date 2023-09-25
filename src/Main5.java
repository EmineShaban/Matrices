import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] command = sc.nextLine().split(" ");
        int row = Integer.parseInt(command[0]);
        int col = Integer.parseInt(command[1]);
        int [][] matrix = new int [row][col];


        int result = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < row; i++) {
            matrix[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }


        for (int rows = 0; rows < row -1; rows++) {
            for (int cols = 0; cols < col-1; cols++) {
                result = matrix[rows][cols] + matrix[rows][cols+1] + matrix[rows +1 ][cols] + matrix[rows +1 ][cols+1];
                arrayList.add(result);
//                System.out.println(result);

            }
        }
        int maximum = arrayList.get(0);

        for (int i = 0; i < arrayList.size(); i++) {
            if(maximum < arrayList.get(i)){
                maximum = arrayList.get(i);
            }
        }
        System.out.println(maximum);

        for (int rows = 0; rows < row -1; rows++) {
            for (int cols = 0; cols < col-1; cols++) {
                result = matrix[rows][cols] + matrix[rows][cols+1] + matrix[rows +1 ][cols] + matrix[rows +1 ][cols+1];
                if(maximum == result){
                    int matrix1 = matrix[rows][cols];
                    int matrix2 = matrix[rows][cols+1];
                    int matrix3 = matrix[rows +1 ][cols];
                    int matrix4 = matrix[rows +1 ][cols+1];
                    System.out.printf("%d %d%n", matrix1, matrix2);
                    System.out.printf("%d %d", matrix3, matrix4);


                }


            }
        }
    }
}