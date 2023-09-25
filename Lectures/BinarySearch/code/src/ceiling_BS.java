
/*
1.Ceiling: Smallest element in the array which is greater than or equal to target;

2.S ANS E

3. E !ANS (S)ceiling

 */
public class ceiling_BS {
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int target=15;
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
        return start;
    }
}