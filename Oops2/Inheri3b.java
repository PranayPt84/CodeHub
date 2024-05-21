package Oops2;
public class Inheri3b extends Inheri3a {
   Inheri3b(){
       System.out.println("Constructur Call");
       this.meth4();
   }
    void meth4(){
        this.meth5();
        System.out.println("meth 4");
    }
    void meth5(){
        super.meth1();
        super.meth2();
        super.meth3();
        System.out.println("meth 5");
       
    }
public static void main(String args[]){
    Inheri3a ob=new Inheri3b();
    ob.meth1();
    ob.meth2();
    ob.meth3();
     
}    
}
