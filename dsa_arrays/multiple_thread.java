 class multiple_thread extends Thread {

    public void run(){
        System.out.println("cooking");
        System.out.println("searching");
    }
}

class thread2 extends Thread{


    public void run(){

        while(true) {


            System.out.println("running");
            System.out.println("swimming");
        }
    }


}

class multi_thread{
    public static void main(String[] args) {
        multiple_thread mt=new multiple_thread();
        mt.start();

        thread2 tt=new thread2();
        tt.start();
    }


}