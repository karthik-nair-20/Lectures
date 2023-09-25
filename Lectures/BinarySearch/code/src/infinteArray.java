/*
do reverse binary search

//end = prev end * size if box *2
 */





public class infinteArray {

    public static void main(String[] args) {

        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(findingRange(arr,target));
    }

    static int findingRange(int[] arr,int target)
    {
        //start with size 2(box)
        int start=0;
        int end = 1;

//        condition for the target to lie in range
//       double the size when target is greater than end of(box1) then it means it lies behind ie:box2.
        while(target > arr[end])
        {
            int temp = end+1;
            //double the box size
//            end = end + sizeofbox1 *2;
            end = end + (end-start +1)*2; //1 is index start is beigned used
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target,int start, int end)
    {
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
