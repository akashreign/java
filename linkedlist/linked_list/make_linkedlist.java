package linked_list;

public class make_linkedlist {
    public static class  node{
        int data;
        node next;

        node(int data)
        {
            this.data=data;
        }

    }

    public static void main(String[] args) {

        node a=new node(2);
        node b=new node(3);
        node c=new node(5);
        node d=new node(1);

        a.next=b;   //2->3
        b.next=c;   //2->3->5
        c.next=d;   //2->3->5->1

        System.out.println(a.next);      //address of b
        System.out.println(b);           //address of b


    }


}
