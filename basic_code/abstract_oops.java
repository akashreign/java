 abstract class abstract_oops {

    abstract void play();
    abstract void sports();

}
class pl extends abstract_oops{

    public void play()
    {
        System.out.println("yes ready to play");

    }
    public void sports()
    {
        System.out.println("CRICKET");
    }

}
class min{
    public static void main(String[] args) {
        pl p=new pl();
        p.play();
        p.sports();
    }
}


