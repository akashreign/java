public class arra_rotation {
    
    static void reverse(int arr[],int start,int end)
    {
        while(start<end)
        {
            int t=arr[start];
            arr[start]=arr[end];
            arr[end]=t;

            start++;
            end--;
        }

    }

    //for right shift

//    static void rotation(int arr[],int k)
//    {
//        k=k%arr.length;
//        reverse(arr,0,arr.length-1);
//        reverse(arr,0,k-1);
//        reverse(arr,k,arr.length-1);
//    }



    // for left shift
    static void rotation(int arr[],int k)
    {
        k=k%arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }



    public static void main(String[] args) {
        int arr[]={3,4,5,6,1,3,5};
        int k=2;
        rotation(arr,k);
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }



}
