import java.util.*;
public class collection_set {
    public static void main(String[] args) {

        Set<Integer> st=new HashSet<>();
        st.add(2);
        st.add(3);
        st.add(0);
        st.add(12);
        st.add(4);
        st.add(9);

        System.out.println(st);
        Collections.reverse((List<?>) st);
        System.out.println(st);

    }
}
