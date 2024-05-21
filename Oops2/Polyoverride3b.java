package Oops2;

public class Polyoverride3b implements Polyoverride3a {
      public void meth1(){
        System.out.println("this is Polyoverride3b class meth1() called ");
    }
    public static void main(String[] args) {
        Polyoverride3a ob=new Polyoverride3b();
        ob.meth1();
    }
  
}
