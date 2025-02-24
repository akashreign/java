import java.util.Arrays;
class insertion{
    public static void main(String[] args) {
        int [] arr={2,1,5,4,0,7,3};
        int key;
        for(int i=1;i<arr.length;i++)
        {
            key=arr[i];
            int j=i-1;
            for(;(j>=0 && arr[j]>key);j--)
            {
                arr[j+1]=arr[j];

            }
            arr[j+1]=key;
            System.out.println(Arrays.toString(arr));

        }
//        System.out.println(Arrays.toString(arr));
    }
}
