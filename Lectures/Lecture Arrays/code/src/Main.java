import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[3];
//        arr[0] = 1;
//        arr[2] = 3;
//        for (int i=0; i<arr.length;i++)
//        {
//            arr[i] = in.nextInt();
//        }
////        printing arrary method 1 USING FOR LOOP
//        for (int num: arr) //for each loop num is the elements in the array arr.
//        {
//            System.out.print(num + " ");
//        }

//        method 2
//        System.out.println(Arrays.toString(arr));

//        int[][] arr = new int[3][];

        int[][] arr = {
                {1,2,3,4,5},
                {2,34,5,5,4},
                {3,4985,493}
        };
        //OUTPUT OF 2D array
        for(int i=0;i<arr.length;i++)//row
        {
            for(int j =0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}