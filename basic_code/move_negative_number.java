import java.util.*;
public class move_negative_number {
    public static void main(String[] args) {

        int arr[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int start=0;
       while(start<arr.length)
       {
           for (int i = 0; i < arr.length - 1; i++)
           {
               if (arr[i] > arr[i + 1])
               {
                   int temp = arr[i];
                   arr[i] = arr[i + 1];
                   arr[i + 1] = temp;
               }
           }
           start++;

       }
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }

    }
}
