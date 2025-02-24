public class prime_number {
    public static void main(String[] args) {

        int n=47;
        boolean res=true;

        if(n<=1)
        {
            res=false;
        }

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                res=false;
                break;
            }

        }

        if(res)
        {
            System.out.println("prime number");

        }
        else
        {
            System.out.println("not a prime number");
        }


    }
}
