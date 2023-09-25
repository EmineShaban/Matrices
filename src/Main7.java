import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] command = sc.nextLine().split(" ");
        int row = Integer.parseInt(command[0]);
        int col = Integer.parseInt(command[1]);
        int [][] matrix = new int [row][col];
        int n = 0;

        int num = 0;



        for (int i = 0; i < row; i++) {
            matrix[i] = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }




        for (int i = 0; i < row; i++) {
num+=matrix[i][n];
            n++;
            if(n >= row){
                break;
            }
         }
        System.out.println();
        n = 0;
        for (int i = row-1; i >= 0 ; i--) {
            num+=matrix[i][n];


            n++;
            if(n >= row){
                break;
            }
        }

        System.out.println(num);
    }
}

