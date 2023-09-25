import java.util.Arrays;

public class swap {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        swap(arr);
        System.out.println(Arrays.toString(arr));
        swapIndex(arr , 3,7);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr)
    {
        int left = 0;
        int right = arr.length-1;
        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
//        System.out.println(Arrays.toString(arr));
    }

    static void  swapIndex(int[] arr, int a, int b)
    {
        int left = a;
        int right = b;
        while(a<b)
        {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}
