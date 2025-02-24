import java.util.*;

public class set {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(20);
        arr.add(30);
        for (Integer ele: arr) 
        {
            set.add(ele);                     
        }
        for(int a :set)
        {
               System.out.print(a);
               System.out.print(" ");
        }
         

    }
    
}
