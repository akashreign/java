import java.util.*;
public class freqpractise {
    public static void main(String[] args) {
        int arr[]={1,6,3,7,3,3,7,1};
        Arrays.sort(arr);
        int i=1;
        int fre=1;
        while(i<arr.length)
        {
            while (i < arr.length && arr[i] == arr[i - 1])
            {
                fre++;
                i++;

            }
            System.out.println(arr[i - 1] + " "+fre);
            fre = 1;
            i++;
        }
    }
}
