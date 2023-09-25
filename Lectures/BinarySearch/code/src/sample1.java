import java.util.Arrays;

public class sample1 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int[] ans = new int[2];
        ans[0] = sample(arr,target,true);
        ans[1] = sample(arr,target,false);
        System.out.println(Arrays.toString(ans));
    }

    public static int sample(int[] arr, int target, boolean startIndex) {
        //5,7,7,7,7,8,8,10
        int start = 0;
        int end = arr.length - 1;
        int ans=0;

            int mid = start + (end - start) / 2;
            if(mid > start && startIndex)
            {
                ans = binarySearch(arr,target,start,mid-1);

            }
            else if(mid < end && !startIndex){
                ans = binarySearch(arr,target,mid+1,end);
            }
            else {
                return mid;
            }

        return ans;
    }

    static int binarySearch(int[] arr, int target,int start, int end) {

        while (start <= end) {
//            int mid = (start+end)/2;
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}