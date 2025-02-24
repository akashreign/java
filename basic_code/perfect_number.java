public class perfect_number {
    public static void main(String[] args) {

        int num=28;
        int sum=0;
        System.out.println("the number divide 28 from 1 to 27 is :");
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {

                System.out.print(i+" ");
                sum=sum+i;
            }

        }
        System.out.println();
        System.out.println("sum :"+sum);
        if(sum==num)
        {
            System.out.println("perfect number");
        }
        else
        {
            System.out.println("not a perfect number");
        }


    }
}
