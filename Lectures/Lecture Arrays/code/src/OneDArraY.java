import java.util.Arrays;
import java.util.Scanner;

public class OneDArraY {

//    input output of integer and string in 1d array

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] arr = new int[5];
//
//        for(int i=0; i<arr.length;i++)
//        {
////            in.nextInt();
//            arr[i] = in.nextInt();
//        }
////
//          for(int num:arr){
//         System.out.print(num + " ");
//      }
//
//      System.out.println(Arrays.toString(arr));



        String[] str = new String[5];

        for(int i=0; i<str.length;i++)
        {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "kunal"; //modify

        System.out.println(Arrays.toString(str));
    }
}
