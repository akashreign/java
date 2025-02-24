import java.util.*;
public class duplicate1 {
    public static void main(String[] args) {
        int arr[]={8,2,1,1,3,5,3,8,8,2,1,7,9,2};
        ArrayList<Integer> duplicates = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                duplicateSet.add(num);
            }
        }

        duplicates.addAll(duplicateSet);
        if(duplicates.isEmpty())
        {
            System.out.println("-1");
        }
        else{
            Collections.sort(duplicates);
            System.out.println(duplicates);
        }


    }


}
