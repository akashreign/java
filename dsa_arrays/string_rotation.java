public class string_rotation {
    static void reverse(char s[],int start,int end)
    {
        while(start<end)
        {
            char element=s[start];
            s[start] = s[end];
            s[end]= element;

            start++;
            end--;
        }

    }

    static void rotate(char s[],int k)
    {

        k=k%s.length;
        reverse(s,0,s.length-1);
        reverse(s,0,k-1);
        reverse(s,k,s.length-1);
    }

    public static void main(String[] args)
    {
        String str="mynameisritesh";
        char []s=str.toCharArray();
        int k=3;
        String res="";
        rotate(s,k);
        for(char ele:s)
        {
            res=res+ele;
        }
        System.out.println(res);

    }


}
