import java.util.ArrayList;
import java.util.List;
public class removeele {
    public static void main(String[] args) {
        int[] a = {4, 4, 2, 8, 4, 2, 3, 1};
        List<Integer> res = remove(a);
        System.out.println(res);

    }
      static  List<Integer> remove(int a[])
        {
            int pos=4;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                if (a[i] != pos) {
                    list.add(a[i]);
                }
            }
            return list;
        }

}
