package Oops2.abstractMethods;
public class Abstr2d extends Abstr2b implements Abstr2c,Abstr2a{
 public void meth1(){
    System.out.println("override meth 1");
    
}   
 public void meth2(){
    System.out.println("meth2 overrided");
    }
 public void meth3(){
     System.out.println("this is overrided meth3");
     
 }
 public void show(){
     System.out.println("override interface abstraction void show method ");
 }
    public static void main(String[] args) {
        Abstr2a ob=new Abstr2d();
        Abstr2b ob1=new Abstr2d();
        Abstr2c ob2=new Abstr2d();
       ob.meth1();
       ob.meth2();
       ob1.meth3();
       ob2.show();
    }
}
