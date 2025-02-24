public class stock_sell {
    public static void main(String[] args) {
       int s[] = {7, 1, 5, 7, 6, 12};
       int max_profit=0;
       int buy=s[0];
       for(int i=1;i<s.length;i++)
       {
            if(buy>s[i])
            {
                buy=s[i];

            }
            else if(s[i]-buy>max_profit)
            {
                //  max_profit=s[i]-buy;
                  //   or
                max_profit=Math.max(s[i]-buy,max_profit);
            }
       }
        System.out.println(max_profit);
    }
}











//prices[] = {7, 1, 5, 3, 6, 4}
//        Output: 5
//        Explanation:
//        The lowest price of the stock is on the 2nd day, i.e. price = 1. Starting from the 2nd day, the highest price of the stock is witnessed on the 5th day, i.e. price = 6.
//        Therefore, maximum possible profit = 6 – 1 = 5.
//
//        Input: prices[] = {7, 6, 4, 3, 1}
//        Output: 0
//        Explanation: Since the array is in decreasing order, no possible way exists to solve the problem.