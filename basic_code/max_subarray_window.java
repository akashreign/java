public class max_subarray_window {
    public static void main(String[] args) {
        int arr[]={2,4,8,9,1};
        int k=3;
        int maxsum=-9999;
        for(int i=0;i<arr.length-k;i++)
        {
            int sum=0;
            for(int j=i;j<i+k;j++)
            {
                sum=sum+arr[j];

            }
            maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum);
    }
}
