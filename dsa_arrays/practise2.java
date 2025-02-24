import java.util.*;
public class practise2 {
    public static void main(String[] args) {
        String s1="aradhya";
        String s2="hradaya";

        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
