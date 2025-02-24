import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        Integer[] a=new Integer[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println(Arrays.asList(a));
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
        Integer[] arr = Arrays.asList(a).toArray(new Integer[0]);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }

    }
}
