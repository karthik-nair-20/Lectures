import java.util.Arrays;

public class sortedMat {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr,6)));

    }
    //search in the row provided btw the columns provided.
    static int[] BinarySearch(int[][] arr ,int target,int row, int cStart, int cEnd)
    {
        while(cStart <= cEnd)
        {
            int mid = cStart +(cEnd- cStart)/2;
            if(arr[row][mid] == target)
            {
                return new int[]{row,mid};
            }
            else if(arr[row][mid] > target)
            {
                cEnd = mid-1;
            }
            else{
                cStart = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search (int[][] arr, int target)
    {
        int row = arr.length;
        int col = arr[0].length;
//if only one row
        if(row == 1) {
            return BinarySearch(arr, target, 0, 0, col - 1);
        }
//run the loop till 2 rows are remaining.
        //here we are eliminating the rows  we can also do column.
        int rStart=0;
        int rEnd = arr.length-1;
        int cMid = col/2; //taking the mid col.
        while(rStart < (rEnd-1)) //while this is true it will have more than 2 rows
        {
            int mid = rStart +(rEnd-rStart)/2;
            if(arr[mid][cMid] == target)
            {
                return new int[]{mid,cMid};
            }
            if(arr[mid][cMid] < target)
            {
                //ignore the above rows
                rStart =mid;
            }
            else {
                rEnd = mid;
            }
        }
        //now we have 2 rows
        //check whether the target is in the column of 2 rows
        if(arr[rStart][cMid] == target)
        {
            return new int[]{rStart,cMid};
        }
        if(arr[rStart+1][cMid] == target)
        {
            return new int[]{rStart+1,cMid};
        }
        //4 binary searchs

        //search in 1st half
        if(target <= arr[rStart][cMid-1])
        {
            return BinarySearch(arr,target,rStart,0,cMid-1);
        }
        //search in 2nd half
        if(target >= arr[rStart][cMid+1] && target <= arr[rStart][col-1])
        {
            return BinarySearch(arr,target,rStart,cMid+1,col-1);
        }
        //search in 3rd half
        if(target <= arr[rStart+1][cMid-1])
        {
            return BinarySearch(arr,target,rStart+1,0,cMid-1);
        }
        //search in 4th half
        if(target >= arr[rStart+1][cMid+1])
        {
            return BinarySearch(arr,target,rStart+1,cMid+1,col-1);
        }
        return new int[]{-1,-1};
    }
}
