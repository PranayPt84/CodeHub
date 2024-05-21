package Oops2.abstractMethods;

public abstract class Abstr1a {
  
   abstract void meth1();
      void meth2(){
    System.out.println("this is meth2()");
   }
      void meth3(){
          System.out.println("this is meth3()");
      }
      static void meth4(){
          System.out.println("this isn meth 4");
      }
     public static void main(String args[]){
         System.out.println("tnis is main meth");
         Abstr1a.meth4();
     }
}
