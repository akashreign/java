public class peak_ele {
    public static void main(String[] args) {
        int peak=0;
        int arr[]={5, 10, 20, 15};
        if(arr.length==1)
        {
            peak=arr[0];
        }
        else if(arr.length==2)
        {
            if(arr[0]>arr[1])
            {
                peak=arr[1];
            }
            peak=arr[0];
        }
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
            {
               peak=arr[i];

            }
            else if(arr[i]<arr[i+1])
            {
                peak=arr[i+1];
            }
        }
        System.out.println(peak);
    }


}


//
//Input: array[]= {5, 10, 20, 15}
//        Output: 20
//        Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
//
//        Input: array[] = {10, 20, 15, 2, 23, 90, 67}
//        Output: 20 or 90
//        Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.