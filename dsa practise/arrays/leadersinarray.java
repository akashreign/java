import java.util.*;
public class leadersinarray {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int  arr[]= {16,17,4,3,17,5,2};

        int j;
        for(int i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]<=arr[j])
                {
                    break;
                }
            }
            if(j==arr.length)
            {
                list.add(arr[i]);
            }


        }
      //  Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


    }
}
