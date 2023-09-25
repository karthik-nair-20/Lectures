/*
imp question 2d BS1
look at the end most element and check //40
3 cases.
return new int[]{row,col}; newARRAY AS OUTPUT
 */









import java.util.Arrays;

public class rowcolMat {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40}, //40 is where we start and do search
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr,37)));

    }

    static int[] search(int[][]matrix, int target)
    {
        int row=0;
        int col = matrix.length-1;
        while(row<matrix.length && col >= 0)
        {
            if(matrix[row][col] == target)
            {
                return new int[]{row,col};
            }
            if(matrix[row][col] > target)
            {
                col--;
            }
            if(matrix[row][col] < target){
                row++;
            }

        }
    return new int[]{-1,-1};
    }
}
