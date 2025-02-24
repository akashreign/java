import java.util.*;
public class max_min_ele {
    public static void main(String[] args) {
        int arr[]={5,3,8,9,12,11,4,1};
        Arrays.sort(arr);
        System.out.println("min ->"+arr[0]+" max->"+arr[arr.length-1]);
    }
}
