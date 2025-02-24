import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int arr[]={11,5,12,13,6};
        for(int j=0;j<arr.length;j++)
        {
            for (int i =j+1; i < arr.length; i++)
            {
                if (arr[j] > arr[i])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
