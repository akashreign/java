package linked_list;

class node{
    int data;
    node next;

    node(int data){
        this.data=data;
    }
}


public class insert_front {


    node head=null;

    void insert_front(int data)
    {
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode;
        }
        newnode.next=head;
        newnode=head;

    }

    void insert_last(int val)
    {
        node newnode=new node(val);
        if(head==null);
        {
            head=newnode;
        }


    }


    void display()
    {
        node temp=head;

       while(temp!=null)
       {
           System.out.println(temp.data);

           temp=temp.next;
       }
    }


    public static void main(String[] args) {
        node a=new node(2);
        node b=new node(4);
        node c=new node(8);
        node d=new node(3);
        node e=new node(1);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        insert_front i=new insert_front();
        i.insert_front(4);
        i.insert_front(0);

        i.display();


    }






}



