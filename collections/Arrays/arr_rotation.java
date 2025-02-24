package Arrays;

// left shift
public class arr_rotation {
    public static void main(String[] args) {
        int arr[]={2,4,6,7,9};
        int start=0;
        int end=arr.length-1;

        int k=2;
        rotation(arr, k);
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }


    }
    static void rotation(int []arr,int k)
    {

        k=k%arr.length;

        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);

    }
    static void reverse(int []arr,int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

        }

    }
}
