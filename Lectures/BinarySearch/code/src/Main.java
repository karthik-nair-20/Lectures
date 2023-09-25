// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target=2;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    //return the index
    //return -1 if not found
    static int binarySearch(int[] arr, int target)
    {
        int start =0;
        int end = arr.length-1;

        while(start <=end)
        {
//            int mid = (start+end)/2;
            int mid = start + (end-start)/2;
            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}