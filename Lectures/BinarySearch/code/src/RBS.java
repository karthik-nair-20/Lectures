public class RBS {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //if you did not found pivot means array is not rotated.
//        so do normal bs
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        //if pivot is found means the array is rotated  ans two ascen sorted array is present.
        //now use the approach ie check in first half if not found check in second half

        //3 cases
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }


    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            //4 cases of RBS
            int mid = start + (end - start) / 2;
            // case1 imagine mid is last index....so mid+1 will give error.
            if (mid < end && arr[mid] > arr[mid + 1]) {
                ans = arr[mid];
                return mid;
            }
            //case2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                ans = arr[mid - 1];
                return mid - 1;
            }
            //case3
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            //case4
            else {
                start = mid + 1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end)
    {
//        int start =0;
//        int end = arr.length-1;

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
