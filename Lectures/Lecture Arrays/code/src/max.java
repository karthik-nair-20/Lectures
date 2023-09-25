public class max {
    public static void main(String[] args) {

        int[] arr = {1,4,5,67,99};

        max(arr);
        maxInRange(arr , 1,3);
    }

    static void max(int[] arr) {
        int max = arr[0];

        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("the max is " + max);
    }


    static void maxInRange(int[] arr ,int a ,int b)
    {
        int max = arr[a];
        for(int i=a;i<=b;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("the max in range is " + max);
    }
}
