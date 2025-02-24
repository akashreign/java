abstract class abstractionn {

    abstract void run();
    abstract void lang();


}


class player1 extends abstractionn{

    void run()
    {
        System.out.println("run fast");
    }

    void lang(){
        System.out.println("speak hindi");
    }

}

class absmain{
    public static void main(String[] args) {
        player1 p=new player1();
        p.run();
        p.lang();
    }

}

