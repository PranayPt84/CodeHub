package Oops2;
public class Polyoverride1b extends Polyoverride1a {
    void meth1(){
        System.out.println("bbbb");
    }
    public static void main(String args[]){
        Polyoverride1a ob=new Polyoverride1b();
        ob.meth1();
}  
}

