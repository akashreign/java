import java.util.Scanner;

public class different_oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int oddcount=0;
        int evencount=0;

        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evencount++;
            }
            else
            {
                oddcount++;
            }
        }

        System.out.println(oddcount-evencount);


    }
}
