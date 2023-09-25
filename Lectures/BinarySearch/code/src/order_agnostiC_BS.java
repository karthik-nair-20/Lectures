public class order_agnostiC_BS {
    public static void main(String[] args) {
        int[] arr = {98,97,86,67,2,1};
        int target=2;
        int ans = search(arr,target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target)
    {
        int start=0;
        int end = arr.length-1;

        //find whether the array is sorted in ascending or descending.
        boolean isAsec;
        if(arr[start]< arr[end])
        {
            isAsec = true;
        }
        else{
            isAsec  = false;
        }

        while(start <=end)
        {
            int mid = start +(end-start)/2;

            if(target == arr[mid])
            {
                return mid; //index
            }
            if(isAsec)
            {
                if(target > arr[mid])
                {
                    start = mid+1;
                }
                else
                {
                    end= mid-1;
                }

            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }
        return -1;

    }
}
