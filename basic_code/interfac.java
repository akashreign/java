interface interfac {

    void run();
    void lang();



}

 class player implements interfac{

    public void run(){
        System.out.println("run fast");
    }

    public void lang(){
        System.out.println("speak english");
    }

}

class intermain{
    public static void main(String[] args) {

        player p=new player();

        p.run();
        p.lang();
    }
}


