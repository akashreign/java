import java.util.*;
public class fir_occur_sub {
    public static void main(String args[]){
        String haystack="leetcode";
        String needle="leeto";
        LinkedList<Integer> ll=new LinkedList<>();
        for(int i=needle.length()-1;i>=0;i--)

        {
            for(int j=haystack.length()-1;j>=0;j--)

            {
                if(needle.charAt(i)==haystack.charAt(j))
                {
                    ll.add(j);
                }
            }
        }
        System.out.println(ll);
        int index=Collections.min(ll);
        System.out.println(index);

    }
}
