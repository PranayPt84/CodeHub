package Oops2;
public class Inheri2a {
 int meth1(){
     System.out.println("meth1 called ");
     return meth2();
 }    
 int meth2(){
     System.out.println("meth 2 called ");
     return 20;
 }
 Inheri2a(){
     System.out.println("constructor call");
     
  }
}
