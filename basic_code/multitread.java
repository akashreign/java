class thread1 extends Thread{

    public void run()
    {
        while(true)
        {
            System.out.println("thread 1 is running");
            System.out.println("thread 1 is cooking");
        }

    }

}

class thread2 extends Thread{

    public void run()
    {
        while(true)
        {
            System.out.println("thread 2 is running");
            System.out.println("thread 2 is cooking");
        }


    }
}

public class multitread {

    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();

        t1.start();
        t2.start();
    }

}
