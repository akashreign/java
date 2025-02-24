public class Mwsum {
    public static void main(String[] args) {

        int arr[]={3,2,5,8,9,1};
        int k=3;
        int wsum=0;
        int msum=-99999;

        for(int i=0;i<k;i++)
        {
            wsum=wsum+arr[i];

        }
        for(int i=k;i<arr.length;i++)
        {
            wsum=wsum+arr[i]-arr[i-k];

            msum=Math.max(wsum,msum);

        }

        System.out.println(msum);
    }
}
