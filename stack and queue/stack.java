public class stack{

    static int stk[];
    static int top;

    stack(int length)
    {
        stk=new int[length];
        top=-1;
    }

    static  void push(int ele)
    {
        if(top==stk.length-1)
        {
            System.out.println("stack overflow");
        }
        top++;
        stk[top]=ele;
        System.out.println("pushed ele :"+stk[top]);
    }

    static void pop(){
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
        int ele=stk[top];
        top--;
        System.out.println("popped element is :"+ele);

    }

    static void display()
    {
        if(top==-1)
        {
            System.out.println("empty");
        }

        for(int i=0;i<=top;i++)
        {
            System.out.print(stk[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        stack stk = new stack(5);
        stk.push(4);
        stk.push(5);
        stk.push(6);

        stk.display();
        stk.pop();
        stk.display();

    }


}
