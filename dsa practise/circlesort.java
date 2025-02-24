import java.util.Arrays;
public class circlesort {
    public static void main(String[] args) {
        int ind=0;
        int [] a={1,4,3,5,7,2,6};
        while(ind<a.length)
        {
            int actualpos=a[ind]-1;
            if(a[ind]!=a[actualpos] && a[ind]<a.length)
            {
                int temp=0;
                temp=a[ind];
                a[ind]=a[actualpos];
                a[actualpos]=temp;
            }
            else
            {
                ind++;
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
