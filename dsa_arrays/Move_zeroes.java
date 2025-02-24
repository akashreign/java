import java.util.*;
public class Move_zeroes
{
    public static void main(String[] args)
    {
        int []nums={0,1,4,5,6,0,0,0,4};
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                arr.add(nums[i]);

            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                arr.add(nums[i]);
            }
        }
        System.out.println(arr);

    }
}


