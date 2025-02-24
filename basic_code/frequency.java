import  java.util.*;
public class frequency {
    public static void main(String[] args) {

        int arr[]={1,1,1,1,3,3,7,7,7,7,4,4,9,1,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count=1;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]==arr[i] )

            {
                count++;
            }

            else

            {

                System.out.println(arr[i-1]+" --> "+count);
                count=1;
            }

        }
        System.out.println(arr[arr.length-1]+" --> "+count);
    }
}
