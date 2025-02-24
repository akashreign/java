import java.util.*;
public class key_pair {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int arr[] = {1, -2, 1, 0, 5};
        int tar=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==tar)
                {
                    list.add(arr[i]);
                    list.add(arr[j]);
                    System.out.println("true");
                    System.out.println(list);
                    return;
                }
            }

        }
        System.out.println("false");


    }


















}
//    Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x.
//
//        Examples:
//
//        Input: arr[] = {0, -1, 2, -3, 1}, x= -2
//        Output: Yes
//        Explanation:  If we calculate the sum of the output,1 + (-3) = -2