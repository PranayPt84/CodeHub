package Oops2.abstractMethods;
public interface Abstr2a {
    void meth1();
    default void meth2(){
    System.out.println("this is meth2v");
}    
}
