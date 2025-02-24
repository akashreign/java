import java.util.*;

public class max_occcur {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 4, 4, 4, 2, 1, 1};
        int ele = arr[0];
        int count = 1;

        // Find the element with the maximum occurrences
        for (int i = 1; i < arr.length; i++) {
            if (ele == arr[i]) {
                count++;
            } else if (count == 0) {
                ele = arr[i];
                count = 1;
            } else {
                count--;
            }
        }
        System.out.println(ele);
    }
}
