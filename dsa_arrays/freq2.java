import java.util.*;
public class freq2 {
    public static void main(String[] args) {
        int arr[]={1,6,3,6,9,3,3};
        Arrays.sort(arr);
        int i,j;

        for(i=0;i<arr.length;i++)
        {
            int freq=1;
            for( j=i+1;j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                    freq++;
                }
                else
                {
                    break;
                }
            }
            i=j-1;
            System.out.println(arr[i]+"-->"+freq);
        }

    }
}
