import java.util.ArrayList;

public class intersection_two {
    public static void main(String[] args) {

        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
        ArrayList<Integer> arr=new ArrayList<>();





        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j< arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    arr.add(arr1[i]);

                }
            }

        }
        System.out.println(arr);


    }
}
