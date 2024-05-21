package Oops2;
import java.util.Scanner;
public class Inheri2b extends Inheri2a {
    void meth3(){
        System.out.println("meth3 called ");
    }
    void meth4(){
        System.out.println("meth4 called ");
        this.meth2();
        this.meth3();
       
    }
    
        
    public static void main(String args[]){
       Inheri2b ob=new Inheri2b();
       ob.meth4();
           }
}
