public class max_window {
    public static void main(String[] args) {
        int arr[] = {2, 9, 31, -4, 21, 7};
        int k = 3;
        int wsum = 0;
        int msum = -99999;
        for (int i = 0; i < k ; i++)
        {
            wsum=wsum+arr[i];

        }
        for(int i=k;i<arr.length;i++)
        {
            wsum=wsum-arr[i-k]+arr[i];
            msum=Math.max(wsum,msum);
        }
        System.out.println(msum);
    }
}
