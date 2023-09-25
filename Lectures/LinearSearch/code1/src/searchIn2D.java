import java.util.Arrays;

public class searchIn2D {
    public static void main(String[] args) {
        int[][] arr = //new int[][]
                {
                {23,4,1},
                {18,21,34},
                {35,67,94},
                {76,99,100}
        };
        int target = 100;
        int[] ans = search(arr,target); //format of return is (row,col);
        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));

    }
    static int[] search( int[][] arr, int target)
    {
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j] == target)
                {
                    return new int[]{i,j}; //so this is initialisation done differently.
                }
            }
        }
        return new int[] {-1,-1} ;
    }

    //max
    static int max( int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;

                }
            }
        }
        return max ;
    }
}
