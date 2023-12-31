/*
floor: Greatest number in an array which is smaller than or equal to target.

START ANS END

E(f) !ans S

 */

public class floorS {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 10;
        System.out.println(floorS(arr,target));

    }
    public static int floorS(int[] arr, int target)
    {
        int start=0;
        int end= arr.length-1;

        while(start <= end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] > target)
            {
                end=  mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;

    }
}
