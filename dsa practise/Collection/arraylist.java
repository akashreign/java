import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        System.out.println(list);
        list.add(2,100);
        System.out.println(list);
    }
}
