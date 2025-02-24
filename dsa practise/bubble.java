import java.util.Arrays;
 class bubble {
    public static void main(String[] args) {
        int[] ar={1,3,2,0,5,8};
        int min;
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]>ar[j])
                {
                    int temp=0;
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
            System.out.println(Arrays.toString(ar));
        }
//        System.out.println(Arrays.toString(ar));
    }

}
