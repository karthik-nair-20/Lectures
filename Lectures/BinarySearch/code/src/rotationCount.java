public class rotationCount {
    public static void main(String[] args) {

        int[] arr = {5,6,7,8,9,0,1,2,3};
        int pivit = findPivot(arr);
        System.out.println("Number of rotation is:" + countRotations(arr));

    }
    public static int countRotations(int[] arr)
    {
        int pivot = findPivot(arr);
        if(pivot == -1 )
        {
            return 0;
        }
        return pivot+1;
    }
    static int  findPivot(int[] arr)
    {
        int start=0;
        int end = arr.length-1;
        int mid = start +(end-start)/2;
        //4 cases
        while(start <= end) {
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
            return -1;
    }
}
