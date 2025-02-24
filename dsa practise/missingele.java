import java.util.List;
import java.util.ArrayList;
public class missingele {
    public static void main(String[] args)
    {
        int []a={4,3,2,7,8,2,3,1};
      List<Integer> res= missing(a);
      System.out.println(res);

    }
    static  List<Integer> missing(int []a)
  {
         int i;
         cyclesort(a);
         List<Integer> mis=new ArrayList<>();
         for( i=0;i<a.length;i++)
         {
             if(a[i]!=i+1)
             {
                 mis.add(a[i]);
             }
         }
         return mis;


  }



    static void cyclesort(int []a){
        int index=0;
        while(index<a.length)
        {

            int actualpos = a[index] - 1;
            if( a[index]!=a[actualpos])
            {
                int temp=0;
                temp=a[index];
                a[index]=a[actualpos];
                a[actualpos]=temp;
            }
            else {
                index++;
            }
        }
    }


}

