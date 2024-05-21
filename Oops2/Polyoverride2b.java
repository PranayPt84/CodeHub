package Oops2;
public class Polyoverride2b extends Polyoverride2a {
   protected void meth(){
        System.out.println("this is meth od class b");
 }
    public static void main(String[] args) {
        Polyoverride2a ob=new Polyoverride2b();
        ob.meth();//overriding
        Polyoverride2a ob1=new Polyoverride2a();
        ob1.meth();//calling meth of Polyoverride2a class
    }
  
}
