import java.util.Arrays;

public class movenonzeroespract {
    public static void main(String[] args) {
        int []nums={0,1,0,3,12};
        int nonZeroIndex=0;
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, swap it with the element at nonZeroIndex
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;

                // Move the nonZeroIndex to the next position
                nonZeroIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
