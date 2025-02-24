public class optimize_window {
    public static void main(String[] args)
    {

        int arr[]={1, 3, 19, -3, 5, 3, 6, 7};
        int max=0;
        int k=3;
        for(int i=0;i<k;i++)
        {
            max=max+arr[i];
        }

        int max_sum=max;
        for(int i=k;i<arr.length;i++)
        {
            max=max-arr[i-k];
            max=max+arr[i];
        }
        max_sum=Math.max(max,max_sum);

        System.out.println(max_sum);
    }

}
