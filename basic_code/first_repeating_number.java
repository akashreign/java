//public class first_repeating_number {
//    public static void main(String[] args) {
//        int arr[]={3, 5, 0, 1, 10, 11, 11};
//
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[i]==arr[j])
//                {
//                    System.out.println(arr[i]);
//                    return;
//                }
//            }
//
//        }
//    }
//}


import java.util.HashSet;

public class first_repeating_number{
    public static void main(String[] args)
    {
        int arr[]={3, 5, 0, 1, 10, 11, 11};

        HashSet<Integer> set=new HashSet<>();
        for (int num : arr)
        {

            if (set.contains(num))
            {
                System.out.println(num);
                return;
            }

            else
            {
                set.add(num);
            }

        }

    }

}