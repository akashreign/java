import java.util.*;
public class armstrong_num {
    public static void main(String[] args)
    {

        int num;
        int digit;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        while(num!=0)
        {
           digit=num%10;
           sum=sum+(digit * digit * digit);

           num=num/10;


        }
        System.out.println(sum);

        if(sum==num)
        {
            System.out.println("true");
        }


    }
}
