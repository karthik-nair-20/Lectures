import java.util.ArrayList;
import java.util.Scanner;

public class mutliAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0; i<4;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i=0; i<2;i++)
        {
            for(int j=0; j<2; j++)
            {
                list.get(i).add(in.nextInt());   //in a row{1} add col{1,2,3}.
            }
        }
        System.out.println(list);

    }
}
