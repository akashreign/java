import java.util.ArrayList;

public class move_zero_last {
    public static void main(String[] args) {
        int arr[]={1,0,0, 5, 7,0, -1,0};
        int start=0;
        while(start<arr.length)
        {
            for (int i = 0; i < arr.length-1; i++)
            {
                if (arr[i] == 0)
                {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            start++;
        }
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }

    }
}
