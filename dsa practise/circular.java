// Write a program to shift every element of an array to circularly

import java.util.Arrays;
import java.util.Collections;
class circular{
    public static void main(String[] args) {
        int[] a={1,3,5,2,9,0,3};
        int t=a[a.length-1];
        for(int i=a.length-1;i>=1;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=t;
        System.out.println(Arrays.toString(a));

    }
}
