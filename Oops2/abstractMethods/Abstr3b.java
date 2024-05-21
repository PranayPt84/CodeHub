package Oops2.abstractMethods;
public class Abstr3b extends Abstr3a{
void meth1(){
    System.out.println("meth1() overrided ");
    
}   
 int meth2(){
     System.out.println("meth2() overrided");
     return 20;
 }
 String meth3(){
     System.out.println("meth3() overrided");
     return "JAY SHREE RAM";
 }
         public static void main(String[] args) {
        Abstr3a ob=new Abstr3b();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
