public class buy_sell {
    public static void main(String[] args) {

        int arr[]={2,4,1,3,7,3,1};

        int max_profit=0;
        int buy=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(buy<arr[i])
            {
                buy=arr[i];
            }

            else if(max_profit<buy-arr[i])
            {
                max_profit=buy-arr[i];


            }

        }
        System.out.println(max_profit);

    }
}
