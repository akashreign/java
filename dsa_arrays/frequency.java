import java.util.*;
public class frequency {
    public static void main(String[] args) {
        int arr[]={3,3,4,4,4,4,5,7,8,8,5,5,5,5,5,1};
        Arrays.sort(arr);
        int i=1;

        while(i<arr.length)
        {
            int f=1;
            while(i<arr.length && arr[i]==arr[i-1])
            {
                i++;
                f++;
            }
            System.out.println(arr[i-1]+" "+f);
            i++;

        }


    }
}
