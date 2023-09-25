public class searchRange {

    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int start = 1;
        int end =4;
        int target = 14 ;
        int ans = search(arr, start, end, target);
        System.out.println(ans);

    }

    static int search(int[] arr , int a , int b, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for (int i =a;i <=b;i++)
        {
            if(arr[i] == target )
            {
                return i;
            }
        }
        return -1;
    }
}
