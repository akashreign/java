import java.util.*;
public class mov__zer {
    public static void main(String args[])
    {
        // Write your code here.
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        arr.add(3);
        arr.add(0);
        arr.add(28);

        ArrayList<Integer> list=new ArrayList<>();
        for(int ele: arr)
        {
            if(ele!=0)
            {
                list.add(ele);
            }
        }
        for(int ele:arr)
        {
            if(ele==0)
            {
                list.add(ele);
            }
        }
        System.out.println(list);

    }
}

