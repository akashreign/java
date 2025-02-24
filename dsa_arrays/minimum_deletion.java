import java.util.ArrayList;
import java.util.Arrays;

public class minimum_deletion {

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();

        int[] nums={3,2,1,4,6,0,5,3};
        for(int ele:nums)
        {
            arr.add(ele);
        }

        Arrays.sort(nums);

        int min=nums[0];
        int max=nums[nums.length-1];

        System.out.println(min);
        System.out.println(max);

        int micount=0;
        int macount=0;

        System.out.println(arr);


        for(int val:arr)
        {
            if(val==min)
            {

                break;

            }
            else
            {
                micount++;

            }


        }
        System.out.println(micount+1);

    }
}
