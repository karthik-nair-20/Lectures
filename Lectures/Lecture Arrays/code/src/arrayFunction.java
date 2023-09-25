import java.util.Arrays;

public class arrayFunction {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
     static void change(int[] num) {
        num[1] = 100;
    }
}

//this code is working because we are using non primitive type and they use pass by reference.
