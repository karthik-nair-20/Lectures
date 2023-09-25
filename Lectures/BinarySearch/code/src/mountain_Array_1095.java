public class mountain_Array_1095 {
    public static void main(String[] args) {
        int[] arr = {1,5,10,15,12,11,9,3};
        int result =  search(arr,15,0,arr.length-1);
        System.out.println(result);
    }

    public int mountainSearch(int[] arr)
    {
        int peak = mountainArray(arr);
        int ascen = search(arr,15,0,peak);
        if(ascen != -1)
        {
            return ascen;
        }
        //search in descen array of mountain
        return search(arr, 15 , peak+1,arr.length-1);
    }

    //peak of mountain array
    public int mountainArray(int arr[])
    {
        int start =0;
        int end = arr.length-1;
        while(start < end)
        {
            int mid = start +(end-start)/2;
            if(arr[mid] < arr[mid +1]) //ascen
            {
                start = mid +1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    //order agnostic bs
    static int search(int[] arr, int target,int first, int last)
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
