package Oops2;

public class Inheri1b extends Inheri1a {
    void meth2(){
        System.out.println("Class b meth2 called ");
    }
   Inheri1b(){
       System.out.println("con class b called ");
   }
    public static void main(String args[]){
    System.out.println("===========");
    Inheri1b ob=new Inheri1b();
    ob.meth1();
    ob.meth2();
}    
}
