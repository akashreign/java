import java.util.ArrayList;
import java.util.HashSet;

public class union_two {
    public static void main(String[] args) {

        int arr1[] = {1, 3, 4, 5, 7};
        int  arr2[] = {2, 3, 5, 6};

        ArrayList<Integer>  arr=new ArrayList<>();
        HashSet<Integer>  set=new HashSet<>();

        for(int ele:arr1)
        {
            set.add(ele);
        }

        for(int ele:arr2)
        {
            set.add(ele);
        }

        System.out.println(set);



    }
}
