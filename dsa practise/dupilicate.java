// find a single duplicate in array by pigenhole method
import java.lang.Math;
 class dupilicate1
{
    public static void main(String[] args) {
        int []a={2,5,1,4,5};
        int res=dupli(a);
        System.out.println(res);
    }
    static int dupli(int a[])
    {
        int ele,actualpos;
        for(int i=0;i<a.length;i++)
        {


            ele = Math.abs(a[i]);
            actualpos = ele - 1;
            if (a[actualpos] < 0)
            {
                return ele;
            }
            a[actualpos] = -1 * a[actualpos];
        }
        return -1;
    }



}
