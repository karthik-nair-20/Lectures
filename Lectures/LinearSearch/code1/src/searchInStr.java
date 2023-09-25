import java.util.Arrays;

public class searchInStr {
    public static void main(String[] args) {
        String name = "karthik";
        char target = 'h';
        boolean ans = search(name, target);
        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()));


    }

    public static boolean search(String str, char a)
    {
        if(str.isEmpty())
        {
            return false;
        }
        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i) == a)
            {
                return true;
            }
        }

        return false;
    }
}
