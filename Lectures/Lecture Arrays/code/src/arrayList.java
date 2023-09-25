
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        1D ARRAYLIST
//        ArrayList<Integer> list = new ArrayList<>(10);
//
//        list.add(12);
//        list.add(24);
//        list.add(36);
//        System.out.println(list);


//        2D ARRAYLIST
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); //declaration  rn the element inside the arraylist is NULL

        //initialisation
        for(int i=0;i<3;i++)
        {
            list.add(new ArrayList<>());  //inner array Initialisation
        }

//        for(int[] arr: list){
//            for(int num: arr){
//
//            }

        //add element
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++)
            {
                list.get(i).add(in.nextInt());
            }
        }



    }
}
