public class practise1 {
    public static void main(String[] args) {
        int []arr={9,3,8,8,9,0};
        int k=2;
        int csum=0;
        int msum=-9999;
        for(int i=0;i<=arr.length-k;i++)
        {
            csum=0;
            for(int j=i;j<i+k;j++)
            {
                csum=csum+arr[j];
            }
            msum=Math.max(csum,msum);

        }
        System.out.println(msum);

    }
}
