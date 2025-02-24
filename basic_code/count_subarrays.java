import java.util.ArrayList;

public class count_subarrays {
    public static void main(String[] args) {

        int arr[] = {1, 0, 0, 1, 0, 1, 1};
        int count=0;

        ArrayList<Integer>  list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]+arr[j]==1 || arr[i]+arr[j]==0)
                {
                    count++;
                    list.add(arr[i]);
                    list.add(arr[j]);
                    System.out.println(list);
                    list.clear();


                }
            }

        }
        System.out.println(count);
    }
}
