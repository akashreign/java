import java.util.*;
class plus_one {
    public static void main(String[] args) {
        int []digits={1,3,9,5};

        ArrayList arr=new ArrayList();

        for(int i=0;i<digits.length;i++)
        {
            if(i==digits.length-1)
            {
                int sum=digits[i]+1;

                arr.add(sum);
            }
            else
            {
                arr.add(digits[i]);
            }


        }
        System.out.println(arr);
    }
}