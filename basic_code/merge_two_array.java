import java.util.*;
public class merge_two_array {
    public static void main(String[] args) {

        int arr1[]={2,4,5,9,13,33};
        int arr2[]={3,1,1,2,4};

       // Arrays.sort(arr1);
        //Arrays.sort(arr2);

        int ma[]=new int[arr1.length+arr2.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                ma[k]=arr1[i];
                k++;
                i++;
            }
            else
            {
                ma[k]=arr2[j];
                k++;
                j++;
            }
        }

        while(i<arr1.length)
        {
            ma[k]=arr1[i];
            k++;
            i++;
        }

        while(j<arr2.length)
        {
            ma[k]=arr2[j];
            k++;
            j++;
        }
        Arrays.sort(ma);

        System.out.println(Arrays.toString(ma));
    }
}
