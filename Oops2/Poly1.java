package Oops2;
public class Poly1 {
   void meth1(){
       System.out.println("this is meth1");
       
   }    
   void meth1(int a){
       System.out.println("this is paramiterized meth1()");
       
   }
   int meth1(int a ,int b){
       System.out.println(" two parameters ");
       return 20;
   }
    public static void main(String[] args) {
        System.out.println("compile time polymorphism");
       Poly1 ob= new Poly1();
       ob.meth1(19);
    }
}
