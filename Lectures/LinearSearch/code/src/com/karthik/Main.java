package com.karthik;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

        int[] nums = {1,2,3,6,17,-1,65,78};
        int target = 65;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }
//search in array
     static int linearSearch(int[] arr , int target){
        if(arr.length == 0){
            return -1;
        }

        //loop
        for(int index=0; index< arr.length;index++)
        {
            if(arr[index] == target)
            {
                return index;
            }
        }

        //this line will return no match found
        return -1;
    }
}