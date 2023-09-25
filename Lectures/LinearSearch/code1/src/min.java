public class min {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};

        int ans= min(arr);
        System.out.println(ans);
    }

    static int min(int[] arr){
        int min = arr[0];
        for(int val: arr)
        {
            if(val < min)
            {
                min = val;
            }
        }
        return min;
    }
}
