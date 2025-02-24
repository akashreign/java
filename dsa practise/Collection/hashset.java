import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();

        set.add(30);
        set.add(40);
        set.add(45);
        set.add(60);
        set.add(40);
        set.add(60);
        System.out.println(set);
        System.out.println("remove 60 from the set");
        set.remove(60);
        System.out.println(set);
        set1.add(20);
        set1.add(23);
        set1.add(25);
        set1.add(28);
        System.out.println("element in 2nd set");
        System.out.println(set1);
        set.addAll(set1);
        System.out.println(set);
        System.out.println(set1.toString());
        System.out.println(set.to);









    }
}
