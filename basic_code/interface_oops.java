 interface interface_oops {

      public void play();
      public void sports();

}
class play implements interface_oops{

    public void play()
    {
        System.out.println("yes ready to play");

    }
    public void sports()
    {
        System.out.println("CRICKET");
    }

}
class main
  {
         public static void main(String[] args) {
          play p=new play();
          p.play();
          p.sports();
    }
}


