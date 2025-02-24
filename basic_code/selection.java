import java.util.Arrays;

public class selection {

    public static void main(String[] args) {

        int arr[]={64,25,12,22,11};
        int j=0;

        while(j<arr.length-1)
        {

            for (int i = 0; i < arr.length-1; i++)
            {

                if (arr[i] > arr[i + 1])

                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

                System.out.println(Arrays.toString(arr));
            }

            j++;
        }

    }
}
