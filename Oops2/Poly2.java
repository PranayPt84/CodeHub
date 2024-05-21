package Oops2;
public class Poly2 {
void meth1(){
    System.out.println("default void meth1");
    
}   
int meth1(String a){
    System.out.println(a);
    return  10;
}
void meth1(int a){
    System.out.println(a);

}
private int meth1(int a ,String b){
System.out.println(a);
    System.out.println(b);
    return 20;
}
    public static void main(String[] args) {
        new Poly2().meth1(12, "JAI SHREE RAM");
    }
}
