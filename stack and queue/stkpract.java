public class stkpract{
    static public int stk[];
    static int top;

    stkpract(int length)
    {
        stk=new int[length];
        top=-1;

    }

    static void push(int ele)
    {
        if(top==stk.length-1)
        {
            System.out.println("stack overflow");
            return;
        }
        top++;
        stk[top]=ele;
        System.out.println("pushed element is :"+stk[top]);

    }

    static void pop()
    {
        if(top==-1)
        {
            System.out.println("empty stack");
            return;
        }
        int ele=stk[top];
        top--;
        System.out.println("popped element:"+ele);
    }

    static void display()
    {
        if(top==-1)
        {
            System.out.println("empty stack");
            return;
        }
        for(int i=0;i<=top;i++)
        {
            System.out.print(stk[i]+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        stkpract stp=new stkpract(8);
        stp.push(2);
        stp.push(4);
        stp.push(6);

        stp.display();
        stp.pop();
        stp.display();
    }





}
