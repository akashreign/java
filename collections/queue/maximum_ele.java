package queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class maximum_ele {
    public static void main(String[] args) {
        int arr[]={35,10,1,20,90,5};
        PriorityQueue<Integer> prt=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            prt.offer(arr[i]);
        }

        // prt.poll();
        System.out.println("largest element is " +prt.poll());
        System.out.println("second largest element is "+prt.poll());

    }
}
