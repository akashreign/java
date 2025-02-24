public class maximum_sum {
    public static void main(String[] args) {
        int arr[]={2,9,31,-4,21,7};
        int msum=-99999;
        int k=3;
        for(int i=0;i<=arr.length-k;i++)
        {
            int csum=0;
            for(int j=i;j<i+k;j++)
            {
                csum=csum+arr[j];
            }
            msum=Math.max(csum,msum);

        }
        System.out.println(msum);
    }
}
